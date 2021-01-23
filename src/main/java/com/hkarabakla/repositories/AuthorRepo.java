package com.hkarabakla.repositories;

import com.hkarabakla.entities.Authors;
import com.hkarabakla.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Authors, String> {
    Authors findByName(String name);
}
