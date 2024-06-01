package UzumHomeWorksJaloliddinMustafoev;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
