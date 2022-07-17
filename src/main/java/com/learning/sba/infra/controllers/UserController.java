package com.learning.sba.infra.controllers;

import com.learning.sba.business.domain.User;
import com.learning.sba.business.usecases.CrudUser;
import com.learning.sba.business.usecases.impl.CrudUserService;
import com.learning.sba.infra.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final CrudUser service;

    public UserController(CrudUserService service) {
        this.service = service;
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable(name = "id") Long id) {
        User user = this.service.getUser(id);
        return ResponseEntity.ok(new UserDto());
    }
}
