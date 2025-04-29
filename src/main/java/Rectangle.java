/*
 *   1. Create a Rectangle class:

It should have _length_ and _width_ as instance variables.</br>
Create 3 constructors.</br>
One that takes no parameters and sets _length_ to 4 and _width_ to 8</br>
One that takes 1 parameter used to set the _length_ and set the _width_ to 8.</br>
One that takes 2 parameters, using them to set the _length_ and _width_</br>
Create getters all instance variables.</br>

 */
public class Rectangle {

	private double length = 4;
	private double width = 8;

	
	/**
	 * creates a rectangle
	 * 
	 * @param length of the rectangle
	 * @param width of the rectangle
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * creates a rectangle of some length and a given width
	 * 
	 * @param length of the rectangle
	 */
	public Rectangle(double length) {
		this.length = length;
	}


	/**
	 * creates a default rectangle object
	 * 
	 */
	public Rectangle() {}

	/**
	 * Gets the length of the rectangle
	 * 
	 * @return the length of the rectangle
	 */
	public double getLength() {
		return this.length;
	}
	/**
	 * Gets the width of the rectangle
	 * 
	 * @return width of the rectangle
	 */
	public double getWidth() {
		return this.width;
	}
	
}