package com.learning.sba.business.usecases.impl;

import com.learning.sba.business.domain.User;
import com.learning.sba.business.usecases.CrudUser;
import com.learning.sba.ports.UserRepository;

public class CrudUserService implements CrudUser {

    private final UserRepository repo;

    public CrudUserService(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User getUser(Long id) {
        return repo.getUser(id);
    }

    @Override
    public void save(User user) {
        repo.save(user);
    }

    @Override
    public User modify(User user) {
        return repo.modify(user);
    }

    @Override
    public void delete(Long id) {
        repo.delete(id);
    }
}
