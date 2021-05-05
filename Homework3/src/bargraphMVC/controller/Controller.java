package bargraphMVC.controller;

import java.util.concurrent.BlockingQueue;

import bargraphMVC.controller.AddNMessage;
import bargraphMVC.model.BarModel;
import bargraphMVC.view.View;

public class Controller {
    BlockingQueue<Message> queue;
//    BlockingQueue<Message> queue2;
//    BlockingQueue<Message> queue3;
    BarModel barModel;
//    BarModel barModel2;
//    BarModel barModel3;
    View view;

    public Controller(BlockingQueue<Message> queue, BarModel barModel, View view) {
        this.queue = queue;
//        this.queue2 = queue2;
//        this.queue3 = queue3;
        this.barModel = barModel;
        this.view = view;
    }

    public void mainLoop() {
    	
        while (view.isDisplayable()) {
            Message message = null;
     
            try {
                message = queue.take();
           
            } catch (InterruptedException exception) {
                // do nothing
            }

             if(message.getClass() == AddNMessage.class) {
                // button addClass was clicked
                // update model and view
                AddNMessage num = (AddNMessage) message;
                barModel.setNum(num.getN());
                view.updateNumberInView(barModel.getNum());
             
//                
//                AddNMessage num2 = (AddNMessage) message2;
//                barModel.setNum(num2.getN());
//                view.updateListOfClassesInView(barModel2.getNum());
//                
//                AddNMessage num3 = (AddNMessage) message3;
//                barModel.setNum(num3.getN());
//                view.updateListOfClassesInView(barModel3.getNum());
            }

        }
    }
}
