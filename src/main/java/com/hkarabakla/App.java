package com.hkarabakla;

import com.hkarabakla.services.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.hkarabakla");
        appContext.refresh();

        UserService userService = (UserService) appContext.getBean("userService");
        userService.userOperations();

        CategoryService categoryService = (CategoryService) appContext.getBean("categoryService");
        categoryService.categoryOperations();

        BookService bookService = (BookService) appContext.getBean("bookService");
        bookService.bookFindOperations();

        AuthorService authorService = (AuthorService) appContext.getBean("authorService");
        authorService.authorFindOperations();

        OrderService orderService = (OrderService) appContext.getBean("orderService");
        orderService.orderOperations();

        appContext.close();
    }
}
