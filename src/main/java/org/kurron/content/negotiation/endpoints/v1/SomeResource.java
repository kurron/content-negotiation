package org.kurron.content.negotiation.endpoints.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController("v1.SomeResource")
@RequestMapping("/some-resource")
@Slf4j
class SomeResource {

    @GetMapping(produces = "application/vnd.kurron.output.v1+json")
    Output getResource() {
        log.info("getResource v1");
        return Output.randomInstance();
    }

    @PostMapping(
            consumes = "application/vnd.kurron.input.v1+json",
            produces = "application/vnd.kurron.output.v1+json"
    )
    Output createResource(@RequestBody Input input) {
        log.info("createResource v1");
        return new Output(input.foo(), input.bar());
    }
}