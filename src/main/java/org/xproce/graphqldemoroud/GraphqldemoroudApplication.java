package org.xproce.graphqldemoroud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.graphqldemoroud.dao.entities.User;
import org.xproce.graphqldemoroud.dao.repositories.UserRepository;

import java.util.List;

@SpringBootApplication
public class GraphqldemoroudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqldemoroudApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository) {
        return args -> {
            List<User> users = List.of(
                    User.builder().name("x").email("x@email.com").password("6546g6re4").build(),
                    User.builder().name("r").email("r@email.com").password("54fe8rew").build(),
                    User.builder().name("f").email("f@email.com").password("wer648e4").build(),
                    User.builder().name("g").email("g@email.com").password("we6r48e4").build()
            );

            userRepository.saveAll(users);
        };
    }
}
