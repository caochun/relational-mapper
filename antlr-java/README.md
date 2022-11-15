## 11.16组会

### 首先借鉴baeldung的例子搭框架

他写的句子是用来解析log日志的。使用的listener。主要解决的问题有下

+ maven生成的class天然被idea exclude。
+ 包管理一些trivial的问题

### 阅读tomassetti的anltr tutorial

确定的事情如下

+ 使用visitor而不是接着仿照baeldung使用listener，相较于visitor，listener会自己遍历完语法树，并且在进入离开某个node时调用enternode和exitnode。而visitor只会手动去visit，这个更像我们编译原理，使用bison/flex去手工打磨。

+ 语句->词素流->语法树

  不同于flex+bison的分布处理，antlr4将这俩一起写在.g4里面。区分方法如下

  > we can already see that lexer rules are all uppercase, while parser rules are all lowercase. Technically the rule about case applies only to the first character of their names, but usually they are all uppercase or lowercase for clarity.

+ antlr4 的plugin提供Test Rule的功能。
+ 仿照之前c--的语言，简单实现了π，但是没有考虑子查询等。比较简单。相比c--语法，把exp拆开了，比如exp->exp add exp | INTEGER | STRING在这里被拆解成了exp-> expAdd | INTEGER | STRING, expAdd->exp add exp。后续可能再改。
+ tomassetti 提供付费服务。