package board;

public class Reply {
	
	private int id; // 데이터 식별
	private String body; // 댓글 내용
	private String nickname; // 댓글 작성자
	private String regDate; // 데이터 추적
	
	public Reply(int id, String body, String nickname, String regDate) {
		super();
		this.id = id;
		this.body = body;
		this.nickname = nickname;
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}
