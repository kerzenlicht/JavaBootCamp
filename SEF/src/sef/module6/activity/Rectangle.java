package sef.module6.activity;

public abstract class Rectangle extends Shape {


	    double length;
	    double breadth;

	    Rectangle(double length, double breadth)
	    {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    double getArea()
	    {
	        return length * breadth;
	    }

	    double getPerimeter()
	    {
	        return 2 * (length + breadth);
	    }
	}
	
