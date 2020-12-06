package com.orm.dao.jpa;

import com.orm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    long countByName(String name);

    List<User> deleteByName(String name);

}
