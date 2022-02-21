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
