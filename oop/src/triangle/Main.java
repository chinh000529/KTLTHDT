package triangle;

LopTriangle/Main.java
package LopTriangle;
import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
	public static void main8396297(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}


LopTriangle/Point.java
package LopTriangle;
import java.util.*;
public class Point {
	private float x;
	private float y;
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public static Point nextPoint(Scanner sc) {
		Point p = new Point();
		p.x = sc.nextFloat();
		p.y = sc.nextFloat();
		return p;
	}
	
	
}


LopTriangle/Triangle.java
package LopTriangle;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public float getPerimeter() {	
		float e = dodai(a,b) + dodai(b,c) + dodai(a,c);
		return (float)(Math.round(e*1000.0)/1000.0);
	}
	
	public float dodai(Point a,Point b) {
		float c = (a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY());
		return (float)Math.sqrt(c);
	}
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean valid() {
		if((dodai(a,b) + dodai(b,c) > dodai(a,c)) && (dodai(a,c) + dodai(a,b) > dodai(b,c)) && (dodai(a,c) + dodai(b,c) > dodai(a,b))){
//			System.out.println(dodai(a,b) + " " + dodai(b,c) + " " + dodai(a,c));
			return true;
		}
//		System.out.println(dodai(a,b) + " " + dodai(b,c) + " " + dodai(a,c));
		return false;
	}
}

