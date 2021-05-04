package bargraphMVC;

import java.awt.FlowLayout;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import javax.swing.Box;
import javax.swing.JPanel;

import bargraphMVC.controller.Controller;
import bargraphMVC.controller.Message;
import bargraphMVC.model.BarModel;
import bargraphMVC.view.View;

class App {
	public static void main(String[] args) {
		JPanel pnl = new JPanel(new FlowLayout());
		BlockingQueue<Message> queue = new LinkedBlockingQueue<>();
		BlockingQueue<Message> queue2 = new LinkedBlockingQueue<>();
		BlockingQueue<Message> queue3 = new LinkedBlockingQueue<>();

		BarModel model = new BarModel();
	
		View view = new View(queue,queue2, queue3, model.getNum());
		Controller controller = new Controller(queue,queue2, queue3, model, view);
		controller.mainLoop();
		
//		BarModel model2 = new BarModel();
//		View view2  = new View(queue2, model2.getNum(), "green");
//		Controller controller2 = new Controller(queue2, model2, view2);
//		controller2.mainLoop();

	}
}
