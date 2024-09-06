// Filename PreschoolDemo
// ASgnmnt  M03 Ch5 Tutorial Assignment
// Written by Erick Semones
// Written on 9-6-2024



public class PreschoolDemo 
{
    public static void main(String[] args) 
    {
        PreschoolStudent ps1 = new PreschoolStudent(2345, 5);
        PreschoolStudent ps2 = new PreschoolStudent(67890, 8);

        display(ps1);
        display(ps2);
        ps1.setStudentAge(6);
        display(ps1);
        ps1.setStudentAge(7);
        display(ps1);
    }
    public static void display(PreschoolStudent ps)
    {
        System.out.print("Student ID " + ps.getStudentID());
        System.out.println("Student Age " + ps.getStudentAge());
        System.out.println();
    }
}
