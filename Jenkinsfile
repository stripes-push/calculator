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
}
}
