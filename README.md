# java-s8-vente-disque
Creation d'un site de vente de disque en methode agile

## Back-end

* Projet spring boot build avec gradle
* Persistence des données avec hibernate
* Necessite une base de données sql, veiller à bien modifier les informations de connexion à la bas dans le fichier properties présent dans /resources/application.properties 
* Fichier sql contenant les insertions en base de données présent dans /resources
* Pour executer, ouvrir le projet avec un IDE 
et executer la classe SelldiskApplication présente dans
/java/com/dev/selldisk/SelldiskApplication.java


## Front-end

* Projet angular généré avec AngularCLI
* Necessite npm ou yarn pour demarrer le projet

### Installation et execution : 

Dans un terminal depuis la racine du projet 

    cd front/sell-disk-app
    npm install
    npm start
    
L'application est alors dispobible à l'adresse <localhost:4200>

Grâce au insertions disponible dans le script sql cité plus haut vous disposez d'un profil de test avec les identifiants mail:'test' mdp:'test'
