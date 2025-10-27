def call(){
    node{
        echo "Envio correo Failure"
        mail to: 'jfrecio@gmail.com',
                subject: "Build Fallida: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "La build ha fallado. Revisa Jenkins en ${env.BUILD_URL}"
    }
}