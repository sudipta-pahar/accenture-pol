public class Student{
    
    private int id;
    private String name;
    private int marks[]=new int[100];
    private float average;
    private char grade;
    
    public Student(int id,String name,int a[])
    {
        this.id=id;
        this.name=name;
        this.marks=a;
    }
    
    /***** Setters & Getters ********/
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setMarks(int a[])
    {
        this.marks=a;
    }
    public int[] getMarks()
    {
        return marks;
    }
    public void setAverage(float a)
    {
        this.average=a;
    }
    public float getAverage()
    {
        return average;
    }
    public void setGrade(char g)
    {
        this.grade=g;
    }
    public char getGrade()
    {
        return grade;
    }
    
    public void calculateAvg()
    {
        int s=0;
        for(int i=0;i<marks.length;i++)
        {
            s=s+marks[i];
        }
        double d=s;
        average=(float)(d/marks.length);
    }
    
    public void findGrade()
    {
        int flag=0;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<50)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            if(average>=80 && average<=100)
                grade='O';
            else if(average>=50 && average<80)
                grade='A';
            else if(average<50)
                grade='F';
        }
        else
        {
            grade='F';
        }
    }
}




