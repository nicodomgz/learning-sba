package com.learning.sba.business.usecases;

import com.learning.sba.business.domain.User;

public interface CrudUser {
    User getUser(Long id);

    void save(User user);

    User modify(User user);

    void delete(Long id);
}
