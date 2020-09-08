class Rectangle extends Shape {
    Rectangle()
    {

    }

    Rectangle(int d,int d2)
    {
        super(d,d2);
    }

    int computeArea()
    {
        int area;
        area=this.getDimension1()*this.getDimension2();
        return area;
    }

    int computePeri()
    {
        int peri;
        peri=2*(this.getDimension1()+this.getDimension2());
        return peri;
    }
    
}