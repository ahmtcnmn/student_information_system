public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int soz;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note=0;
        int soz=0;

    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else System.out.print("Öğrentmen ve ders bölümleri uyuşmuyor.");

    }


    void printTeacherInfo(){
        this.teacher.printTeacher();
    }


}
