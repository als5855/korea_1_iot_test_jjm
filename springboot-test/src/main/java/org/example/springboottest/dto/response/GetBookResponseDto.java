package org.example.springboottest.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetBookResponseDto {
    private Long id;
    private String book_title;
    private String book_author;
    private String category;

}
