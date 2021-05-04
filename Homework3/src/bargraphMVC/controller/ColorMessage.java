package bargraphMVC.controller;

public class ColorMessage implements Message {
	String color;
	
	public ColorMessage(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}
