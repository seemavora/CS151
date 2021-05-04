package bargraphMVC.controller;

import java.util.concurrent.BlockingQueue;

import bargraphMVC.controller.AddNMessage;
import bargraphMVC.model.BarModel;
import bargraphMVC.view.View;

public class Controller {
    BlockingQueue<Message> queue;
    BlockingQueue<Message> queue2;
    BlockingQueue<Message> queue3;
    BarModel barModel;
    BarModel barModel2;
    BarModel barModel3;
    View view;

    public Controller(BlockingQueue<Message> queue, BlockingQueue<Message> queue2,BlockingQueue<Message> queue3, BarModel barModel, View view) {
        this.queue = queue;
        this.queue2 = queue2;
        this.queue3 = queue3;
        this.barModel = barModel;
        this.view = view;
    }

    public void mainLoop() {
    	
        while (view.isDisplayable()) {
            Message message = null;
            Message message2 = null;
            Message message3 = null;
            try {
                message = queue.take();
                message2 = queue2.take();
                message3 = queue3.take();
            } catch (InterruptedException exception) {
                // do nothing
            }

//            if(message.getClass() == ColorMessage.class ||message2.getClass() == ColorMessage.class || message3.getClass() == ColorMessage.clas ) {
//                // button updateStudentName was clicked
//                ColorMessage color = (ColorMessage) message;
//                ColorMessage color2 = (ColorMessage) message2;
//                ColorMessage color3 = (ColorMessage) message3;
//                barModel.setColor(color.getColor()); // update model
//                view.updateColorName(barModel.getColor()); // update view
//            }
             if(message.getClass() == AddNMessage.class||message2.getClass() == AddNMessage.class||message3.getClass() == AddNMessage.class) {
                // button addClass was clicked
                // update model and view
                AddNMessage num = (AddNMessage) message;
                barModel.setNum(num.getN());
                view.updateListOfClassesInView(barModel.getNum());
                
                AddNMessage num2 = (AddNMessage) message2;
                barModel.setNum(num2.getN());
                view.updateListOfClassesInView(barModel2.getNum());
                
                AddNMessage num3 = (AddNMessage) message3;
                barModel.setNum(num3.getN());
                view.updateListOfClassesInView(barModel3.getNum());
            }

        }
    }
}
