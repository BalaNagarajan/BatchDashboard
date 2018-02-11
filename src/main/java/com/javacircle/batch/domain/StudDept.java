package com.javacircle.batch.domain;

/**
 * 
 * @author Bala
 *
 */
public class StudDept {

	private String studCount;
	private String deptName;

	public String getStudCount() {
		return studCount;
	}

	public void setStudCount(String studCount) {
		this.studCount = studCount;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "StudDept [studCount=" + studCount + ", deptName=" + deptName + "]";
	}

}
