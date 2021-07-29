package uas.code.reengineering.dua;
/*
 * 
 * Smell code			:
 * potential cause(s)	:
 * solution(s)			:
 * 
 */
public class Courses {
	private CourseData couserData;
	public String getCourseId() {
		return couserData.courseId;
	}
	public void setCourseId(String courseId) {
		this.couserData.courseId = courseId;
	}
	public String getCourseName() {
		return couserData.courseName;
	}
	public void setCourseName(String courseName) {
		this.couserData.courseName = courseName;
	}
	public String getCourseCredit() {
		return couserData.courseCredit;
	}
	public void setCourseCredit(String courseCredit) {
		this.couserData.courseCredit = courseCredit;
	}
}
