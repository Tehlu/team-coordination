# Team Gathering
A spring based project that helps setup a team meetup time.
Each participant would enter the name and available range of time.
And then a chart would display showing the timeline of each member.
Intersecting dates would then be considered as potential meetup times.

## Tools
 I used Spring Boot 2 for this project. The MVC model was used to render
 the data sources to display on the browser. I used Thymeleaf as a template
 to show entered data.
 Postgres was used to set up the database that handles form submissions. In addition to the
auto-generated ID, it uses three fields (name, start_date, and end_date).
 The built jar file can run on an AWS run Ubuntu server (an ec2 instance).
 
 ### Composition
  The project consists of 5 packages which will be described as follows:
 
 ### Challenges
 Running the application requires me to always connect to the ubuntu server and run the jar
 file on my terminal. It's not very practical as the application doesn't run in the
 background. A way to continuously deploy and integrate should be sought after.
 
