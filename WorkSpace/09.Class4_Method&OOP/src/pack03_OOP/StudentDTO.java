package pack03_OOP;

public class StudentDTO {
	String name;
	String[] subject;
	int[] score;
	String grade;
	int num;
	public StudentDTO(String name, String[] subject, int[] score, int num) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public String getName(String name) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject(int i) {
		return subject[i];
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public int getScore(int i) {
		return score[i];
	}
	public void setScore(int[] score) {
			this.score = score;			
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getNum(int i) {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	/*public StudentDTO(String name, String[] subject) {
		super();
		this.name = name;
		this.subject = subject;
		if(subject != null) {
			this.scores = new int[subject.length];
		}
		Random r = new Random();
		for (int i = 0; i < scores.length; i++) {
			scores[i] = r.nextInt(100)+1;
		}
	}*/
}
