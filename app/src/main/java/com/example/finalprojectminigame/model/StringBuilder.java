package com.example.finalprojectminigame.model;

import com.example.finalprojectminigame.Symbols;

import java.util.Random;

public class StringBuilder {
    //terminalView.setText("[}',./!$#>//@^*@)(!&\n#..?#!&@(#@/;'[}" + bracketCommands.get(0) + "!@\n%&$#:!><./#}{" + wrongAnswers.get(0) + "-\n+#$!@%$#@" + wrongAnswers.get(1) + ")(!#\n!#&*@':|{]" + bracketCommands.get(1) + ",>\n/?'!^%==-#@" + bracketCommands.get(2) + "))(#$$\n@!-.<'" + wrongAnswers.get(2) + "!#@-]{|!\n" + correctAnswer + "$%#@!':.<+*&%$\n" + bracketCommands.get(3) + "!?$#%[}(" +bracketCommands.get(4) + "\n$#>,-=+!-+=" + wrongAnswers.get(3) + "(}]\n'$?;<!#%@%z^&*" + wrongAnswers.get(4) + "\n^&)($@!':}{#@" + bracketCommands.get(5) + ";\n===-#$(]!@" + resetTries + "?><\n:'$*&^@!" + wrongAnswers.get(5) + ",,.?//\n" + wrongAnswers.get(6) + "!@##$%--" + wrongAnswers.get(7) + "\n%%^$@*;:" + wrongAnswers.get(8) + "!^*^#@");
    public String terminalText = "";
    public void randomSymbols() {
        Random randGen = new Random();

        for (int i = 0; i < 20; i++) {
            int randSymbolIndex = randGen.nextInt(Symbols.values().length);
             Symbols randSymbol = Symbols.values() [randSymbolIndex];
            terminalText += randSymbol;
        }

    }
}
