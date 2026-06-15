// src/main/java/com/example/sample/domain/user/dto/UserUpdateRequest.java
package com.example.sample.domain.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Schema(description = "유저 수정 요청")
public class UserUpdateRequest {

    @NotBlank
    @Size(min = 2, max = 20)
    @Schema(description = "변경할 유저 이름", example = "김철수")
    private String name;
}
