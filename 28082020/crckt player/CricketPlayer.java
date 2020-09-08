class CricketPlayer {
    private String name;
    private int matches_played;
    private int runs_scored;

    CricketPlayer()
    {
        
    }

    CricketPlayer(String n,int mp,int rs)
    {
        this.name=n;
        this.matches_played=mp;
        this.runs_scored=rs;
    }

    void setPlayerName(String pname)
    {
        this.name=pname;
    }

    void setMatches_played(int no_mp)
    {
        this.matches_played=no_mp;
    }

    void setRunsScored(int No_runs)
    {
        this.runs_scored=No_runs;
    }

    String getPlayerName()
    {
        return this.name;
    }

    int getMatchesPlayed()
    {
        return this.matches_played;
    }

    int getRunsScored()
    {
        return this.runs_scored;
    }
    
}