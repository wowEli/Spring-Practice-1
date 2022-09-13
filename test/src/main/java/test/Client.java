package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		// Spring컨테이너를 동작시킬 수있도록 코드작성
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		// Spring 컨테이너야 나 phone객체 갖고싶어
		// == Lookup
		Phone phone=(Phone)factory.getBean("iphone");
		phone.powerOn();
		phone.volumeUp();
		phone.volumeDown();
		phone.powerOff();
		factory.close();
		
		/*
		BeanFactory bf=new BeanFactory();
		Phone phone=(Phone)bf.getBean(args[0]);
		phone.powerOn();
		phone.volumeUp();
		phone.volumeDown();
		phone.powerOff();
		*/
	}
}
