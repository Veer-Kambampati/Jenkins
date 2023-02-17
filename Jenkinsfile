pipeline {
    agent any
    parameters{string(defaultValue: 'default-coursename', name: 'coursename')}
    stages{
        stage('Welcome') {
            steps {
               echo "Hello World. Course name is ${params.coursename}."
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
    }
    post {
            always {
               echo "Thanks for running the job !"
            }
        }
}