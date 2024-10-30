package org.example.springboottest.cotroller;


import lombok.RequiredArgsConstructor;
import org.example.springboottest.dto.request.PostBookRequestDto;
import org.example.springboottest.dto.response.BookListResponseDto;
import org.example.springboottest.entity.Category;
import org.example.springboottest.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/")
    public ResponseEntity<BookListResponseDto>createBook(@RequestBody PostBookRequestDto dto) {
        BookListResponseDto result = bookService.createBook(dto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/list")
    public ResponseEntity<List<BookListResponseDto>> getAllBooks() {
        List<BookListResponseDto> result = bookService.getAllBooks();
        return ResponseEntity.ok(result);
    }


    @GetMapping("/category")
    public ResponseEntity<List<BookListResponseDto>> getBookByCategory(@RequestParam Category category) {
        List<BookListResponseDto> result = bookService.getBookByCategory(category);
        return ResponseEntity.ok(result);
    }



}
