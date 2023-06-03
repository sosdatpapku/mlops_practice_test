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
                sh 'cp /var/workspace/test/lab1/pipeline.sh $WORKSPACE/test@tmp/'
                sh 'cd $WORKSPACE/test@tmp./pipeline.sh'
            }
        }
    }
}
