# Use a imagem do OpenJDK como base para a construção da aplicação
FROM maven:3.8.6-openjdk-11-slim

ENV SERVER_PORT=8085
# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o código-fonte do projeto para dentro do contêiner (certifique-se de ter o arquivo pom.xml no diretório)
COPY . /app


# Comando para executar a aplicação quando o contêiner for iniciado
CMD ["mvn", "spring-boot:run"]


EXPOSE 8085
