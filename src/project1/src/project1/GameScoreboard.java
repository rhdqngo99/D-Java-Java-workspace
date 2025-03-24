package project1;

import java.util.HashMap;
import java.util.Map;

public class GameScoreboard {
    private Map<String, Integer> upperSection;
    private Map<String, Integer> lowerSection;
    private int upperSectionTotal;
    private int lowerSectionTotal;
    private int bonus;
    private int grandTotal;

    public GameScoreboard() {
        upperSection = new HashMap<>();
        lowerSection = new HashMap<>();
        upperSectionTotal = 0;
        lowerSectionTotal = 0;
        bonus = 0;
        grandTotal = 0;
        
        for (int i = 1; i <= 6; i++) {
            upperSection.put(String.valueOf(i), -1);
        }
        
        lowerSection.put("Choice", -1);
        lowerSection.put("4 of a Kind", -1);
        lowerSection.put("Full House", -1);
        lowerSection.put("Small Straight", -1);
        lowerSection.put("Large Straight", -1);
        lowerSection.put("Yahtzee", -1);
    }

    public void recordUpperSection(String category, int score) {
        if (upperSection.containsKey(category) && upperSection.get(category) == -1) {
            upperSection.put(category, score);
            upperSectionTotal += score;
        }
    }

    public void recordLowerSection(String category, int score) {
        if (lowerSection.containsKey(category) && lowerSection.get(category) == -1) {
            lowerSection.put(category, score);
            lowerSectionTotal += score;
        }
    }

    public void calculateBonus() {
        if (upperSectionTotal >= 63) {
            bonus = 35;
        }
    }

    public void calculateGrandTotal() {
        calculateBonus();
        grandTotal = upperSectionTotal + lowerSectionTotal + bonus;
    }

    public void displayScoreboard() {
        System.out.println("==== 점수판 ====");
        System.out.println("상위 항목:");
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ": " + (upperSection.get(String.valueOf(i)) == -1 ? "-" : upperSection.get(String.valueOf(i))));
        }
        
        System.out.println("\n하위 항목:");
        for (String category : lowerSection.keySet()) {
            System.out.println(category + ": " + (lowerSection.get(category) == -1 ? "-" : lowerSection.get(category)));
        }
        
        System.out.println("\n상위 항목 합계: " + upperSectionTotal);
        System.out.println("하위 항목 합계: " + lowerSectionTotal);
        System.out.println("보너스: " + bonus);
        System.out.println("총 합계: " + grandTotal);
    }
}
