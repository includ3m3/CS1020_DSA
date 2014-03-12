// To compute the distance of the nearest pair of points
// among a list of points.

import java.util.*;
import java.awt.*;

public class NearestPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double minDist;

		int size = sc.nextInt();  // size of list;

		ArrayList<Point> points = new ArrayList<Point>(size);
		for(int i=0;i<size;i++){
			points.add(new Point(sc.nextInt(),sc.nextInt()));
		}
		/*
		for(Point p:points){
			System.out.println(p.x + "," +p.y);
		}
		*/
		minDist = distClosestPair(points);
		System.out.printf("Minimum distance = %.2f\n", minDist);
	}
	public static double distance(Point ptA,Point ptB){
		return Math.sqrt(Math.pow((ptA.x-ptB.x),2) + Math.pow((ptA.y-ptB.y),2));
	}
	public static double distClosestPair(ArrayList<Point> points){
		double closest = 1000.0;
		for(int i=0;i<points.size();i++){
			for(int j=i+1;j<points.size()-1;j++){
				double temp = distance(points.get(i),points.get(j));
				//System.out.println("temp : "+temp);
				if(temp < closest){
					closest = temp;
				}
			}
			
		}
		return closest;
	}
}

