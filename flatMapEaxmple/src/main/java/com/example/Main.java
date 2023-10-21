package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khalil ALMAASALI
 */ 
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Book> books = generateDummyBooks(10);
        System.out.println("books size::" + books.size());

        books.stream()
                .peek(book -> System.out.println("Book ID: " + book.getId()))
                .flatMap(t -> t.getChapters().stream())
                .peek(chapter -> System.out.println("Chapter Title: " + chapter.getId()))
                .forEach(c -> {});
    }

    public static List<Book> generateDummyBooks(int numBooks) {
        List<Book> books = new ArrayList<>();

        for (int i = 1; i <= numBooks; i++) {
            Book book = generateDummyBook(i);
            books.add(book);
        }

        return books;
    }

    public static Book generateDummyBook(long bookId) {
        List<Chapter> chapters = generateDummyChapters(10);

        Book book = new Book();
        book.setId(bookId);
        book.setName("Book " + bookId);
        book.setAuthors("Author " + bookId);
        book.setChapters(chapters);

        return book;
    }

    public static List<Chapter> generateDummyChapters(int numChapters) {
        List<Chapter> chapters = new ArrayList<>();

        for (int i = 1; i <= numChapters; i++) {
            Chapter chapter = generateDummyChapter(i);
            chapters.add(chapter);
        }

        return chapters;
    }

    public static Chapter generateDummyChapter(long chapterId) {
        Chapter chapter = new Chapter();
        chapter.setId(chapterId);
        chapter.setTitle("Chapter " + chapterId);
        chapter.setPages(20);

        return chapter;
    }
}