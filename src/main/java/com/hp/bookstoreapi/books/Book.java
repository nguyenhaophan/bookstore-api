package com.hp.bookstoreapi.books;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Book {
    private String title;
    private int publicationYear;
    private int price;
    private String language;
    private ObjectId author;
    private List<ObjectId> categories;
}
