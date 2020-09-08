class Config {
    private double Dim1,Dim2;
    Config()
    {

    }

    Config(Double d1,Double d2)
    {
        this.Dim1=d1;
        this.Dim2=d2;
    }

    void setDimension1(Double di1)
    {
        this.Dim1=di1;
    }

    void setDimension2(Double di2)
    {
        this.Dim2=di2;
    }
    
    double getDimension1()
    {
        return this.Dim1;
    }

    double getDimension2()
    {
        return this.Dim2;
    }

	
}