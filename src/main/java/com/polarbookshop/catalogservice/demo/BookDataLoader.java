package com.polarbookshop.catalogservice.demo;

import com.polarbookshop.catalogservice.domain.Book;
import com.polarbookshop.catalogservice.domain.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;



@Component
@Profile("testdata")
public class BookDataLoader {
    private final BookRepository bookRepository;

    public BookDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        var book1 = new Book("1491950358", "Building Microservices", "Sam Newman", 9.90);
        var book2 = new Book("1680502395", "Release It!", "Michael T. Nygard", 12.90);
        var book3 = new Book("0321601912", "Continuous Delivery", "Jez Humble, David Farley", 11.90);
        var book4 = new Book("0321125215", "Java Concurrency in Practice", "Brian Goetz", 15.90);
        var book5 = new Book("1617290459", "Spring in Action", "Craig Walls", 12.90);
        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);
        bookRepository.save(book4);
        bookRepository.save(book5);
    }
}
