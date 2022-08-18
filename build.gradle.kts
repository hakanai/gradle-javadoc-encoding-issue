plugins {
    java
}

tasks.javadoc {
    options.encoding = "UTF-8"
    (options as StandardJavadocDocletOptions).bottom =
        "Copyright Ⓒ 2022 Acme Corp"
}
