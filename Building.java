//PT -- javadoc. -2
public class Building{
protected String name;
protected String address;
    //PT -- look at ArrayList, which is more flexible than arrays
public Person[] occupants= {};
public Building()
{
    name = "Whitworth";
    address = "123456 SE 7th Ave";
}
public String toString(){
    return String.format("this building's name is: %s" , name);
}
public void setname(String n)
{
    name = n;
}
public void setaddress(String n)
{
    address = n;
}
public String getname()
{
    return name;
}
public String getaddress()
{
    return address;
}

public int sizeofArray()
{
    return occupants.length;
}

public Boolean IsOfficer(int i)
{
    //PT -- how about: return occupants[i] instanceOf Police;
    if(occupants[i] instanceof Police)
    {
        return true;
    }
    else 
    return false;
}
public Boolean IsKid(int i)
{
    if(occupants[i] instanceof Kid)
    {
        return true;
    }
    else return false;
}
public Boolean IsTeacher(int i)
{
    if(occupants[i] instanceof Teacher)
    {
        return true;
    }
    else
    return false;
}

public Boolean IsEmployee(int i)
{
    if(occupants[i] instanceof Employee)
    {
        return true;
    }
    else
    return false;
}

}
