package lab7.ex4;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

public class MdpContainer {

	public MdpContainer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("lab7/ex4/beans-config.xml");
		DefaultMessageListenerContainer container = 
				(DefaultMessageListenerContainer) context.getBean("myMDP");
		container.start();
		
	}

}
