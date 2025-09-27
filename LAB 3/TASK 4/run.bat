cls

javac -d out src\Student.java src\Date.java src\Address.java src\Gender.java

javac -cp out StudentDemo.java

java -cp out;. StudentDemo