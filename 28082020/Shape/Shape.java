class Shape {
    private int dim1,dim2;
    Shape()
    {

    }

    Shape(int d1,int d2)
    {
        this.dim1=d1;
        this.dim2=d2;
    }

    void setDimension1(int dimen1)
    {
        this.dim1=dimen1;
    }

    void setDimension2(int dimen2)
    {
        this.dim2=dimen2;
    }

    int getDimension1()
    {
        return this.dim1;
    }

    int getDimension2()
    {
        return this.dim2;
    }
    
}