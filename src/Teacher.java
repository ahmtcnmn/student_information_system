public class Teacher {
    String name;
    String mobilPhone;
    String branch;
    Teacher(String name, String mobilPhone, String branch){
        this.name=name;
        this.mobilPhone=mobilPhone;
        this.branch=branch;
    }

    void printTeacher(){
        System.out.println("Adı : "+name+",\nTelefon numarası : "+mobilPhone+",\nBranch : "+branch);
    }


}
