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

		BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

		BarModel model = new BarModel();

		View view = new View(queue, model.getNum());
		Controller controller = new Controller(queue, model, view);
		controller.mainLoop();

	}
}
