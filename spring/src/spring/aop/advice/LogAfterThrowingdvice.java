package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingdvice implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("���ܰ� �߻��߽��ϴ�. " + e.getMessage());
	}
}
