package com.learning.sba.infra.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserDto {
    private Long id;
    private Long dni;
    private String name;
    private String address;
    private Long age;
}
