//수강신청 프로그램 학생 교수님 과목 수강신청 모델링

class Student {
	private String studentNo;
	private String name;
}
class Professor {
	private String professorNo;
	private String name;
}
class Subject {
	private String code;
	private String name;
	private Professor professor;
}
class Enrollment {
	private Subject subject;
	private Student student;
	private String regDate;
}
