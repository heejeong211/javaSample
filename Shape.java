abstract class Shape {
	private int borderColor;
	private int borderWidth;
	private int fillColor;

	public void draw() {
		System.out.println("Draw shape");
	}

	public abstract void move(int x, int y);

	public abstract void rotate(int raidan);

	public final int getBorderColor() {
		return borderColor;
	}

	public final void setBorderColor(int color){
		this.borderColor = color;
	}
    
	//getter of borderWidth
	public final int getBorderWidth() {
		return borderWidth;
	}
	
	//setter of borderWidth
	public final void setBorderWidth(int width) {
		this.borderWidth = width;
	}
	
	public final void getFillColor() {
		return fillColor;
	}

	public final void setFillColor(int color) {
		thif.fillColor = color;

}
