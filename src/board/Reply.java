package board;

public class Reply {
	
	private int id; 
	private int parentId;
	private String body; 
	private String nickname; 
	private String regDate; 
	
	public Reply(int id, String body, String nickname, String regDate, int parentId) {
		super();
		this.id = id;
		this.body = body;
		this.nickname = nickname;
		this.regDate = regDate;
		this.parentId = parentId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
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
