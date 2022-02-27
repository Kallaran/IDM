#generated_python_file
import pandas as pd
		
file = pd.read_csv('villes.csv')
file.drop(columns=['population', ], inplace=True)  
row = pd.Series(['Brest', 'Pascal', ])
dfRow = pd.DataFrame([row])
dfRow.columns = list(file.columns)
file = pd.concat([file, dfRow], ignore_index=True)
file.to_csv("villes.csv", index=False)  
print("Villes et maires :")
print(file.head())
