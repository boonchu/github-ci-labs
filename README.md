![Java CI with Gradle](https://github.com/boonchu/github-ci-labs/workflows/Java%20CI%20with%20Gradle/badge.svg)

##### Admin Daily update

  - Append Jenkinsfile and script.groovy

#### Understanding pipelines

  - https://github.com/jenkinsci/pipeline-plugin/blob/master/TUTORIAL.md

##### Testing multi-branched pipelines

  - https://gitlab.com/nanuchi/techworld-js-docker-demo-app/-/tree/jenkins-multi-input
  - https://www.youtube.com/watch?v=MY1w7sWW5ms
  - https://www.youtube.com/watch?v=CmwTPxdx24Y
  - https://www.youtube.com/watch?v=L9Ite-1pEU8

```
# Configure multi-branched pipeline with this feature branch
git repo: https://github.com/boonchu/github-ci-labs/tree/feature-1

# Allow docker containers instance to run gradle build
```

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

```
./gradlew build
```

##### build Docker image called java-app. Execute from root

```
docker build -t java-demo-app .
```
    
##### push image to repo 

```
docker tag java-demo-app java-demo-app:v1
```
