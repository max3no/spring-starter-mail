# SPRING BOOT - SPRING STARTER MAIL

## Getting Started

Need jdk, spring boot, working machine.

### Prerequisites

Install Spring Boot.
Configure your java in environmental variables.


### Steps

Create a new Spring Starter Project (Dependency - Web, Spring boot starter mail)

```
https://start.spring.io/
```

add the following setting in application.properties

```
spring.mail.host = smtp.gmail.com
spring.mail.username = youremailid@gmail.com
spring.mail.password= youpassword
spring.mail.port=587
spring.mail.properties.mail.smtp.starttls.enable = true
```


Review your account setting and add this in your trusted account if any error comes.

POST API

```
http://localhost:8080/api/v1/mail

{
	"from" : "youremailid@gmail.com",
	"to" : "otheremailid@gmail.com",
	"subject" : "java mail service",
	"message" : "Hi, this message is send from spring boot mail starter"
}
```


## Acknowledgments

* Open Source community

