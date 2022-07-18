package com.learning.sba.infra.controllers;

import com.learning.sba.business.domain.User;
import com.learning.sba.business.usecases.CrudUser;
import com.learning.sba.business.usecases.impl.CrudUserService;
import com.learning.sba.infra.dto.request.UserDto;
import com.learning.sba.infra.dto.response.UserResponseDto;
import com.learning.sba.infra.mappers.UserMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final CrudUser service;
    private final UserMapper mapper;

    public UserController(CrudUserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable(name = "id") Long id) {
        User user = this.service.getUser(id);
        return ResponseEntity.ok(this.mapper.fromUser(user));
    }

    @PostMapping("")
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserDto userDto) {
        this.service.save(this.mapper.fromDto(userDto));
        return ResponseEntity.ok(this.mapper.fromUser(userDto.getId(), "user created successfully"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDto> modifyUser(@PathVariable(name = "id") Long id, @RequestBody UserDto userDto) {
        this.service.modify(this.mapper.fromDto(userDto));
        return ResponseEntity.ok(this.mapper.fromUser(id, "user edited successfully"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserResponseDto> deleteUser(@PathVariable(name = "id") Long id) {
        this.service.delete(id);
        return ResponseEntity.ok(this.mapper.fromUser(id, "user deleted successfully"));
    }
}
