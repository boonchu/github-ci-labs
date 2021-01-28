![Java CI with Gradle](https://github.com/boonchu/github-ci-labs/workflows/Java%20CI%20with%20Gradle/badge.svg)

##### Admin Daily update

  - Append Jenkinsfile and script.groovy


##### Understanding groovy syntax 

  - https://blog.nevercodealone.de/groovy-shell-scripting-teil-1/
  - https://blog.nevercodealone.de/groovy-shell-scripting-pipes-und-fifos-teil-2/
  - https://blog.nevercodealone.de/groovy-shell-scripting-testing-teil-3/

```
# install groovy in local desktop
curl -s get.sdkman.io | bash
source ~/.sdkman/bin/sdkman-init.sh && sdk install groovy
```

##### build the project

    ./gradlew build

##### build Docker image called java-app. Execute from root

    docker build -t java-app .
    
##### push image to repo 

    docker tag java-app demo-app:java-1.0
