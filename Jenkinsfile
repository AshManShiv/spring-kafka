pipeline {
    agent any
    stages {
        stage('Build') {
            steps {

                // Get some code from a GitHub repository
                git 'https://github.com/AshManShiv/spring-kafka.git'
                sh 'mvn -B -DskipTests clean package'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
    }
}