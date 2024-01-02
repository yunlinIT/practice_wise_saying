package com.ws.wiseSaying.repository;

import java.util.ArrayList;
import java.util.List;

import com.ws.wiseSaying.entity.WiseSaying;

public class WiseSayingRepository {

	private int lastWiseSayingId; // 변수
	private List<WiseSaying> wiseSayings; // 어래이리스트타입의 변수

	public WiseSayingRepository() { // 생성자. wiseSayingRepository 객체 생성과 동시에
		lastWiseSayingId = 0; // 변수 세팅하고 0으로 초기화
		wiseSayings = new ArrayList<>(); // 어래이리스트 만듬
	}

	public int write(String content, String author) {
		int id = lastWiseSayingId + 1;
		WiseSaying wiseSaying = new WiseSaying(id, content, author);
		wiseSayings.add(wiseSaying);

		lastWiseSayingId = id;

		return id;
	}

	public List<WiseSaying> findAll() {
		return wiseSayings;
	}

	public WiseSaying findById(int id) {
		for (WiseSaying wiseSaying : wiseSayings) {
			if (wiseSaying.getId() == id) {
				return wiseSaying;
			}
		}
		return null;
	}

	public void remove(WiseSaying wiseSaying) {
		wiseSayings.remove(wiseSaying);
	}

	public void modify(WiseSaying wiseSaying, String content, String author) {
		wiseSaying.setContent(content);
		wiseSaying.setAuthor(author);
	}

		
	}

