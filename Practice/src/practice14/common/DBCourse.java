package practice14.common;

public class DBCourse implements Course {

	String name = "DB基礎";
	String[] unit = { "DB基礎", "SQR基礎", "正規化", "SQE応用" };

	public String getCourseName() {
		return PREFIX + name;
	}

	public String[] getCourseUnit() {
		return unit;
	}

}
