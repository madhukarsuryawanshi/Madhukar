package com.j8.model;

import java.util.List;
import java.util.Map;

public class Book {
    private Integer id;
    private String bookName;
    private String auther;
    private String publishedDate;
    private Map<String, List<String>> topics;

    public Book(Integer id, String bookName, String auther, String publishedDate, Map<String, List<String>> topics) {
        this.id = id;
        this.bookName = bookName;
        this.auther = auther;
        this.publishedDate = publishedDate;
        this.topics = topics;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Map<String, List<String>> getTopics() {
        return topics;
    }

    public void setTopics(Map<String, List<String>> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", auther='" + auther + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", topics=" + topics +
                '}';
    }
}
