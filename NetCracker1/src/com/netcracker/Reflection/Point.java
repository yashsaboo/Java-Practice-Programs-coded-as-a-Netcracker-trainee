package com.netcracker.Reflection;

public class Point {

	private Integer xCord;
	private Integer yCord;
	public Integer getxCord() {
		return xCord;
	}
	public void setxCord(Integer xCord) {
		this.xCord = xCord;
	}
	public Integer getyCord() {
		return yCord;
	}
	public void setyCord(Integer yCord) {
		this.yCord = yCord;
	}
	public Point(Integer xCord, Integer yCord) {
		super();
		this.xCord = xCord;
		this.yCord = yCord;
	}
	
	public void move(int x, int y)
	{
		this.xCord = x;
		this.yCord = yCord;
	}

}
