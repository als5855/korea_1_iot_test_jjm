package org.example.springboottest.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostBookRequestDto {
    @NotNull
    private String book_title;
    @NotNull
    private String book_ahthor;
    @NotNull
    private String catogory;

}
