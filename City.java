
public class City{
    public static void main(String[] args){
    Person[] inhabitents = {new Police(), new Teacher(), new Kid()};
     Building[] buildings = {new CityHall(), new School()};
  
    for(Person p : inhabitents)
    {
        System.out.printf("%s\n", p.toString());
    }

    for(Building b : buildings)
    {
        System.out.printf("%s\n", b.toString());
    }
    if(buildings[0] instanceof CityHall)
    {
        for(int i=0; i < buildings[0].sizeofArray(); i++)
        {
            if(buildings[0].IsOfficer(i) == true)
            {
                System.out.printf("The officer's name is: %s\n", );
                if(buildings[0].IsEmployee(i) == true)
                {
                    System.out.printf("This employee was paid\n");
                }
            }
        }
    }
    else if(buildings[1] instanceof School)
    {
        for(int i=0; i< buildings[1].sizeofArray(); i++)
        {
            if(buildings[1].IsKid(i) == true)
            {
                System.out.printf("The child's name is: %s\n", );
            }
           else if(buildings[1].IsTeacher(i) == true)
            {
                System.out.printf("The Teacher's name is: %s\n", );
                if(buildings[1].IsEmployee(i) == true)
                {
                    System.out.printf("This employee was paid\n");
                }
            }
        }
        
    }
    }
}