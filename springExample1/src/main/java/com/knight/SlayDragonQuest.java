package com.knight;

import java.io.PrintStream;

/**
 * Created by dhanendra-jft on 31/8/15.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }

}
