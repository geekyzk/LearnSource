package com.em248.repository;

import com.em248.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by tian on 2017/5/9.
 */
public interface UserRepository extends MongoRepository<User,Long> {

    User findFirstByUsername(String username);

    User findByUsernameAndPhone(String username,String phone);

}
