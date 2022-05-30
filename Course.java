/** Class that represents a Course. */
public class Course {
    // Data Fields
   private String CourseNum, CourseName;
    private int Credits, section;
    // Constructors
    /**
     * Default Constructor.
     */
    public Course() {
        CourseNum = "None";
        CourseName = "None";
        Credits = 0;
        section = 0;
    }

    /**
     * Initializes a Course object with all properties specified
     * @param Num Course number (Such as ITCS214).
     * @param Name Course name (Such as Data Structure).
     * @param Credits Course Credits.
     * @param section Course Section.
     */
    public Course(String Num, String Name, int Credits, int section) {
        CourseNum = Num;
        CourseName = Name;
        this.Credits = Credits;
        this.section = section;
    }

    /**
     *Course Name setter.
     * @param courseName set this courseName to courseName.
     */
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    /**
     * Course Number Setter.
     * @param courseNum set this courseNum to courseNum.
     */
    public void setCourseNum(String courseNum) {
        CourseNum = courseNum;
    }

    /**
     * Course Credits setter
     * @param credits set this credits to credits.
     */
    public void setCredits(int credits) {
        Credits = credits;
    }

    /**
     * Course Section Setter.
     * @param section set this Section to Section.
     */
    public void setSection(int section) {
        this.section = section;
    }

    /**
     * @return Course Credits.
     */
    public int getCredits() {
        return Credits;
    }

    /**
     *
     * @return Course Section.
     */
    public int getSection() {
        return section;
    }

    /**
     *
     * @return Course Name.
     */
    public String getCourseName() {
        return CourseName;
    }

    /**
     *
     * @return Course Number.
     */
    public String getCourseNum() {
        return CourseNum;
    }

    /**
     * Method to check equality of two Courses.
     * @param C1 To compare it with this object.
     * @return True if two objects of type Course are equal.
     */
    public boolean equals(Course C1) {
        if (this.getCourseName().equals(C1.getCourseName()) && this.getCourseNum().equals(C1.getCourseNum()) && this.getCredits() == C1.getCredits() && this.getSection() == C1.getSection())
            return true;
        else
            return false;
    }

    /**
     * toString Method to print Course Information.
     * @return String Representation of Course Information.
     */
    public String toString(){
        return "\nCourse Number: "+getCourseNum()+"\nCourse Name: "+getCourseName()+"\nCourse Credits: "+getCredits()+"\nSection: "+getSection()+"\n-------------------------------------";
    }
}