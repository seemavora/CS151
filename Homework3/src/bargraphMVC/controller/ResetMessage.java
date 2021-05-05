package bargraphMVC.controller;

public class ResetMessage implements Message{
	private String num;
	private String num2;
	private String num3;
	
	public ResetMessage(String num, String num2, String num3) {
		this.num = num;
		this.num2 = num2;
		this.num3 = num3;
	}
	public String getNum() {
		return "0";
	}
	
	public String getNum2() {
		return "0";
	}
	
	public String getNum3() {
		return "0";
	}
}
