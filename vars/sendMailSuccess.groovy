def call(){
    node{
        echo "Envio correo Success"
        mail to: 'jfrecio@gmail.com',
                subject: "Build Exitosa: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: "La build ha sido exitosa. Ver detalles en ${env.BUILD_URL}"
    }
}