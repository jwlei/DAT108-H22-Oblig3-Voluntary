package ex3.initializer.task4;

public class Fruit {
    String name;
    int votes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Fruit(String name) {
        this.votes = 0;
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void addVote() {
        this.votes++;
    }

}
