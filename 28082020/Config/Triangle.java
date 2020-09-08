class Triangle extends Config {
    private double Dim3;
    Triangle()
    {

    }

    Triangle(double dimen1,double dimen2,double dimen3)
    {
        super(dimen1, dimen2);
        this.Dim3=dimen3;
    }

    void setDimension3(double dimension3)
    {
        this.Dim3=dimension3;
    }

    double getDimension3()
    {
        return this.Dim3;
    }

    double computeArea()
    {
        double s,area,under;
        s=(this.getDimension1()+this.getDimension2()+this.getDimension3())/2;
        under=(s*(s-this.getDimension1())*(s-this.getDimension2())*(s-this.getDimension3()));
        area=Math.sqrt(under);
        return area;
    }

    double computePeri()
    {
        double peri;
        peri=this.getDimension1()+this.getDimension2()+this.getDimension3();
        return peri;
    }
    
}