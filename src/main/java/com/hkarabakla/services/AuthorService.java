package com.hkarabakla.services;

import com.hkarabakla.entities.Authors;
import com.hkarabakla.entities.Book;
import com.hkarabakla.repositories.AuthorRepo;
import com.hkarabakla.repositories.BookRepo;
import org.springframework.stereotype.Component;

@Component
public class AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void bookOperations() {

    }

    public void authorFindOperations(){
        Authors authors = authorRepo.findByName("Spring in Action");
        System.out.println(authors);
    }
}
