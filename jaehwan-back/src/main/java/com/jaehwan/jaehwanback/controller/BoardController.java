package com.jaehwan.jaehwanback.controller;

import com.jaehwan.jaehwanback.model.Board;
import com.jaehwan.jaehwanback.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    // get all board
    @GetMapping("/board")
    public List<Board> getAllBoards() {

        System.out.println("연결됨.....");
        List<Board> getAllBoards = boardService.getAllBoard();
        System.out.println(getAllBoards);
        return getAllBoards;
    }
}