# Étape 1 : Construire l'application
FROM maven:3.9.5-eclipse-temurin-21 AS builder

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers nécessaires pour la construction
COPY pom.xml ./
COPY src ./src

# Construire l'application et générer un JAR
RUN mvn clean package -DskipTests

# Étape 2 : Image finale pour exécuter l'application
FROM eclipse-temurin:21-jre

# Définir le répertoire de travail
WORKDIR /app

# Copier le JAR depuis l'étape précédente
COPY --from=builder /app/target/DevOps_Project-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port de l'application
EXPOSE 9001

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
