package com.marc2web.auth.service;

import com.marc2web.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
