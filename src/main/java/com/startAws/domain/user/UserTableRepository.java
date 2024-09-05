package com.startAws.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserTableRepository extends JpaRepository<UserTable, Long> {


    Optional<UserTable> findByEmail(String email);
}
