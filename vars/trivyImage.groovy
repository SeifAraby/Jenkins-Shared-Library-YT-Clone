def call() {
    sh 'trivy image anonymous92/youtube:latest > trivyimage.txt'
}