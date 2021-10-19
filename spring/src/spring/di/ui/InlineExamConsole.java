package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {

	@Autowired
	//@Qualifier("exam2") // 기본생성자를 호출하며 생성된다
	private Exam exam;
	
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (this.exam != null)
			System.out.printf("total:%d, avg:%f", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;		
	}

}
