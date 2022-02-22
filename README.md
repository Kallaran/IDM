# IDM

## Notre grammaire :
[MyDsl.xtext](org.xtext.example.mydsl/bin/org/xtext/example/mydsl/MyDsl.xtext)

## Le compilateur vers python
[MyDslGenerator.xtend](org.xtext.example.mydsl/bin/org/xtext/example/mydsl/generator/MyDslGenerator.xtend)


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
INSERT COLUMN <nom_variable> "<nom_colonne>" "<col1>" "<col2>" ...
```
Exemple :
```
INSERT COLUMN file "maire" "Bertrand" "Bernard"
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
Permet d'afficher une colunne dans un CSV chargé dans une variable en fonction du nom de la colonne.
```
GET COLUMN <nom_variable> "<col>"
```
Exemple :
```
GET COLUMN file "ville"
```
