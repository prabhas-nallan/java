class Rectangle2 extends Config {
    Rectangle2()
    {

    }

    Rectangle2(double d1,double d2)
    {
        super(d1, d2);
    }

    double computeArea()
    {
        double area;
        area=this.getDimension1()*this.getDimension2();
        return area;
    }

    double computePeri()
    {
        double peri;
        peri=2*(this.getDimension1()+this.getDimension2());
        return peri;
    }
}