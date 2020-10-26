# Team Gathering
 A spring based project that helps setup a team meetup time.
 Each participant would enter the name and available range of time.
 Then a chart would display showing the timeline of each willing participant.
 Intersecting dates would then be considered as potential meetup times.
 
# Purpose
  The purpose of this project is to showcase the skills learned at my course at jobreadyprogrammer.com.
  This is a personal project derived from using Java and Spring Boot in my course.

## Tools
 I used *Spring Boot 2* for this project. The MVC model was used to access
 the data sources and display on the browser. I used Thymeleaf as a template
 to show entered data.
 Postgres was used to set up the database that handles form submissions.
 The built jar file can run on an AWS run Ubuntu server which is an ec2 instance.
 
### Composition
 The project consists of 5 packages:\
  a) **com.jrp.er**  
		&nbsp;&nbsp;&nbsp;&nbsp;This is where the application will start running.\
  b) **com.jrp.er.controllers**  
		&nbsp;&nbsp;&nbsp;&nbsp;This is where the http commands(Get, Push requests etc) are captured and mapped to html pages.
		&nbsp;&nbsp;&nbsp;&nbsp;They also access data repositories and/or create new entities.\
  c) **com.jrp.er.dao**  
		&nbsp;&nbsp;&nbsp;&nbsp;This is the interface that allows interaction with entities in the database. It extends the
		&nbsp;&nbsp;&nbsp;&nbsp;CrudRepository class.\
  d) **com.jrp.er.dto**  
		&nbsp;&nbsp;&nbsp;&nbsp;This interface transfers each field of the data elements at the request of the controllers.\
  e) **com.jrp.er.entities**  
		&nbsp;&nbsp;&nbsp;&nbsp;This defines the fields of the elements.
	  
	  
### Datasource
 I used Postgres to create the schema and the table.In addition to the
 auto-generated ID, it uses three fields (name, start_date, and end_date).
 The data is captured via a POST request when users enter their information in the form.
   
 
### Challenges
 Running the application requires me to always connect to the ubuntu server and run the jar
 file on my terminal. It's not very practical as the application doesn't run in the
 background. A way to continuously deploy and integrate should be sought after.
 
### Disclaimer
 This project took its design model from a course project at jobreadyprogrammer.com. The project consisted
 of creating a Maven application called "Project Management".
 So I took the 'skeleton' so to speak and added my own spin to come up with "Team Gathering".
 
