package com.example.ohadou_auto_backend.Repository;

import com.example.ohadou_auto_backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
