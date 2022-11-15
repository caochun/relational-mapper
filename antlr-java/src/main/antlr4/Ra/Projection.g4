grammar Projection;
// involve subquery, change the gramar of c--
exp :
    projectionExp #projection
    | STRING #simpleRelation
;

projectionExp :
    PROJECTION attributes exp
;

// Varlist
attributes :
    attribute
    | attribute COMMA attributes
;

attribute :
    STRING
;



PROJECTION : 'π';

STRING: [a-zA-Z0-9_'*]+ ;
NUMBER: [0-9]+ ;

COMMA: ',';
LP: '(';
RP: ')';
ARROW: '→';
SEMI: ';';

WS: [ \t\r\n]+ -> skip;


//fragments defined to make the input case-insensitive
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];