package com.j8.service;
@FunctionalInterface
public interface ICheckProcess<T> {
//    void processProduct(String productName);
    boolean isProductAvailable(T t);
}
