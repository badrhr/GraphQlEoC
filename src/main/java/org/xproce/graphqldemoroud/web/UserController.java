package org.xproce.graphqldemoroud.web;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;
import org.xproce.graphqldemoroud.dtos.UserDto;
import org.xproce.graphqldemoroud.dtos.UserDtoInscription;
import org.xproce.graphqldemoroud.service.UserService;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;
import java.util.stream.Stream;

@Controller
@AllArgsConstructor
public class UserController {

    UserService userService;


    //getUserById(id: ID): User
    @QueryMapping
    public UserDto getUserById(@Argument Long id) {
        return userService.getUserByID(id);
    }

    //addUser(userInscription: UserInscription):User

    @MutationMapping
    public UserDto addUser(@Argument UserDtoInscription userInscription) {
        return userService.addUser(userInscription);
    }

    @SubscriptionMapping
    public Flux<UserDto> notifyUserAdd(@Argument Long id) {
        return Flux.fromStream(Stream.generate(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            UserDto userDto = userService.getUserByID(id);
            userDto.setName(userDto.getName() + new Random().nextInt());
            return userDto;
        }));
    }
}