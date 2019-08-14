grammar Stark;

program
    : statement +
    ;

statement
    : if_statement
    | while_statement
    | do_while_statement
    | '{' statement '}'
    | expr
    ;

if_statement
    : 'se' paren_expr statement
    | 'se' paren_expr statement 'senão' statement
    ;

while_statement
    : 'enquanto' paren_expr 'faça' statement
    ;

do_while_statement
    : 'faça' statement 'enquanto' paren_expr
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
    : 'leia()'
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
    | integer
    | paren_expr
    ;

id
    : STRING
    ;

integer
    : INT
    ;


STRING
    : [a-z]+
    ;

INT
    : [0-9] +
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