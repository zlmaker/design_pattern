package mediator;

public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    abstract public void getMessage(String message);
}
