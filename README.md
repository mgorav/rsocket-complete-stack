# RSocket Complete Stack


## Introduction

https://www.linkedin.com/feed/update/urn:li:activity:6617723612164083712/

What? For building Micro Service Architecture either Event Driven Architecture or Messaging passing Architecture is *the must* with HTTP as communication protocol.

The paradigm shift from "Event Driven Architecture" to "Message Passing Architecture" will simplify.

Why? With all the benefits of "Event Driven Architecture", it poses some challenges:
1. increase cost of infrastructure, deployment ..
2. exception handling i.e. how to handle errored message
3. replaying error/exception message
4. speed of the HTTP protocol (serialisation/de-serialization cost, compression cost ...)
5. the list goes on

How? "Message Passing Architecture" fuelled by Netifi/RSocket is designed for micro-services communication at scale with all good things of "Event Driven Architecture" & eliminating its bad.

Further, to build such architecture, we need following patterns:
- DDD interaction model
- Load balancing
- Restartability
- RPC
- Spring Boot
   - Requester (producer)
   - Responder (consumer)

Check out my project which demonstrate above patterns:
https://lnkd.in/eQqygGx


This should encourage micro-services architecture adoption with low cost of deployment & its overheads, with no loss in performance.
Shikha Malhotra Gaurav Malhotra #gonnectformance.
Each module address different aspect of the protocol, more detailed description is available in the module directories.

## Build

The modules use ```gradle``` as a build tool. In order to crate executable jars please invoke
`./gradlew clean build` on the root directory. Each module can be built individually using the same command, 
but executed in the particular module directory.

NOTE: These modules are designed to run from IDE.


