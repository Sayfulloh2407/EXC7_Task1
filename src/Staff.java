public class Staff extends Person{
    private String Education;
    private String Position;
    Person Person = new Person();
    public void Input(){

        Person.Input();
        System.out.println("Please enter your Education Level:");
        Education=String.valueOf(scanner.next());
        System.out.println("Please enter your Position:");
        Position=String.valueOf(scanner.next());
    }
    public void Output(){
        Person.Output();
        System.out.println("Education: "+Education+"\nPosition: "+Position);
    }
}
