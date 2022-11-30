package com.sparta.spring3wpractice5.service;

import com.sparta.spring3wpractice5.dto.BoardCreateResponseDto;
import com.sparta.spring3wpractice5.dto.BoardRequestDto;
import com.sparta.spring3wpractice5.dto.BoardResponseDto;
import com.sparta.spring3wpractice5.entity.Board;
import com.sparta.spring3wpractice5.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {
    // Repository와 연결
    private final BoardRepository boardRepository;

    // 생성 로직
    public BoardCreateResponseDto createBoard(BoardRequestDto requestDto) {       // requestDto를 받고 BoardResponseDto를 반환
        Board board = new Board(requestDto);                                // entity선언후 requestDto 삽입
        boardRepository.save(board);                                        // Repository에 entity 저장
        return new BoardCreateResponseDto(board);                                 // entity -> Dto로 반환
    }
    // 조회 로직
    public List<BoardResponseDto> getBoard() {                                                       // BoardResponseDto를 List에 담아 반환
        List<Board> list = boardRepository.findAllByOrderByModifiedAtDesc();
        return list.stream().map(board -> new BoardResponseDto(board)).collect(Collectors.toList()); // entity -> Dto로 반환
    }

    // 선택 조회 로직
    public BoardResponseDto getBoard(long id) {
        Board board = boardRepository.findById(id).orElseThrow(                                  // 일치하는 id의 게시글 조회
                () -> new RuntimeException("게시글을 조회 할 수 없습니다.")                             // 일치하지 않을시
        );
        return new BoardResponseDto(board);                                                      // entity -> Dto 반환
    }

    // 수정 로직
    public BoardResponseDto updateBoard(Long id, BoardRequestDto requestDto) {
        Board board = boardRepository.findByIdAndPassword(id,requestDto.getPassword()).orElseThrow(
                () -> new IllegalArgumentException("아이디 비밀번호가 일치하지 않습니다")  // id와 password 일치여부 확인
        );
        board.update(requestDto);                                                 //
        boardRepository.save(board);                                              // update repository
        return new BoardResponseDto(board);                                       // entity -> Dto 반환
    }

    // 삭제 로직
    public BoardResponseDto deleteBoard(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(     // 일치하는 id 값 확인
                () -> new RuntimeException("일치하는 게시글이 없습니다")
        );
        boardRepository.delete(board);                              // delete
        return new BoardResponseDto(board);                         // entity -> Dto 반환
    }
}
