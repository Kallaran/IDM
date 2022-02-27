# IDM

## Notre métamodèle 

![myDsl_class_diagram.jpg](myDsl_class_diagram.jpg)

[Fichier .ecore](org.xtext.example.mydsl/model/generated/MyDsl.ecore)


## Notre grammaire 

[MyDsl.xtext](org.xtext.example.mydsl/src/org/xtext/example/mydsl/MyDsl.xtext)

## Les compilateurs 

Vers Python : [PythonGenerator.xtend](org.xtext.example.mydsl/src/org/xtext/example/mydsl/generator/PythonGenerator.xtend)

Vers Java : [JavaGenerator.xtend](org.xtext.example.mydsl/src/org/xtext/example/mydsl/generator/JavaGenerator.xtend)

Pour choisir quel compilateur utiliser il faut commenter/décommenter les lignes suivantes :

```
//Python Generator
p.generate (resource, fsa,  context); 
		
//Java Generator
//j.generate (resource, fsa,  context);
```
Ici le compilateur vers Python sera utilisé.

Ces lignes se trouvent dans le fichier : [MyDslGenerator.xtend](org.xtext.example.mydsl/src/org/xtext/example/mydsl/generator/MyDslGenerator.xtend)


## Quelques exemples de programmes réalisés avec notre langage 

Ces exemples se trouvent dans le dossier "MYDSL_programs".

[pro1.mydsl](MYDSL_programs/pro1.mydsl) : Ce programme permet de créer un fichier CSV et de lui rajouter une colonne.

[pro2.mydsl](MYDSL_programs/pro2.mydsl) : Ce programme récupère le fichier créé avec pro1.mydsl et lui retire une colonne avant de lui rajouter une ligne, enfin il retourne dans la sortie standard un message "Villes et maires :" ainsi que les 5 premières lignes du CSV.

## Tester notre lanagage (avec Docker)

Une image `Docker` est fournie pour pouvoir compiler un programme de notre langage. `docker run <abs_path>:/app/src-gen paulborielabs/compiler <nom du programme>`. Le code généré se trouvera dans le dossier indiqué à `<abs_path>` sur le système hôte. 

```bash
docker run -v ~/IDM/generated_code:/app/src-gen paulborielabs/compiler pro2.mydsl
```
Un `docker-compose` est également fourni. Encore une fois le code généré se trouvera dans le dossier `generated_code`. Pour rajouter des programmes il faut qu'ils soient montés dans le conteneur à son démarage, le `docker-compose` permet cela car il monte tous les programmes dans le dossier `MYDSL_programs` dans le conteneur. Il faudra donc placer les nouveaux programmes dans ce dossier.

```bash
docker-compose up
```


## Documentation de notre langage 

Notre langage est constitué d'un ensemble de commandes qu'il suffit d'utiliser dans un ordre cohérent.

#### `Create`

Créé un fichier CSV avec nom des colonnes et données contenues.

```
CREATE "<nom_fichier>" : ["<nom_col1>" "<nom_col2>" ... ] : [["<row1_col1>" "<row1_col2>" ... ] ["<row2_col1>" "<row2_col2>" ... ] ...]
```

Exemple :

```
CREATE "villes" : ["ville" "population" ] : [["rennes" "65623444"]["lyon" "5223331"]]
```

#### `Load`

Permet de charger dans une variable le contenu d'un fichier CSV.

```
LOAD <nom_variable> = "<nom_fichier.csv>"
```

Exemple :

```
LOAD file = "villes.csv"
```

#### `Print`

Retourne un message dans la sortir standard.

```
PRINT "<texte>"
```

Exemple :

```
PRINT "un message"
```

#### `Head`

Permet d'afficher dans la sortie standard les 5 premières lignes d'un CSV préalablement chargé dans une variable.

```
HEAD <nom_variable>
```

Exemple :

```
HEAD file
```

#### `InsertColumn`

Permet de rajouter une colonne à un CSV chargé dans une variable.

```
INSERT COLUMN <nom_variable> "<nom_colonne>" : "<col1>" "<col2>" ...
```

Exemple :

```
INSERT COLUMN file "maire" : "Bertrand" "Bernard"
```

#### `ToCSV`

Permet de sauvegarder le contenu d'une variable dans un fichier CSV.

```
TO CSV <nom_variable> "<nom_fichier.csv>"
```

Exemple :

```
TO CSV file "villes.csv"
```

#### `DropColumn`

Permet de supprimer une ou plusiseurs colonnes.

```
DROP COLUMN <nom_variable> "<col1>" "<col2>" ...
```

Exemple :

```
DROP COLUMN file "population"
```

#### `DropRow`

Permet de supprimer une ou plusiseurs lignes.

```
DROP ROW <nom_variable> "<index_row1>" "<index_row2>" ...
```

Exemple :

```
DROP ROW file "0"
```

#### `InsertRow`

Permet de rajouter une ligne à un CSV chargé dans une variable à la fin.

```
INSERT ROW <nom_variable> "<index_row1>" "<index_row2>" ...
```

Exemple :

```
INSERT ROW file "Brest" "321020"
```

#### `GetRow`

Permet d'afficher une ligne dans un CSV chargé dans une variable en fonction de son index.

```
GET ROW <nom_variable> "<index_row>"
```

Exemple :

```
GET ROW file "0"
```

#### `GetColumn`

Permet d'afficher une colonne dans un CSV chargé dans une variable en fonction du nom de la colonne.

```
GET COLUMN <nom_variable> "<col>"
```

Exemple :

```
GET COLUMN file "ville"
```
