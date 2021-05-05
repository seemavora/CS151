package bargraphMVC.controller;

public class AddNMessage implements Message{
	private String num;
	
//	public AddNMessage(String blue, String green, String red) {
//		this.blue = blue;
//		this.green = green;
//		this.red = red;
//	}
//	public String getBlue() {
//		return blue;
//	}
//	
//	public String getRed() {
//		return red;
//	}
//	
//	public String getGreen() {
//		return green;
//	}

	public AddNMessage(String num) {
		this.num = num;
	}
	
	public String getN() {
		return num;
	}
}
