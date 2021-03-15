package solution.dto;

import java.io.Serializable;

public class BoardDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public int boardIdx;
	
	public String title;
	
	public String content;
	
	public int hitCnt;
	
	public String regId;
	
	public String regDate;

	public int getBoardIdx() {
		return boardIdx;
	}

	public void setBoardIdx(int boardIdx) {
		this.boardIdx = boardIdx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHitCnt() {
		return hitCnt;
	}

	public void setHitCnt(int hitCnt) {
		this.hitCnt = hitCnt;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "BoardDto [boardIdx=" + boardIdx + ", title=" + title + ", content=" + content + ", hitCnt=" + hitCnt
				+ ", regId=" + regId + ", regDate=" + regDate + "]";
	}
}