package com.sparta.spring3wpractice5.controller;

import com.sparta.spring3wpractice5.dto.BoardCreateResponseDto;
import com.sparta.spring3wpractice5.dto.BoardRequestDto;
import com.sparta.spring3wpractice5.dto.BoardResponseDto;
import com.sparta.spring3wpractice5.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    // Service와 연결
    private final BoardService boardService;

    // 접속 테스트
    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    // 생성
    @PostMapping("/api/boards")
    public BoardCreateResponseDto createBoard(@RequestBody BoardRequestDto requestDto) {
        return boardService.createBoard(requestDto);
    }

    // 조회
    @GetMapping("/api/boards")
    public List<BoardResponseDto> getBoard() {
        return boardService.getBoard();
    }

    // 선택 조회
    @GetMapping("/api/boards/{id}")
    public BoardResponseDto getBoard(@RequestParam long id) {
        return boardService.getBoard(id);
    }

    // 수정
    @PutMapping("/api/boards/{id}")
    public BoardResponseDto updateBoard(@RequestParam long id, @RequestBody BoardRequestDto requestDto) {
        return boardService.updateBoard(id, requestDto);
    }

    // 삭제
    @DeleteMapping("/api/boards/{id}")
    public BoardResponseDto deleteBoard(@RequestParam long id) {
        return boardService.deleteBoard(id);
    }
}
