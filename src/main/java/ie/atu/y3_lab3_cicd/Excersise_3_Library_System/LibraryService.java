package ie.atu.y3_lab3_cicd.Excersise_3_Library_System;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

// reference: https://shorturl.at/dhwHZ
@Service
public class LibraryService {
    public static ArrayList<Book> bookArrayList = new ArrayList<>();

    public void addBook(Book book){
        bookArrayList.add(book);
    }

    public static ArrayList<Book> getBook() {
        return bookArrayList;
    }
}
