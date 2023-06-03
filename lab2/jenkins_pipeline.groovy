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
                sh '${WORKSPACE}/var/lib/jenkins/workspace/test/lab1/pipeline.sh'
                sh './pipeline.sh'
            }
        }
    }
}
