package section2.liskovSubstitutionPrinciple;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Taught English");
    }
}
