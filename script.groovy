#!/usr/bin/env groovy

def buildApp() {
    echo 'building the application...'
    sh 'docker build -t boonchu/java-spring-demo .'
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
