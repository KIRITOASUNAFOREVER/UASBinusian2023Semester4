package uas.code.reengineering.empat;
/*
 * 
 * Smell code			:
 * potential cause(s)	:
 * solution(s)			:
 * 
 */
public abstract class Triangle {
	private int radius;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public abstract int calculareAround();
	public int calculareArea() {
		return (22/7)*this.radius*this.radius;
	}
}
