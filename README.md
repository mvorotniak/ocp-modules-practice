Code-First Java Module System
-------------------------------
This is a project to learn all the module system basics: how to declare modules with module-info.java, compile, package, and launch them.

### Structure
```
ocp-modules-practice
+ classes
+ mods
- ocp.certification.preparation
    - src
        - main
            - java
                - ocp
                    - certification
                        - preparation
                            Preparation.java
                            module-info.java
            + resources
        - test
            + java
            + resources
+ ocp.read.materials
+ ocp.review.questions
```
### Declaring Modules
```
module ocp.read.materials {
exports ocp.read.materials;
}

module ocp.review.questions {
exports ocp.review.questions;
}

module ocp.certification.preparation {
requires ocp.read.materials;
requires ocp.review.questions;
}
```
### Compiling, Packaging, And Running
```
javac -d classes/ocp.read.materials ocp.read.materials/src/main/java/ocp/read/materials/*.java ocp.read.materials/src/main/java/*.java
jar -cvf mods/ocp.read.materials.jar -C classes/ocp.read.materials .

javac -d classes/ocp.review.questions ocp.review.questions/src/main/java/ocp/review/questions/*.java ocp.review.questions/src/main/java/*.java
jar -cvf mods/ocp.review.questions.jar -C classes/ocp.review.questions .

javac -p mods -d classes/ocp.certification.preparation ocp.certification.preparation/src/main/java/ocp/certification/preparation/*.java ocp.certification.preparation/src/main/java/*.java
jar -cvf mods/ocp.certification.preparation.jar -C classes/ocp.certification.preparation .
```
### Qualified Exports - Determine which modules can access the package
```
module ocp.read.materials {
exports ocp.read.materials to ocp.certification.preparation;
}

module ocp.review.questions {
exports ocp.review.questions to ocp.certification.preparation;
}
```



