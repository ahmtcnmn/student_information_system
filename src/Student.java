public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;

    double avarage;
    double c1ort;
    double c2ort;
    double c3ort;


    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note11, int note2, int note22, int note3, int note33) {
        if ((note1 >= 0 && note1 <= 100) && (note11 >= 0 && note11 <= 100)) {
            this.c1.note = note1;
            this.c1.soz = note11;
        }
        if (((note2 >= 0 && note2 <= 100) && (note22 >= 0 && note22 <= 100))) {
            this.c2.note = note2;
            this.c2.soz = note22;
        }
        if ((note3 >= 0 && note3 <= 100) && (note33 >= 0 && note33 <= 100)) {
            this.c3.note = note3;
            this.c3.soz = note33;
        }
    }

    void Avarage(double note1, double soz1, double note2, double soz2, double note3, double soz3) {
        this.c1ort=(note1*0.80)+(soz1*0.20);
        this.c2ort=(note2*0.80)+(soz2*0.20);
        this.c3ort=(note3*0.80)+(soz3*0.20);
        avarage=(c1ort+c2ort+c2ort)/3;
    }

    void isPass() {
        Avarage(this.c1.note, this.c1.soz, this.c2.note, this.c2.soz, this.c3.note, this.c3.soz);
        if (this.avarage >= 50) {
            System.out.println("================================");
            System.out.println("Sınıfı geçtiniz.!");
            this.isPass = true;
        } else {
            System.out.println("================================");
            System.out.println("Sınıfı geçemediniz.Seneye tekrar görüşürüz");
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.name + " Not ortalamanız:\t" + this.c1ort);
        System.out.println(c2.name + " Not ortalamanız:\t" + this.c2ort);
        System.out.println(c3.name + " Not ortalamanız:\t" + this.c3ort);
        System.out.println("Ortalamanız:\n" + this.avarage);
    }

}
