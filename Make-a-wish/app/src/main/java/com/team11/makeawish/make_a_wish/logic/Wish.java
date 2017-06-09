package com.team11.makeawish.make_a_wish.logic;

import java.util.List;

public class Wish {
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public List<String> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    String target;
    boolean isDone;
    List<String> requirements;

    public Wish(String target, boolean isDone, List<String> requirements) {
        this.target = target;
        this.isDone = isDone;
        this.requirements = requirements;
    }
}
