# Spring Boot Requester

This repository contains example simple RSocket requester built as a spring boot application. 
It expose three endpoints:

- `persons`
- `persons/{id}`
- `persons-channel`

which are routed to the Spring Boot Responder application using RSocket as a transport layer.
In order to run this example please start the Responder application first 
and then spin up the requester.

