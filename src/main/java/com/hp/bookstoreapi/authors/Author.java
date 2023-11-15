package com.hp.bookstoreapi.authors;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Author {
    private String firstName;
    private String lastName;
    private List<ObjectId> books;
}
