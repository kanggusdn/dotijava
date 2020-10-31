package upgrade;

public class Chapter06_Student2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;

	public Chapter06_Student2() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Chapter06_Student2.serialNum = serialNum;
	}
}