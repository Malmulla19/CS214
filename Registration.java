import java.util.*;
public class Registration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Roster Students =new Roster();
        System.out.println("=======Please Select a Number to Perform an Action=======");
        System.out.println("#1  Add A New Student.");
        System.out.println("#2  Modify an Existing Student's Record.");
        System.out.println("#3  Display Student's Record.");
        System.out.println("#4  Delete Student's Record.");
        System.out.println("#5  Check How Many Students are Registered.");
        System.out.println("#0  Exit the Program.");
        System.out.println("======================================================================");
        System.out.print("Your Choice: ");
        int Choice = in.nextInt();
        System.out.println("======================================================================");
        while (Choice != 0) {
            switch (Choice) {
                case 1:
                    Student S = new Student();
                    System.out.print("Student's First Name: ");
                    String FName = in.next();
                    S.setFirstName(FName);
                    System.out.println();
                    System.out.print("Student's Last Name: ");
                    String LName = in.next();
                    S.setLastName(LName);
                    System.out.println();
                    System.out.print("Student's Email: ");
                    String Email = in.next();
                    S.setEmail(Email);
                    System.out.println();
                    System.out.print("Student's Gender: ");
                    char Ge = in.next().charAt(0);
                    S.setGender(Ge);
                    System.out.println();
                    System.out.print("Student's ID: ");
                    long ID = in.nextLong();
                    S.setIdNum(ID);
                    System.out.println();
                    boolean Ch = Students.addStudent(S);
                    if (Ch)
                        System.out.println("Student Record Successfully Added.");
                      else{
                        System.out.println("Student Already Registered !");
                    System.out.println("======================================================================");
                   }
                    break;

                case 2:
                    System.out.print("Enter Student's ID: ");
                    long NID=in.nextLong();
                    System.out.println();
                    int Search= Students.searchStudent(NID);
                    if (Search !=-1){
                        System.out.println("======= Modifying an Existing Student's Data - Student's Data =======");
                        Students.printStudentDetails(NID);
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("======= Modifying an Existing Student's Data - Please Select a Number to Perform an Action =======");
                        System.out.println("#1  Add A New Course.");
                        System.out.println("#2  Delete an Existing Course");
                        System.out.println("#3  Exit to Main Menu");
                        System.out.print("Your Choice:  ");
                        int Choice3=in.nextInt();
                        switch (Choice3){
                            case 1:
                                System.out.println("Adding a New Course for: "+Students.studentsList.get(Search).getFirstName()+" "+Students.studentsList.get(Search).getLastName());
                                char Choice4 = 'Y';
                                while (Choice4 =='Y') {
                                    Course NC=new Course();
                                    System.out.print("Course Number:");
                                    String CourseNum=in.next();
                                    NC.setCourseNum(CourseNum);
                                    System.out.println();
                                    System.out.print("Course Name: ");
                                    String CourseName;
                                    in.nextLine();
                                    CourseName=in.nextLine();
                                    NC.setCourseName(CourseName);
                                    System.out.println();
                                    System.out.print("Course Credits: ");
                                    int CourseCredits=in.nextInt();
                                    NC.setCredits(CourseCredits);
                                    System.out.println();
                                    System.out.print("Section: ");
                                    int Section=in.nextInt();
                                    NC.setSection(Section);
                                    System.out.println();
                                    boolean Chk2=Students.addCourse(NC,NID);
                                    if (Chk2)
                                        System.out.println("Course Added Successfully !");
                                    else
                                        System.out.println("Couldn't Add the Course !");
                                    System.out.println("Add More? (Y/N)");
                                    Choice4=in.next().charAt(0);
                                }
                                break;
                            case 2:
                                System.out.println("Deleting an Exiting Course for: "+Students.studentsList.get(Search).getFirstName()+" "+Students.studentsList.get(Search).getLastName());
                                Course NC=new Course();
                                System.out.print("Course Number:");
                                String CourseNum=in.next();
                                NC.setCourseNum(CourseNum);
                                boolean Chk2=Students.deleteCourse(NC,NID);
                                if (Chk2)
                                    System.out.println("Course Deleted Successfully !");
                                else
                                    System.out.println("Couldn't Delete the Course !");
                                break;
                            case 3:
                                break;


                        }
                    }
                    else

                        System.out.println("Student Not Found!");
                    break;

                case 3:
                    System.out.print("Please Enter Student's ID:");
                    long NNID = in.nextLong();
                    System.out.println("=======Student's Data=======");
                    Students.printStudentDetails(NNID);
                    break;
                case 4:
                    System.out.print("Please Enter Student's ID to be Deleted:  ");
                    long ID1=in.nextLong();
                    int IF=Students.searchStudent(ID1);
                    if (IF!=-1){
                        Students.deleteStudent(ID1);
                        System.out.println("Record Successfully Deleted ! ");
                    }
                    else
                        System.out.println("No Data for "+ID1);
                    break;
                case 5:
                    System.out.println(Students.listSize()+" Student's are Registered.");
                    break;
            }
            System.out.println("=======Please Select a Number to Perform an Action=======");
            System.out.println("#1  Add A New Student.");
            System.out.println("#2  Modify an Existing Student's Record.");
            System.out.println("#3  Display Student's Record.");
            System.out.println("#4  Delete Student's Record.");
            System.out.println("#5  Check How Many Students are Registered.");
            System.out.println("#0  Exit the Program.");
            System.out.print("Your Choice: ");
            Choice = in.nextInt();
            System.out.println("======================================================================");
        }
        System.out.println("See You Soon ..");
        System.out.println("======================================================================");
        System.exit(0);
    }
}


