pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'whoami'
                sh 'pwd'
                sh 'ls -la'
                sh 'sh /var/lib/jenkins/workspace/test/lab1/pipeline.sh'
            }
        }
    }
}
