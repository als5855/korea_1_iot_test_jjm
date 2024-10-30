package org.example.springboottest.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.springboottest.entity.Category;

@Data
@NoArgsConstructor
public class PostBookRequestDto {
    @NotNull
    private String book_title;
    @NotNull
    private String book_author;
    @NotNull
    private Category category;

}
