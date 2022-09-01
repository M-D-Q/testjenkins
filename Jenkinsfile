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

	deploy adapters: [tomcat9(credentialsId: 'c876cbc4-cdfc-456b-91dd-dc1ae86773a5', path: '', url: 'http://localhost:8080')],contextPath: '/psark', war: '*/*.war'
      }
    }

  }
}
