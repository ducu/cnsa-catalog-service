package com.polarbookshop.catalogservice.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public record Book(
    @NotBlank(message = "ISBN is required.")
    @Pattern(regexp = "^[0-9]+$", message = "ISBN must be numeric.")
    String isbn,
    @NotBlank(message = "Title is required.")
    String title,
    @NotBlank(message = "Author is required.")
    String author,
    @Positive(message = "Price must be positive.")
    Double price) {
    }
