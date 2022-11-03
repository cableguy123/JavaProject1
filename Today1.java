// import java.util.ArrayList;
// import java.util.List;

// class People {
//     private String name;
 
//     People(String name) {
//         this.name = name;
        
//     }
//     @Override
//     public String toString() {
//         return name;
//     }

// }
// class Student extends People {
//     Student(String name) {
//         super(name);
//     }
// }
// class Worker extends People {
//     Worker(String name) {
//         super(name);
//     }
// }
// class Course<T> {
//     // 직장인,학생, 즉 사람들은 강좌를 한개 들을수있음
//     private String name;  
//     private List<T> list; // 여기다가 학생이름 넣어야됌
//     Course(String name) {
//         this.name = name;
//         list = new ArrayList<>();
//     }
//     public String getName() {
//         return name;
//     }
//     public List<T> getList() {
//         return list;
//     }
// }
// class CourseSystem {
//     public <T> void compare(Course<? extends People> course,T t) {
//         List<T> courseList;
//         courseList = (List<T>) course.getList();
//         courseList.add(t);
//         // Course,T t
//     }
//    public static void printCourse(Course<?> course) {
//     System.out.println(course.getName() + course.getList());
//    }
//    public static void printCourseStudent(Course<? extends Student> course) {
//     System.out.println(course.getName() + course.getList());
//    }
//    public static void printCourseWorker(Course<? extends Worker> course) {
//     System.out.println(course.getName() + course.getList());
//    }
   
// }

// public class Today1 {
//     public static void main(String[] args) {
//         Course<Worker> p1 = new Course<Worker>("직장인코스");
//         Course<Student> p2 = new Course<Student>("학생코스");
//         Course<People> p3 = new Course<People>("일반인과정!");
//         People people = new People("김이연");
//         Student student = new Student("김민수");
//         Worker worker = new Worker("알리바바");
//         CourseSystem cs = new CourseSystem();
//         cs.compare(p3, people);
//         cs.compare(p2,student);
//         cs.compare(p1, worker);
//         // 강의 등록했음
//         // 다음 출력을 해야지
//         CourseSystem.printCourse(p3);
//         CourseSystem.printCourse(p2);
//         CourseSystem.printCourse(p1);
        



        
//     }
// }
// 1.동물
// 2. 조류 포유류 , 어류
// 3. 매,개 생선
class Animal {
    
}
public class Today1 {
    public static void main(String[] args) {

    }
}