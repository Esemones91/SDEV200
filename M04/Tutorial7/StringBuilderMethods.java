// Filename StringBuilderMethods
// Asgnmnt  M04 Ch7 Pg 257
// Written by Erick Semones
// Written on 9-9-2024



public class StringBuilderMethods 
{
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("singing");
        System.out.println(str);

        str.append(" in the dead of ");
        System.out.println(str);

        str.insert(0, "black ");
        System.out.println(str);

        str.insert(6, "bird ");
        System.out.println(str);

        str.append("night");
        System.out.println(str);
    }
}
