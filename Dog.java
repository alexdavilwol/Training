package Training;

public class Dog {

    String name;
    int age;
    double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public void showExcitement(){
        System.out.println(name + " is wagging their tail!!");
    }

    public void showExcitement(int levelOfExcitement){
        System.out.println(name + " is wagging their tail!! Their level is " + levelOfExcitement + "!!");
    }

    public void eating(){
        System.out.println(name + " eating!");
    }

    public void eating(String food){
        System.out.println(name + " eating " + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class DogTest{

    public static void main(String[] args) {

        Dog dog1 = new Dog("Sparky", 2, 25.0);
        Dog dog2 = new Dog("Gerald", 13, 49.9);

        System.out.println(dog1);
        System.out.println(dog2);

        dog1.showExcitement();
        dog2.showExcitement();

        dog1.showExcitement(12);
        dog2.showExcitement(5);

        dog1.eating();
        dog2.eating();

        dog1.eating("Kibble");
        dog2.eating("Grass");

    }

}
