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
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Veer-Kambampati/Jenkins.git']])
            }
        }
        stage('Build') {
            steps {
               sh 'mvn package -Dmaven.test.skip=true'
            }
        }
    }
    post {
            always {
               echo "Thanks for running the job !"
            }
        }
}
