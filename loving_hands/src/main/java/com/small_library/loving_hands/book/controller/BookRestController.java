package com.small_library.loving_hands.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.small_library.loving_hands.book.dto.BookVo;
import com.small_library.loving_hands.book.service.BookService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookRestController {
    private final BookService bookService;

    @PostMapping("/regist")
    public ResponseEntity<?> registBook(@RequestBody BookVo bookVo) {
        try{
            bookService.insertBook(bookVo);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            log.error("Error registering book: ", e);
            return ResponseEntity.status(500).body("도서 등록에 실패했습니다.");
        }
    }
    
}
