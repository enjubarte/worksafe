package com.worksafe.api.dto;

import com.worksafe.api.model.User;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

/**
 * A DTO for the {@link User} entity
 */
public record UserDto(
        UUID id,
        String username,
        String password,
        Instant createAt,
        Instant updateAt
) implements Serializable {
}