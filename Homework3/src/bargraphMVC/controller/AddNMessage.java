package bargraphMVC.controller;

public class AddNMessage implements Message{
	private String blue;
	private String green;
	private String red;
	
	public AddNMessage(String blue, String green, String red) {
		this.blue = blue;
		this.green = green;
		this.red = red;
	}
	public String getBlue() {
		return blue;
	}
	
	public String getRed() {
		return red;
	}
	
	public String getGreen() {
		return green;
	}

}
