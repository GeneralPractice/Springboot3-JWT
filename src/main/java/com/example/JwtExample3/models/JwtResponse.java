package com.example.JwtExample3.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {

    private String jwtToken;

    private String username;
}
