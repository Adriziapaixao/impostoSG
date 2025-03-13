package com.zup.impostoSG.infra.security;

import com.zup.impostoSG.entities.UserEntity;

public interface TokenProvider {

    String generateToken(UserEntity user);
    boolean validateRefreshToken(String refreshToken);
    String refreshAccessToken(String refreshToken);
}
