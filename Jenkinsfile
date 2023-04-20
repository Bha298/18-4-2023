pipeline{

    agent any

    stages {

        stage('Git Checkout'){

            steps{

                script{

                   git branch: 'main', url: 'https://github.com/Bha298/18-4-2023.git'
                }
            }
        }
 
        stage('docker build'){
              steps{
                  script{
                    bat 'mvn clean package dockerfile:build'
                  }
              }
              }
        
         stage('docker tag'){
            steps{
                script{
                 bat "docker tag 0.0.1-SNAPSHOT  bharadwaz1/java:demo321"   
                }
            }
            
        }
          stage('docker logout'){
              steps{
                  script{
                    bat 'docker logout'
                  }
              }
              }
            stage('docker login'){
        
        steps{
            
            script{
             withCredentials([string(credentialsId: 'bharadwaz11', variable: 'bharadwaz1')]) {
                 bat "docker login -u bharadwaz1 -p ${bharadwaz1}"
}   
            }
            
        }
        
      
        }
           stage('docker push'){
            steps{
                script{
                 bat "docker push bharadwaz1/java:devops"   
                }
            }
            
        }
        
        
    }
}

