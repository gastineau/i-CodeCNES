/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/**********************************************************************************/
/* This file is used to generate a rule checker for COM.DESIGN.ActiveWait rule.     */
/* For further information on this, we advise you to refer to RNC manuals.        */
/* As many comments have been done on the ExampleRule.lex file, this file         */
/* will restrain its comments on modifications.                                   */
/*                                                                                */
/**********************************************************************************/

package fr.cnes.analysis.tools.shell.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.util.List;

import org.eclipse.core.runtime.Path;

import fr.cnes.analysis.tools.analyzer.datas.AbstractChecker;
import fr.cnes.analysis.tools.analyzer.datas.CheckResult;
import fr.cnes.analysis.tools.analyzer.exception.JFlexException;

%%

%class COMDESIGNActiveWait
%extends AbstractChecker
%public
%column
%line


%function run
%yylexthrow JFlexException
%type List<CheckResult>


%state COMMENT, NAMING

COMMENT_WORD = \#
FUNC         = "function"
SPACE        = [\ \r\t\f]
VAR          = [a-zA-Z][a-zA-Z0-9\_]*
STRING       = \'[^\']*\' | \"[^\"]*\"

ACTWAIT     = "while"{SPACE}*\[{SPACE}*"1"{SPACE}*\]{SPACE}*    |
              "read"
                                                                
%{
    String location = "MAIN PROGRAM";
    private String parsedFileName;

    public COMDESIGNActiveWait() {
    }
    
    @Override
    public void setInputFile(final File file) throws FileNotFoundException {
        super.setInputFile(file);
        
        this.parsedFileName = file.toString();
        this.zzReader = new FileReader(new Path(file.getAbsolutePath()).toOSString());
    }
        
%}

%eofval{
    return getCheckResults();
%eofval}


%%          



/************************/



/************************/
/* COMMENT STATE        */
/************************/
<COMMENT>       
        {
                \n              {yybegin(YYINITIAL);}  
                .               {}
        }
        
/************************/
/* NAMING STATE     */
/************************/
<NAMING>    
        {
                {VAR}           {location = location + yytext(); yybegin(YYINITIAL);}
                \n              {yybegin(YYINITIAL);}  
                .               {}
        }

/************************/
/* YYINITIAL STATE      */
/************************/
<YYINITIAL>
        {
                {COMMENT_WORD}  {yybegin(COMMENT);}
                {FUNC}          {location = yytext(); yybegin(NAMING);}
                {ACTWAIT}       {setError(location,"There is an active wait in this point.", yyline+1); }
                {STRING}        {}
                {VAR}           {} /* Clause to match with words */
                [^]             {}
        }


/************************/
/* ERROR STATE          */
/************************/
				[^]            {
									
				                    final String errorMessage = "Analysis failure : Your file could not be analyzed. Please verify that it was encoded in an UNIX format.";
				                    throw new JFlexException(this.getClass().getName(), parsedFileName,
				                                    errorMessage, yytext(), yyline, yycolumn);
								}