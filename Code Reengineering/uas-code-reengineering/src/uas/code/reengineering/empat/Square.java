package uas.code.reengineering.empat;
/*
 * 
 * Smell code			:
 * potential cause(s)	:
 * solution(s)			:
 * 
 */
public class Square extends Triangle implements CalculateShape {
	
	private int side;
	public Square(int side) {
		super();
		this.side = side;
	}
	@Override
	public int calculareAround() {
		
		return 4*this.side;
	}
	@Override
	public int calculareArea() {
		return this.side*this.side;
	}

}
