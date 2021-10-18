package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total:%d, avg:%f", exam.total(), exam.avg());
	}



	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;		
	}

}
