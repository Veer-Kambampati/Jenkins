pipeline {
    agent any
    stages {
        stage('Welcome') {
            steps {
               echo "Hello World. Course name is ${coursename}."
            }
        }
        stage('Checkout') {
            steps {
               checkoutstep "https://github.com/Veer-Kambampati/jenkins-git-integration.git"
            }
        }
        stage('Build') {
            steps {
               sh 'mvn clean install'
            }
        }
        stage('Success') {
            steps {
               sh 'mvn clean install'
            }
        }
    }
}