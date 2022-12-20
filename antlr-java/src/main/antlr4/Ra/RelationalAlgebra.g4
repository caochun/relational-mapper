grammar RelationalAlgebra;

//SELECTION : 'σ';
//PROJECTION : 'π';
//LEFTJOIN : '⟕' // different form left outer join
//AND : '∧';
//OR : '∨';
//RENAME : 'ρ';
//LIKE : 'λ'
//FUNCTION 'ƒ'
//CASE : 'ψ';
//GROUPBY : 'γ'
//UNION : '∪';

exp :
    selectionExp #selection
    | projectionExp #projection
    | exp leftJoinExp exp #leftjoin
    | renameExp exp #rename
    | STRING #relation
    | groupbyExp exp #groupby
    | exp UNION exp #union
    | exp innerJoinExp exp #innerjoin
    ;

innerJoinExp :
    INNER_JOIN // this won't work on specific sql release version
    | INNER_JOIN conditions
    ;

groupbyExp :
    GROUP_BY attributes
;

renameExp :
    RENAME newAttributes // user can rename the attributes like a.b, we wont take care of this
    ;

newAttributes :
    newAttribute
    | newAttribute COMMA newAttributes
    ;
newAttribute :
    constVar STRING
    | attribute STRING

;

//newTableName :
//    STRING
//    ;

leftJoinExp :
    LEFT_OUTER_JOIN // this won't work on specific sql release version
    | LEFT_OUTER_JOIN conditions
    ;

projectionExp :
    PROJECTION attributes exp
    ;

selectionExp :
    SELECTION conditions exp
    ;

conditions :
    condition |
    condition logicOp conditions
    ;

condition :
    attribute RELOP attribute
    | constVar RELOP attribute
    | attribute RELOP constVar
    | likeExp
    ;


likeExp :
    attribute LIKE constVar
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
    | CASE LP casestmts RP
    | dialect
;

dialect :
    DIALECT LP NUMBER RP
;

casestmts :
    casestmt SEMI constVar
    | casestmt SEMI attribute
    | casestmt SEMI casestmts

;

casestmt :
    conditions COMMA attribute
    | conditions COMMA constVar
;

constVar :
    constString
    | NUMBER
    ;

constString :
    SINGLE_QUOTA STRING SINGLE_QUOTA
    | SINGLE_QUOTA SINGLE_QUOTA
    ;


UNION : '∪';
GROUP_BY: 'γ';
DIALECT : 'ƒ';
CASE : 'ψ';
RELOP : ('>'|'>='|'<'|'<='|'='|'!='|'λ');
RENAME : 'ρ';
SELECTION : 'σ';
PROJECTION : 'π';
LEFT_OUTER_JOIN : '⟕';
INNER_JOIN : '⨝';
AND : '∧';
OR : '∨';
DOT : '.';
COMMA : ',';
QUOTA : '"';
SINGLE_QUOTA : '\'';
LP : '(';
RP : ')';
SEMI : ';';


LIKE : L I K E;
STRING : [\u4e00-\u9fa5a-zA-Z0-9_%{}#*]+ ;
NUMBER : [0-9]+ ;







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