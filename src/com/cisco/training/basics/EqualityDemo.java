package com.cisco.training.basics;
class Point{
	int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object o) { //incomplete and sunstandard as of now
		Point other = (Point) o;
		if(this.x == other.x && this.y == other.y) {
			return true;
		}else {
			return false;
		}
	}
}
public class EqualityDemo {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = p1;
		//Point p2 = new Point(10, 20);
		
		System.out.println("p1 == p2? "+(p1 == p2));
		System.out.println("p1.equals(p2)? "+(p1.equals(p2)));
	}

}
