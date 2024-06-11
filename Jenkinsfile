pipeline {
   agent any
   stages {
       stage('Install') {
           steps {
            
            bat '''
            cd pg3-react
            npm install
            '''            
 
           }
       }
    //    stage('Delete') {
    //        steps {
            
    //         bat 'pm2 delete all'
           
    //        }
    //    }
       stage('Run') {
           steps {
            bat '''
            cd pg3-react
            pm2 start "C:\\Program Files\\nodejs\\node_modules\\npm\\bin\\npm-cli.js" -- start
            '''
 
           }
       }
   }
}