class Student extends person{
    private int num;
    Student(int no,String n2)
    {
        super(n2);
        this.num=no;
    }

    void setNum(int nu)
    {
        this.num=nu;
    }

    int getNum()
    {
        return this.num;
    }

    void display()
    {
        System.out.println("The Studno is " + this.getNum() + " the name of the Student is " + this.getName());
    }


}