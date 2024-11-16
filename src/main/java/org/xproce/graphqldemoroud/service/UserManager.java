package org.xproce.graphqldemoroud.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.graphqldemoroud.dao.entities.User;
import org.xproce.graphqldemoroud.dao.repositories.UserRepository;
import org.xproce.graphqldemoroud.dtos.UserDto;
import org.xproce.graphqldemoroud.dtos.UserDtoInscription;
import org.xproce.graphqldemoroud.service.mappers.UserMapper;

@Service
@AllArgsConstructor
public class UserManager implements UserService{

    UserRepository userRepository ;

    UserMapper mapper;


    @Override
    public UserDto getUserByID(Long id) {
        return mapper.fromUserToUserDto(userRepository.findById(id).get());
    }

    @Override
    public UserDto addUser(UserDtoInscription userDtoInscription) {
        User user = mapper.fromUserDtoInscriptionToUser(userDtoInscription);

        user = userRepository.save(user);

        return mapper.fromUserToUserDto(user);
    }
}
