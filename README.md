techone
=======

a sample jee stack inspired by Adam Bien



okay.... first let's install maven, git, jdk



config git:
  407  git config --global user.name "Your Name"
  408  git config --global user.email "your@email.de"
  409  git config --global push.default simple
  410  git config --global branch.autosetuprebase always
  411  git config --global color.ui true
  412  git config --global color.branch auto
  413  git config --global color.status auto
  414  git config --list


create a minimal pom:

either by running the archetype generation:
mvn archetype:generate -Dfilter=com.airhacks:javaee7-essentials-archetype

or just create a pom.xml:

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>sol.neptune</groupId>
    <artifactId>techone</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>war</packaging>
    <dependencies>
        <dependency>
            <groupId>javax</groupId>
            <artifactId>javaee-api</artifactId>
            <version>7.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
	
	
	<build>
		<finalName>techone</finalName>
		</build>
    <properties>
        <maven.compiler.source>1.7</maven.compiler.source>
        <maven.compiler.target>1.7</maven.compiler.target>
        <failOnMissingWebXml>false</failOnMissingWebXml>
    </properties>
</project>

This is the small as possible but usable pom configuration.
At the beginning you won't need more.
Don't add thirdparty lib blindly. First check if the feature isn't already provided by jdk.
If you really must add a lib, discuss it in your team and make a point why you really need this and that.



this will already work:

# mvn clean
# mvn package

should first load the dependencies.





Architecture:

don't use interfaces
don't use DTO or DAO. There's already enought wrapping going on if you use the EntityManager
Business first - start with your core functionallity what your application is supposed to do in the end and not with some fancy framework-architecture.
don't over complicate thing with configuration. In almost any scenario you won't need this so called flexibility later anyway.



Okay... let's do client side first :-)

install node.js
# pacman -S nodejs
# npm install yo grunt bower -g

at src/main create new folder: "webapp_grunt". This will contain our yeoman, grunt bower managed (clientside) webapplication.

goto the webapp_grunt dir

# yo angular

if you now run "grunt", you'll get probably a missing dependency. To fix this, install karma-jasmine
:
#npm install karma-jasmine --save-dev


To run the tests:
$grunt 



run "grunt serve" to test you app in a browser:
$grunt serve


in order to deploy only the build application to wildfly, we have to change the "dist" path at Gruntfile.js to "../webapp".

$grunt build

willl create this new "dist" (../webapp) directory, which then can be used with wildfly properly!

$ mvn wildfly:deploy





I like animation:
$ bower install angular-animate

and routing:
$ bower install angular-route
