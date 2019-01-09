public class Police extends Person implements Employee{
    public enum PoliceRole{Patrol, Sargent, Captain, Cheif};
    public PoliceRole Role;
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
    public boolean PayEmployee(Employee e){
        return true;
    }
    public boolean GetID(Employee e){
        return true;
    }
}