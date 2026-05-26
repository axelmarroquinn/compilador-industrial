
grammar Industrial;

// ─── REGLA INICIAL ───────────────────────────────────────────────
programa
    : declaracionMaquina+ EOF
    ;

// ─── MÁQUINA ─────────────────────────────────────────────────────
declaracionMaquina
    : MAQUINA ID LLAVE_AB cuerpoMaquina LLAVE_CE
    ;

cuerpoMaquina
    : (declaracionVar | declaracionProceso)*
    ;

// ─── VARIABLES ───────────────────────────────────────────────────
declaracionVar
    : VAR tipo ID PUNTO_COMA
    ;

tipo
    : NUM
    | TEXTO
    | BOOL
    ;

// ─── PROCESO ─────────────────────────────────────────────────────
declaracionProceso
    : PROCESO ID LLAVE_AB sentencias LLAVE_CE
    ;

// ─── SENTENCIAS ──────────────────────────────────────────────────
sentencias
    : sentencia*
    ;

sentencia
    : asignacion
    | controlMaquina
    | sentenciaSi
    | sentenciaMientras
    | sentenciaRepetir
    | llamadaEscribir
    | llamadaAlarma
    | sentenciaEsperar
    ;

// ─── ASIGNACIÓN ──────────────────────────────────────────────────
asignacion
    : ID IGUAL expresion PUNTO_COMA
    | ID IGUAL LEER PAREN_AB CADENA PAREN_CE PUNTO_COMA
    ;

// ─── CONTROL DE MÁQUINA ──────────────────────────────────────────
controlMaquina
    : (INICIAR | DETENER | PAUSAR | REINICIAR) ID PUNTO_COMA
    ;

// ─── SI / ENTONCES / SINO ────────────────────────────────────────
sentenciaSi
    : SI condicion ENTONCES sentencias (SINO sentencias)? FIN
    ;

// ─── MIENTRAS ────────────────────────────────────────────────────
sentenciaMientras
    : MIENTRAS condicion HACER sentencias FIN
    ;

// ─── REPETIR N VECES ─────────────────────────────────────────────
sentenciaRepetir
    : REPETIR expresion VECES sentencias FIN
    ;

// ─── ESCRIBIR / ALARMA ───────────────────────────────────────────
llamadaEscribir
    : ESCRIBIR PAREN_AB (CADENA | expresion) PAREN_CE PUNTO_COMA
    ;

llamadaAlarma
    : ALARMA PAREN_AB CADENA PAREN_CE PUNTO_COMA
    ;

// ─── ESPERAR ─────────────────────────────────────────────────────
sentenciaEsperar
    : ESPERAR expresion MS PUNTO_COMA
    ;

// ─── EXPRESIONES ─────────────────────────────────────────────────
expresion
    : expresion (MAS | MENOS | MULT | DIV) expresion
    | PAREN_AB expresion PAREN_CE
    | NUMERO
    | ID
    ;

condicion
    : expresion operadorComp expresion
    | condicion (Y | O) condicion
    | NO condicion
    ;

operadorComp
    : MAYOR | MENOR | MAYOR_IGUAL | MENOR_IGUAL | IGUAL_IGUAL | DIFERENTE
    ;

// ═══════════════════════════════════════════════════════════════════
// TOKENS — PALABRAS RESERVADAS
// ═══════════════════════════════════════════════════════════════════
MAQUINA     : 'maquina';
SENSOR      : 'sensor';
PROCESO     : 'proceso';
ALARMA      : 'alarma';
INICIAR     : 'iniciar';
DETENER     : 'detener';
PAUSAR      : 'pausar';
REINICIAR   : 'reiniciar';
SI          : 'si';
ENTONCES    : 'entonces';
SINO        : 'sino';
FIN         : 'fin';
MIENTRAS    : 'mientras';
HACER       : 'hacer';
REPETIR     : 'repetir';
VECES       : 'veces';
LEER        : 'leer';
ESCRIBIR    : 'escribir';
ESPERAR     : 'esperar';
MS          : 'ms';
VAR         : 'var';
NUM         : 'num';
TEXTO       : 'texto';
BOOL        : 'bool';
VERDADERO   : 'verdadero';
FALSO       : 'falso';
Y           : 'y';
O           : 'o';
NO          : 'no';

// ─── OPERADORES ──────────────────────────────────────────────────
MAYOR_IGUAL : '>=';
MENOR_IGUAL : '<=';
IGUAL_IGUAL : '==';
DIFERENTE   : '!=';
MAYOR       : '>';
MENOR       : '<';
IGUAL       : '=';
MAS         : '+';
MENOS       : '-';
MULT        : '*';
DIV         : '/';

// ─── DELIMITADORES ───────────────────────────────────────────────
LLAVE_AB    : '{';
LLAVE_CE    : '}';
PAREN_AB    : '(';
PAREN_CE    : ')';
PUNTO_COMA  : ';';

// ─── LITERALES ───────────────────────────────────────────────────
NUMERO      : [0-9]+ ('.' [0-9]+)?;
CADENA      : '"' (~["\r\n])* '"';
ID          : [a-zA-Z_][a-zA-Z0-9_]*;

// ─── IGNORAR ─────────────────────────────────────────────────────
WS          : [ \t\r\n]+ -> skip;
COMENTARIO  : '//' ~[\r\n]* -> skip;