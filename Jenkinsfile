pipeline{
agent any
tools { maven 'mvn_local'}
stages {
  stage ('build') { 
    steps {
   sh 'mvn clean package'  }
   post {
      
      success {
           echo "Starting archiving"  
           archiveArtifacts artifacts:'**/target/*.war' 
              }
     
           }
   }
      stage 'deploy' {
 
          steps { 
                   build job: 'deploy-to-stage'
              }
   }
  
 }


}
