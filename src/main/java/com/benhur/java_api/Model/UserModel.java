package com.benhur.java_api.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;

@Data // get set sozinho
@Document("user")
public class UserModel {
    @Id
    private String id;
    private String name;
    private short age;

    public UserModel(String id, String name, short age) {
        this.id = id;
        this.name = name;

        this.age = age;
    }

    public UserModel(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public UserModel() {
    }
}
