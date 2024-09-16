// Filename BowlingTeamDemo2
// Asgnmnt  M04 Ch8 Pg 282
// Written by Erick Semones
// Written on 9-13-2024

import java.util.*;

public class BowlingTeamDemo2 
{
    public static void main(String[] args) 
    {
        String teamName;
        String memberName;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        final int NUM_TEAM_MEMBERS = 4; 
        Scanner inputTeam = new Scanner(System.in);
        Scanner inputMember = new Scanner(System.in);

        // Loop to input team names and members
        for(int y = 0; y < NUM_TEAMS; ++y)
        {
            teams[y] = new BowlingTeam();
        
            System.out.println("Enter team name >>");
            teamName = inputTeam.nextLine();
            teams[y].setTeamName(teamName);

            // Input team members
            for(int x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.println("Enter team member's name >> ");
                memberName = inputMember.nextLine();
                teams[y].setTeamMember(x, memberName);
            }
        }

        // Loop to display team names and members
        for(int y = 0; y < NUM_TEAMS; ++y)
        {
            System.out.println("Members of team " + teams[y].getTeamName() + ":");
    
            // Display each team member on a new line
            for(int x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.println(teams[y].getTeamMember(x));
            }
            
            System.out.println();  // Blank line between teams for clarity
        }

        // Close the scanner to avoid resource leaks
        inputTeam.close(); 
        inputMember.close();
    }
}
