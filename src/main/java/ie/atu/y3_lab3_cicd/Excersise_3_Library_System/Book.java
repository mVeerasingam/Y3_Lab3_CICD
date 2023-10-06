package ie.atu.y3_lab3_cicd.Excersise_3_Library_System;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private int isbn;
    private int publishedYear;
}
