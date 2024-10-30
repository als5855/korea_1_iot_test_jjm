package org.example.springboottest.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.springboottest.entity.Category;

@Data
@NoArgsConstructor
public class PostBookResponseDto {
    private Long id;
    private String book_title;
    private String book_author;
    private Category category;
}
