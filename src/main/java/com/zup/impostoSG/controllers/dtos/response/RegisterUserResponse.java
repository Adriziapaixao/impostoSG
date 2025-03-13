package com.zup.impostoSG.controllers.dtos.response;

import com.zup.impostoSG.entities.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {
    private Long id;
    private String username;
    private Set<RoleEntity> roles;
}
