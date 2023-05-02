package dto;

import org.apache.ibatis.type.Alias;

@Alias ("Under")// 마이바티스 TypeAlias 이름 지정 어노테이션
public class Underscore {

	private String userId;
	private String userPw;

	public Underscore() {
	}

	public Underscore(String userId, String userPw) {
		super();
		this.userId = userId;
		this.userPw = userPw;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	@Override
	public String toString() {
		return "underscore [userId=" + userId + ", userPw=" + userPw + "]";
	}

}
