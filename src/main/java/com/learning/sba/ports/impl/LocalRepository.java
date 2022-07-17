package com.learning.sba.ports.impl;

import com.learning.sba.business.domain.User;
import com.learning.sba.ports.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class LocalRepository implements UserRepository {
    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public User modify(User user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
