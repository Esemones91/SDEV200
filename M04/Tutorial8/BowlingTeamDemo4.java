// Filename BowlingTeamDemo4
// Asgnmnt  M04 Ch8 Pg 291
// Written by Erick Semones
// Written on 9-14-2024



import java.util.*;

public class BowlingTeamDemo4
{
    public static void main(String[] args) 
    {
        String teamName;
        String memberName;
        int x, y; // Subscript variables
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        final int NUM_TEAM_MEMBERS = 4; 
        Scanner inputTeam = new Scanner(System.in);
        Scanner inputMember = new Scanner(System.in);
        Scanner inputRoster = new Scanner(System.in);

        getTeamData(teams);

        // Loop to display team names and members
        for(y = 0; y < NUM_TEAMS; ++y)
        {
            System.out.println("Members of team " + teams[y].getTeamName() + ":");
    
            // Display each team member on a new line
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.println(teams[y].getTeamMember(x));
            }
            
            System.out.println();  // Blank line between teams for clarity
        }

        System.out.print("\n\nEnter a team name to see its roster >> ");
        teamName = inputRoster.nextLine();

        for(y = 0; y < teams.length; ++y)
        {
            if(teamName.equals(teams[y].getTeamName()))
            {
                for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
                {
                    System.out.print(teams[y].getTeamMember(x) + " ");
                    System.out.println();
                }
            }
        }

        // Close the scanner to avoid resource leaks
        inputTeam.close(); 
        inputMember.close();
        inputRoster.close();
    }

    public static void getTeamData(BowlingTeam[] teams)
    {
        String teamName;
        String memberName;
        final int NUM_TEAMS = 4;
        final int NUM_TEAM_MEMBERS = 4;
        int x, y;
        Scanner inputTeam = new Scanner(System.in);
        Scanner inputMember = new Scanner(System.in);

        // Loop to input team names and members
        for(y = 0; y < NUM_TEAMS; ++y)
        {
            teams[y] = new BowlingTeam();
        
            System.out.println("Enter team name >>");
            teamName = inputTeam.nextLine();
            teams[y].setTeamName(teamName);

            // Input team members
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.println("Enter team member's name >> ");
                memberName = inputMember.nextLine();
                teams[y].setTeamMember(x, memberName);
            }
        }
    }
}