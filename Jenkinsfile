pipeline {
agent any
stages {
stage("Compile") {
steps { 
sh "mvn install"
}
}
stage("Unit test") {
steps {
sh "mvn test"
}
}
stage("Code coverage") {
steps {
sh "mvn test"
publishHTML (target: [
reportDir: 'target/site/jacoco',
reportFiles: 'index.html',
reportName: "JaCoCo Report"
])
}
}
}
}
