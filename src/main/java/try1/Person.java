package try1;

class Person {
    private String name = "Amit";

    protected String sayHello() {
        name = "Aditya";
        return "Hello! " + name;
    }
}
