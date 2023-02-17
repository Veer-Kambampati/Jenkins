pipeline {
    agent any
    // parameters{
    //     string(defaultValue: "default course name", description: "This is a course name", name: "coursename")
    // }
    stages {
        stage('Setup parameters') {
            steps {
                script{
                    properties([
                        parameters([
                            string(
                                defaultValue: 'default-course-name',
                                name: 'coursename',
                                trim: true
                            )
                        ])
                    ])
                }
            }
        }
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
        stage('Success') {
            steps {
               echo "Thanks for running the job !"
            }
        }
    }
}