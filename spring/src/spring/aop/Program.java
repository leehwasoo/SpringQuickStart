package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;
import spring.di.NewlecDIConfig;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				//new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
		
		Exam examProxy = (Exam) context.getBean("proxy");
		
		System.out.printf("total is %d\n", examProxy.total());
		System.out.printf("total is %f\n", examProxy.avg());
		
		/*
		 * ExamConsole console = (ExamConsole) context.getBean("console");
		 * 
		 * Exam exam = new NewlecExam(1,1,1,1);
		 * 
		 * Exam examProxy = (Exam)
		 * Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[]
		 * {Exam.class}, new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws IllegalAccessException, IllegalArgumentException,
		 * InvocationTargetException { long start = System.currentTimeMillis();
		 * 
		 * Object result = method.invoke(exam, args);
		 * 
		 * long end = System.currentTimeMillis();
		 * 
		 * String message = (end - start) + "ms 시간이 걸렸습니다.";
		 * System.out.println(message); return result; } });
		 */
	}

}
