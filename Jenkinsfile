pipeline {
    agent any
    tools {
        maven 'Maven3.8.1'
    }


    stages {
    
        
        
       

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'Maven3.8.1') {
                    bat 'mvn compile'
                }
            }
        }


        
    }
}