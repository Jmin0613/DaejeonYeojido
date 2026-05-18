package com.example.DaejeonYeojido.comment.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentDeleteRequest {
    @NotBlank
    private String nickname;

    @NotBlank
    private String password;

}
