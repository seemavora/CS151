package bargraphMVC.view;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bargraphMVC.controller.AddNMessage;
import bargraphMVC.controller.Message;
import bargraphMVC.controller.ResetMessage;

public class View extends JFrame {
	 BlockingQueue<Message> queue;
//	 BlockingQueue<Message> queue2;
//	 BlockingQueue<Message> queue3;

	    JTextField textField, textField2, textField3;
	    JButton updateNumButton,resetButton;
	    JLabel colorNameLabel, colorNameLabel2, colorNameLabel3;
	    JLabel numLabel, numLabel2, numLabel3;
	    

	    public View(BlockingQueue<Message> queue,String num) {
	        
	    	this.queue = queue;
//	    	this.queue2 = queue;
//	    	this.queue3 = queue;

	        this.colorNameLabel = new JLabel("Red");
	        this.numLabel = new JLabel(String.valueOf(num));
	        this.textField = new JTextField(10);
	        this.updateNumButton = new JButton("Update N");

//
	        this.colorNameLabel2 = new JLabel("Blue");
	        this.numLabel2 = new JLabel(String.valueOf(num));
	        this.textField2 = new JTextField(10);
//	        this.updateNumButton2 = new JButton("Update N");
	        
	        this.colorNameLabel3 = new JLabel("Green");
	        this.numLabel3 = new JLabel(String.valueOf(num));
	        this.textField3 = new JTextField(10);
//	        this.updateNumButton3 = new JButton("Update N");
//	        
	        this.resetButton = new JButton("Reset");
	        
	        updateNumButton.addActionListener(e -> {
	            String value = textField.getText();
	                 
	            try {
	            	this.queue.put(new AddNMessage(textField.getText(), textField2.getText(), textField3.getText()));
//	                Message msg = new AddNMessage(value);
//	                queue.put(msg);
//	 
	            } catch (InterruptedException exception) {
	                // do nothing
	            }
	        });
	        resetButton.addActionListener(e -> {
	            String value = "0";
	                 
	            try {
            	this.queue.put(new ResetMessage("0", "0", "0"));
//	                Message msg = new AddNMessage(value,value,value);
//	                queue.put(msg);
	      
//	 
	            } catch (InterruptedException exception) {
	                // do nothing
	            }
	        });

	        this.add(colorNameLabel);
	        this.add(numLabel);
	        this.add(textField);
	        
	        this.add(colorNameLabel2);
	        this.add(numLabel2);
	        this.add(textField2);
//	        this.add(updateNumButton2);
	        
	        this.add(colorNameLabel3);
	        this.add(numLabel3);
	        this.add(textField3);
//	        this.add(updateNumButton3);

	        this.add(updateNumButton);
	        this.add(resetButton);

	        this.setSize(800, 800);
	        this.setLayout(new FlowLayout());
	        this.setVisible(true);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }


		public void updateColorName(String value) {
	        this.colorNameLabel.setText(value);
	    }

	    public void updateNumberInView(String num, String num2, String num3) {
	        this.numLabel.setText(num.toString());
	        this.numLabel2.setText(num2.toString());
	        this.numLabel3.setText(num3.toString());
	    }
	    
	    public void updateResetInView() {
	        this.numLabel.setText("0");
	        this.numLabel2.setText("0");
	        this.numLabel3.setText("0");
	    }

	  
}
