// src/main/java/com/example/sample/domain/user/store/UserStore.java
package com.example.sample.domain.user.store;

import com.example.sample.domain.user.dto.UserResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class UserStore {

    private final Map<Long, UserResponse> store = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public UserResponse save(String name, String email) {
        Long id = sequence.getAndIncrement();
        UserResponse user = new UserResponse(id, name, email);
        store.put(id, user);
        return user;
    }

    public List<UserResponse> findAll() {
        return new ArrayList<>(store.values());
    }

    public Optional<UserResponse> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public Optional<UserResponse> update(Long id, String name) {
        return findById(id).map(u -> {
            UserResponse updated = new UserResponse(id, name, u.getEmail());
            store.put(id, updated);
            return updated;
        });
    }

    public boolean delete(Long id) {
        return store.remove(id) != null;
    }
}
