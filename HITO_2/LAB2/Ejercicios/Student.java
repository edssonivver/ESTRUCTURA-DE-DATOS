package Ejercicios;

public class Student {

    private String fullname;
    private String lastname;
    private Integer age;

    public Student (String funame,String lname, Integer age)
    {
        this.fullname= funame;
        this.lastname= lname;
        this.age= age;
    }

    public void setFullname(String fullname)
    {
        this.fullname=fullname;
    }

    // GET PERMITE RETORNAR
    public String getFullName()
    {
        return this.fullname;
    }


    // metodo set permite cambiar el metodo de una clase
    public void setLastname(String lastname)
    {
        this.lastname=lastname;
    }
    public String getLastname()
    {
        return this.lastname;
    }

    public int getAge()
    {
         return this.age;
    }
    public void setAge (int age)
    {
        this.age=age;
    }

}
