package com.ws.wiseSaying.service;

import java.util.List;

import com.ws.wiseSaying.entity.WiseSaying;
import com.ws.wiseSaying.repository.WiseSayingRepository;

public class WiseSayingService {
	
	private WiseSayingRepository wiseSayingRepository; // WiseSayingRepository 변수

	public WiseSayingService() { // 생성자. wiseSayingService 객체 생성과 동시에 

		wiseSayingRepository = new WiseSayingRepository(); // WiseSayingRepository 객체 만듬
	}

	public int write(String content, String author) {
		
		return wiseSayingRepository.write(content,author);
	}

	public List<WiseSaying> findAll() {
		return wiseSayingRepository.findAll();
	}

	public WiseSaying findById(int id) {
		return wiseSayingRepository.findById(id);
	}

	public void remove(WiseSaying wiseSaying) {
		wiseSayingRepository.remove(wiseSaying);
	}

	public void modify(WiseSaying wiseSaying, String content, String author) {
		wiseSayingRepository.modify(wiseSaying, content, author);
	}

}
