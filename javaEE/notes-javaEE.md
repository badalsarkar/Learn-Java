# Java EE #

<!-- vim-markdown-toc GFM -->

* [What is Java EE](#what-is-java-ee)
    * [Multi-tired Application](#multi-tired-application)
        * [Java Technologies Used in Web Tire](#java-technologies-used-in-web-tire)
        * [Java Technologies Used in business tire](#java-technologies-used-in-business-tire)
* [Java Servlet Technology](#java-servlet-technology)
    * [Servlet Lifecycle](#servlet-lifecycle)
    * [Creating and Initializing a Servlet](#creating-and-initializing-a-servlet)
    * [Dealing with Request and Response](#dealing-with-request-and-response)

<!-- vim-markdown-toc -->
## What is Java EE ##

Java EE is a platform to develop large scale, complex, multi-tired, scalable
software. The platform provides VM and API for development. There are 4
platforms in Java.They are-

1. Java SE (Standard Edition)
2. Java EE (Enterprise Edition)
3. Java ME (Micro Edition)
4. JavaFX

[Nicely written here](https://docs.oracle.com/javaee/6/firstcup/doc/gkhoy.html)

### Multi-tired Application ###

Typically three tires-

1. Client Tire
2. Web Tire - Handles the interaction between client tire and business tire.
3. Middle/Business Tire
4. Data Tire

Java EE concentrates on the middle tire.

#### Java Technologies Used in Web Tire ####

1. Servlet: This are Java programming classes that process the request and
   construct response, usually for HTML page.
2. JavaServer Faces Technologies
3. JavaServer Faces Faceletes Technologies
4. Expression Language
5. JavaServer Pages
6. JavaServer Pages Standard Tag Library
7. JavaBeans Components

#### Java Technologies Used in business tire ####

1. Enterprise JavaBeans Components: *JavaBeans are classes in Java that
   encapsulates many objects into a single object.*
2. JAX-RS RESTful Web Services: For restful web services.
3. JAX-WS Web Services Endpoints: For SOAP web services.
4. Java Persistence API entities: For accessing underlying data store.
5. Java EE managed beans.

**Question: What is Java Beans?**

* JavaBeans is a technology to write reusable software component. This
technology is based on JavaBeans specification, which provides guidlines to
writing code so that it can be used as a component in other applications.
JavaBeans components are called beans.
* Beans are distributed as jar files.

[Source](https://docs.oracle.com/javase/8/docs/technotes/guides/beans/index.html)

## Java Servlet Technology ##

[Source](https://javaee.github.io/tutorial/servlets.html#BNAFD)

Java Servlet is a class which is used to extend the functionality of servers.
Servlets respond to requests. They are commonly used to extend the applications
hosted by web servers. For such applications servlets defines HTTP specific
classes.

### Servlet Lifecycle ###

[Read here](https://javaee.github.io/tutorial/servlets002.html)
Lifecycle events can be handled by using event listeners.

### Creating and Initializing a Servlet ###

[Read here](https://javaee.github.io/tutorial/servlets004.html)

### Dealing with Request and Response ###

[Read here](https://javaee.github.io/tutorial/servlets005.html)

