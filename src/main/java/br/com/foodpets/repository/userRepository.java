package br.com.foodpets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.foodpets.model.User;


@Repository
public interface userRepository extends JpaRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);
}
