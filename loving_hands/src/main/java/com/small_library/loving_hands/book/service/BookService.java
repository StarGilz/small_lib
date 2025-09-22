package com.small_library.loving_hands.book.service;

import java.util.List;

import com.small_library.loving_hands.book.dto.BookVo;

public interface BookService {
    List<BookVo> selectBookList();
    void insertBook(BookVo book);
    List<BookVo> selectIsbn();
}
