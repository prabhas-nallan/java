class Bowler extends CricketPlayer {
    private int number_of_wickets,number_of_5Wicket_innings;
    Bowler()
    {

    }

    Bowler(String name_player,int matches_played,int runsscored,int no_w,int no_5_wickets)
    {
        super(name_player,matches_played,runsscored);
        this.number_of_wickets=no_w;
        this.number_of_5Wicket_innings=no_5_wickets;
    }

    void setNumberOfWickets(int no_wickets)
    {
        this.number_of_wickets=no_wickets;
    }

    void setNumberOf5Wicket(int no_5_wicket)
    {
        this.number_of_5Wicket_innings=no_5_wicket;
    }

    int getNumberOfWickets()
    {
        return this.number_of_wickets;
    }

    int getNumberof5wicketInnings()
    {
        return this.number_of_5Wicket_innings;
    }

    void display_Bowler()
    {
        System.out.println("Name : " + this.getPlayerName());
        System.out.println("Matches Played : " + this.getMatchesPlayed());
        System.out.println("Runs Scored : " + this.getRunsScored());
        System.out.println("Number of wickets : " + this.getNumberOfWickets());
        System.out.println("Number of 5 wicket Innings : " + this.getNumberof5wicketInnings());
    }
}