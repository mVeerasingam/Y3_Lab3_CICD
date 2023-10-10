package ie.atu.y3_lab3_cicd.Excersise_3_Library_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/library")
public class LibraryController {
    private LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/getBook")
    public ArrayList<Book> getBook(){
        return libraryService.getBook();
    }

    @PostMapping("/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        libraryService.addBook(book);
        System.out.println(book);
    }
}
