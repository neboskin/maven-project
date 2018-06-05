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
      stage ('deploy') {
          timeout(time:5,unit:'days'){input message:"Check to proceed" } 
          steps { 
                   build job: 'deploy-to-stage'
              }
   }
  
 }


}
