public class Person{
    protected String name;
    protected int age;
    protected int phoneNumber;
    protected static int lastusednumber = 1111111;
    public Person()
    {
        phoneNumber = lastusednumber;
        lastusednumber++;
        name = "John";
        age= 30;
    }
    
    //PT -- javadoc throughout. -2
public String toString(){
    return String.format("Persons' name is: %s" , name);
}
public void setname(String n)
{
    name = n;
}
public void setage(int n)
{
    //PT -- make sure you're getting a valid age and phone number. -2
     age = n;
}
public void setnumber(int n)
{
    phoneNumber = n;
}
public String getname()
{
    return name;
}
public int getage()
{
    return age;
}
public int getnumber()
{
    return phoneNumber;
}


}
