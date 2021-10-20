package spring.di;


import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		//Exam exam = new NewlecExam();
		
		//ExamConsole console = new InlineExamConsole(exam);
		/*스프링에게 시하는 방식으로 코드작성
		 ExamConsole console = new GridExamConsole();
		//console.setExam(exam);
		console.print();*/
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		 
			/*
			 * List<Exam> exams = (List<Exam>) context.getBean("exams"); //exams.add(new
			 * NewlecExam(10,10,10,10)); for (Exam example : exams) {
			 * System.out.println(example.toString()); }
			 */
	}
}
