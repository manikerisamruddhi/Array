class Student {
    public String name;
    public int roll;

    Student(int roll,String name) {
        this.roll=roll;
        this.name=name;
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student[] arr=new Student[5];
        arr[0]=new Student(0,"samruddhi");
        arr[2]=new Student(2, "Samya");

        System.out.println("First and 3rd element name of array::"+arr[0].name+" "+arr[2].name);
    }
   
    
}