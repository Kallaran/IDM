package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Create
import org.xtext.example.mydsl.myDsl.Load
import org.xtext.example.mydsl.myDsl.Print
import org.xtext.example.mydsl.myDsl.Head
import org.xtext.example.mydsl.myDsl.InsertColumn
import org.xtext.example.mydsl.myDsl.ToCSV
import org.xtext.example.mydsl.myDsl.DropColumn
import org.xtext.example.mydsl.myDsl.DropRow
import org.xtext.example.mydsl.myDsl.InsertRow
import org.xtext.example.mydsl.myDsl.GetColumn
import org.xtext.example.mydsl.myDsl.GetRow
import org.xtext.example.mydsl.myDsl.Command

class PythonGenerator {
	
	
	
	
	def generate (Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context){
				fsa.generateFile('file.py',
'''
#generated_python_file
import pandas as pd
		
?FOR c : resource.allContents.toIterable.filter(Command)?
	?c.compile?
?ENDFOR?
''' 
   		)
   	}
		
	
	   
    private def compile(Command c) {
    	switch c {
    		case c.eClass().name === "Create" : compile(c as Create)
    		case c.eClass().name === "Load" : compile(c as Load)
 			case c.eClass().name === "Print" : compile(c as Print)
 			case c.eClass().name === "Head" : compile(c as Head)
 			case c.eClass().name === "InsertColumn" : compile(c as InsertColumn)
  			case c.eClass().name === "ToCSV" : compile(c as ToCSV)
  			case c.eClass().name === "DropColumn" : compile(c as DropColumn)
  			case c.eClass().name === "DropRow" : compile(c as DropRow)
  			case c.eClass().name === "InsertRow" : compile(c as InsertRow)
  			case c.eClass().name === "GetColumn" : compile(c as GetColumn)
  			case c.eClass().name === "GetRow" : compile(c as GetRow)
  			
  			
 			
 			default : "Error"
		}
    }
    
    private def compile(Print p) {
    	'''print("?p.name?")'''
    }
    
    private def compile(Load l) {
		'''?l.name? = pd.read_csv('?l.path?')'''
    }
    
    private def compile(Create c) {
	
		var String colums = "";
		for( col : c.columns){
			colums+= "'" + col + "', ";
		}

		var String content = "[";
		for( cont : c.content){
			var String f = "[";
			for(field : cont.fields){
				f += "'" + field + "', ";
			}
			content+= f + "], ";
			
		}
		content+="]"


		'''
		?c.path? = pd.DataFrame(?content?, columns=[?colums?])
		?c.path?.to_csv('?c.path?.csv', index=False)
		'''
		
    }
    
    private def compile(Head l) {
		'''print(?l.name?.head())'''
    }
    
    private def compile(InsertColumn i) {
	   	var String columns = "";
        for( cont : i.content){
            columns+= "'" + cont + "', ";
        }
        '''?i.name?["?i.column?"] = ?columns? '''
    }
    
    private def compile(ToCSV i) {
    	'''?i.name?.to_csv("?i.path?", index=False)  '''
    		
    }
    
    private def compile(DropColumn i) {
    	var String colums = "";
		for( col : i.columns){
			colums+= "'" + col + "', ";
		}
    	'''?i.name?.drop(columns=[?colums?], inplace=True)  '''
    		
    }
    
    private def compile(DropRow i) {
    	var String rows = "";
		for( row : i.rows){
			rows+= row + ", ";
		}
    	'''?i.name?.drop([?rows?], inplace=True)  '''
    		
    }

 	private def compile(InsertRow i) {
        var String rows = "";
        for( row : i.rows){
            rows+= "'" + row + "', ";
        }
        '''
        row = pd.Series([?rows?])
        dfRow = pd.DataFrame([row])
        dfRow.columns = list(?i.name?.columns)
        ?i.name? = pd.concat([?i.name?, dfRow], ignore_index=True)
        '''
    }
     
    private def compile(GetColumn i) {
        '''print(?i.name?["?i.column?"])'''
    }

    private def compile(GetRow i) {
        '''print(?i.name?.loc[?i.index?])'''
    }
}
	
