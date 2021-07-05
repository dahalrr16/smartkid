pipeline {
//defining the agent
    agent any
    def name="Raj"
    def lastName="jpt"
    //defining the tools used
    tools {
        maven 'Maven3.8.1'
    }

//defining the stages
    stages {
    
        
        
       

        stage ('Testing Stage') {
        //testing something 
     if(name=='Raj'){
         println('This is raj testing')
     }
if(lastName!='Raj'){
         println('This is jpt testing')
     }
//actual steps start here
            steps {
                withMaven(maven : 'Maven3.8.1') {
                    bat 'mvn compile'
                }
            }
        }//first stage complete




        
    }
}