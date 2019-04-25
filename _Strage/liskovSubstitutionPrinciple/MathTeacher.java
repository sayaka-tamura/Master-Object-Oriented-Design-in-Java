package section2.liskovSubstitutionPrinciple;

public class MathTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Taught Math");
    }
}
