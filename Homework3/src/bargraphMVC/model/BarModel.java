package bargraphMVC.model;

public class BarModel {
    private String num;
    private String num2;
    private String num3;
    private String color;
//    private ArrayList<String> classes = new ArrayList<>();

    public void setNum(String num, String num2, String num3) {
    	int n = Integer.parseInt(num);
        if (n>0) {
            this.num = num;
        }
        int n2 = Integer.parseInt(num2);
        if (n2>0) {
            this.num2 = num2;
        }
        int n3 = Integer.parseInt(num3);
        if (n3>0) {
            this.num3 = num3;
        }

    }
    public void resetNum(String num, String num2, String num3) {
    	this.num = num;
    	this.num2 = num2;
    	this.num3 = num3;
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    public String getColor() {
    	return color;
    }

//    public void addClass(String name) {
//        this.classes.add(name);
//    }

    public String getNum() {
        return num;
    }

    public String getNum2() {
        return num2;
    }
    
    public String getNum3() {
        return num3;
    }
//    public ArrayList<String> getClasses() {
//        return (ArrayList<String>) classes.clone();
//    }
}
