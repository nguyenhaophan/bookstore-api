package com.hp.bookstoreapi.books.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

@Getter
@Setter
public class CreateBookDTO {
    @NotBlank(message = "can't be blank")
    private String title;

    @NotNull
    @Positive
    private int publicationYear;

    @NotNull
    @Positive
    private int price;

    @NotBlank(message = "can't be blank")
    private String language;

//    @NotNull
    private ObjectId author;

//    @NotNull
    private List<ObjectId> categories;
}
