package org.example.springboottest.cotroller;


import lombok.RequiredArgsConstructor;
import org.example.springboottest.dto.request.PostBookRequestDto;
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
    public ResponseEntity<PostBookRequestDto>createBook(@RequestBody PostBookRequestDto dto) {
        PostBookRequestDto result = bookService.createBook(dto);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/list")
    public ResponseEntity<List<PostBookRequestDto>> getAllBooks() {
        List<PostBookRequestDto> result = bookService.getAllBooks();
        return ResponseEntity.ok(result);
    }


    @GetMapping("/category")
    public ResponseEntity<List<PostBookRequestDto>> getBookByCategory(@RequestParam Category category) {
        List<PostBookRequestDto> result = bookService.getBookByCategory(category);
        return ResponseEntity.ok(result);
    }



}
