@echo off
echo === COMPILANDO INDUSTRIALSCRIPT ===

:: 1. Generar lexer y parser con soporte Visitor
java -jar C:\antlr\antlr-4.13.1-complete.jar -visitor -o generated grammar/Industrial.g4

:: 2. Compilar: primero generated, luego src
javac -cp ".;C:\antlr\antlr-4.13.1-complete.jar" -d out generated\*.java
javac -cp ".;out;C:\antlr\antlr-4.13.1-complete.jar" -d out src\*.java

:: 3. Ejecutar — usa el archivo pasado como argumento, o valid1.ind por defecto
if "%1"=="" (
    set ARCHIVO=examples\valid1.ind
) else (
    set ARCHIVO=%1
)
java -cp ".;out;C:\antlr\antlr-4.13.1-complete.jar" Main %ARCHIVO%

echo ===================================
pause