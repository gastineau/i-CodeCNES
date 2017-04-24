/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/********************************************************************************/
/* This file is used to generate a rule checker for COM.FLOW.Exit rule. 		*/
/* For further information on this, we advise you to refer to RNC manuals.	    */
/* As many comments have been done on the ExampleRule.lex file, this file       */
/* will restrain its comments on modifications.								    */
/*																			    */
/********************************************************************************/

package fr.cnes.analysis.tools.fortran90.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;

import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;
import fr.cnes.analysis.tools.analyzer.datas.Violation;
import fr.cnes.analysis.tools.analyzer.exception.JFlexException;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/COMFLOWExit.lex</tt>
 */
public class COMFLOWExit extends AbstractRule {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int NAMING = 4;
  public static final int NEW_LINE = 6;
  public static final int LINE = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\33\1\34\1\34\1\34\22\0\1\24\1\1\1\32\4\0"+
    "\1\31\2\0\1\3\5\0\12\30\7\0\1\21\1\17\1\2\1\15"+
    "\1\14\1\4\1\20\1\25\1\26\2\25\1\23\1\22\1\6\1\11"+
    "\1\12\1\25\1\13\1\27\1\7\1\5\5\25\4\0\1\30\1\0"+
    "\1\21\1\17\1\2\1\15\1\14\1\4\1\20\1\25\1\26\2\25"+
    "\1\23\1\22\1\6\1\11\1\12\1\25\1\13\1\27\1\7\1\5"+
    "\5\25\12\0\1\34\252\0\2\10\115\0\1\16\u1ea8\0\1\34\1\34"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\5\1\1\3\1\4\1\5\1\6"+
    "\1\7\4\1\11\5\77\0\1\10\1\11\12\0\1\12"+
    "\40\0\1\13\5\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\35\0\72\0\127\0\164\0\221\0\221\0\256"+
    "\0\313\0\350\0\u0105\0\u0122\0\221\0\221\0\221\0\u013f"+
    "\0\221\0\u015c\0\u0179\0\u0196\0\u01b3\0\u01d0\0\u01ed\0\u020a"+
    "\0\u015c\0\u0179\0\u0227\0\u0244\0\u0196\0\u01b3\0\u0261\0\u027e"+
    "\0\u029b\0\u02b8\0\u02d5\0\u02f2\0\u030f\0\u0196\0\u01b3\0\u032c"+
    "\0\u0349\0\u0366\0\u0383\0\u03a0\0\u03bd\0\u03da\0\u03f7\0\u0414"+
    "\0\u0431\0\u044e\0\u046b\0\u0488\0\u04a5\0\u04c2\0\u04df\0\u04fc"+
    "\0\u0519\0\u0536\0\u0553\0\u0570\0\u058d\0\u05aa\0\u05c7\0\u05e4"+
    "\0\u0601\0\u061e\0\u063b\0\u0658\0\u0675\0\u0692\0\u06af\0\u06cc"+
    "\0\u06e9\0\u0706\0\u0723\0\u0740\0\u075d\0\u077a\0\u0797\0\u07b4"+
    "\0\u07d1\0\u07ee\0\u080b\0\u0828\0\u0845\0\u0862\0\u087f\0\u089c"+
    "\0\u08b9\0\u08d6\0\u08f3\0\u0910\0\u092d\0\221\0\221\0\u094a"+
    "\0\u0967\0\u0984\0\u09a1\0\u09be\0\u09db\0\u09f8\0\u0a15\0\u0a32"+
    "\0\u0a4f\0\221\0\u0a6c\0\u0a89\0\u0aa6\0\u0ac3\0\u0ae0\0\u0afd"+
    "\0\u0b1a\0\u0b37\0\u0b54\0\u0b71\0\u0b8e\0\u0bab\0\u0bc8\0\u0be5"+
    "\0\u0c02\0\u0c1f\0\u0c3c\0\u0c59\0\u0c76\0\u0c93\0\u0cb0\0\u0ccd"+
    "\0\u0cea\0\u0d07\0\u0d24\0\u0d41\0\u0d5e\0\u0d7b\0\u0d98\0\u0db5"+
    "\0\u0dd2\0\u0def\0\221\0\u0e0c\0\u0e29\0\u0e46\0\u0e63\0\u0e80";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\3\7\1\10\3\6\1\11\1\6\1\12\3\6"+
    "\1\13\3\6\1\14\3\6\1\11\1\13\3\6\1\15"+
    "\1\16\1\17\1\7\31\17\1\15\1\16\1\17\1\7"+
    "\1\20\1\17\4\20\1\17\5\20\1\17\5\20\1\17"+
    "\3\20\3\17\1\21\1\16\1\6\3\7\1\10\3\6"+
    "\1\11\1\6\1\12\1\22\1\23\1\6\1\13\3\6"+
    "\1\14\3\6\1\11\1\13\1\6\1\24\1\25\1\17"+
    "\1\16\1\17\1\7\2\17\1\26\3\17\1\27\1\17"+
    "\1\30\1\31\1\32\1\17\1\33\3\17\1\34\3\17"+
    "\1\27\1\33\1\17\1\35\1\36\1\15\1\16\42\0"+
    "\1\37\35\0\1\40\41\0\1\41\26\0\1\42\40\0"+
    "\1\43\25\0\1\20\1\0\4\20\1\0\5\20\1\0"+
    "\5\20\1\0\4\20\20\0\1\44\26\0\1\45\26\0"+
    "\31\46\1\17\3\46\32\47\1\17\2\47\5\0\1\50"+
    "\35\0\1\51\41\0\1\52\26\0\1\53\40\0\1\54"+
    "\31\0\1\55\35\0\1\56\36\0\1\57\42\0\1\60"+
    "\32\0\1\61\26\0\1\62\42\0\1\63\25\0\1\64"+
    "\35\0\1\65\36\0\1\66\42\0\1\67\32\0\1\70"+
    "\21\0\1\71\46\0\1\72\22\0\1\73\15\0\1\74"+
    "\27\0\1\75\26\0\1\76\34\0\1\77\53\0\1\100"+
    "\12\0\1\101\46\0\1\102\22\0\1\103\15\0\1\104"+
    "\27\0\1\105\26\0\1\106\36\0\1\107\40\0\1\110"+
    "\35\0\1\111\33\0\1\112\32\0\1\113\46\0\1\114"+
    "\24\0\1\115\25\0\1\116\3\0\1\117\1\0\1\120"+
    "\3\0\1\121\3\0\1\122\1\0\1\100\1\0\1\117"+
    "\1\121\14\0\1\123\40\0\1\124\35\0\1\125\33\0"+
    "\1\126\32\0\1\127\46\0\1\130\21\0\1\131\15\0"+
    "\1\131\12\0\1\132\45\0\1\133\40\0\1\134\20\0"+
    "\1\135\43\0\1\136\26\0\1\137\33\0\1\140\35\0"+
    "\1\141\41\0\1\142\26\0\1\143\40\0\1\144\33\0"+
    "\1\145\15\0\1\145\12\0\1\146\45\0\1\147\40\0"+
    "\1\150\20\0\1\151\43\0\1\152\31\0\1\153\44\0"+
    "\1\154\20\0\1\155\51\0\1\136\21\0\1\156\33\0"+
    "\1\157\35\0\1\160\36\0\1\161\42\0\1\162\32\0"+
    "\1\163\30\0\1\164\44\0\1\165\20\0\1\166\51\0"+
    "\1\152\21\0\1\167\33\0\1\136\30\0\1\114\45\0"+
    "\1\114\31\0\1\170\15\0\1\170\10\0\1\171\46\0"+
    "\1\172\22\0\1\173\15\0\1\174\27\0\1\175\26\0"+
    "\1\176\35\0\1\152\30\0\1\130\45\0\1\130\31\0"+
    "\1\177\15\0\1\177\14\0\1\114\35\0\1\200\40\0"+
    "\1\201\35\0\1\202\33\0\1\203\32\0\1\204\46\0"+
    "\1\205\17\0\1\130\36\0\1\206\15\0\1\206\12\0"+
    "\1\207\45\0\1\210\40\0\1\211\20\0\1\212\43\0"+
    "\1\213\31\0\1\214\44\0\1\215\20\0\1\216\51\0"+
    "\1\213\21\0\1\217\33\0\1\213\30\0\1\205\45\0"+
    "\1\205\31\0\1\220\15\0\1\220\14\0\1\205\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3741];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\2\11\5\1\3\11\1\1\1\11\15\1\77\0"+
    "\2\11\12\0\1\11\40\0\1\11\5\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	String location = "MAIN PROGRAM";
	List<String> loc = new LinkedList<String>();
	boolean returnExist = false;
	
	public COMFLOWExit(){
		loc.add(location);
	}
	
	@Override
	public void setInputFile(IPath file) throws FileNotFoundException {
		super.setInputFile(file);
		this.zzReader = new FileReader(file.toOSString());
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public COMFLOWExit(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 174) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public List<Violation> run() throws java.io.IOException, JFlexException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	return getViolations();
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(LINE);
            }
          case 12: break;
          case 2: 
            { yybegin(COMMENT);
            }
          case 13: break;
          case 3: 
            { yybegin(NEW_LINE);
            }
          case 14: break;
          case 4: 
            { throw new JFlexException( new Exception("Illegal character <" + yytext() + ">") );
            }
          case 15: break;
          case 5: 
            { 
            }
          case 16: break;
          case 6: 
            { location = location + " " + yytext(); returnExist = false; loc.add(location); yybegin(COMMENT);
            }
          case 17: break;
          case 7: 
            { loc.add(location); yybegin(NEW_LINE);
            }
          case 18: break;
          case 8: 
            { location = yytext(); yybegin(NAMING);
            }
          case 19: break;
          case 9: 
            { if(returnExist) setError(loc.get(loc.size()-1),"There is more than one exit in the function.", yyline+1);
								 else returnExist = true;
            }
          case 20: break;
          case 10: 
            { location=yytext(); yybegin(NAMING);
            }
          case 21: break;
          case 11: 
            { loc.remove(loc.size()-1);
            }
          case 22: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}