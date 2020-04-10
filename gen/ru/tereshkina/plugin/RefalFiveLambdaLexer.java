/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package ru.tereshkina.plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import ru.tereshkina.plugin.psi.RefalFiveLambdaTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>RefalFiveLambda.flex</tt>
 */
class RefalFiveLambdaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CPP_INLINE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\1\1\14\1\15\1\2\22\0\1\3\1\0\1\20\1\54\1\26\1\13\1\55\1\16\1\63"+
    "\1\64\1\12\1\72\1\56\1\5\1\74\1\11\12\25\1\60\1\57\1\67\1\70\1\21\1\73\1\0"+
    "\1\34\1\53\1\52\1\27\1\33\1\50\1\37\1\4\1\31\2\4\1\47\1\42\1\40\1\51\1\45"+
    "\1\4\1\30\1\35\1\36\1\41\1\32\1\44\1\46\1\43\1\4\1\65\1\17\1\66\1\71\1\4\1"+
    "\0\4\24\1\10\1\24\7\4\1\22\3\4\1\22\1\6\1\7\3\4\1\23\2\4\1\61\1\0\1\62\7\0"+
    "\1\14\242\0\2\14\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\2\3\1\1\1\4\3\1\1\5"+
    "\1\6\1\1\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\0\1\25\2\0\1\26\3\0\1\27\6\0\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\25\42\0"+
    "\1\25\1\37\10\0\1\40\2\0\1\41\1\42\2\0"+
    "\1\43\3\0\1\44\1\0\1\45\1\46\1\47\1\0"+
    "\1\50\2\0\1\51\2\0\1\52\2\0\1\53\2\0"+
    "\1\54\2\0\1\55\1\56\1\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
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
    "\0\0\0\75\0\75\0\172\0\267\0\364\0\u0131\0\u016e"+
    "\0\u01ab\0\u01e8\0\u0225\0\75\0\u0262\0\u029f\0\75\0\75"+
    "\0\75\0\75\0\75\0\75\0\75\0\75\0\75\0\75"+
    "\0\75\0\u02dc\0\75\0\75\0\u0319\0\u0356\0\u0393\0\u01e8"+
    "\0\75\0\u03d0\0\u0225\0\u040d\0\75\0\u044a\0\u0487\0\u04c4"+
    "\0\u0501\0\u053e\0\u057b\0\75\0\75\0\75\0\75\0\75"+
    "\0\75\0\u0319\0\u05b8\0\u05f5\0\u0632\0\u066f\0\u06ac\0\u06e9"+
    "\0\u0726\0\u0763\0\u07a0\0\u07dd\0\u081a\0\u0857\0\u0894\0\u08d1"+
    "\0\u090e\0\u094b\0\u0988\0\u09c5\0\u0a02\0\u0a3f\0\u0a7c\0\u0ab9"+
    "\0\u0af6\0\u0b33\0\u0b70\0\u0bad\0\u0bea\0\u0c27\0\u0c64\0\u0ca1"+
    "\0\u0cde\0\u0d1b\0\u0d58\0\u0d95\0\u0dd2\0\75\0\75\0\u0e0f"+
    "\0\u0e4c\0\u0e89\0\u0ec6\0\u0f03\0\u0f40\0\u0f7d\0\u0fba\0\75"+
    "\0\u0ff7\0\u1034\0\75\0\75\0\u1071\0\u10ae\0\75\0\u10eb"+
    "\0\u1128\0\u1165\0\75\0\u11a2\0\75\0\75\0\75\0\u11df"+
    "\0\75\0\u121c\0\u1259\0\75\0\u1296\0\u12d3\0\u1310\0\u134d"+
    "\0\u138a\0\75\0\u13c7\0\u1404\0\75\0\u1441\0\u147e\0\75"+
    "\0\75\0\75";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
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
    "\1\3\3\4\1\5\1\3\3\6\1\7\1\10\1\11"+
    "\1\0\1\4\1\12\1\3\1\13\1\14\3\5\1\15"+
    "\1\16\25\5\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\3\3\76\0\3\4\11\0\1\4\63\0\5\5\11\0"+
    "\4\5\1\0\25\5\25\0\5\5\11\0\4\5\1\0"+
    "\25\5\20\0\1\35\12\0\1\36\62\0\1\10\2\0"+
    "\72\10\13\0\1\37\61\0\1\40\2\0\13\40\1\41"+
    "\1\42\55\40\1\43\2\0\14\43\1\44\1\45\54\43"+
    "\25\0\1\15\76\0\1\46\1\0\1\47\1\0\1\50"+
    "\1\0\1\51\11\0\1\52\1\53\31\0\1\54\3\0"+
    "\1\55\1\56\1\57\56\0\1\60\1\61\5\0\5\62"+
    "\11\0\4\62\1\0\25\62\21\0\12\63\1\64\62\63"+
    "\1\0\1\65\102\0\1\40\6\0\5\40\1\66\37\0"+
    "\2\40\2\0\1\40\14\0\1\43\6\0\5\43\1\67"+
    "\37\0\2\43\2\0\1\43\35\0\1\70\104\0\1\71"+
    "\67\0\1\72\1\73\1\74\2\0\1\75\5\0\1\76"+
    "\72\0\1\77\1\100\63\0\1\101\111\0\1\102\23\0"+
    "\12\63\1\103\74\63\1\0\62\63\1\104\1\65\11\104"+
    "\1\105\61\104\10\0\1\106\13\0\2\106\1\0\1\106"+
    "\3\0\2\106\13\0\1\106\1\0\2\106\31\0\1\107"+
    "\13\0\2\107\1\0\1\107\3\0\2\107\13\0\1\107"+
    "\1\0\2\107\52\0\1\110\101\0\1\111\10\0\1\112"+
    "\2\0\1\113\62\0\1\114\71\0\1\115\103\0\1\116"+
    "\66\0\1\117\2\0\1\120\71\0\1\121\72\0\1\122"+
    "\73\0\1\123\114\0\1\124\51\0\1\125\44\0\11\63"+
    "\1\126\1\103\62\63\1\104\1\65\1\0\11\104\2\0"+
    "\60\104\1\65\11\104\1\127\61\104\10\0\1\40\13\0"+
    "\2\40\1\0\1\40\3\0\2\40\13\0\1\40\1\0"+
    "\2\40\31\0\1\43\13\0\2\43\1\0\1\43\3\0"+
    "\2\43\13\0\1\43\1\0\2\43\53\0\1\130\72\0"+
    "\1\131\75\0\1\132\112\0\1\133\66\0\1\134\71\0"+
    "\1\135\72\0\1\136\70\0\1\137\106\0\1\140\62\0"+
    "\1\141\2\0\1\142\106\0\1\143\101\0\1\144\55\0"+
    "\1\145\105\0\1\146\63\0\1\147\72\0\1\150\103\0"+
    "\1\151\75\0\1\152\75\0\1\153\65\0\1\154\106\0"+
    "\1\155\72\0\1\156\71\0\1\157\64\0\1\160\113\0"+
    "\1\161\61\0\1\162\100\0\1\163\67\0\1\164\70\0"+
    "\1\165\75\0\1\166\104\0\1\167\64\0\1\170\101\0"+
    "\1\171\72\0\1\172\74\0\1\173\75\0\1\174\67\0"+
    "\1\175\76\0\1\176\102\0\1\177\104\0\1\200\77\0"+
    "\1\201\61\0\1\202\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5307];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\10\1\11\10\1\1\11\2\1\13\11\1\1"+
    "\2\11\1\0\1\1\2\0\1\11\3\0\1\11\6\0"+
    "\6\11\2\1\42\0\2\11\10\0\1\11\2\0\2\11"+
    "\2\0\1\11\3\0\1\11\1\0\3\11\1\0\1\11"+
    "\2\0\1\11\2\0\1\1\2\0\1\11\2\0\1\11"+
    "\2\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  RefalFiveLambdaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(YYINITIAL); return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 48: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 49: break;
          case 3: 
            { return RefalFiveLambdaTypes.NAME;
            } 
            // fall through
          case 50: break;
          case 4: 
            { return RefalFiveLambdaTypes.LINE_COMMENT;
            } 
            // fall through
          case 51: break;
          case 5: 
            { return RefalFiveLambdaTypes.RCHEVRON;
            } 
            // fall through
          case 52: break;
          case 6: 
            { return RefalFiveLambdaTypes.INTEGER_LITERAL;
            } 
            // fall through
          case 53: break;
          case 7: 
            { return RefalFiveLambdaTypes.SHARP;
            } 
            // fall through
          case 54: break;
          case 8: 
            { return RefalFiveLambdaTypes.AMPERSAND;
            } 
            // fall through
          case 55: break;
          case 9: 
            { return RefalFiveLambdaTypes.COMMA;
            } 
            // fall through
          case 56: break;
          case 10: 
            { return RefalFiveLambdaTypes.SEMICOLON;
            } 
            // fall through
          case 57: break;
          case 11: 
            { return RefalFiveLambdaTypes.COLON;
            } 
            // fall through
          case 58: break;
          case 12: 
            { return RefalFiveLambdaTypes.LBRACE;
            } 
            // fall through
          case 59: break;
          case 13: 
            { return RefalFiveLambdaTypes.RBRACE;
            } 
            // fall through
          case 60: break;
          case 14: 
            { return RefalFiveLambdaTypes.LPAREN;
            } 
            // fall through
          case 61: break;
          case 15: 
            { return RefalFiveLambdaTypes.RPAREN;
            } 
            // fall through
          case 62: break;
          case 16: 
            { return RefalFiveLambdaTypes.LBRACKET;
            } 
            // fall through
          case 63: break;
          case 17: 
            { return RefalFiveLambdaTypes.RBRACKET;
            } 
            // fall through
          case 64: break;
          case 18: 
            { return RefalFiveLambdaTypes.LCHEVRON;
            } 
            // fall through
          case 65: break;
          case 19: 
            { return RefalFiveLambdaTypes.EQUAL;
            } 
            // fall through
          case 66: break;
          case 20: 
            { return RefalFiveLambdaTypes.CARET;
            } 
            // fall through
          case 67: break;
          case 21: 
            { return RefalFiveLambdaTypes.MULTILINE_COMMENT;
            } 
            // fall through
          case 68: break;
          case 22: 
            { return RefalFiveLambdaTypes.QUOTEDSTRING;
            } 
            // fall through
          case 69: break;
          case 23: 
            { return RefalFiveLambdaTypes.COMPOUND;
            } 
            // fall through
          case 70: break;
          case 24: 
            { return RefalFiveLambdaTypes.SUB;
            } 
            // fall through
          case 71: break;
          case 25: 
            { return RefalFiveLambdaTypes.DIV;
            } 
            // fall through
          case 72: break;
          case 26: 
            { return RefalFiveLambdaTypes.MUL;
            } 
            // fall through
          case 73: break;
          case 27: 
            { return RefalFiveLambdaTypes.MOD;
            } 
            // fall through
          case 74: break;
          case 28: 
            { return RefalFiveLambdaTypes.ADD;
            } 
            // fall through
          case 75: break;
          case 29: 
            { return RefalFiveLambdaTypes.RESIDUE;
            } 
            // fall through
          case 76: break;
          case 30: 
            { return RefalFiveLambdaTypes.VARIABLE;
            } 
            // fall through
          case 77: break;
          case 31: 
            { return RefalFiveLambdaTypes.NATIVE_IN;
            } 
            // fall through
          case 78: break;
          case 32: 
            { return RefalFiveLambdaTypes.ENUM;
            } 
            // fall through
          case 79: break;
          case 33: 
            { return RefalFiveLambdaTypes.SWAP;
            } 
            // fall through
          case 80: break;
          case 34: 
            { return RefalFiveLambdaTypes.SPEC;
            } 
            // fall through
          case 81: break;
          case 35: 
            { return RefalFiveLambdaTypes.DRIVE;
            } 
            // fall through
          case 82: break;
          case 36: 
            { return RefalFiveLambdaTypes.EENUM;
            } 
            // fall through
          case 83: break;
          case 37: 
            { return RefalFiveLambdaTypes.ESWAP;
            } 
            // fall through
          case 84: break;
          case 38: 
            { return RefalFiveLambdaTypes.ENTRY;
            } 
            // fall through
          case 85: break;
          case 39: 
            { return RefalFiveLambdaTypes.EXTRN;
            } 
            // fall through
          case 86: break;
          case 40: 
            { return RefalFiveLambdaTypes.LABEL;
            } 
            // fall through
          case 87: break;
          case 41: 
            { return RefalFiveLambdaTypes.INLINE;
            } 
            // fall through
          case 88: break;
          case 42: 
            { return RefalFiveLambdaTypes.EXTERN;
            } 
            // fall through
          case 89: break;
          case 43: 
            { return RefalFiveLambdaTypes.INCLUDE;
            } 
            // fall through
          case 90: break;
          case 44: 
            { return RefalFiveLambdaTypes.FORWARD;
            } 
            // fall through
          case 91: break;
          case 45: 
            { return RefalFiveLambdaTypes.EXTERNALL;
            } 
            // fall through
          case 92: break;
          case 46: 
            { return RefalFiveLambdaTypes.INTRINSIC;
            } 
            // fall through
          case 93: break;
          case 47: 
            { return RefalFiveLambdaTypes.EASTEREGG;
            } 
            // fall through
          case 94: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
