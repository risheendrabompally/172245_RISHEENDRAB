package com.exc;

public class Customer {
	private String name;
	private boolean member;
	private String memberType;
	public Customer(String name) {
		this.setName(name);
		
	}
	public String getname() {
		return getName();
		
	}
	public boolean ismember() {
		return member;
	}
	public boolean setmember(boolean member) {
		this.member=member;
		return member;
	}
	public String memberType() {
		return memberType;
	}
	public String  setmemberType(String membertype) {
		this.memberType=memberType;
		return memberType;
	}
	@Override
	public String toString() {
		return "Customer [name=" + getName() + ", member=" + member + ", memberType=" + memberType + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}