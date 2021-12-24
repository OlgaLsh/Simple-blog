package ru.ifmo.blog.simpleblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("posts")
public class Post {
    @Id
    private Long id;
    private Long authorId;
    private LocalDateTime createdAt;
    private String title;
    private String content;
}
