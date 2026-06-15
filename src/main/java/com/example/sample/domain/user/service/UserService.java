// src/main/java/com/example/sample/domain/user/service/UserService.java
package com.example.sample.domain.user.service;

import com.example.sample.domain.user.dto.UserCreateRequest;
import com.example.sample.domain.user.dto.UserResponse;
import com.example.sample.domain.user.dto.UserUpdateRequest;
import com.example.sample.domain.user.store.UserStore;
import com.example.sample.global.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserStore userStore;

    public UserResponse create(UserCreateRequest request) {
        return userStore.save(request.getName(), request.getEmail());
    }

    public List<UserResponse> findAll() {
        return userStore.findAll();
    }

    public UserResponse findById(Long id) {
        return userStore.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User", id));
    }

    public UserResponse update(Long id, UserUpdateRequest request) {
        return userStore.update(id, request.getName())
                .orElseThrow(() -> new ResourceNotFoundException("User", id));
    }

    public void delete(Long id) {
        if (!userStore.delete(id)) {
            throw new ResourceNotFoundException("User", id);
        }
    }
}
