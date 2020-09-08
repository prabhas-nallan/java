class RectanglePrizm extends Rectangle {
    private int dim3;
    RectanglePrizm()
    {

    }

    RectanglePrizm(int di1,int di2,int di3)
    {
        super(di1,di2);
        this.dim3=di3;

    }

    void setDimension3(int num3)
    {
        this.dim3=num3;
    }

    int getDimension3()
    {
        return this.dim3;
    }

    int computeprizmArea()
    {
        int surfaceArea;
        surfaceArea=(2*this.getDimension1()*this.getDimension2())+(2*this.getDimension2()*this.getDimension3())+(2*this.getDimension3()*this.getDimension1());
        return surfaceArea;
    }

    int computeVolume()
    {
        int volume;
        volume=this.getDimension1()*this.getDimension2()*this.getDimension3();
        return volume;
    }

    
}