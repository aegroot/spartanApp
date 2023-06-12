package nl.itvitae.spartans.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Game {
    @Id
    @GeneratedValue
    private long id;

    private boolean isFinished;

    private  int totalNumberOfContestants;


    public long getId() {
        return id;
    }

    public int getTotalNumberOfContestants() {
        return totalNumberOfContestants;
    }

    public Game() {
    }

    public Game(int totalNumberOfContestants) {
        this.isFinished=false;
        this.totalNumberOfContestants = totalNumberOfContestants;
    }

    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
