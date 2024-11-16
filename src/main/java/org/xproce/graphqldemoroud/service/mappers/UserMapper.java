package org.xproce.graphqldemoroud.service.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.graphqldemoroud.dao.entities.User;
import org.xproce.graphqldemoroud.dtos.UserDto;
import org.xproce.graphqldemoroud.dtos.UserDtoInscription;

@Component
public class UserMapper {


    ModelMapper mapper = new ModelMapper();

    public UserDto fromUserToUserDto(User user) {
        return mapper.map(user, UserDto.class);
    }

    public User fromUserDtoToUser(UserDto userDto) {
        return mapper.map(userDto, User.class);
    }

    public User fromUserDtoInscriptionToUser(UserDtoInscription userDtoInscription) {
        return mapper.map(userDtoInscription, User.class);
    }
}
