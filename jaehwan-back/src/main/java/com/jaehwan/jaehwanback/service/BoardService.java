package com.jaehwan.jaehwanback.service;

import com.jaehwan.jaehwanback.model.Board;
import com.jaehwan.jaehwanback.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // get boards data
    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }

}