package bargraphMVC.model;

import java.util.ArrayList;

public class BarModel {
    private String num;
    private String color;
//    private ArrayList<String> classes = new ArrayList<>();

    public void setNum(String num) {
    	int n = Integer.parseInt(num);
        if (n>0) {
            this.num = num;
        }
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

//    public ArrayList<String> getClasses() {
//        return (ArrayList<String>) classes.clone();
//    }
}
