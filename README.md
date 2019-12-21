# RSocket Complete Stack


## Introduction

This repository contains architectural patterns implemented using RSocket.

It consist of following modules:
- interaction-model
- load-balancing
- resumability
- rpc
- spring-boot-requester
- spring-boot-responder

Each module address different aspect of the protocol, more detailed description is available in the module directories.

## Build

The modules use ```gradle``` as a build tool. In order to crate executable jars please invoke
`./gradlew clean build` on the root directory. Each module can be built individually using the same command, 
but executed in the particular module directory.

NOTE: These modules are designed to run from IDE.
