package com.small_library.loving_hands.book.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.small_library.loving_hands.book.dto.BookVo;

@Mapper
public interface BookMapper {
    List<BookVo> selectBookList();
    void insertBook(BookVo book);
    List<BookVo> selectIsbn();
}
