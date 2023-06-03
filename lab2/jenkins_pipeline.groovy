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
                sh 'cp /var/lib/jenkins/workspace/test/mlops_practice_test/lab1 scripts/'
                sh './pipeline.sh'
            }
        }
    }
}
