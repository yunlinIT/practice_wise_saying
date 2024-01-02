package com.ws;

import com.ws.system.controller.SystemController;
import com.ws.wiseSaying.controller.WiseSayingController;

public class App {
	
	private byte system_status = 1;
	
	public App() { // 생성자
		
	}
	
	public void run() { // run 메서드 
		System.out.println("== 명언 앱 실행 ==");
		
		SystemController systemController = new SystemController();
		WiseSayingController wiseSayingController = new WiseSayingController();
		
		while (true) {
			System.out.print("명령어 ) ");
			String cmd = Container.getScanner().nextLine().trim();
			Rq rq = new Rq(cmd); // rq 객체 만듬과 동시에 생성자로 cmd 입력받은거 메서드에서 요리하고 리턴해서 rq에 담음
			
			switch (rq.getActionCode()) {
			case "종료":
				systemController.exit();
				system_status = 0;
				break;
			case "등록":
				wiseSayingController.write();
				break;
			case "목록":
				wiseSayingController.list();
				break;
			case "삭제":
				wiseSayingController.remove(rq);
				break;
			case "수정":
				wiseSayingController.modify(rq);
				break;
			default:
				System.out.println("존재하지 않는 명령어입니다.");
				break;				
			
			}
			
		}
	}

}
