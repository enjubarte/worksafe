package com.worksafe.api.dto;



import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

public record UserDto(
        UUID id,
        String username,
        String password,
        Instant createAt,
        Instant updateAt
) implements Serializable {
}