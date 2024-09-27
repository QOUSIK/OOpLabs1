package lab1;

import java.util.Date;

class Publication {
    private String title;
    private BookGenre genre;
    private Date publishDate;

    public Publication(String title, BookGenre genre, Date publishDate) {
        this.title = title;
        this.genre = genre;
        this.publishDate = publishDate;
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

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Publication: " + title + ", Genre: " + genre + ", Published on: " + publishDate;
    }
}
