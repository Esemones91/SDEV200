// Filename BowlingTeam
// Asgnmnt  M04 Ch8 Pg 290
// Written by Erick Semones
// Written on 9-11-2024



public class BowlingTeam 
{
    private String teamName;
    private String[] members = new String[4];

    public void setTeamName(String team)
    {
        teamName = team;
    }
    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamMember(int number, String name)
    {
        members[number] = name;
    }

    public String getTeamMember(int number)
    {
        return members[number];
    }
}
