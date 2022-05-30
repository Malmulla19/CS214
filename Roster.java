/*
Student's Name: Mahdi Mulla Ali
Student's ID: 20180401
Section: 2
 */
import java.util.ArrayList;
import java.util.LinkedList;
public class Roster {
    // Data Fields.
        LinkedList<Student> studentsList;
        int size;

    /**
     * Default Constructor to Creates new Students ArrayList and initialize ArrayList Size.
     */
    public Roster(){
            studentsList=new LinkedList<>();
            size=studentsList.size();
        }

    /**
     * Method to add a new Student to the list.
     * @param S Object of type Student.
     * @return true if the Student was Added Successfully, else, returns false.
     */
    public boolean addStudent(Student S){
            for (int i=0; i<studentsList.size(); i++) {
                if (S.equals(studentsList.get(i).getIdNum())) {
                    return false;
                }
            }
            studentsList.add(size,S);
                size++;

            return true;
        }

    /**
     * Method to search for a specific Student by his or her ID number.
     * @param ID Student's ID Number.
     * @return if the student was found returns his or her index in the list, else returns -1.
     */
    public int searchStudent(long ID){
            if (size==0)
                return -1;
            for (Student S:studentsList){
                if (S.getIdNum()==ID){
                    return studentsList.indexOf(S);
                }
            }
            return -1;
        }

    /**
     * Method to delete a specific Student by his or her ID.
     * @param ID Student's ID.
     * @return true if Student was successfully deleted from the list, else returns false.
     */
    public boolean deleteStudent(long ID){
            if (isEmpty())
                return false;
            if (searchStudent(ID)==-1)
                return false;
            studentsList.remove(searchStudent(ID));
            size--;
            return true;
        }

    /**
     * Method to check if there is any student inside StudentList.
     * @return true if List is Empty, Else returns False.
     */
    public boolean isEmpty(){
      return (listSize()==0);
        }

    /**
     *
     * @return actual number of elements (Students).
     */
    public int listSize(){return size;}

    /**
     * Method to add a new Course for a specific Student by his or her ID.
     * @param Obj Object of Type Course.
     * @param IDNum Student's ID Number.
     * @return true if the course was added successfully, else returns false.
     */
        public boolean addCourse(Course Obj, long IDNum){
            if (searchStudent(IDNum)==-1)
                return false;
            Student S=studentsList.get(searchStudent(IDNum));
            System.out.println("===== Student Name: "+S.getFirstName()+" "+S.getLastName()+" ===== ");
            ArrayList <Course> C1;
            C1=S.getCourseRegistered();
           for (int i=0; i<C1.size();i++){
                if (C1.get(i).equals(Obj))
                    return false;
           }
            C1.add(Obj);
            int credits=0;
            for (int i=0; i<C1.size();i++){
                credits+=C1.get(i).getCredits();
            }
            if (credits>=18) {
                C1.remove(Obj);
                return false;
            }
            S.setCourseRegistered(C1);
            return true;
        }

    /**
     *Method to delete a course for a specific Student by his or her ID.
     * @param Obj Object of Type Course.
     * @param ID Student's ID Number.
     * @return true if the course was deleted successfully, else returns false.
     */
        public boolean deleteCourse(Course Obj, long ID){
            if (studentsList.isEmpty())
                return false;
            if (searchStudent(ID)==-1)
                return false;
            Student TempStudent=studentsList.get(searchStudent(ID));
            ArrayList <Course> C1;
            C1=TempStudent.getCourseRegistered();
            for (int i=0; i<C1.size();i++){
                if (Obj.getCourseNum().equals(TempStudent.getCourseRegistered().get(i).getCourseNum())){
                    C1.remove(i);
                    TempStudent.setCourseRegistered(C1);
                    return true;
                }
            }
                return false;
        }

    /**
     * Method to print Student's Details IF FOUND.
     * @param ID Student's ID.
     */
    public void printStudentDetails(long ID) {
            if (searchStudent(ID) != -1) {
                int LOC=searchStudent(ID);
                Student S=studentsList.get(LOC);
                System.out.println("Student's Name: "+S.getFirstName()+" "+S.getLastName());
                System.out.println("Student's ID: "+S.getIdNum());
                System.out.println("Student's Email: "+S.getEmail());
                System.out.println("Student's Gender: "+S.getGender());
                System.out.println("Registered Courses: ");
                S.printCourseRegistered();
            }
            else
                System.out.println("No Student Found for " + ID + " Please Make sure that the entered ID is correct.");
        }
}
