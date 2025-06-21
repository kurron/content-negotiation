package org.kurron.content.negotiation.endpoints.v1;

import java.util.Random;
import java.util.UUID;

record Output(String foo, int bar) {
    public static Output randomInstance() {
        var foo = UUID.randomUUID().toString();
        var bar = new Random().nextInt();
        return new Output(foo, bar);
    }
}