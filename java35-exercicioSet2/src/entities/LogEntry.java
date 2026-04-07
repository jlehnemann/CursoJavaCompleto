package entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {

    private String username;
    private Instant instant;

    public LogEntry(String username, Instant instant) {
        this.username = username;
        this.instant = instant;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(username, logEntry.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }
}
