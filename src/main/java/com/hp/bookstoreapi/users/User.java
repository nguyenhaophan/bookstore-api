package com.hp.bookstoreapi.users;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class User {
    private String username;
    private String password;
    private List<ObjectId> shoppingBag;
    private List<ObjectId> favorites;
}
