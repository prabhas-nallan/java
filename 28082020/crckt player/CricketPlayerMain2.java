import java.util.Scanner;
public class CricketPlayerMain2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String playername;
        int matchesPlayed,runsscored,wickets,no_5wickets;
        System.out.println("Enter the player name");
        // sc.nextLine();
        playername=sc.nextLine();
        System.out.println("Enter the matchesPlayed");
        matchesPlayed=sc.nextInt();
        System.out.println("Enter the runs scored");
        runsscored=sc.nextInt();
        System.out.println("Enter number of wickets");
        wickets=sc.nextInt();
        System.out.println("Enter the number of 5 wicket innings");
        no_5wickets=sc.nextInt();
        Bowler b2=new Bowler(playername, matchesPlayed, runsscored, wickets, no_5wickets);
        b2.display_Bowler();
        sc.close();

    }
}