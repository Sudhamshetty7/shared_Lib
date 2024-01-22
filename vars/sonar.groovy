def call() {
       // Your SonarQube scan steps go here https://github.com/Sudhamshetty7/shared_Lib/settings
      // sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://13.232.78.101:9000 -Dsonar.java.binaries=target/classes'
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://13.232.78.101:9000 -Dsonar=sonar.exclusions**/*.java'
   }

return this
