Ce projet est une application de démonstration utilisant Spring Boot pour gérer des produits dans une base de données. Il comprend un module de test unitaire 
pour tester les opérations CRUD sur l'entité Product en utilisant JUnit et le framework Spring Data JPA.
L'application utilise également Docker pour le build et le déploiement automatisé,
et GitLab CI/CD pour la pipeline de déploiement, qui comprend les étapes de construction, de packaging et de déploiement de l'image Docker
. Le projet est conçu pour démontrer une approche DevOps complète, de la gestion du code source à l'exécution de l'application dans un conteneur Docker
, avec un processus de déploiement automatisé sur une infrastructure cloud.


Configuration Docker :

![{B8641C3F-FB75-4394-BD4F-327334EC4384}.png](..%2F%7BB8641C3F-FB75-4394-BD4F-327334EC4384%7D.png)

Cette image montre les informations du conteneur  nommé "yassinezoubairi12345/product-microservice:v1"

![{87ACFA12-0F2B-486F-A16D-94DF0511691E}.png](..%2F%7B87ACFA12-0F2B-486F-A16D-94DF0511691E%7D.png)


Configuration Gitlab : 

![{FCC1B14E-2060-4E5F-B436-9BF9C892B3AB}.png](..%2F%7BFCC1B14E-2060-4E5F-B436-9BF9C892B3AB%7D.png)

Les Résulats de la Configuration :


![{ADE5EB4B-F636-4890-9193-72D862DBC993}.png](..%2F%7BADE5EB4B-F636-4890-9193-72D862DBC993%7D.png)

![{5800B085-C123-4381-8C19-ECCBC48CA23C}.png](..%2F%7B5800B085-C123-4381-8C19-ECCBC48CA23C%7D.png)

![{E13BC53F-8F5B-4C06-A5FC-6EE0E2463A57}.png](..%2F%7BE13BC53F-8F5B-4C06-A5FC-6EE0E2463A57%7D.png)

![{3F66C853-F715-4932-A355-F9EAD4C5B79C}.png](..%2F%7B3F66C853-F715-4932-A355-F9EAD4C5B79C%7D.png)

![{189E4499-AE47-49A9-A171-0CA1FFF3068F}.png](..%2F%7B189E4499-AE47-49A9-A171-0CA1FFF3068F%7D.png)

![{84F6830B-2EE1-4E30-8AD2-E4DD022F1BA6}.png](..%2F%7B84F6830B-2EE1-4E30-8AD2-E4DD022F1BA6%7D.png)


Les Tests Unitaires ( ProductControllerUnitTest = MockMvc ) ,  Les Tests Unitaires ( ProductDaoUnitTest = JUnit 5 ) :

![{C1EEBB33-FB7B-4D23-968E-AAE96ADDB933}.png](..%2F%7BC1EEBB33-FB7B-4D23-968E-AAE96ADDB933%7D.png)

![{3D18EF63-E60A-444B-8FFB-9215F6B2B80D}.png](..%2F%7B3D18EF63-E60A-444B-8FFB-9215F6B2B80D%7D.png)


Utilisation de base de données H2 pour le testing : 

![{42A016C1-AC39-497B-B909-E9896ACC9B8F}.png](..%2F%7B42A016C1-AC39-497B-B909-E9896ACC9B8F%7D.png)