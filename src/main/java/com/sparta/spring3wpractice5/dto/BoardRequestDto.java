package com.sparta.spring3wpractice5.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardRequestDto {
    private String title;
    private String name;
    private String contents;
    private String password;
}
