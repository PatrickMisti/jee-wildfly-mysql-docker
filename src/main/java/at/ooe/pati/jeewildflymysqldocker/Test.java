package at.ooe.pati.jeewildflymysqldocker;

import javax.persistence.*;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long Id;

    String name;

    int note;

    public Test(String name, int note) {
        this.name = name;
        this.note = note;
    }

    public Test() {

    }
}

