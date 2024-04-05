package com.j8.model;

import java.util.List;

public class BookStore {

    private Integer storeId;
//    private Double bookPrice;
    private String adresses;
    private List<Book> books;
    private String isRented;

    public BookStore(Integer storeId, List<Book> books, String address, String isRented) {
        this.storeId = storeId;
        this.books = books;
        this.adresses = address;
        this.isRented = isRented;
    }

//    public Double getBookPrice() {
//        return bookPrice;
//    }

//    public void setBookPrice(Double bookPrice) {
//        this.bookPrice = bookPrice;
//    }

    public String getAdresses() {
        return adresses;
    }

    public void setAdresses(String adresses) {
        this.adresses = adresses;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String isRented() {
        return isRented;
    }

    public void setRented(String rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "storeId=" + storeId +
                ", adresses='" + adresses + '\'' +
                ", isRented='" + isRented + '\'' +
                ", books=" + books +

                '}';
    }
}
