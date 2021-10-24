package spring.aop.entity;

/*import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
*/
public class NewlecExam implements Exam {

	private int kor;
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
		//long start = System.currentTimeMillis();
		
		int result = this.kor + this.math + this.eng + this.com;
		
		if (kor > 100)
				throw new IllegalArgumentException("유효하지 않은 국어점수");
		
		try {
			Thread.sleep(200);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//long end = System.currentTimeMillis();
		
		//String message = (end - start) + "ms 시간";
		//System.out.println(message);
		return result;
	}

	@Override
	public double avg() {
		
		double result = total() / 4.0d;
		
		return result;
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", math=" + math + ", eng=" + eng + ", com=" + com + "]";
	}

}
