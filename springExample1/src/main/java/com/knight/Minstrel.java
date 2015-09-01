package com.knight;

import java.io.PrintStream;

/**
 * Created by dhanendra-jft on 31/8/15.
 */
public class Minstrel {
    private PrintStream stream;
    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }
    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }
    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " +
                "did embark on a quest!");
    }
}
