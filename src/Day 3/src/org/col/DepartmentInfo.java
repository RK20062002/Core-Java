package org.col;

public class DepartmentInfo {
	private void ug(String name) {
		System.out.println("Enter Degree : "+name);

	}
	
	private void ug(int no , int boys, int girls) {
		System.out.println("Total Number of Students : "+no);
		System.out.println("Total Number of Boys : "+boys);
		System.out.println("Total Number of Girls : "+girls);

	}
	
	private void ug(float fee) {
		System.out.println("Enter UG Fee : "+fee);

	}
	
	public static void main(String[] args) {
		DepartmentInfo dept = new DepartmentInfo();
		dept.ug("B.Sc");
		dept.ug(43, 25, 18);
		dept.ug(12000f);
	}

}
