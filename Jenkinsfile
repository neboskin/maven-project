pipeline{
agent any
parameters {
   string(name:'staging', defaultValue:'127.0.0.1', description:'Deploy to staging')
}
triggers {pollSCM('* * * * *') }
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
          steps {
           timeout(time:5, unit:'DAYS'){
                 input message:"Check to proceed" 
                } 
                   sh 'cp **/*.war /home/kubik/Jenkins/apache-tomcat-9.0.8/webapps/'
              }
   }
  
 }


}
