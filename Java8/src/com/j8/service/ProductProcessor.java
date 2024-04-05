package com.j8.service;

import com.j8.dao.DataBuilderRepository;
import com.j8.model.BookStore;

import java.util.List;

public class ProductProcessor {


    public List<BookStore> bookProcessor() {
//        ICheckProcess checkProcess = (productName)  -> productName.equals("xyz");
//        System.out.println(checkProcess.isProductAvailable("xyz"));

        DataBuilderRepository repository = new DataBuilderRepository();
        return repository.bookStore();
    }

}
