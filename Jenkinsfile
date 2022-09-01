pipeline {
  agent { label 'jean' }
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('post build') {
      steps {
        archiveArtifacts '**/*'
        deploy adapters: [tomcat9(credentialsId: 'b959dce6-4d45-41a0-a948-62591fa5f48a', path: '', url: 'http://172.17.0.3:8080')], contextPath: 'chocolat', war: '*/*.war'

      }
    }

  }
}
