
import java.time.LocalDateTime;

// Filename TestFusedLoopTime
// Asgnmnt  M03 Ch6 Tutorial Assignments
// Written by Erick Semones
// Written on 9-6-2024



public class TestFusedLoopTime 
{
    public static void main(String[] args) 
    {
        int startTime, endTime;
        int x;
        final int REPEAT = 5;
        final int FACTOR = 1_000_000;
        
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();

        for(x = 0; x < REPEAT; ++x)
        {
            method1();
        }
        for(x = 0; x < REPEAT; ++x)
        {
            method2();
        }

        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed separately: " + 
            ((endTime - startTime) / FACTOR) + " miliseconds");
        
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(x = 0; x < REPEAT; ++x)
        {
            method1();
            method2();
        }
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed together: " + 
            ((endTime - startTime) / FACTOR) + " miliseconds");
    }

    public static void method1()
    {

    }
    public static void method2()
    {

    }
}
