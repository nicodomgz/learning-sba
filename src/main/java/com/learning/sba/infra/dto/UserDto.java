package com.learning.sba.infra.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserDto {
    private Long id;
    private Long dni;
    private String name;
    private String address;
    private Long age;
}
