package edu.kh.todoList.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// Getter + Setter + toString
@NoArgsConstructor
@AllArgsConstructor
@Builder // Todo라는 객체를 만들때 Builder 패턴 쓸 수 있다(TodoListDAOImpl)
public class Todo {
	private int todoNo; 			// todo 번호
	private String todoTitle; 		// todo 제목
	private String todoDetaiil; 	// todo 상세내용
	private boolean todoComplete; 	// todo 완료여부
	private String regDate; 		// todo 등록일 
	
}
