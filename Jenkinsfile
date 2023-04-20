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
        
        
        
    }
}

