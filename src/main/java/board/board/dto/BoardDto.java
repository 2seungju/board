package board.board.dto;

import lombok.Data;
import board.common.*;

import java.util.List;

@Data
public class BoardDto {
	
	private List<BoardFileDto> fileList;
	
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private String createdDatetime;
	private String updaterId;
	private String updatedDatetime;
}
