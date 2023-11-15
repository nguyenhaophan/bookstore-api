package com.hp.bookstoreapi.books;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, ObjectId> {
    Book findBookByTitle(String title);
}
