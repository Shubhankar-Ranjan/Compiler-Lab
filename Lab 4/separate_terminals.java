import java.util.*;

public class separate_terminals {
    public static void main(String[] args) {
        List<String> grammar = Arrays.asList("S->aA", "A->bB", "B->cC", "C->d");

        Set<Character> nonTerminals = new HashSet<>();
        Set<Character> terminals = new HashSet<>();

        for (String rule : grammar) {
            for (int i = 0; i < rule.length(); i++) {
                if(rule.charAt(i) >= 'A' && rule.charAt(i) <= 'Z') {
                    nonTerminals.add(rule.charAt(i));
                }
                else if(rule.charAt(i) == '-' || rule.charAt(i) == '>'){
                    continue;
                }
                else{
                    terminals.add(rule.charAt(i));
                }
            }
        }

        System.out.println("Non-terminals: " + nonTerminals + ", Count: " + nonTerminals.size());
        System.out.println("Terminals: " + terminals + ", Count: " + terminals.size());
    }
}