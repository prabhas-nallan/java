class Batsmen extends CricketPlayer{
    private int number_of_centuries,number_of_halfcenturies;

    Batsmen()
    {

    }
    
    Batsmen(String n,int mapl,int runsScored,int no_cen,int no_half_cent)
    {
        super(n,mapl,runsScored);
        this.number_of_centuries=no_cen;
        this.number_of_halfcenturies=no_half_cent;
    }

    void setNumberOfCenturies(int num)
    {
        this.number_of_centuries=num;
    }

    void setNumberOfHalfCenturies(int num2)
    {
        this.number_of_halfcenturies=num2;
    }

    int getNumberOfCenturies()
    {
        return this.number_of_centuries;
    }

    int getNumberOfHalfCenturies()
    {
        return this.number_of_halfcenturies;
    }

    void display_Batsmen()
    {
        System.out.println("Name : " + this.getPlayerName());
        System.out.println("Matchs Played : " + this.getMatchesPlayed());
        System.out.println("Runs Scored :" + this.getRunsScored());
        System.out.println("Centuries : " + this.getNumberOfCenturies());
        System.out.println("Half Centuries " + this.getNumberOfHalfCenturies());
    }
    
}