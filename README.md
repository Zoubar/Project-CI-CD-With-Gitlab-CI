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

![{840D1E53-6B39-4BE2-BAB3-92864A124322}](https://github.com/user-attachments/assets/20c2a0a4-a922-4f30-828f-7214e9d5dd60)

![{E99B506E-77B1-4504-A007-2C4992A0D744}](https://github.com/user-attachments/assets/5d33ffc2-922c-4ef7-8a6b-4c0fa0037c64)

----------------------------------------------------------------------------------------------------------------------


Configuration Gitlab :

![alt text]({944B0EBA-D03F-4C41-A3E2-34DF77060306}.png)


Les Résultas de la Configuration :

![{59F23E19-8E5A-4D35-A75A-9C4702D600CF}](https://github.com/user-attachments/assets/a938d698-361c-4819-9ea8-862927c4c412)



Maven  Build  : ![alt text]({3A656A61-9A77-4DDE-85F4-B33D12D6782C}.png)
Docker Build  : ![alt text]({AA2676D0-008C-4F3B-9597-F6807DD1B0A7}.png)
Docker Deploy : ![alt text]({80D66209-6037-4023-8A82-7CAAC035876D}.png)

Les Tests Unitaires ( ProductControllerUnitTest = MockMvc ) :

![{29FB8F6C-026D-4354-A396-51DF59F395B0}](https://github.com/user-attachments/assets/cfe7c772-1499-4a02-9675-f9b72c8e9506)

Les Tests Unitaires ( ProductDaoUnitTest = JUnit 5 ) :

![alt text]({E132418B-29F4-494A-BC47-087F577D9300}.png)

Utilisation de base de données H2 pour le testing :

![{F92A55C2-D80E-4C05-AF48-AE58AEE50584}](https://github.com/user-attachments/assets/5e5bdc83-df4d-4880-a6f1-1a3ff34cdc29)

![{29380C44-1F97-468F-96EB-4280735D82A7}](https://github.com/user-attachments/assets/032b4196-eb78-4143-93a5-88b8c8bdea33)
