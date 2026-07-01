package com.ipl;

import java.util.Scanner;

public class TestIPL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Mumbai Indians
        Player[] miPlayers = {
        		new Player("Hardik Pandya",16.35,"Mumbai Indians"),
                new Player("Rohit Sharma",16.30,"Mumbai Indians"),
                new Player("Jasprit Bumrah",18.00,"Mumbai Indians"),
                new Player("Suryakumar Yadav",16.35,"Mumbai Indians"),
                new Player("Tilak Varma",8.00,"Mumbai Indians"),
                new Player("Trent Boult",12.50,"Mumbai Indians"),
                new Player("Deepak Chahar",9.25,"Mumbai Indians"),
                new Player("Naman Dhir",5.25,"Mumbai Indians"),
                new Player("Will Jacks",5.25,"Mumbai Indians"),
                new Player("Ryan Rickelton",1.00,"Mumbai Indians"),
                new Player("Mitchell Santner",2.00,"Mumbai Indians")
        };

        // Chennai Super Kings
        Player[] cskPlayers = {
        		new Player("Ruturaj Gaikwad",18.00,"Chennai Super Kings"),
                new Player("MS Dhoni",4.00,"Chennai Super Kings"),
                new Player("Ravindra Jadeja",18.00,"Chennai Super Kings"),
                new Player("Shivam Dube",12.00,"Chennai Super Kings"),
                new Player("Matheesha Pathirana",13.00,"Chennai Super Kings"),
                new Player("Ravichandran Ashwin",9.75,"Chennai Super Kings"),
                new Player("Devon Conway",6.25,"Chennai Super Kings"),
                new Player("Noor Ahmad",10.00,"Chennai Super Kings"),
                new Player("Khaleel Ahmed",4.80,"Chennai Super Kings"),
                new Player("Sam Curran",2.40,"Chennai Super Kings"),
                new Player("Rahul Tripathi",3.40,"Chennai Super Kings")
        };

        // Royal Challengers Bengaluru
        Player[] rcbPlayers = {
        		new Player("Virat Kohli",21.00,"Royal Challengers Bengaluru"),
                new Player("Rajat Patidar",11.00,"Royal Challengers Bengaluru"),
                new Player("Yash Dayal",5.00,"Royal Challengers Bengaluru"),
                new Player("Josh Hazlewood",12.50,"Royal Challengers Bengaluru"),
                new Player("Phil Salt",11.50,"Royal Challengers Bengaluru"),
                new Player("Jitesh Sharma",11.00,"Royal Challengers Bengaluru"),
                new Player("Bhuvneshwar Kumar",10.75,"Royal Challengers Bengaluru"),
                new Player("Liam Livingstone",8.75,"Royal Challengers Bengaluru"),
                new Player("Tim David",3.00,"Royal Challengers Bengaluru"),
                new Player("Krunal Pandya",5.75,"Royal Challengers Bengaluru"),
                new Player("Rasikh Dar",6.00,"Royal Challengers Bengaluru")
                
        };

        Team[] teams = {
                new Team("Mumbai Indians", miPlayers),
                new Team("Chennai Super Kings", cskPlayers),
                new Team("Royal Challengers Bengaluru", rcbPlayers)
        };

        System.out.println("----IPL Teams ----");

        for (int i = 0; i < teams.length; i++) {
            System.out.println((i + 1) + ". " + teams[i].getTeamName());
        }

        System.out.print("\nSelect Team : ");
        int teamChoice = sc.nextInt();

        Team selectedTeam = teams[teamChoice - 1];

        selectedTeam.displayPlayers();

        System.out.print("\nSelect Player : ");
        int playerChoice = sc.nextInt();

        Player selectedPlayer = selectedTeam.getPlayers()[playerChoice - 1];

        System.out.println("\n---- Player Details ----");

        selectedPlayer.displayPlayer();

        sc.close();
    }
}