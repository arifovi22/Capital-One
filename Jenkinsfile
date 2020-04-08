pipeline{
    agent any
    stages{
       stage('build'){
steps{  
    bat 'mvn -version'
		}
       }
       stage('clean'){
steps{   
    bat 'mvn clean'
		}
       }
       stage('test'){
steps{
    bat 'mvn test'
		}
       }
       stage('package'){
steps{
    
    bat 'mvn package'
		}
       }   
    }
}
