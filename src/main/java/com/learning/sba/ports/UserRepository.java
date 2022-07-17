package com.learning.sba.ports;

import com.learning.sba.business.domain.User;

public interface UserRepository {
    User getUser(Long id);

    void save(User user);

    User modify(User user);

    void delete(Long id);
}
