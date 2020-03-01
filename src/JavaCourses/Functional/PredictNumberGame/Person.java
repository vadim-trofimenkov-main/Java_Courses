package JavaCourses.Functional.PredictNumberGame;

public class Person {
    private String name;
    private int guessNumber;


    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    int getGuessNumber() {
        return guessNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }


    @Override
    public String toString() {
        return "PersonGuessGame{" +
                "name='" + getName() + '\'' +
                ", guessNumber=" + getName() +
                '}';
    }
}