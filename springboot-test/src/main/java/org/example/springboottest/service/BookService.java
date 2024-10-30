package org.example.springboottest.service;

import jakarta.validation.Valid;
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

    public PostBookRequestDto createBook(@Valid PostBookRequestDto dto) {

        Book book = new Book(
                null, dto.getBook_title(), dto.getBook_author(),
                dto.getCategory()
        );

        Book savedBook = bookRepository.save(book);
        return convertToResponseDto(savedBook);
    }





    public List<PostBookRequestDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(this::convertToResponseDto)
                .collect(Collectors.toList());
    }

    public List<PostBookRequestDto> getBookByCategory(Category category) {
        return bookRepository.findByCategory(category)
                .stream()
                .map(this::convertToResponseDto)
                .collect(Collectors.toList());
    }

    private PostBookRequestDto convertToResponseDto(Book savedBook) {


}
