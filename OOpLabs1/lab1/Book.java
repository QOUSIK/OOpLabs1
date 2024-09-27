package lab1;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private BookGenre genre;
    private Author author;
    private List<Publication> publications;

    public Book(String title, BookGenre genre, Author author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publications = new ArrayList<>();
    }

    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    //  повна інформація
    public void printFullInfo() {
        System.out.println("Book: " + title + ", Genre: " + genre + ", Author: " + author);
        System.out.println("Publications:");
        for (Publication publication : publications) {
            System.out.println(publication);
        }
    }

    //  коротка інформація
    public void printShortInfo() {
        System.out.println("Title: " + title + ", Author: " + author.getName() + " " + author.getSurname() +
                ", Number of publications: " + publications.size());
    }
}

