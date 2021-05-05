public class Customer{
    private String name;
    private String panno;
    private String emailid;
    private int salary;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setPanno(String panno){
        this.panno = panno;
    }
    public String getPanno(){
        return panno;
    }
    
    public void setEmailid(String emailid){
        this.emailid = emailid;
    }
    public String getEmailid(){
        return emailid;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    
    public Customer(String name, String panno, String emailid, int salary){
        this.name= name;
        this.panno= panno;
        this.emailid= emailid;
        this.salary= salary;
    }
    
    @Override
    public boolean equals(Object obj){
        Customer cc= (Customer) obj;
        if((panno.equals(cc.panno)) && (emailid.equals(cc.emailid))){
            return true;
        }
        return false;
    }
}