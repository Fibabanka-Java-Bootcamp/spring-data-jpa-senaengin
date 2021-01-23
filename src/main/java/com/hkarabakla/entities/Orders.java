package com.hkarabakla.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;


@Entity
public class Orders {
    @Id
    private int id;
    private int created_id;

    @ManyToOne
    private User user;
    private int total;

    @ManyToMany
    List<Book> books;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", created_id=" + created_id +
                ", user=" + user +
                ", total=" + total +
                ", books=" + books +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreated_id() {
        return created_id;
    }

    public void setCreated_id(int created_id) {
        this.created_id = created_id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
