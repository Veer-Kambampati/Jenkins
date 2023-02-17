pipeline {
    agent any
    properties([parameters([string(defaultValue: 'default-coursename', name: 'coursename')])])
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
        post {
            always {
               echo "Thanks for running the job !"
            }
    }
}