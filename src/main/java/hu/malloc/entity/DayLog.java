package hu.malloc.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_DAY_LOG")
public class DayLog {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String log;

    // spring-data needs it
    public DayLog() {
    }

    public DayLog(String log) {
        this.log = log;
    }

    public long getId() {
        return id;
    }

    public String getLog() {
        return log;
    }

    @Override
    public String toString() {
        return "DayLog{" +
                "id=" + id +
                ", log='" + log + '\'' +
                '}';
    }
}
