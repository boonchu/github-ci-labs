#!/usr/bin/env groovy

def buildApp() {
    echo 'building the application...'
    String command = "sh ./gradlew build"
    def proc = command.execute()
    StringBuffer sout = new StringBuffer(), serr = new StringBuffer()
    proc.consumeProcessOutput(sout, serr)
    proc.waitForOrKill(15000)
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
