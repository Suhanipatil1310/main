pipeline {
        agent any
        stages {
            stage('Script1') {
                steps {
                    script {
                            build job: 'Script1'
                        }
                    }
               }   
            stage('Script2') {
                steps {
                    script {
                            build job: 'Script2'
                        }
                    }
               }   
           }
       }