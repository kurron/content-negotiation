package org.kurron.content.negotiation.endpoints.v2;

import java.util.Random;
import java.util.UUID;

record Output(String foo, int bar, String baz) {
    static Output randomInstance() {
        var foo = UUID.randomUUID().toString();
        var bar = new Random().nextInt();
        var baz = UUID.randomUUID().toString();
        return new Output(foo, bar, baz);
    }
}
