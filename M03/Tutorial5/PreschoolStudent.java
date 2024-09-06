// Filename PreschoolStudent
// Asgnmnt  M03 Ch5 Tutorial Assignment
// Written by Erick Semones
// Written on 9-4-2024



public class PreschoolStudent 
{
   int studentID;
   int studentAge; 
   final int HIGH_ID = 9999;
   final int HIGH_AGE = 6;

   public PreschoolStudent(int num, int age)
   {
        setStudentID(num);
        setStudentAge(age);
   }
   public void setStudentID(int num)
   {
        if(num <= HIGH_ID)
        {
            studentID = num;
        }
        else
        {
            studentID = 0;
        }
   }
   public void setStudentAge(int age)
   {
        if(age <= HIGH_AGE)
        {
            studentAge = age;
        }
        else
        {
            studentAge = 0;
        }
   }

   public int getStudentID()
   {
        return studentID;
   }

   public int getStudentAge()
   {
        return studentAge;
   }
}
