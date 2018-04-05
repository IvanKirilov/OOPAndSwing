package School.src.Project;

public class Pupil {

	private String pupilName;
	private int pupilNumber;
	private String pupilClas;

	public Pupil(String pupilName, int pupilNumber, String pupilClas) {
		this.setPupilName(pupilName);
		this.setPupilNumber(pupilNumber);
		this.setPupilClas(pupilClas);
	}

	public String getPupilName() {
		return pupilName;
	}

	public void setPupilName(String pupilName) {
		this.pupilName = pupilName;
	}

	public int getPupilNumber() {
		return pupilNumber;
	}

	public void setPupilNumber(int pupilNumber) {
		this.pupilNumber = pupilNumber;
	}

	public String getPupilClas() {
		return pupilClas;
	}

	public void setPupilClas(String pupilClas) {
		this.pupilClas = pupilClas;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb
		.append(this.getPupilName())
		.append(" ")
		.append(this.getPupilNumber())
		.append(" ")
		.append(this.getPupilClas());
		return sb.toString();
	}
}
