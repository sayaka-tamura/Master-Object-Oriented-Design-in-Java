package section2.liskovSubstitutionPrinciple;

public class SchoolStaff {

    private void makeAnnouncements() {
        System.out.println("Made announcements...");
    }

    private void takeAttendence() {
        System.out.println("Took attendence...");
    }

    private void collectPaperwork() {
        System.out.println("Collected paperwork...");
    }

    private void conductHallwayDuties() {
        System.out.println("Conducted hallway duties...");
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendence();
        collectPaperwork();
        conductHallwayDuties();
    }
}
