package com.example.DaejeonYeojido.comment.controller;

import com.example.DaejeonYeojido.comment.dto.CommentCreateRequest;
import com.example.DaejeonYeojido.comment.dto.CommentDeleteRequest;
import com.example.DaejeonYeojido.comment.dto.CommentResponse;
import com.example.DaejeonYeojido.comment.dto.CommentUpdateRequest;
import com.example.DaejeonYeojido.comment.service.CommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CommentController {
    private final CommentService commentService;

    // 댓글 목록
    @GetMapping("/restaurants/{restaurantId}/comments")
    public ResponseEntity<List<CommentResponse>> getComments(@PathVariable Long restaurantId){
        return ResponseEntity.ok(commentService.getComments(restaurantId));
    }

    //댓글 작성
    @PostMapping("/restaurants/{restaurantId}/comments")
    public CommentResponse createComment(@PathVariable Long restaurantId,
                              @RequestBody @Valid CommentCreateRequest request){
        return commentService.createComment(restaurantId, request);
    }

    //댓글 수정
    @PutMapping("/comments/{commentId}")
    public CommentResponse updateComment(@PathVariable Long commentId,
                              @RequestBody @Valid CommentUpdateRequest request){
        return commentService.updateComment(commentId, request);
    }

}
