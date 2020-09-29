# Team Gathering
A springboot project that helps setup a team meetup time.
Each participant would enter the name and available range of time.
And then a chart would display showing the timeline of each member.
Intersecting dates would then be considered as potential meetup times.

## Tools
 I used Spring Boot 2 for this project. The MVC model was used to render
 the data sources to display on the browser. I used Thymeleaf as a template
 to show entered data.
 Postgres was used to set up the database that handles form submissions. In addition to the
auto-generated ID, it uses three fields (name, start_date, and end_date).
