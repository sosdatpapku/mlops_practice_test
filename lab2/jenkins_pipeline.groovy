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
                sh 'cd /var/lib/jenkins/workspace/test/lab1/'
                sh 'ls -la'
                sh 'sh /var/lib/jenkins/workspace/test/lab1/pipeline.sh'
            }
        }
    }
}
