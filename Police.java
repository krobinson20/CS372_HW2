public class Police extends Person implements Employee{
    public enum PoliceRole{Patrol, Sargent, Captain, Cheif};
    public PoliceRole Role;
    //PT -- javadoc throughout. -2
    public Police()
    {
        Role = PoliceRole.Patrol;
    }
    public Police(int _age, int _number, String _name, PolieceRole _role)
    {
        age = _age;
        phoneNumber= _number;
        Name = _name;
        Role = _role;
    }
    //You should be keeping track of how much they are paid. -1
    public boolean PayEmployee(Employee e){
        return true;
    }
    //PT -- ??? -2
    public boolean GetID(Employee e){
        return true;
    }
}
