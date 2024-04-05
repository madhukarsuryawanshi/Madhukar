package com.j8.test;

import com.j8.model.Book;
import com.j8.model.BookStore;
import com.j8.service.ProductProcessor;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ProductProcessor processor = new ProductProcessor();
        List<BookStore> bookStores = processor.bookProcessor();
        /*List<Map<String, List<String>>> owened = bookStores.stream()
                .filter(r -> r.isRented().equals("Owened"))
                .map(BookStore::getBooks)
                .flatMap(Collection::stream)
                .map(Book::getTopics)
                .collect(Collectors.toList());

        owened.stream()
                .collect(Collectors.groupingBy(stringListMap -> stringListMap.entrySet()));*/
        int count = 0;
        for(BookStore bookStore : bookStores) {
            if(bookStore.getAdresses().equals("Mumbai")) {
                List<Book> books = bookStore.getBooks();
                for (Book book : books) {
//                    System.out.println(book.getBookName() + "\n");
                    count++;
                }
            }
        }
//        System.out.println("At mumbai we have " + count + " Books...");
        bookStores.stream()
                .filter(bookStore -> bookStore.getAdresses().equals("Mumbai"))
                .map(BookStore::getBooks)
                .flatMap(Collection::stream)
                .map(Book::getBookName)
                .forEach(System.out::println);


    }
}
