public class Room {
	private double length, width, height;
	private static final double DEFAULT_DIMENSION=10, DEFAULT_WINDOW_WIDTH=3, DEFAULT_WINDOW_HEIGHT=6, DEFAULT_DOOR_WIDTH=3, DEFAULT_DOOR_HEIGHT=8;

	public Room() {
		setLength(DEFAULT_DIMENSION);
		setWidth(DEFAULT_DIMENSION);
		setHeight(DEFAULT_DIMENSION);	
	}
	public Room(double newLength, double newWidth, double newHeight) {
		setLength(newLength);
		setWidth(newWidth);
		setHeight(newHeight);		
	}
	
	public double getLength() { return length; }
	public double getWidth() { return width; }
	public double getHeight() { return height; }
	
	public double getFloorArea() {
		return length*width;
	}
	
	public void setLength(double newLength) { 
		if (newLength>0) {
			length=newLength;
		}
		else {
			length=DEFAULT_DIMENSION;
		}
	}
	public void setWidth(double newWidth) { 
		if (newWidth>0) {
			width=newWidth;
		}
		else {
			width=DEFAULT_DIMENSION;
		}
	}
	public void setHeight(double newHeight) { 
		if (newHeight>0) {
			height=newHeight;
		}
		else {
			height=DEFAULT_DIMENSION;
		}
	}	
	public String toString() { return length + "x" + width + "x" + height; }	
}