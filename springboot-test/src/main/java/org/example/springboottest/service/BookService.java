package org.example.springboottest.service;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.springboottest.dto.request.PostBookRequestDto;
import org.example.springboottest.dto.response.BookListResponseDto;
import org.example.springboottest.entity.Book;
import org.example.springboottest.entity.Category;
import org.example.springboottest.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public BookListResponseDto createBook(@Valid PostBookRequestDto dto) {
        Book book = new Book(
                null, dto.getBook_title(), dto.getBook_author(),
                dto.getCategory()
        );

        Book savedBook = bookRepository.save(book);
        return convertToResponseDto(savedBook);
    }


    public List<BookListResponseDto> getAllBooks() { // 반환 타입 수정
        return bookRepository.findAll()
                .stream()
                .map(this::convertToResponseDto)
                .collect(Collectors.toList());
    }

    public List<BookListResponseDto> getBookByCategory(Category category) { // 반환 타입 수정
        return bookRepository.findByCategory(category)
                .stream()
                .map(this::convertToResponseDto)
                .collect(Collectors.toList());
    }
    private BookListResponseDto convertToResponseDto(Book book) {
        return new BookListResponseDto(
                book.getId(), book.getBook_title(), book.getBook_author(), book.getBook_category()
        );
    }

}
