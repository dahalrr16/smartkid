import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import java.util.Date
//defining the agent
    //agent any
    def name="Raj"
    def lastName="jpt"
pipeline {

    //defining the tools used
    tools {
        maven 'Maven3.8.1'
    }

//defining the stages
    stages {
    
        
        
       

        stage ('Testing Stage') {
        
        script{
            
        //testing something 
     if(name=='Raj'){
         print('This is jpt testing')
     }
if(lastName!='Raj'){
         print('This is jpt testing')
     }
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