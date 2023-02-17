pipeline {
    agent any
    parameters{string(name: 'coursename', defaultValue: 'DevOps', description: 'NA')}
    stages{
        stage('Welcome') {
            steps {
               echo "Hello World. Course name is ${params.coursename}."
            }
        }
        stage('Checkout') {
            steps {
               checkout "https://github.com/Veer-Kambampati/jenkins-git-integration.git"
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