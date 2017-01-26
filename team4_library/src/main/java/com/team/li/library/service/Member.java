package com.team.li.library.service;

public class Member {
	private int memberId;
	private String memberName;
	private String memberPh;
	private int mLevelNo;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPh() {
		return memberPh;
	}
	public void setMemberPh(String memberPh) {
		this.memberPh = memberPh;
	}
	public int getmLevelNo() {
		return mLevelNo;
	}
	public void setmLevelNo(int mLevelNo) {
		this.mLevelNo = mLevelNo;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberPh=" + memberPh + ", mLevelNo="
				+ mLevelNo + "]";
	}
	
	
}
