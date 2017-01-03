package hu.malloc.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_DAY_LOG")
public class DayLog {

    @Id
    @GeneratedValue
    long id;

    @Column
    String log;

    // spring-data miatt
    public DayLog() {
    }

    public DayLog(String log) {
        this.log = log;
    }
}
