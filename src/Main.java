public class Main {
    public static void main(String[] args) {
        Teacher m1=new Teacher("Ahmet Hoca","555","MT");
        Teacher b1=new Teacher("Ayşe Hoca","556","BIO");
        Teacher f1=new Teacher("Salih Hoca","557","FİZ");

        Course matematik=new Course("Matematik","101","MT");
        matematik.addTeacher(m1);
        Course biyoloji=new Course("Biyoloji","102","BIO");
        biyoloji.addTeacher(b1);
        Course fizik=new Course("Fizik","103","FİZ");
        fizik.addTeacher(f1);


        Student s1=new Student("AhmetCan","123","4",matematik,biyoloji,fizik);
        s1.addBulkExamNote(100,50,75,15,100,25);
        s1.isPass();

        Student s2=new Student("Sedat","124","4",matematik,biyoloji,fizik);
        s2.addBulkExamNote(25,65,10,50,20,100);
        s2.isPass();
    }
}