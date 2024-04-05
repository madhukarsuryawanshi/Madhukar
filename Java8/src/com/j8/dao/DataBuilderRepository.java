package com.j8.dao;

import com.j8.model.Book;
import com.j8.model.BookStore;
import com.j8.model.Topic;

import java.util.*;

public class DataBuilderRepository {

    public List<BookStore> bookStore() {
        List<BookStore> bookStores = new ArrayList<>();
        for (int i=1; i<=4; i++) {
            BookStore bookStore = new BookStore(i, bookData(), setCity(i), isRented(i));
            bookStores.add(bookStore);
        }
        return bookStores;
    }
    private String setCity(int i ) {
        if(i == 1) { return "Hyderabad"; }
        else if(i==2) { return "Mumbai"; }
        else if(i==3) {return "Banglore"; }
        else if(i==4) {return "Delhi"; }

        return "Hyderabad";
    }

    private String isRented(int i ) {
        if(i == 1) { return "Owened"; }
        else if(i==2) { return "Rented"; }
        else if(i==3) {return "Rented"; }
        else if(i==4) {return "Rented"; }

        return null;
    }

    public List<Book> bookData() {
        List<Book> books = new ArrayList<>();
        Book javaBook = new Book(1, "Java", "Kanetkar", "01/01/2022", javaTopics());
        Book hibernateBook = new Book(2, "Hibernate", "Gavin King", "02/02/2020", hibernateTopics());
        Book springBook = new Book(3, "Spring", "Rachel Carson", "27/09/1960", springTopics());
        books = Arrays.asList(javaBook, hibernateBook, springBook);
        return books;
    }

    private Map<String, List<String>> javaTopics() {

        Map<String, List<String>> javaTopics = new HashMap<>();
        javaTopics.put("OOPS", Arrays.asList("Inheritance", "Polymorphism", "Abstraction", "Encapsulation"));
        javaTopics.put("Exception", Arrays.asList("RuntimeException", "CompiletimeException"));
        javaTopics.put("Thread", Arrays.asList("Thread", "Runnable"));
        javaTopics.put("Collection", Arrays.asList("List", "Set", "Map"));
        return javaTopics;
    }

    private Map<String, List<String>> hibernateTopics() {

        Map<String, List<String>> hibernateTopics = new HashMap<>();
        hibernateTopics.put("Configuration", Arrays.asList("HibernateConfig", "MappingConfig"));
        hibernateTopics.put("Cache", Arrays.asList("FirstLevel", "SecondLevel"));
        hibernateTopics.put("Association", Arrays.asList("One-to-One", "One-to-Many", "Many-to-Many", "Many-to-One"));
        return hibernateTopics;
    }

    private Map<String, List<String>> springTopics() {

        Map<String, List<String>> springTopics = new HashMap<>();
        springTopics.put("dependencyInjection", Arrays.asList("Setter", "Constructor"));
        springTopics.put("mvc", Arrays.asList("MVC Flow", "DispatureServlet", "RequestMapper", "Filters"));
        springTopics.put("Annotations", Arrays.asList("@Bean", "@Autowired", "@Qualifier", "@RestController"));
        return springTopics;
    }
}
