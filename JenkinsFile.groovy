pipeline {
        agent any
        stages {
            stage('Script1') {
                steps {
                    script {
                            build job: 'Script-01'
                        }
                    }
               }   
            stage('Script2') {
                steps {
                    script {
                            build job: 'Script-02'
                        }
                    }
               }   
           }
       }