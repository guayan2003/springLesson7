package lab7.ex4;

import javax.jms.Message;

public class MyMessageDrivenPojo implements javax.jms.MessageListener {

	public MyMessageDrivenPojo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		System.out.println("message received:" + arg0);
		
	}

}
