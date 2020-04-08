pipeline{
    agent any
    stages{
       stage("version"){
steps{  
    bat "mvn -version"
		}
       }
       stage("claen"){
steps{   
    bat "mvn clean"
		}
       }stage("test"){
steps{
    bat "mvn test"
		}
       }
       stage("package"){
steps{
    
    bat "mvn package"
		}
       }   
    }
}
