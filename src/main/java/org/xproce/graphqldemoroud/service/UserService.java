package org.xproce.graphqldemoroud.service;

import org.xproce.graphqldemoroud.dao.entities.User;
import org.xproce.graphqldemoroud.dtos.UserDto;
import org.xproce.graphqldemoroud.dtos.UserDtoInscription;

public interface UserService {

    public UserDto getUserByID(Long id);

    public UserDto addUser(UserDtoInscription userDtoInscription);

    //....

}
