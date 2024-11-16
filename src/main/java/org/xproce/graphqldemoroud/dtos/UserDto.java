package org.xproce.graphqldemoroud.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDto {
    private Long id;
    private String name;
    private String email;
}
