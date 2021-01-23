package com.hkarabakla.services;

import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.entities.Orders;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.BookRepo;
import com.hkarabakla.repositories.CategoryRepo;
import com.hkarabakla.repositories.OrderRepo;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Component
public class OrderService {

    private final OrderRepo orderRepo;
    private final UserRepo userRepo;
    private final BookRepo bookRepo;

    public OrderService(OrderRepo orderRepo, UserRepo userRepo, BookRepo bookRepo) {
        this.orderRepo = orderRepo;
        this.userRepo = userRepo;
        this.bookRepo = bookRepo;
    }

    public void orderOperations() {

        User user = userRepo.findByName("Sena");
        Book book = bookRepo.findByName("Spring in Action");

        Orders order = new Orders();
        order.setUser(user);
        order.setBooks(Collections.singletonList(book));
        order.setTotal(20);

        order = orderRepo.save(order);
        System.out.println(order);
    }
}
