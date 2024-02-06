pipeline{
    agent {
        docker { image 'maven:3.8.5-openjdk-17-slim' }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean test'
                sh 'mvn package'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true, onlyIfSuccessful: true
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true, onlyIfSuccessful: true
                }
            }
        }
    }

}