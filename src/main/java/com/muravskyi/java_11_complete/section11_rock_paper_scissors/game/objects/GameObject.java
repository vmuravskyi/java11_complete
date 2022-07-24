package com.muravskyi.java_11_complete.section11_rock_paper_scissors.game.objects;

public abstract class GameObject implements Comparable<GameObject> {

    //@formatter:off
    private int id = 1;
    private String name;

    private final int[][] comparison = {
            //                 rock      paper     scissors
            /* rock */      {   0,        -1,          1,   },
            /* paper */     {   1,         0,         -1,   },
            /* scissors */  {  -1,         1,          0,   }
    };
    //@formatter:on

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(GameObject that) {
        return comparison[this.id][that.id];
    }

    @Override
    public String toString() {
        return this.name;
    }

}