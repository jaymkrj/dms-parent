# dms-parent
### Goal
######  To learn following
  - Create multi module project using pom
  - Rest ws using JAX-RS with help of CXF and Servlet 3.1
  - H2 in memory db integration
  - EJB injection in REST
  - Seperate Entity module from service
  
### Software Required
- Eclipse neon 0.1 and above
- JDK 8
- TomEE Plum 7.2
- H2 db
- Git client
- Maven
- Eclipselink

### Configuration
- Copy h2 jdbc jar to tomee.xx/lib
- Configure DS : copy tomeee.xml to eclipse server and paste following ( persistance.xml is pointing to jndi name PostgresDbDs  )
```xml
<Resource id="PostgresDbDs" type="javax.sql.DataSource"> 
		jdbcDriver=org.h2.Driver
		jdbcUrl=jdbc:h2:~/test 
		userName=sa 
		password=sa 
		jtaManaged=true
	</Resource>
```
- H2 db config

### Test urls
- http://localhost:8080/dms-web/rest/dms
- http://localhost:8080/dms-web/rest/dms/7
- http://localhost:8080/dms-web/rest/dms/title1/desc1
