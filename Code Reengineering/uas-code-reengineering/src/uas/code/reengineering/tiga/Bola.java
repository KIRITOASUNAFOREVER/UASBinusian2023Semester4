package uas.code.reengineering.tiga;
/*
 * 
 * Smell code			:
 * potential cause(s)	:
 * solution(s)			:
 * 
 */
public class Bola implements Shape{
	private int side;

	public Bola(int side) {
		super();
		this.side = side;
	}

	@Override
	public float ballVolume() {
		// TODO Auto-generated method stub
		return (float) ((4/3)*Math.PI*this.side*this.side*this.side);
	}

	@Override
	public float ballArea() {
		// TODO Auto-generated method stub
		return (float) (4*Math.PI*this.side*this.side);
	}

	@Override
	public float ballAround() {
		// TODO Auto-generated method stub
		return (float) ((4/3)*Math.PI*this.side*this.side);
	}

	@Override
	public float squareArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float squareAround() {
		// TODO Auto-generated method stub
		return 0;
	}

}
