// src/main/java/com/example/sample/domain/user/dto/UserCreateRequest.java
package com.example.sample.domain.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Schema(description = "유저 생성 요청")
public class UserCreateRequest {

    @NotBlank
    @Size(min = 2, max = 20)
    @Schema(description = "유저 이름", example = "홍길동")
    private String name;

    @NotBlank
    @Email
    @Schema(description = "이메일 주소", example = "hong@example.com")
    private String email;

    @NotBlank
    @Size(min = 8)
    @Schema(description = "비밀번호 (최소 8자)", example = "password1234")
    private String password;
}
