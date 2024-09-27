package lab1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Створення автора
        Author author = new Author("John", "Doe", new Date(80, 5, 15));  // Дата: 15 червня 1980 року

        // Створення книги
        Book book = new Book("The Science of Fiction", BookGenre.SCIENCE, author);

        //  публікаці
        book.addPublication(new Publication("Physics and Imagination", BookGenre.SCIENCE, new Date(120, 0, 10))); // 10 січня 2020
        book.addPublication(new Publication("Fiction in Modern Science", BookGenre.SCIENCE, new Date(121, 5, 12))); // 12 червня 2021

        // getter і setter
        book.setTitle("The Updated Science of Fiction");

        //  повна інформація
        book.printFullInfo();


        book.printShortInfo();
    }
}
