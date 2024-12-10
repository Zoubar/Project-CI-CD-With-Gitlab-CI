# Project-CI-CD-With-Gitlab-CI



Ce projet est une application de démonstration utilisant Spring Boot pour gérer des produits dans une base de données. Il comprend un module de test unitaire
pour tester les opérations CRUD sur l'entité Product en utilisant JUnit et le framework Spring Data JPA.
L'application utilise également Docker pour le build et le déploiement automatisé,
et GitLab CI/CD pour la pipeline de déploiement, qui comprend les étapes de construction, de packaging et de déploiement de l'image Docker
. Le projet est conçu pour démontrer une approche DevOps complète, de la gestion du code source à l'exécution de l'application dans un conteneur Docker
, avec un processus de déploiement automatisé sur une infrastructure cloud.


Configuration Docker :


Cette image montre les informations du conteneur  nommé "yassinezoubairi12345/product-microservice:v1"

![alt text](image.png)

Résultat s'affiche dans localhost:9001 :

![alt text]({A7D80730-CA27-4B95-90C4-ECE3E150B676}.png)

![alt text]({A514F0CC-FDDA-4566-8204-ADE7E994A838}.png)

----------------------------------------------------------------------------------------------------------------------


Configuration Gitlab :

![alt text]({944B0EBA-D03F-4C41-A3E2-34DF77060306}.png)


Les Résultas de la Configuration :

![alt text]({BD0B65D3-40B7-451E-9986-16FD8EFFCE6B}.png)



Maven  Build  : ![alt text]({3A656A61-9A77-4DDE-85F4-B33D12D6782C}.png)
Docker Build  : ![alt text]({AA2676D0-008C-4F3B-9597-F6807DD1B0A7}.png)
Docker Deploy : ![alt text]({80D66209-6037-4023-8A82-7CAAC035876D}.png)

Les Tests Unitaires ( ProductControllerUnitTest = MockMvc ) :

![{29FB8F6C-026D-4354-A396-51DF59F395B0}](https://github.com/user-attachments/assets/cfe7c772-1499-4a02-9675-f9b72c8e9506)

Les Tests Unitaires ( ProductDaoUnitTest = JUnit 5 ) :

![alt text]({E132418B-29F4-494A-BC47-087F577D9300}.png)

Utilisation de base de données H2 pour le testing :

![alt text]({48E29C49-C8FE-4D75-9675-FA59F8CFE180}.png)

![alt text]({B757859B-ECD7-46AE-84EE-82F8F8A38BA9}.png)
