package com.benhur.java_api.Repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.benhur.java_api.Model.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String>{
    @Query("{'name': ?0}")
    List<UserModel> findByName(String name);
    @Query("{'name': ?1, 'age: ?0'}")
    List<UserModel> findByAgeAndName(short age, String name);
}
