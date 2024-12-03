package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {

    private Bar bar;
    private List<Baz> bazs = new ArrayList<>();
    private Qux qux;
    private Corge corge;
    private List<Grault> graults = new ArrayList<>();

    public Foo(final Bar bar) {
        this.bar = bar;
        this.qux = new Qux();

    }

    public Bar getBar() {
        return bar;
    }

    public List<Grault> getGraults() {
        return graults;
    }

    public Corge getCorge() {
        return corge;
    }

    public Qux getQux() {
        return qux;
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public void addBaz(final Baz baz) {
        bazs.add(baz);
    }

    public void addGrault() {
        graults.add(new Grault(this));
    }

    public void setCorge(final Corge firstCorge) {
        this.corge = corge;
        if (this.corge == firstCorge) {
            return;
        }

        if (this.corge != null) {
            Corge oldCorge = this.corge;
            this.corge = null;
            oldCorge.setFoo(null);
        }

        this.corge = firstCorge;
        if (firstCorge != null && firstCorge.getFoo() != this) {
            firstCorge.setFoo(this);
        }
    }

}
