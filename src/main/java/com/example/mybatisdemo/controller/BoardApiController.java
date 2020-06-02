package com.example.mybatisdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybatisdemo.dto.BoardDto;
import com.example.mybatisdemo.service.BoardService;

@RequestMapping(path = "/api")
@RestController
public class BoardApiController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping
	public List<BoardDto>selectBoardList() throws Exception {
		return boardService.selectBoardList();
	}
}
