pipeline {
    agent any
    tools {
        maven 'Maven3.8.1'
    }


    stages {
    
    stage ('Initialize') {
            steps {
                
                    sh '''
                    echo "PATH = $PATH"
                    echo "MVN_HOME= $MVN_HOME"
                                                 
                 
                    '''
                }
            }
        stage ('Compile Stage') {

            steps {
                
                    sh 'mvn clean compile'
                }
            }
       

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_8_1') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3_8_1') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}