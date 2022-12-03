grammar RelationalAlgebra;

//SELECTION : 'σ t a a1, c c1, id id1 R';
//PROJECTION : 'π';
//LEFTJOIN : '⟕' // different form left outer join
//AND : '∧';
//OR : '∨';
//RENAME : 'ρ';

exp :
    selectionExp #selection
    | projectionExp #projection
    | exp leftJoinExp exp #leftjoin
    | renameExp exp #rename
    | STRING #relation
    ;

renameExp :
    RENAME newTableName newAttributes // user can rename the attributes like a.b, we wont take care of this
    ;

newAttributes :
    newAttribute
    | newAttribute COMMA newAttributes
    ;
newAttribute :
    attribute STRING
    | constString STRING
;

newTableName :
    STRING
    ;

leftJoinExp :
    LEFTOUTERJOIN // this won't work on specific sql release version
    | LEFTOUTERJOIN conditions
    ;

projectionExp :
    PROJECTION attributes exp
    ;

selectionExp :
    SELECTION conditions exp
    ;

conditions:
    condition |
    condition logicOp conditions
    ;

condition :
    attribute RELOP attribute
    | constVar RELOP attribute
    | attribute RELOP constVar
    ;

// Varlist
attributes :
    attribute
    | attribute COMMA attributes
    ;

logicOp:
    AND
    | OR
    ;

attribute :
    STRING DOT STRING
    | STRING
    ;

constVar :
    NUMBER
    | constString
    ;

constString :
    SINGLEQUOTA STRING SINGLEQUOTA
    ;


RELOP : ('>'|'>='|'<'|'<='|'='|'!=');
RENAME : 'ρ';
SELECTION : 'σ';
PROJECTION : 'π';
LEFTOUTERJOIN : '⟕';
AND : '∧';
OR : '∨';
DOT : '.';
COMMA : ',';
QUOTA : '"';
SINGLEQUOTA : '\'';
LP : '(';
RP : ')';
SEMI : ';';

NUMBER : [0-9]+ ;
STRING : [a-zA-Z0-9_'*]+ ;






WS : [ \t\r\n]+ -> skip;


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