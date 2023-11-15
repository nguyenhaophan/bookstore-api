package com.hp.bookstoreapi.categories;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Category {
    private String bookCategory;
}
