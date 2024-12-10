# Project-CI-CD-With-Gitlab-CI



Ce projet est une application de démonstration utilisant Spring Boot pour gérer des produits dans une base de données. Il comprend un module de test unitaire
pour tester les opérations CRUD sur l'entité Product en utilisant JUnit et le framework Spring Data JPA.
L'application utilise également Docker pour le build et le déploiement automatisé,
et GitLab CI/CD pour la pipeline de déploiement, qui comprend les étapes de construction, de packaging et de déploiement de l'image Docker
. Le projet est conçu pour démontrer une approche DevOps complète, de la gestion du code source à l'exécution de l'application dans un conteneur Docker
, avec un processus de déploiement automatisé sur une infrastructure cloud.


Configuration Docker :


Cette image montre les informations du conteneur  nommé "yassinezoubairi12345/product-microservice:v1"

![{7FE6F610-42EE-42F9-8DAB-162C0B1A3647}](https://github.com/user-attachments/assets/8e539bc4-8e09-4880-9173-90cb9f730bde)

Résultat s'affiche dans localhost:9001 :

![{840D1E53-6B39-4BE2-BAB3-92864A124322}](https://github.com/user-attachments/assets/20c2a0a4-a922-4f30-828f-7214e9d5dd60)

![{E99B506E-77B1-4504-A007-2C4992A0D744}](https://github.com/user-attachments/assets/5d33ffc2-922c-4ef7-8a6b-4c0fa0037c64)

----------------------------------------------------------------------------------------------------------------------


Configuration Gitlab :

![{38AFB6D7-BD7B-4531-AE5C-090E579171B6}](https://github.com/user-attachments/assets/fff92c6b-cf2e-4e33-99fa-b57de7a47c70)


Les Résultas de la Configuration :

![{59F23E19-8E5A-4D35-A75A-9C4702D600CF}](https://github.com/user-attachments/assets/a938d698-361c-4819-9ea8-862927c4c412)



Maven  Build  :![{FA5BF424-0187-43A4-B255-5BF00E7624CC}](https://github.com/user-attachments/assets/e7c216c4-df54-4848-8ff5-a6dd92bc1ed8)

Docker Build  : ![{D8444C35-E5CB-4054-93A2-16FD5F957BE1}](https://github.com/user-attachments/assets/047a464e-58d2-4598-a6d3-b40b14449e10)

Docker Deploy : ![{C6B86C3E-C35C-4152-8A15-23BC43020777}](https://github.com/user-attachments/assets/6bb20731-5b29-4307-9a16-09233d34d002)


Les Tests Unitaires ( ProductControllerUnitTest = MockMvc ) :

![{29380C44-1F97-468F-96EB-4280735D82A7}](https://github.com/user-attachments/assets/032b4196-eb78-4143-93a5-88b8c8bdea33)


Les Tests Unitaires ( ProductDaoUnitTest = JUnit 5 ) :

![{43169428-85F1-4C1D-9D0C-DA71B4712002}](https://github.com/user-attachments/assets/84566098-b9c0-4f5e-a735-1ecfe15e3326)

Utilisation de base de données H2 pour le testing :

![{F036D727-DFC3-4F20-9F38-81DB8565387C}](https://github.com/user-attachments/assets/776abf66-8bfc-44ae-8b4b-7ccfc19d487b)


![image](https://github.com/user-attachments/assets/ef89a5b7-8687-44ed-8beb-8099221fff8f)


