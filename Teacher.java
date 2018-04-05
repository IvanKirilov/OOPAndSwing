package School.src.Project;

public class Teacher {
	private String teacherName;
	private String teachingDiscipline;

	public Teacher(String teacherName, String teachingDiscipline) {

		this.setTeacherName(teacherName);
		this.setTeachingDiscipline(teachingDiscipline);
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeachingDiscipline() {
		return teachingDiscipline;
	}

	public void setTeachingDiscipline(String teachingDiscipline) {
		this.teachingDiscipline = teachingDiscipline;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.teacherName)
		.append(" ")
		.append(this.teachingDiscipline);

		return sb.toString();
	}
}
