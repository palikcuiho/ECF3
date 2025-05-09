# ECF 3 : Application de E-Commerce

![banner](banner.png)

## Lancement de l'application

1. Cloner le repository
   `git clone https://github.com/palikcuiho/ECF3.git`
2. Se rendre dans le dossier ECF3
3. Créer un fichier `.env` et y copier les variables contenues dans `.env.example`
4. Lancer le Docker-Compose à l'aide de la commande suivante : `docker-compose up -d`

L'interface utilisateur est accessible via l'url <http://localhost:3000>.

## Fonctionnalités

L'application permet de rechercher des produits selon différents critères, de créer un compte utilisateur, et de payer de façon sécurisée.

## Requête de test

Il est possible de tester la communication avec les microservices `authentication-service` et `payment-service` en effectuant une requête `GET` sur leur endpoint `/test`, par exemple : `curl http://localhost:9050/test`. Une réponse status 200 avec le body "success" atteste du succès du test.

## Conteneurisation

### Dockerfiles

- [client](https://raw.githubusercontent.com/palikcuiho/ECF3/refs/heads/main/client/Dockerfile-client)
- [authentication-service](https://raw.githubusercontent.com/palikcuiho/ECF3/refs/heads/main/server/Dockerfile-authentication-service)
- [common-data-service](https://raw.githubusercontent.com/palikcuiho/ECF3/refs/heads/main/server/Dockerfile-common-data-service)
- [payment-service](https://raw.githubusercontent.com/palikcuiho/ECF3/refs/heads/main/server/Dockerfile-payment-service)

### Docker Compose

- [docker-compose](https://raw.githubusercontent.com/palikcuiho/ECF3/refs/heads/main/docker-compose.yml)
