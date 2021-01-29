#!/usr/bin/env groovy

def buildApp() {
    echo 'building the application...'
    docker.withServer('tcp://192.168.60.60:2375') {
       def testImage = docker.build("--rm=false", "boonchu/java-spring-demo:${params.VERSION}")
    }
} 

def testApp() {
    echo 'testing the application...'
    sh './gradlew test'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
