public class Person {
    private int id;
    private String name;

    public Person(){}

    public Person(int id, 
                  String name){

                    System.out.println("Person's parameterized constructor initializing");
                    this.id=id;
                    this.name=name;
    }

    public void showDetails(){
        System.out.println("ID                 : "+id);
        System.out.println("Name               : "+name);
    }
}
