package entity;

public class findbug1 {
	public static void main(String [] args){
		int year=2012;
		double students=80000;
		while (students<200000) {		
			students=students*(1+0.25);
			year++;
		}
		System.out.println(year+"年学员满20万");
	}
}
