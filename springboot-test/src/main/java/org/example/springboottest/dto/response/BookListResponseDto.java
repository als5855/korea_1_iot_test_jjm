package org.example.springboottest.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.springboottest.entity.Category;

@Data
@NoArgsConstructor
public class BookListResponseDto {
    private Long id;
    private String book_title;
    private String book_author;
    private Category book_category;


    public BookListResponseDto(Long id, @NotBlank String bookTitle, String bookAuthor, Category bookCategory) {
        this.id = id;
        this.book_title = bookTitle;
        this.book_author = bookAuthor;
        this.book_category = bookCategory;

    }
}
