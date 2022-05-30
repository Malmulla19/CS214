/** Class that represents a Course. */
import java.util.ArrayList;
public class Student {
    // Data Fields
    long idNum;
    String firstName, lastName, email;
    char gender;
    ArrayList<Course> courseRegistered;
    //Constructors.

    /**
     * Default Constructor that Initializes a Student object with all properties specified and creates ArrayList of type Course.
     */
    public Student(){
        idNum=20100000;
        firstName="Unknown";
        lastName="Unknown";
        email="20100000@uob.edu.st.bh";
        gender=' ';
        courseRegistered=new ArrayList<>();
    }

    /**
     * Constructor that Initializes a Student object with all properties specified and creates ArrayList of type Course.
     * @param id Student's ID.
     * @param FN Student's First Name.
     * @param LN Student's Last Name.
     * @param Em Student's Email.
     * @param G Student's Gender.
     */
    public Student(long id, String FN, String LN, String Em, char G){
        idNum=id;
        firstName=FN;
        lastName=LN;
        email=Em;
        gender=G;
        courseRegistered=new ArrayList<>();
    }

    /**
     * Student's Email Setter.
     * @param email set email value to this email value.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Student's Courses ArrayList setter.
     * @param courseRegistered set courseRegistered value to this courseRegistered value.
     */
    public void setCourseRegistered(ArrayList<Course> courseRegistered) {
        this.courseRegistered = courseRegistered;
    }

    /**
     * Student's First Name Setter.
     * @param firstName set firstName Value to this firstName Value.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Student's Gender Setter
     * @param gender set gender value to this gender value.
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Student's ID Setter.
     * @param idNum sets idNum value to this idNum Value.
     */
    public void setIdNum(long idNum) {
        this.idNum = idNum;
    }

    /**
     * Student's LastName Setter.
     * @param lastName sets lastName value to this lastName value.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Student's Gender getter.
     * @return Student's Gender.
     */
    public char getGender() {
        return gender;
    }

    /**
     * Student's ID getter.
     * @return Student's ID
     */
    public long getIdNum() {
        return idNum;
    }

    /**
     * Student's Email getter .
     * @return Student's Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     *Student's First Name getter.
     * @return Student's First Name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Student's Last Name Getter.
     * @return Student's Last Name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Student's Course Registered getter.
     * @return Student's Course Registered as an ArrayList.
     */
    public ArrayList<Course> getCourseRegistered() {
        return courseRegistered;
    }

    /**
     * Method to check equality of two ID Nums.
     * @param nID Compare it with this Object's ID.
     * @return true if the two ID'S are the same, false if not.
     */
    public boolean equals(long nID){
        if (getIdNum()==nID)
            return true;
        else
            return false;
    }

    /**
     * Prints String representation of Course Registered.
     */
    public void printCourseRegistered(){
        Course Obj;
        int Credits=0;
        for (int i=0; i<getCourseRegistered().size();i++){
            Obj=getCourseRegistered().get(i);
            Credits+=getCourseRegistered().get(i).getCredits();
            System.out.println("#"+(i+1));
            System.out.println("Course Number: "+Obj.getCourseNum());
            System.out.println("Course Name: "+Obj.getCourseName());
            System.out.println("Course Credits: "+Obj.getCredits());
            System.out.println("Section: "+Obj.getSection());
            System.out.println("===========================================");
        }
        System.out.println("Total Credits: "+Credits);
    }
}