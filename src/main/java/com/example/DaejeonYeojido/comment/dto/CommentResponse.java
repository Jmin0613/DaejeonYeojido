package com.example.DaejeonYeojido.comment.dto;

import com.example.DaejeonYeojido.comment.domain.Comment;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponse {
    private Long id;
    private Long restaurantId;

    private String nickname;
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private CommentResponse(Comment comment){
        this.id = comment.getId();
        this.restaurantId = comment.getRestaurant().getId();
        this.nickname = comment.getNickname();
        this.content = comment.getContent();
        this.createdAt = comment.getCreatedAt();
        this.updatedAt = comment.getUpdatedAt();
    }

    public static CommentResponse from(Comment comment){
        return new CommentResponse(comment);
    }

}
