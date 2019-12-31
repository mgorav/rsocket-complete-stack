# RSocket Complete Stack


## Introduction

The paradigm shift from "Event Driven Architecture" to "Message Passing Architecture". Why? With all the benefits of "Event Driven Architecture" it poses some challenges:
1. increase cost of infrastructure, deployment ..
2. exception handling i.e. how to handle errored message/event
3. replaying error/exception message
4. speed of the HTTP protocol (serialisation/de-serialization cost)
5. .... the list goes on...
The answer is: "Message Passing Architecture" fuelled by Netifi/RSocket designed for micro-services communication at scale with all good things of "Event Driven Architecture". But to build such architecture, we need following patterns:
- interaction-model
- load-balancing
- resumability
- rpc
- spring-boot-requester (binder/Kafka producer)
- spring-boot-responder (binder/Kafka consumer)

#gonnect #servicemesh #rsocket #springboot
This should encourage micro-services architecture with low cost of deployment & deployment overheads with no loss in performance.
Each module address different aspect of the protocol, more detailed description is available in the module directories.

## Build

The modules use ```gradle``` as a build tool. In order to crate executable jars please invoke
`./gradlew clean build` on the root directory. Each module can be built individually using the same command, 
but executed in the particular module directory.

NOTE: These modules are designed to run from IDE.


