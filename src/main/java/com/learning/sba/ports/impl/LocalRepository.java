package com.learning.sba.ports.impl;

import com.learning.sba.business.domain.User;
import com.learning.sba.business.exceptions.EntityNotFoundException;
import com.learning.sba.ports.UserRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class LocalRepository implements UserRepository {

    private final Map<Long, User> local = new HashMap<>();

    @Override
    public User getUser(Long id) {
        if (local.containsKey(id)) {
            return local.get(id);
        }
        throw new EntityNotFoundException(
            String.format("user with id %s not found", id)
        );
    }

    @Override
    public void save(User user) {
        local.put(user.getId(), user);
    }

    @Override
    public User modify(User user) {
        if (!local.containsKey(user.getId())) {
            throw new EntityNotFoundException(
                String.format("can't modify user with id %s. user not exist", user.getId())
            );
        }
        local.put(user.getId(), user);
        return user;
    }

    @Override
    public void delete(Long id) {
        if (!local.containsKey(id)) {
            throw new EntityNotFoundException(
                String.format("can't remove user with id %s. user not exist", id)
            );
        }
        local.remove(id);
    }
}
