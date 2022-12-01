package com.sparta.spring3wpractice5.repository;

import com.sparta.spring3wpractice5.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByCreatedAtDesc(); // 생성시간 기준 내림차순

    Optional<Board> findByIdAndPassword(Long id, String password); // id와 password 일치여부 확인

}
