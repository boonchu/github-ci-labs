#!/usr/bin/env groovy

def buildApp() {
    echo 'building the application...'
    sh './gradlew build'
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
