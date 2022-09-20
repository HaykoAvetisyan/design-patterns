package structural.bridge;

import creational_dp.factory.Program;

public abstract class Prog {

    protected Developer developer;

    public Prog(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
