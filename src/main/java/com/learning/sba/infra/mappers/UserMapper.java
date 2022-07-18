package com.learning.sba.infra.mappers;

import com.learning.sba.business.domain.User;
import com.learning.sba.infra.dto.request.UserDto;
import com.learning.sba.infra.dto.response.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User fromDto(UserDto dto) {
        return new User(
            dto.getId(),
            dto.getDni(),
            dto.getName(),
            dto.getAddress(),
            dto.getAge()
        );
    }

    public UserDto fromUser(User user) {
        return new UserDto(
            user.getId(),
            user.getDni(),
            user.getName(),
            user.getAddress(),
            user.getAge()
        );
    }

    public UserResponseDto fromUser(Long id, String message) {
        return new UserResponseDto(
            id,
            message
        );
    }
}
