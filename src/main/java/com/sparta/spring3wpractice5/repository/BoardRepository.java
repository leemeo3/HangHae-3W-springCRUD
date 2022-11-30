package com.sparta.spring3wpractice5.repository;

import com.sparta.spring3wpractice5.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByModifiedAtDesc(); // 내림차순

    Optional<Board> findByIdAndPassword(Long id, int password); // id와 password 일치여부 확인
}
