grammar ghoul;

options { caseInsensitive = true; }

@header {
package ru.DmN.ghoullang;
}

file
    : command*
    ;

command
    : while
    | oper0
    | oper1
    | oper2
    | oper3
    | oper4
    ;

oper0
    : OPER0 OPER0 // >
    ;

oper1
    : OPER0 OPER1 // <
    ;

oper2
    : OPER1 OPER1 // +
    ;

oper3
    : OPER1 OPER0 // -
    ;

oper4
    : '1000' '-' '7'
    ;

while
    : START command* STOP
    ;

OPER0
    : 'гуль'
    ;

OPER1
    : 'SSS'
    ;

START
    : 'канеки'
    ;

STOP
    : 'кен'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;