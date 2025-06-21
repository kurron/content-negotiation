package org.kurron.content.negotiation.endpoints.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController("v2.SomeResource")
@RequestMapping("/some-resource")
@Slf4j
class SomeResource {

    @GetMapping(produces = "application/vnd.kurron.output.v2+json")
    Output getResource() {
        log.info("getResource v2");
        return Output.randomInstance();
    }

    @PostMapping(
            consumes = "application/vnd.kurron.input.v2+json",
            produces = "application/vnd.kurron.output.v2+json"
    )
    Output createResource(@RequestBody Input input) {
        log.info("createResource v2");
        return new Output(input.foo(), input.bar(), input.baz());
    }
}