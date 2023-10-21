package com.example;
/**
 * @author Khalil ALMAASALI
 */ 
public class Chapter {
    private Long id;
    private String title;
    private Integer pages;
    
    public Chapter() {
    }
    
    public Chapter(Long id, String title, Integer pages) {
        this.id = id;
        this.title = title;
        this.pages = pages;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getPages() {
        return pages;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Chapter [id=" + id + ", title=" + title + ", pages=" + pages + "]";
    }
    
    
}
