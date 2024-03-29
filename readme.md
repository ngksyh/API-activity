Problem Description: Determining optimal scheduling methods for road closures.

Problem Domain: Logistics, Routes, and Maps.

The goal of the project is to create a method for efficiently planning neccessary road closures throughout the year for city construction projects
while minimizing the effect of the closures on traffic. This can be viewed as a graph problem, and likely has connections to network flow and, specifically, 
the effect of node deletion on flow.
We plan to take as input historical traffic data and a set of proposed road closures, and use the historical traffic data to create a (network/graph) model from which
we can compute an efficient schedule.

Additionally, the project will likely extend to applications in multi-user route scheduling, where the effect of users on each other can be represented as
a continuous case of the road closure problem (instead of a road being open or closed, it would range from full to empty).


Link to potential API: http://project-osrm.org/docs/v5.24.0/api/?language=cURL#table-service

Screenshot of initial API test:
![image](https://github.com/ngksyh/API-activity/assets/144482446/8e26c916-118b-42c8-b66d-3551a18dd7f0)

Java API call:
![image](https://github.com/ngksyh/API-activity/assets/144482446/9b9934b2-ee70-4396-a192-81cc8df413ba)

One non-technical issue: had a bit of trouble getting in touch with the last group member, will get this figured out in Monday's lab.

Technical issue 1 [SOLVED]: Wouldn't resolve JSON symbol; solved by file -> invalidate caches
