package uas.code.reengineering.tiga;
/*
 * 
 * Smell code			:
 * potential cause(s)	:
 * solution(s)			:
 * 
 */
public class Square implements Shape {
	
	private float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public float ballVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float ballArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float ballAround() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float squareArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

	@Override
	public float squareAround() {
		// TODO Auto-generated method stub
		return 4*this.side;
	}

}
