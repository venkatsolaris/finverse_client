package com.javapuzzle.springbootkeycloakexample;

public abstract class CommonAuthentication {

    abstract void login(String username, String password);

    abstract void logout(String token);

    abstract void validate_token(String token);

    abstract void reset_password(String username, String newPassword);

    abstract void change_password(String username, String oldPassword, String newPassword);

}
