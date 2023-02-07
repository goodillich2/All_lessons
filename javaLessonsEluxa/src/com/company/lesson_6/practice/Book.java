package com.company.lesson_6.practice;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Сработал метод принт для книги");
    }
}


