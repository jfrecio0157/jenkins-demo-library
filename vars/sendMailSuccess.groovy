def call(Map config){
    node{
        echo "Envio correo Success"
        mail to: ${config.mail},
                subject: "Build Exitosa: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "La build ha sido exitosa. Ver detalles en ${env.BUILD_URL}"
    }
}