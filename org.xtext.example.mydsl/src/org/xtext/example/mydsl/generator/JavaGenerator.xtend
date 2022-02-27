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

class JavaGenerator {
	
	
	
	
	def generate (Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context){
				fsa.generateFile('file.java',
'''
#generated_java_file

		
«FOR c : resource.allContents.toIterable.filter(Command)»
	«c.compile»
«ENDFOR»
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
    	''' '''
    }
    
    private def compile(Load l) {
        '''BufferedReader «l.name» = new BufferedReader(new (FileReader('«l.name»'));'''
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
        «c.path» = pd.DataFrame(«content», columns=[«colums»])
        «c.path».to_csv('«c.path».csv', index=False)
        '''
    }
    
    private def compile(Head l) {
		''' '''
    }
    
    private def compile(InsertColumn i) {

        ''' '''
    }
    
    private def compile(ToCSV i) {
    	''' '''
    		
    }
    
    private def compile(DropColumn i) {
    	
    	''' '''
    		
    }
    
    private def compile(DropRow i) {
        	''' '''
    		
    }

 	private def compile(InsertRow i) {
      var String rows = "";
        for( row : i.rows){
            rows+= "'" + row + "', ";
        }
        '''
        Writer writer = new FileWriter("src/ville.csv", true);
        BufferedWriter bw = new BufferedWriter(writer);
        String text =  "«rows»"; 
        bw.write(text);
        bw.flush();
        '''     
    }
     
    private def compile(GetColumn i) {
        ''' '''
    }

    private def compile(GetRow i) {
              '''
        String delimiter = ",";
        
        BufferedReader br = «i.name»; 
        
        String line = "";
        String[] tempArr;
        int index = 0;
        
        while((line = br.readLine()) != null) {
            if(index == «i.index»){
                tempArr = line.split(delimiter);
                for(String tempStr : tempArr) {
                   System.out.print(tempStr + " ");
                }
                System.out.println();
            }
            index++;
        }
        br.close();
        
        '''
    }
}
	
