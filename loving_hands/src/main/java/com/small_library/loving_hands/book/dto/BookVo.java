package com.small_library.loving_hands.book.dto;

import lombok.Data;

@Data
public class BookVo {
    // 도서 등록
    private int id;
    private String title;
    private String author;
    private String isbn;
    private String create_date;
    private String update_date;
    
    // isbn
    private String name;
    private String category;
    private String subcategory;
}
