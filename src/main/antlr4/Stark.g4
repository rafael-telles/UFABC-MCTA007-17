grammar Stark;

program
    : statement +
    ;

statement
    : if_statement
    | while_statement
    | do_while_statement
    | '{' statement* '}'
    | expr ';'
    | ';'
    ;

if_statement
    : 'se' paren_expr 'então' statement
    | 'se' paren_expr 'então' statement 'senão' statement
    ;

while_statement
    : 'enquanto' paren_expr 'faça' statement
    ;

do_while_statement
    : 'faça' statement 'enquanto' paren_expr ';'
    ;

paren_expr
    : '(' expr ')'
    ;

expr
    : test
    | read_expr
    | write_expr
    | assign_expr
    | paren_expr
    ;

assign_expr
    : id '=' expr
    ;

write_expr
    : 'escreva' paren_expr
    ;

read_expr
    : read_string_expr
    | read_number_expr
    ;

read_string_expr
    : 'lerTexto()'
    ;

read_number_expr
    : 'lerNumero()'
    ;

test
    : sum
    | sum logical_op sum
    ;

sum
    : prod
    | sum '+' prod
    | sum '-' prod
    ;

prod
    : term
    | prod '*' term
    | prod '/' term
    ;

term
    : id
    | number
    | string
    | paren_expr
    | read_expr
    ;

id
    : ID
    ;

number
    : INT '.'? INT?
    | INT? '.' INT?
    ;

ID
    : [_$a-zA-Z]+ [_$a-zA-Z0-9]*
    ;
INT
    : [0-9]+
    ;

STRING: '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

string
    : STRING
    ;

logical_op
    : '=='
    | '!='
    | '>'
    | '<'
    | '>='
    | '<='
    ;

WS
    : [ \r\n\t]+ -> skip
    ;