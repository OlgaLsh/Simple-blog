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
@Table("comments")
public class Comment {
    @Id
    private Long id;
    private Long authorId;
    private Long postId;
    private LocalDateTime createdAt;;
    private String content;
}
