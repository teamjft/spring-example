package com.knight;

/**
 * Created by dhanendra-jft on 31/8/15.
 */
public class DamselRescuingKnight implements knight{
    private Quest quest;
    public DamselRescuingKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
