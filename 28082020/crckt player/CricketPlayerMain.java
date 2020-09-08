import java.util.Scanner;
public class CricketPlayerMain {
    public static void main(String[] args) {
        String playername;
        int matchesPlayed,runsscored,centuries,halfcenturies;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player name");
        // sc.nextLine();
        playername=sc.nextLine();
        System.out.println("Enter the matchesPlayed");
        matchesPlayed=sc.nextInt();
        System.out.println("Enter the runs scored");
        runsscored=sc.nextInt();
        System.out.println("Enter the number of centuries");
        centuries=sc.nextInt();
        System.out.println("Enter the number of half centuries");
        halfcenturies=sc.nextInt();

        Batsmen b1=new Batsmen(playername, matchesPlayed, runsscored, centuries, halfcenturies);
        b1.display_Batsmen();
        sc.close();

    }
}