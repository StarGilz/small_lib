package com.small_library.loving_hands.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.small_library.loving_hands.book.dto.BookVo;
import com.small_library.loving_hands.book.mapper.BookMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookMapper bookMapper;

    @Override
    public List<BookVo> selectBookList() {
        return bookMapper.selectBookList();
    }

    @Override
    public void insertBook(BookVo book) {
        bookMapper.insertBook(book);
    }

    @Override
    public List<BookVo> selectIsbn() {
        return bookMapper.selectIsbn();
    }
    
    
}
