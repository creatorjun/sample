// src/main/java/com/example/sample/domain/user/dto/UserResponse.java
package com.example.sample.domain.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(description = "유저 응답")
public class UserResponse {

    @Schema(description = "유저 ID", example = "1")
    private Long id;

    @Schema(description = "유저 이름", example = "홍길동")
    private String name;

    @Schema(description = "이메일 주소", example = "hong@example.com")
    private String email;
}
