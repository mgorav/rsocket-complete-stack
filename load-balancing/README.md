# Load balancing

This repository contains example of client load balancing in RSocket. It spins up three instances of the RSocket responder, 
on the ports: `7000`,`7001`,`7002` respectively. Then you can start the `LoadBalancedClient`. In the logs you should see 
the frames sent to different RSocket responders, e.g:

![Alt text](img/load-balancer-logs.png?raw=true "Load balancer")



NOTE: The examples were designed to work from your IDE.
