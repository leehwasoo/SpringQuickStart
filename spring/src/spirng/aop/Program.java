package spirng.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewlecExam(1,1,1,1);

		Exam examProxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[] {Exam.class}, 
				new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
				long start = System.currentTimeMillis();
				
				Object result = method.invoke(exam, args);
				
				long end = System.currentTimeMillis();
				
				String message = (end - start) + "ms �ð��� �ɷȽ��ϴ�.";
				System.out.println(message);
				return result;
			}
		});
		
		System.out.printf("total is %d\n", examProxy.total());
		System.out.printf("total is %f\n", examProxy.avg());
	}

}
