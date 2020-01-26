import dao.CourseDao;
import dao.ProfessorDao;
import dao.StudentDao;
import entity.Course;
import entity.Professor;
import entity.Student;
import model.CourseModel;
import model.ProfessorModel;
import model.StudentModel;
import service.StudentService;

import java.util.Scanner;

public class App {
   static Student student;
   static StudentService studentService;
   static Professor professor;
   static ProfessorDao professorDao;
   static CourseDao courseDao;
    public static void main(String[] args) throws Exception {

        showMenu();


    }

    private static void showMenu() throws Exception{
        StudentDao studentDao = new StudentDao();
        studentService = new StudentService();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("1-Add a new Student");
            System.out.println("2-Add a new Professor");
            System.out.println("3-Add a new Course");
            System.out.println("4-Add a Course by a student");
            System.out.println("5-Add a course by a professor");
            System.out.println("6-List All students");
            System.out.println("7-List all professors");
            System.out.println("8-List all courses");
            System.out.println("9-List courses which given by a specific student(id)");
            System.out.println("10-List courses which taken by a specific professor(id)");
            System.out.println("0-Exit");
            System.out.println("Please enter the number of your choose: ");
            int num = input.nextInt();

            switch (num) {
                case 1:

                    System.out.println("Enter name");
                    String name = input.next();
                    System.out.println("Enter family");
                    String family = input.next();
                    System.out.println("Enter NumberCode");
                    long numberCode = input.nextInt();
                    System.out.println("Enter Address");
                    String Address = input.next();
                    studentService.save(new Student(name, family, numberCode,Address));
                    break;
                case 2:

                    System.out.println("Enter name");
                    String pname = input.next();
                    System.out.println("Enter family");
                    String pfamily = input.next();
                    System.out.println("Enter PersonalCode");
                    int personalCode = input.nextInt();
                    professorDao.saveProfessor(new Professor(pname,pfamily,personalCode));
                    break;
                case 3:
                    System.out.println("Enter name");
                    String cname = input.next();
                    System.out.println("Enter unit");
                    String unit = input.next();
                    courseDao.saveCourse(new Course(cname,unit));
                    break;
              /*  case 4:
                    System.out.println("Enter id");
                    int csid = input.nextInt();
                    System.out.println("Enter student id");
                    int st_i = input.nextInt();
                    System.out.println("Enter course_id");
                    int cids = input.nextInt();
                    m.insert_course_student(csid, st_i, cids);
                    break;
                case 5:
                    System.out.println("Enter id");
                    int cpcid = input.nextInt();
                    System.out.println("Enter professor id");
                    int pf_i = input.nextInt();
                    System.out.println("Enter course_id");
                    int ci_ds = input.nextInt();
                    m.insert_course_professor(cpcid, pf_i, ci_ds);
                    break;*/
                case 6:
                    showStudent();
                    break;
                case 7:
                    showProfessor();
                    break;
                case 8:
                    showCourse();
                    break;
             /*   case 9:
                    m.select_9();
                    break;
                case 10:
                    m.select_10();
                    break;*/
                case  0:
                    System.exit(0);
            }
        }
    }

    public static void showStudent(){
        //Student student = (Student) studentDao.getStudent();
        StudentModel studentModel = new StudentModel();
        studentModel.setFirstName(student.getFirstName());
        studentModel.setLastName(student.getLastName());
        studentModel.setNumberCode(student.getNumberCode());
        System.out.println(studentModel);

    }
    public static void showProfessor(){
        Professor professor = (Professor) professorDao.getProfessor();
        ProfessorModel professorModel = new ProfessorModel();
        professorModel.setFirstName(professor.getFirstName());
        professorModel.setLastname(professor.getLastname());
        professorModel.setNumberCodePersonnel(professor.getNumberCodePersonnel());
        System.out.println(professorModel);

    }
       public static void showCourse(){
        Course course = (Course) courseDao.getCourse();
        CourseModel courseModel = new CourseModel();
        courseModel.setTitle(course.getTitle());
        courseModel.setUnite(course.getUnite());
           System.out.println(courseModel);


    }
}
