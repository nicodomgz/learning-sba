package com.learning.sba.infra.controllers;

import com.learning.sba.business.exceptions.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping("/ok")
    public ResponseEntity<String> pingOk() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/not_found")
    public ResponseEntity<String> pingNotFound() {
        throw new EntityNotFoundException("ping not found");
    }

    @GetMapping("/error")
    public ResponseEntity<String> pingInternalServerError() {
        throw new RuntimeException("ping runtime exception");
    }
}
