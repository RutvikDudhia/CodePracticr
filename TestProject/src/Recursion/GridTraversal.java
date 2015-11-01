package Recursion;

import java.util.ArrayList;

public class GridTraversal {
	
	ArrayList<Point> arraylist = new ArrayList<Point>();
	public class Point {
		
		int x;
		int y;
		
	public Point(int x,int y)
		{
			this.x =x;
			this.y = y;
		}
		
	}
	
	public boolean traverseGrid(int x, int y)
	{
		Point p = new Point (x,y);
		arraylist.add(p);
		if(x==0 && y == 0)
			return true;
		boolean success = false;
		if(x>=1 && is_free(x-1,y))
		{
			
			success = traverseGrid(x-1, y);
			
		}
		if(!success && y>=1 && is_free(x,y-1))
			
			success = traverseGrid(x, y-1);
		if(!success)
			arraylist.remove(p);
		
		return success;
	}
	
	public boolean is_free(int x,int y)
	{
		for(Point p : arraylist)
		{
			if(p.x == x && p.y == y)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridTraversal grid = new GridTraversal();
		boolean ans = grid.traverseGrid(8, 15);
		for(Point p : grid.arraylist)
			System.out.println("X = " + p.x +" and Y = " + p.y);

	}

}
