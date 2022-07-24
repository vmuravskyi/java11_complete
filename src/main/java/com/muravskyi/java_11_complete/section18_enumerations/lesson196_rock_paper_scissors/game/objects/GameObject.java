package com.muravskyi.java_11_complete.section18_enumerations.lesson196_rock_paper_scissors.game.objects;

public enum GameObject {

    ROCK, PAPER, SCISSORS;

    private GameObject beats;

    static {
        ROCK.beats = SCISSORS;
        PAPER.beats = ROCK;
        SCISSORS.beats = PAPER;
    }

    public boolean beats(GameObject that) {
        return this.beats == that;
    }

}