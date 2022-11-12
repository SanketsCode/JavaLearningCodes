package AdvanceOOPS;

public class Rectangle {
	
	private int length;
	private int width;
	
	Rectangle(int length,int width){
		this.length = length;
		this.width = width;
	}
	

	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2 * (length + width);
	}
	
	public String toString() {
		return String.format("width - %d length - %d area - %d perimeter - %d ", length,width,area(),perimeter());
	}
}
