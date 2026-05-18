package com.example.DaejeonYeojido.comment.repository;

import com.example.DaejeonYeojido.comment.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository <Comment, Long> {
    List<Comment> findByRestaurantIdOrderByCreatedAtDesc(Long restaurantId);
}
