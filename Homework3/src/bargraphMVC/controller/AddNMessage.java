package bargraphMVC.controller;

public class AddNMessage implements Message{
	private String n;
	
	public AddNMessage(String n) {
		this.n = n;
	}
	public String getN() {
		return n;
	}

}
