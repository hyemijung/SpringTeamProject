package kr.co.jsphomme.member.vo;

import java.util.Date;

public class MemberVo {
	
	private int memberNo;
	private int status;
	private String authority;
	private String name;
	private String id;
	private String password;
	private String adress;
	private String hp;
	private Date creDate;
	private Date modDate;
	
	
	
	public MemberVo() {
		super();
	}



	public MemberVo(int memberNo, int status, String authority, String name, String id, String password, String adress,
			String hp, Date creDate, Date modDate) {
		super();
		this.memberNo = memberNo;
		this.status = status;
		this.authority = authority;
		this.name = name;
		this.id = id;
		this.password = password;
		this.adress = adress;
		this.hp = hp;
		this.creDate = creDate;
		this.modDate = modDate;
	}



	public int getMemberNo() {
		return memberNo;
	}



	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public String getAuthority() {
		return authority;
	}



	public void setAuthority(String authority) {
		this.authority = authority;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public String getHp() {
		return hp;
	}



	public void setHp(String hp) {
		this.hp = hp;
	}



	public Date getCreDate() {
		return creDate;
	}



	public void setCreDate(Date creDate) {
		this.creDate = creDate;
	}



	public Date getModDate() {
		return modDate;
	}



	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}



	@Override
	public String toString() {
		return "MemberVo [memberNo=" + memberNo + ", status=" + status + ", authority=" + authority + ", name=" + name
				+ ", id=" + id + ", password=" + password + ", adress=" + adress + ", hp=" + hp + ", creDate=" + creDate
				+ ", modDate=" + modDate + "]";
	}
	
	
	
	
	
	
	
}

	