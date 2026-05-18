package com.example.DaejeonYeojido.comment.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.example.DaejeonYeojido.restaurant.domain.Restaurant;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String passwordHash; //BCrypt 해싱

    @Column(nullable = false)
    private String content;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;

    private Comment(Restaurant restaurant, String nickname, String passwordHash, String content){
        if(restaurant == null){ throw new IllegalStateException("댓글을 작성할 맛집을 입력해주세요."); }
        if(nickname == null || nickname.isBlank()){ throw new IllegalStateException("닉네임을 입력해주세요."); }
        if(passwordHash == null || passwordHash.isBlank()){ throw new IllegalStateException("비밀번호를 입력해주세요."); }
        if(content == null || content.isBlank()){ throw new IllegalStateException("내용을 입력해주세요."); }

        this.restaurant = restaurant;
        this.nickname = nickname;
        this.passwordHash = passwordHash;
        this.content = content;
    }

    // 댓글 생성
    public static Comment createComment(Restaurant restaurant, String nickname, String passwordHash, String content){
        return new Comment(restaurant, nickname, passwordHash, content);
    }

    // 댓글 수정
    public void updateComment(String content){
        if(content == null || content.isBlank()){
            throw new IllegalStateException("내용을 입력해주세요.");
        }

        this.content = content;
    }
}
