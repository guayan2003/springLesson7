package lab7.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class TestClient2 {

	public TestClient2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new ClassPathXmlApplicationContext("lab7/ex3/beans-config.xml");
		JmsTemplate jmst = (JmsTemplate) context.getBean("jmst");
		jmst.convertAndSend("Hello World!");
	}

}
