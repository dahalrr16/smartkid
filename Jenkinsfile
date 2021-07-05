import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import java.util.Date
//defining the agent
    
    def name="Raj"
    def lastName="jpt"
pipeline {
agent any

    //defining the tools used
    tools {
        maven 'Maven3.8.1'
    }

//defining the stages
    stages {
    
        
        
       

        stage ('Testing Stage') {
        
     
      
      
//actual steps start here
            steps {
               script{
            
        //testing something 
     if(name=='Raj'){
         print('This is jpt testing')
     }
if(lastName!='Raj'){
         print('This is jpt testing')
     }
      }
      
      
                withMaven(maven : 'Maven3.8.1') {
                    bat 'mvn compile'
                }
                
            }
        }//first stage complete




        
    }
}