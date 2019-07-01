package com.devd.spring.bookstoreaccountservice.repository;


import com.devd.spring.bookstoreaccountservice.repository.dao.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-05-17
 */
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUserName(String username);

    User findByUserNameOrEmail(String uName, String eMail);

    Boolean existsByUserName(String userName);

    Boolean existsByEmail(String email);
}
