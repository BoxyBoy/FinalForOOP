package com.example.finalprojectminigame;

import java.util.ArrayList;

public class Prompt {

    ArrayList<String> bracketCommands = BracketCommands.bracketCommands;
    String resetTries = BracketCommands.resetTries;
    ArrayList<String> wrongMediumAnswers = VocabMedium.wrongMediumAnswers;
    String correctAnswer = VocabMedium.correctAnswer;

    String thePrompt = "[}',./!$#>//@^*@)(!&\n#..?#!&@(#@/;'[}" + bracketCommands.get(0) + "!@\n%&$#:!><./#}{" + wrongMediumAnswers.get(0) + "-\n+#$!@%$#@"
            + wrongMediumAnswers.get(1) + ")(!#\n!#&*@':|{]" + bracketCommands.get(1) + ",>\n/?'!^%==-#@" + bracketCommands.get(2)
            + "))(#$$\n@!-.<'" + wrongMediumAnswers.get(2) + "!#@-]{|!\n" + correctAnswer + "$%#@!':.<+*&%$\n" + bracketCommands.get(3) + "!?$#%[}("
            + bracketCommands.get(4) + "\n$#>,-=+!-+=" + wrongMediumAnswers.get(3) + "(}]\n'$?;<!#%@%z^&*" + wrongMediumAnswers.get(4)
            + "\n^&)($@!':}{#@" + bracketCommands.get(5) + ";\n===-#$(]!@" + resetTries + "?><\n:'$*&^@!"
            + VocabMedium.wrongMediumAnswers.get(5)
            + ",,.?//\n" + wrongMediumAnswers.get(6) + "!@##$%--" + wrongMediumAnswers.get(7) + "\n%%^$@*;:" + wrongMediumAnswers.get(8) + "!^*^#@";

}
