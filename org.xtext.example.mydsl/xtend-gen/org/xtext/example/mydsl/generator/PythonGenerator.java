package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.myDsl.Command;
import org.xtext.example.mydsl.myDsl.Content;
import org.xtext.example.mydsl.myDsl.Create;
import org.xtext.example.mydsl.myDsl.DropColumn;
import org.xtext.example.mydsl.myDsl.DropRow;
import org.xtext.example.mydsl.myDsl.GetColumn;
import org.xtext.example.mydsl.myDsl.GetRow;
import org.xtext.example.mydsl.myDsl.Head;
import org.xtext.example.mydsl.myDsl.InsertColumn;
import org.xtext.example.mydsl.myDsl.InsertRow;
import org.xtext.example.mydsl.myDsl.Load;
import org.xtext.example.mydsl.myDsl.Print;
import org.xtext.example.mydsl.myDsl.ToCSV;

@SuppressWarnings("all")
public class PythonGenerator {
  public void generate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#generated_python_file");
    _builder.newLine();
    _builder.append("import pandas as pd");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      Iterable<Command> _filter = Iterables.<Command>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Command.class);
      for(final Command c : _filter) {
        CharSequence _compile = this.compile(c);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    fsa.generateFile("file.py", _builder);
  }
  
  private CharSequence compile(final Command c) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    String _name = c.eClass().getName();
    boolean _tripleEquals = (_name == "Create");
    if (_tripleEquals) {
      _matched=true;
      _switchResult = this.compile(((Create) c));
    }
    if (!_matched) {
      String _name_1 = c.eClass().getName();
      boolean _tripleEquals_1 = (_name_1 == "Load");
      if (_tripleEquals_1) {
        _matched=true;
        _switchResult = this.compile(((Load) c));
      }
    }
    if (!_matched) {
      String _name_2 = c.eClass().getName();
      boolean _tripleEquals_2 = (_name_2 == "Print");
      if (_tripleEquals_2) {
        _matched=true;
        _switchResult = this.compile(((Print) c));
      }
    }
    if (!_matched) {
      String _name_3 = c.eClass().getName();
      boolean _tripleEquals_3 = (_name_3 == "Head");
      if (_tripleEquals_3) {
        _matched=true;
        _switchResult = this.compile(((Head) c));
      }
    }
    if (!_matched) {
      String _name_4 = c.eClass().getName();
      boolean _tripleEquals_4 = (_name_4 == "InsertColumn");
      if (_tripleEquals_4) {
        _matched=true;
        _switchResult = this.compile(((InsertColumn) c));
      }
    }
    if (!_matched) {
      String _name_5 = c.eClass().getName();
      boolean _tripleEquals_5 = (_name_5 == "ToCSV");
      if (_tripleEquals_5) {
        _matched=true;
        _switchResult = this.compile(((ToCSV) c));
      }
    }
    if (!_matched) {
      String _name_6 = c.eClass().getName();
      boolean _tripleEquals_6 = (_name_6 == "DropColumn");
      if (_tripleEquals_6) {
        _matched=true;
        _switchResult = this.compile(((DropColumn) c));
      }
    }
    if (!_matched) {
      String _name_7 = c.eClass().getName();
      boolean _tripleEquals_7 = (_name_7 == "DropRow");
      if (_tripleEquals_7) {
        _matched=true;
        _switchResult = this.compile(((DropRow) c));
      }
    }
    if (!_matched) {
      String _name_8 = c.eClass().getName();
      boolean _tripleEquals_8 = (_name_8 == "InsertRow");
      if (_tripleEquals_8) {
        _matched=true;
        _switchResult = this.compile(((InsertRow) c));
      }
    }
    if (!_matched) {
      String _name_9 = c.eClass().getName();
      boolean _tripleEquals_9 = (_name_9 == "GetColumn");
      if (_tripleEquals_9) {
        _matched=true;
        _switchResult = this.compile(((GetColumn) c));
      }
    }
    if (!_matched) {
      String _name_10 = c.eClass().getName();
      boolean _tripleEquals_10 = (_name_10 == "GetRow");
      if (_tripleEquals_10) {
        _matched=true;
        _switchResult = this.compile(((GetRow) c));
      }
    }
    if (!_matched) {
      _switchResult = "Error";
    }
    return _switchResult;
  }
  
  private CharSequence compile(final Print p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("print(\"");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder;
  }
  
  private CharSequence compile(final Load l) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = l.getName();
    _builder.append(_name);
    _builder.append(" = pd.read_csv(\'");
    String _path = l.getPath();
    _builder.append(_path);
    _builder.append("\')");
    return _builder;
  }
  
  private CharSequence compile(final Create c) {
    CharSequence _xblockexpression = null;
    {
      String colums = "";
      EList<String> _columns = c.getColumns();
      for (final String col : _columns) {
        String _colums = colums;
        colums = (_colums + (("\'" + col) + "\', "));
      }
      String content = "[";
      EList<Content> _content = c.getContent();
      for (final Content cont : _content) {
        {
          String f = "[";
          EList<String> _fields = cont.getFields();
          for (final String field : _fields) {
            String _f = f;
            f = (_f + (("\'" + field) + "\', "));
          }
          String _content_1 = content;
          content = (_content_1 + (f + "], "));
        }
      }
      String _content_1 = content;
      content = (_content_1 + "]");
      StringConcatenation _builder = new StringConcatenation();
      String _path = c.getPath();
      _builder.append(_path);
      _builder.append(" = pd.DataFrame(");
      _builder.append(content);
      _builder.append(", columns=[");
      _builder.append(colums);
      _builder.append("])");
      _builder.newLineIfNotEmpty();
      String _path_1 = c.getPath();
      _builder.append(_path_1);
      _builder.append(".to_csv(\'");
      String _path_2 = c.getPath();
      _builder.append(_path_2);
      _builder.append(".csv\', index=False)");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence compile(final Head l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("print(");
    String _name = l.getName();
    _builder.append(_name);
    _builder.append(".head())");
    return _builder;
  }
  
  private CharSequence compile(final InsertColumn i) {
    CharSequence _xblockexpression = null;
    {
      String columns = "";
      EList<String> _content = i.getContent();
      for (final String cont : _content) {
        String _columns = columns;
        columns = (_columns + (("\'" + cont) + "\', "));
      }
      StringConcatenation _builder = new StringConcatenation();
      String _name = i.getName();
      _builder.append(_name);
      _builder.append("[\"");
      String _column = i.getColumn();
      _builder.append(_column);
      _builder.append("\"] = ");
      _builder.append(columns);
      _builder.append(" ");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence compile(final ToCSV i) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = i.getName();
    _builder.append(_name);
    _builder.append(".to_csv(\"");
    String _path = i.getPath();
    _builder.append(_path);
    _builder.append("\", index=False)  ");
    return _builder;
  }
  
  private CharSequence compile(final DropColumn i) {
    CharSequence _xblockexpression = null;
    {
      String colums = "";
      EList<String> _columns = i.getColumns();
      for (final String col : _columns) {
        String _colums = colums;
        colums = (_colums + (("\'" + col) + "\', "));
      }
      StringConcatenation _builder = new StringConcatenation();
      String _name = i.getName();
      _builder.append(_name);
      _builder.append(".drop(columns=[");
      _builder.append(colums);
      _builder.append("], inplace=True)  ");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence compile(final DropRow i) {
    CharSequence _xblockexpression = null;
    {
      String rows = "";
      EList<String> _rows = i.getRows();
      for (final String row : _rows) {
        String _rows_1 = rows;
        rows = (_rows_1 + (row + ", "));
      }
      StringConcatenation _builder = new StringConcatenation();
      String _name = i.getName();
      _builder.append(_name);
      _builder.append(".drop([");
      _builder.append(rows);
      _builder.append("], inplace=True)  ");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence compile(final InsertRow i) {
    CharSequence _xblockexpression = null;
    {
      String rows = "";
      EList<String> _rows = i.getRows();
      for (final String row : _rows) {
        String _rows_1 = rows;
        rows = (_rows_1 + (("\'" + row) + "\', "));
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("row = pd.Series([");
      _builder.append(rows);
      _builder.append("])");
      _builder.newLineIfNotEmpty();
      _builder.append("dfRow = pd.DataFrame([row])");
      _builder.newLine();
      _builder.append("dfRow.columns = list(");
      String _name = i.getName();
      _builder.append(_name);
      _builder.append(".columns)");
      _builder.newLineIfNotEmpty();
      String _name_1 = i.getName();
      _builder.append(_name_1);
      _builder.append(" = pd.concat([");
      String _name_2 = i.getName();
      _builder.append(_name_2);
      _builder.append(", dfRow], ignore_index=True)");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private CharSequence compile(final GetColumn i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("print(");
    String _name = i.getName();
    _builder.append(_name);
    _builder.append("[\"");
    String _column = i.getColumn();
    _builder.append(_column);
    _builder.append("\"])");
    return _builder;
  }
  
  private CharSequence compile(final GetRow i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("print(");
    String _name = i.getName();
    _builder.append(_name);
    _builder.append(".loc[");
    int _index = i.getIndex();
    _builder.append(_index);
    _builder.append("])");
    return _builder;
  }
}
