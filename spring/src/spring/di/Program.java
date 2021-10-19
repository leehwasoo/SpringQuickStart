package spring.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {
	public static void main(String[] args) {
		//Exam exam = new NewlecExam();
		
		//ExamConsole console = new InlineExamConsole(exam);
		/*���������� ���ϴ� ������� �ڵ��ۼ�
		 ExamConsole console = new GridExamConsole();
		//console.setExam(exam);
		console.print();*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
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
