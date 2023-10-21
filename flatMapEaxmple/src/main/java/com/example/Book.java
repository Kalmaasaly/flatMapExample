package com.example;
import java.util.List;
/*
 * 
 * @Author Khalil
 */
public class Book {
    private Long id;
    private String name;
    private String authors;
    List<Chapter> Chapters;

    public Book() {
    }

    public Book(Long id, String name, String authors, List<Chapter> chapters) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        Chapters = chapters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public List<Chapter> getChapters() {
        return Chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        Chapters = chapters;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", authors=" + authors + ", Chapters=" + Chapters + "]";
    }

}
