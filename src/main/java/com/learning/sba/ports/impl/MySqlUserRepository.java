package com.learning.sba.ports.impl;

import com.learning.sba.business.domain.User;
import com.learning.sba.ports.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class MySqlUserRepository implements UserRepository {

    @Override
    public User getUser(Long id) {
        return new User();
    }

    @Override
    public void save(User user) {
    }

    @Override
    public User modify(User user) {
        return new User();
    }

    @Override
    public void delete(Long id) {
    }
}
