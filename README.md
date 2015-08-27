# Maven Test

This is a really simple maven project to test libraries. The `pom.xml` embed the plugin:
```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-shade-plugin</artifactId>
    <version>2.2</version>
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>shade</goal>
            </goals>
            <configuration>
                <transformers>
                    <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                        <mainClass>my.main.class</mainClass>
                    </transformer>
                </transformers>
            </configuration>
        </execution>
    </executions>
</plugin>
```
which will add to your package all the needed libraries, allowing you to execute it without any dependence issue.

### INSTALLATION
To use it clone the project and add the library you want to test in your `pom.xml` and create a dedicated class with at least one function that you will call in the main class `App.java`.
(see example with `JodaTimeExample.java`)

Then execute `mvn clean install` to compile you project and `java -cp target/maven-test-1.0-SNAPSHOT.jar main.java.org.milo.test.App` to execute it.

Feel free to use/fork/contribute/fix and enjoy!
