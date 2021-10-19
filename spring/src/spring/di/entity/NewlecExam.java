package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class NewlecExam implements Exam {

	@Value("20")
	private int kor;
	@Value("20")
	private int math;
	private int eng;
	private int com;
	
	public NewlecExam() {
		
	}
	
	public NewlecExam(int kor, int math, int eng, int com) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.kor + this.math + this.eng + this.com;
	}

	@Override
	public double avg() {
		// TODO Auto-generated method stub
		return total() / 4.0d;
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", math=" + math + ", eng=" + eng + ", com=" + com + "]";
	}

}
