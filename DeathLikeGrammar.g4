grammar DeathLikeGrammar;

program : 'main' block;

block :BEGIN statement* END;

statement :
assign_var |
operations |
assign_var_method_invocation |
while_cicle |
if_else |
method_invokation |
print |
for_cicle;

BEGIN : '{';
END : '}';
PRINT: 'print';

INT : 'int';
FLOAT: 'float';
DOUBLE: 'double';

WHILE: 'while';
FOR: 'for';

CONST: 'const';

IF : 'if';
ELSE : 'else';

CALL : 'call';

RETURN : 'return';
SEPARATOR : ';';
DELIMITER : '.';

COLON : ':';

GLOBAL: 'global';

ID : [a-zA-Z_][a-zA-Z_0-9]*;
STRING : '"'(.)+?'"';
NUMBER : [0-9]+;
NOT_WHOLE_NUMBER : [0-9]+([.][0-9]+)?;
WS     : [ \n\t\r]+ -> skip;

PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
PROCENT: '%';
EXPONENTIATION: '^';

NEGATION : '!';
AND : '&';
OR: '||';
TRUE: 'true';
FALSE: 'false';

EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
LESS_OR_EQUALS: '<=';
GREATER: '>';
GREATER_OR_EQUALS: '>=';

O_BRACKET : '(';
C_BRACKET : ')';

digit_expression:	digit_expression (MULTIPLY|DIVIDE|PLUS|MINUS|PROCENT|EXPONENTIATION) digit_expression
    |	ID
    |	O_BRACKET digit_expression C_BRACKET
    |   NUMBER
    |   NOT_WHOLE_NUMBER
    ;

boolean_expression: digit_expression (EQUAL|NON_EQUAL|LESS|LESS_OR_EQUALS|GREATER|GREATER_OR_EQUALS) digit_expression
    | O_BRACKET boolean_expression C_BRACKET
    | NEGATION boolean_expression
    | TRUE
    | FALSE
    | boolean_expression (EQUAL|NON_EQUAL) boolean_expression
    | boolean_expression (AND|OR) boolean_expression
    ;

type: INT|FLOAT|DOUBLE;
type_cast: O_BRACKET (type) C_BRACKET;
assign_var : CONST? type ID '=' (ID|digit_expression|type_cast O_BRACKET digit_expression C_BRACKET) SEPARATOR;
assign_var_method_invocation : CONST? type ID '=' (method_invokation| type_cast O_BRACKET method_invokation C_BRACKET) SEPARATOR;
operations : reasign_var SEPARATOR;
reasign_var: ID '=' (digit_expression|type_cast O_BRACKET digit_expression C_BRACKET);
print : PRINT O_BRACKET (ID|NUMBER|STRING|NOT_WHOLE_NUMBER) C_BRACKET SEPARATOR;

while_cicle: WHILE O_BRACKET (boolean_expression) C_BRACKET block;
if_else: IF O_BRACKET (boolean_expression) C_BRACKET block ELSE block;
for_cicle : FOR O_BRACKET assign_var boolean_expression SEPARATOR reasign_var C_BRACKET block;

signature: (O_BRACKET (type ID ',')* (type ID) C_BRACKET);
subprogram_return : 'function' type ID (signature|(O_BRACKET C_BRACKET)) block_return;
subprogram_non_return : 'function' ID (signature|(O_BRACKET C_BRACKET)) (block_non_return|block);

block_return : BEGIN statement* RETURN (ID|NUMBER|NOT_WHOLE_NUMBER) SEPARATOR END;
block_non_return : BEGIN statement* RETURN SEPARATOR END;

signature_method_invokation: (O_BRACKET (ID ',')* (ID) C_BRACKET);
method_invokation : CALL ID (signature_method_invokation|(O_BRACKET C_BRACKET));

global_program: (assign_var|operations)*program{1}(subprogram_non_return|subprogram_return)*;
