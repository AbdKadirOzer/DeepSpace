package com.example.server.model.request;

import com.example.server.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
public class UserAddRequest {
    @NotBlank
    @Length(max = 20)
    private String username;

    @NotBlank
    @Length(min = 6, max = 20)
    private String password;

    public User toUser() {
        return User.builder()
                .username(this.username)
                .password(this.password)
                .build();
    }
}
