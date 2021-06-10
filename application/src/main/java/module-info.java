module com.example {
    requires io.micronaut.core;
    requires io.micronaut.http;
    requires io.micronaut.http_client_core;
    requires io.micronaut.inject;
    requires io.micronaut.runtime;
    requires io.micronaut.kotlin.kotlin_extension_functions;
    requires io.micronaut.validation;
    requires javax.inject;
    requires kotlin.stdlib;

    exports com.example;
}