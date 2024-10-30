package org.example.springboottest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//책 고유 id

    //책이름
    @NotBlank
    private String book_title;

    @Column(nullable = false, length = 255)
    private String book_author;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Category book_category;


}
