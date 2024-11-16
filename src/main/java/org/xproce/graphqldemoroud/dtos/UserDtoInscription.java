package org.xproce.graphqldemoroud.dtos;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDtoInscription {

    private String name;
    private String email;
    private String password;
}
