pipeline {
    agent any 
    stages {
        stage('clone and clean') { 
            steps {
                sh 'git clone https://github.com/vaidyanath08/demo-cicd'
                sh 'mvn clean -f demo-cicd'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test -f demo-cicd'
            }
        }
        stage('Deploy') { 
            steps {
                sh 'mvn package -f demo-cicd'
            }
        }
    }
}
