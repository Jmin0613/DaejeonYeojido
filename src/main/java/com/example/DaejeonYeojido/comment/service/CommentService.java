package com.example.DaejeonYeojido.comment.service;

import com.example.DaejeonYeojido.comment.domain.Comment;
import com.example.DaejeonYeojido.comment.dto.CommentCreateRequest;
import com.example.DaejeonYeojido.comment.dto.CommentResponse;
import com.example.DaejeonYeojido.comment.dto.CommentUpdateRequest;
import com.example.DaejeonYeojido.comment.repository.CommentRepository;
import com.example.DaejeonYeojido.restaurant.domain.Restaurant;
import com.example.DaejeonYeojido.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CommentService {
    private final CommentRepository commentRepository;
    private final RestaurantRepository restaurantRepository;
    private final PasswordEncoder passwordEncoder;

    // 댓글 목록
    public List<CommentResponse> getComments(Long restaurantId){
        return commentRepository.findByRestaurantIdOrderByCreatedAtDesc(restaurantId)
                .stream()
                .map(CommentResponse::from)
                .toList();
    }

    // 댓글 작성
    public CommentResponse createComment(Long restaurantId, CommentCreateRequest request){
         Restaurant restaurant = restaurantRepository.findById(restaurantId)
                 .orElseThrow(()-> new IllegalStateException("해당 맛집을 찾을 수 없습니다."));

         //BCrypt 해싱
         String passwordHash = passwordEncoder.encode(request.getPassword());

         Comment comment = Comment.createComment(restaurant, request.getNickname(), passwordHash, request.getContent());

         commentRepository.save(comment);

         return CommentResponse.from(comment);
    }

    // 댓글 수정
    public CommentResponse updateComment(Long commentId, CommentUpdateRequest request){
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new IllegalStateException("비밀번호를 입력해주세요."));

        if(passwordEncoder.matches(request.getPassword(), comment.getPasswordHash())){
            throw new IllegalStateException("비밀번호가 일치하지 않습니다.");
        }

        comment.updateComment(request.getContent());

        return CommentResponse.from(comment);
    }
}
