package practice13;

import practice13.common.Person;

public class Employee extends Person {

	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

	private String departmentNm;
	private int departmentCnt;

	public void setDepartmentNm( String departmentNm ) {
		this.departmentNm = departmentNm;
	}

	public String departmentNm() {
		return this.departmentNm;
	}

	public void setDepartmentCnt( int departmentCnt ) {
		this.departmentCnt = departmentCnt;
	}

	public int getDepartmentCnt() {
		return this.departmentCnt;
	}



}
