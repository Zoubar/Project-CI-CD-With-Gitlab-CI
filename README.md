Ce projet est une application de démonstration utilisant Spring Boot pour gérer des produits dans une base de données. Il comprend un module de test unitaire
pour tester les opérations CRUD sur l'entité Product en utilisant JUnit et le framework Spring Data JPA.
L'application utilise également Docker pour le build et le déploiement automatisé,
et GitLab CI/CD pour la pipeline de déploiement, qui comprend les étapes de construction, de packaging et de déploiement de l'image Docker
. Le projet est conçu pour démontrer une approche DevOps complète, de la gestion du code source à l'exécution de l'application dans un conteneur Docker
, avec un processus de déploiement automatisé sur une infrastructure cloud.


Configuration Docker :

![alt text]({B6BD15D8-B944-43B8-83AB-B73AA2A60A17}.png)

Cette image montre les informations du conteneur  nommé "yassinezoubairi12345/product-microservice:v1"

![alt text]({59B31DB4-1158-4DF5-9B5A-25FF6A41CDB9}.png)


Résultat s'affiche dans localhost:9001

![alt text]({C982BF13-0790-49CF-8F61-4098E2809887}.png)

----------------------------------------------------------------------------------------------------------------------


Configuration Gitlab :

![alt text]({72846D17-7F97-40F7-B611-1E067F225505}.png)

Les Résulats de la Configuration :

![alt text]({E0E723E7-9F11-42C6-9787-C28DE9B0374B}.png)

Maven  Build  : ![alt text]({7365104F-C93C-4556-BDBB-5A651FA24149}.png)
Docker Build  : ![alt text]({CD9CA7AC-E877-4D42-90FC-6EF8FAA7DAFB}.png)
Docker Deploy : ![alt text]({80D66209-6037-4023-8A82-7CAAC035876D}.png)

Les Tests Unitaires ( ProductControllerUnitTest = MockMvc ) :

![alt text]({9B07FB50-C15B-4ECB-AD85-8A3A4FB028FF}.png)


Les Tests Unitaires ( ProductDaoUnitTest = JUnit 5 ) :


![alt text]({246E265F-0587-4A45-A786-3D972D84889E}.png)


Utilisation de base de données H2 pour le testing :

![alt text]({870CF33B-88F7-425B-BAB4-694ACE400710}.png)

![alt text]({FDFE9969-276C-4961-983C-A4AF6C58F872}.png)