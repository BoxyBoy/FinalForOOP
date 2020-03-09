package com.example.finalprojectminigame;

//import static com.example.finalprojectminigame.BracketCommands.bracketCommands;
//import static com.example.finalprojectminigame.BracketCommands.resetTries;
//import static com.example.finalprojectminigame.Vocab.correctAnswer;
//import static com.example.finalprojectminigame.Vocab.wrongAnswers;


import java.util.ArrayList;

public class Prompt {

    ArrayList<String> bracketCommands = BracketCommands.bracketCommands;
    String resetTries = BracketCommands.resetTries;
    ArrayList<String> wrongAnswers = Vocab.wrongAnswers;
    String correctAnswer = Vocab.correctAnswer;

    String thePrompt = "[}',./!$#>//@^*@)(!&\n#..?#!&@(#@/;'[}" + bracketCommands.get(0) + "!@\n%&$#:!><./#}{" + wrongAnswers.get(0) + "-\n+#$!@%$#@"
            + wrongAnswers.get(1) + ")(!#\n!#&*@':|{]" + bracketCommands.get(1) + ",>\n/?'!^%==-#@" + bracketCommands.get(2)
            + "))(#$$\n@!-.<'" + wrongAnswers.get(2) + "!#@-]{|!\n" + correctAnswer + "$%#@!':.<+*&%$\n" + bracketCommands.get(3) + "!?$#%[}("
            + bracketCommands.get(4) + "\n$#>,-=+!-+=" + wrongAnswers.get(3) + "(}]\n'$?;<!#%@%z^&*" + wrongAnswers.get(4)
            + "\n^&)($@!':}{#@" + bracketCommands.get(5) + ";\n===-#$(]!@" + resetTries + "?><\n:'$*&^@!"
            + Vocab.wrongAnswers.get(5)
            + ",,.?//\n" + wrongAnswers.get(6) + "!@##$%--" + wrongAnswers.get(7) + "\n%%^$@*;:" + wrongAnswers.get(8) + "!^*^#@";

}
