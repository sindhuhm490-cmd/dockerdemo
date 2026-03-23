pipeline {
    agent any
    environment {
        // Define your image name once to avoid typos
        IMAGE_NAME = "sindhuhm18/myapp:v1"
    }
    stages {
        stage('Build Docker Image') {
            steps {
                bat "docker build -t %IMAGE_NAME% ."
            }
        }
        stage('Push to Docker Hub') {
            steps {
                // Use the ID of the credentials you created in Jenkins
                withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                    // One-line login and push to ensure the session is active
                    bat "echo %PASS% | docker login -u %USER% --password-stdin"
                    bat "docker push %IMAGE_NAME%"
                }
            }
        }
    }
}