package bargraphMVC.controller;

public class AddNMessage implements Message{
	private String num;
	private String num2;
	private String num3;
	
	public AddNMessage(String num, String num2, String num3) {
		this.num = num;
		this.num2 = num2;
		this.num3 = num3;
	}
	public String getNum() {
		return num;
	}
	
	public String getNum2() {
		return num2;
	}
	
	public String getNum3() {
		return num3;
	}
//	}

//	public AddNMessage(String num) {
//		this.num = num;
//	}
//	
//	public String getN() {
//		return num;
//	}
}
