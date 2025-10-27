def call(){
    node{
        echo "Verificando herramientas instaladas..."
        echo "Version java: "
        bat 'java -version'
        echo "Version git: "
        bat ' git --version'
    }
}