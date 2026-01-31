package datatypesAndVariables;

public class Main {
  public static void main(String[] args) {
    // primitive datatypes => byte,short,int,long,float,double,boolean,char
    // variable name => Rules => 1) must start with a letter and not a
    // number,underscore.
    // 2) each variable must have a unique name and case sensitive
    // 3) contain only certian characters i.e., dollar symbol, letters
    // digits, underscores.don't contain spaces and don't end with a
    // underscore. don't use double underscore.
    // 4) start with lower case letter. use uppercase for first
    // letter of each additional words. (example -> addNum).

    byte numByte_1 = -128; // negative end range. if exceeds the range , it will return error
    // (out of range).
    byte numByte_2 = 127;// positive end range. 
    short numShort_1 = -32768; // negative end range.
    short numShort_2 = 32767; // positive end range.
    int numInt_1 = -2147483648;// negative end range.
    int numInt_2 = 2147483647;// positive end range.
    // long numLong_1 = -9223372036854775808;//negative end range.
    // long numLong_2 = 9223372036854775807;//positive end range.
    float numFloat_1 = 1.2345678f;// Seven decimal digits after point.
    double numDouble_1 = 1.2233445566778899;// sixteen decimal digits after point.
    boolean valueBoolean_1 = true;
    boolean valueBoolean_2 = false;

    // To print ASCII value of character need to typecast from char to int.
    int example = (int) 'a';
    System.out.println(example);

    char valueCharacter_33 = '!'; // numerical value after under score represents respective ASCII value
    // of the character
    char valueCharacter_34 = '"';
    char valueCharacter_35 = '#';
    char valueCharacter_36 = '$';
    char valueCharacter_37 = '%';
    char valueCharacter_38 = '&';
    char valueCharacter_39 = '\''; // escaping character \ for single quote
    char valueCharacter_40 = '(';
    char valueCharacter_41 = ')';
    char valueCharacter_42 = '*';
    char valueCharacter_43 = '+';
    char valueCharacter_44 = '`';
    char valueCharacter_45 = '-';
    char valueCharacter_46 = '.';
    char valueCharacter_47 = '/';
    char valueCharacter_48 = '0';
    char valueCharacter_49 = '1';
    char valueCharacter_50 = '2';
    char valueCharacter_51 = '3';
    char valueCharacter_52 = '4';
    char valueCharacter_53 = '5';
    char valueCharacter_54 = '6';
    char valuecharacter_55 = '7';
    char valueCharacter_56 = '8';
    char valueCharacter_57 = '9';
    char valueCharacter_58 = ':';
    char valueCharacter_59 = ';';
    char valueCharacter_60 = '<';
    char valueCharacter_61 = '=';
    char valueCharacter_62 = '>';
    char valueCharacter_63 = '?';
    char valueCharacter_64 = '@';
    char valueCharacter_65 = 'A';
    char valueCharacter_66 = 'B';
    char valueCharacter_67 = 'C';
    char valueCharacter_68 = 'D';
    char valueCharacter_69 = 'E';
    char valueCharacter_70 = 'F';
    char valueCharacter_71 = 'G';
    char valueCharacter_72 = 'H';
    char valueCharacter_73 = 'I';
    char valueCharacter_74 = 'J';
    char valueCharacter_75 = 'K';
    char valueCharacter_76 = 'L';
    char valueCharacter_77 = 'M';
    char valueCharacter_78 = 'N';
    char valueCharacter_79 = 'O';
    char valueCharacter_80 = 'P';
    char valueCharacter_81 = 'Q';
    char valueCharacter_82 = 'R';
    char valueCharacter_83 = 'S';
    char valueCharacter_84 = 'T';
    char valueCharacter_85 = 'U';
    char valueCharacter_86 = 'V';
    char valueCharacter_87 = 'W';
    char valueCharacter_88 = 'X';
    char valueCharacter_89 = 'Y';
    char valueCharacter_90 = 'Z';
    char valueCharacter_91 = '[';
    char valueCharacter_92 = '\\';
    char valueCharacter_93 = ']';
    char valueCharacter_94 = '^';
    char valueCharacter_95 = '_';
    char valueCharacter_96 = '`';
    char valueCharacter_97 = 'a';
    char valueCharacter_98 = 'b';
    char valueCharacter_99 = 'c';
    char valueCharacter_100 = 'd';
    char valueCharacter_101 = 'e';
    char valueCharacter_102 = 'f';
    char valueCharacter_103 = 'g';
    char valueCharacter_104 = 'h';
    char valueCharacter_105 = 'i';
    char valueCharacter_106 = 'j';
    char valueCharacter_107 = 'k';
    char valueCharacter_108 = 'l';
    char valueCharacter_109 = 'm';
    char valueCharacter_110 = 'n';
    char valueCharacter_111 = 'o';
    char valueCharacter_112 = 'p';
    char valueCharacter_113 = 'q';
    char valueCharacter_114 = 'r';
    char valueCharacter_115 = 's';
    char valueCharacter_116 = 't';
    char valueCharacter_117 = 'u';
    char valueCharacter_118 = 'v';
    char valueCharacter_119 = 'w';
    char valueCharacter_120 = 'x';
    char valueCharacter_121 = 'y';
    char valueCharacter_122 = 'z';
    char valueCharacter_123 = '{';
    char valueCharacter_124 = '|';
    char valueCharacter_125 = '}';
    char valueCharacter_126 = '~';

    // String is one of the example of non-primitive datatypes. collection of
    // characters, symbols, numbers inside pair of double quotes is called String
    // value.
    String name = "Rathinam";
    String name_1 = "1234567890-=_+qwertyuiopasdfghjklzxcvbnm,.;'/[]@#$%^&*() ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String stringConcatenation = "Cod" + "ing";
    System.out.println(name);
    System.out.println(stringConcatenation);

    //comment
  }
}