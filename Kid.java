public class Kid extends Person{
    private String favoriteCandy;

    public Kid()
    {
        favoriteCandy = "Twix";
    }
    public Kid(int _age, int _number, String _name, String _candy)
    {
        age = _age;
        phoneNumber= _number;
        Name = _name;
        favoriteCandy = _candy;
    }
}