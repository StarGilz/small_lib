package com.small_library.loving_hands.book.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.small_library.loving_hands.book.dto.BookVo;
import com.small_library.loving_hands.book.service.BookService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @GetMapping("/list")
    public String list(Model model) {

        // List<BookVo> books = bookService.selectBookList();
        // model.addAttribute("books", books);        
        return "book/list";
    }

    @GetMapping("/regist")
    public String regist(Model model) {        
        List<BookVo> isbns = bookService.selectIsbn();
        List<BookVo> categories = isbns.stream()
            .collect(Collectors.toMap(BookVo::getCategory, book -> book, (existing, replacement) -> existing))
            .values()
            .stream()
            .collect(Collectors.toList());

        List<BookVo> subcategories = isbns.stream()
            .collect(Collectors.toMap(BookVo::getSubcategory, book -> book, (existing, replacement) -> existing))
            .values()
            .stream()
            .sorted(Comparator.comparing(BookVo::getSubcategory))
            .collect(Collectors.toList());

        model.addAttribute("categories", categories);
        model.addAttribute("subcategories", subcategories);
        model.addAttribute("isbns", isbns);
        return "book/regist";
    }

    @GetMapping("/status")
    public String status() {
        return "book/status";
    }
}
