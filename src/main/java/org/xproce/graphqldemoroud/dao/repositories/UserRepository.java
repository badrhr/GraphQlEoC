package org.xproce.graphqldemoroud.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.graphqldemoroud.dao.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
