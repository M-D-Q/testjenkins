pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '-sh mvn clean install'
      }
    }

    stage('post build') {
      steps {
        archiveArtifacts '**/*'
        sh '''deploy adapters: [tomcat9(credentialsId: \'b959dce6-4d45-41a0-a948-62591fa5f48a\', path: \'\', url: \'http://localhost:8080/\')], context
Path: \'chocolat\', war: \'*/*.war\''''
      }
    }

  }
}