#/bin/sh
cup declaration.cup
javac declaration.java
javac sym.java
javac parser.java
jlex Yylex
javac Yylex.java
java Main
