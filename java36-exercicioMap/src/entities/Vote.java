package entities;

import java.util.Objects;

public class Vote {

    String candidate;
    Integer registeredVotes;

    public Vote(String candidate, int registeredVotes) {
        this.candidate = candidate;
        this.registeredVotes = registeredVotes;
    }

    public int getRegisteredVotes() {
        return registeredVotes;
    }

    public void setRegisteredVotes(int registeredVotes) {
        this.registeredVotes = registeredVotes;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return registeredVotes == vote.registeredVotes && Objects.equals(candidate, vote.candidate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidate, registeredVotes);
    }
}
