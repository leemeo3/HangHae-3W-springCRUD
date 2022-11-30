package com.sparta.spring3wpractice5.dto;

import com.sparta.spring3wpractice5.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BoardCreateResponseDto {
    private Long id;
    private String title;
    private String name;
    private String contents;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public BoardCreateResponseDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.name = board.getName();
        this.contents = board.getContents();
        this.password = board.getPassword();
        this.createdAt  = board.getCreatedAt();
        this.modifiedAt = board.getModifiedAt();
    }
}
