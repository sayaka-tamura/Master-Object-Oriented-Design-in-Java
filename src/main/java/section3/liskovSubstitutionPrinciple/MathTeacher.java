// LSP states that subtypes must be substitutable for their basetypes
package section3.liskovSubstitutionPrinciple;

public class MathTeacher extends SchoolStaff implements CourseInstructor {

	@Override
	public void teach() {
		System.out.println("Taught Math");
	}
}
