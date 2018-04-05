package School.src.Project;

public class Discipline {
	private String disciplineName;
	private int lessonNumber;
	private int exerciseNumber;
	public Discipline(String disciplineName, int lessonNumber, int exerciseNumber) {
		
		this.setDisciplineName(disciplineName);
		this.setLessonNumber(lessonNumber);
		this.setExerciseNumber(exerciseNumber);
	}
	public String getDisciplineName() {
		return disciplineName;
	}
	
	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}
	
	public int getLessonNumber() {
		return lessonNumber;
	}
	public void setLessonNumber(int lessonNumber) {
		this.lessonNumber = lessonNumber;
	}
	public int getExerciseNumber() {
		return exerciseNumber;
	}
	public void setExerciseNumber(int exerciseNumber) {
		this.exerciseNumber = exerciseNumber;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb
		.append(this.disciplineName)
		.append(" ")
		.append(this.lessonNumber)
		.append(" ")
		.append(this.exerciseNumber);
		
		return sb.toString();
	}

}
