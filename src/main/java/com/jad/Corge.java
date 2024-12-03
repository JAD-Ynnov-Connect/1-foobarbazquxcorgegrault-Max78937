package com.jad;

public class Corge {

    private Foo foo;

    public Corge(final Foo foo) {
        setFoo(foo);
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(final Foo foo) {
        if (this.foo == foo) {
            return;
        }

        if (this.foo != null) {
            Foo oldFoo = this.foo;
            this.foo = null;
            oldFoo.setCorge(null);
        }

        this.foo = foo;
        if (foo != null && foo.getCorge() != this) {
            foo.setCorge(this);
        }
    }
}
