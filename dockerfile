# Define a imagem base
FROM adoptopenjdk:11-jdk-hotspot

# Copia o arquivo pom.xml para o diretório de trabalho
COPY pom.xml .

# Baixa as dependências do projeto
RUN mvn dependency:go-offline -B

# Copia todo o código fonte para o diretório de trabalho
COPY src ./src

# Compila o código fonte
RUN mvn package -DskipTests

# Define o comando para executar a aplicação
CMD ["java", "-jar", "target/nome-do-arquivo-jar.jar"]
