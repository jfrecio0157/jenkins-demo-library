def call(Map config){
    node{
        echo "Envio correo Failure"
        mail to: config.mail,
                subject: "Build Fallida: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "La build ha fallado. Revisa Jenkins en ${env.BUILD_URL}"
    }
}