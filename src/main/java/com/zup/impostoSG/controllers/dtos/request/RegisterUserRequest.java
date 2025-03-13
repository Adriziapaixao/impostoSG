package com.zup.impostoSG.controllers.dtos.request;

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
public class RegisterUserRequest {

    private String username;
    private String password;
    private Set<RoleEntity> roles;
}
