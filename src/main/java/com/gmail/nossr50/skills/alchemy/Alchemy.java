package com.gmail.nossr50.skills.alchemy;

public final class Alchemy {
    /*public enum Tier {
        EIGHT(8),
        SEVEN(7),
        SIX(6),
        FIVE(5),
        FOUR(4),
        THREE(3),
        TWO(2),
        ONE(1);

        int numerical;

        private Tier(int numerical) {
            this.numerical = numerical;
        }

        public int toNumerical() {
            return numerical;
        }

        public static Tier fromNumerical(int numerical) {
            for (Tier tier : Tier.values()) {
                if (tier.toNumerical() == numerical) {
                    return tier;
                }
            }
            return null;
        }

        protected int getLevel() {
            return AdvancedConfig.getInstance().getConcoctionsTierLevel(this);
        }
    }*/

//    public static final int INGREDIENT_SLOT = 3;
//
//    public static int catalysisUnlockLevel = RankUtils.getUnlockLevel(SubSkillType.ALCHEMY_CATALYSIS);
//    public static int catalysisMaxBonusLevel = AdvancedConfig.getInstance().getCatalysisMaxBonusLevel();
//    public static double catalysisMinSpeed = AdvancedConfig.getInstance().getCatalysisMinSpeed();
//    public static double catalysisMaxSpeed = AdvancedConfig.getInstance().getCatalysisMaxSpeed();
//
//    public static Map<Location, AlchemyBrewTask> brewingStandMap = new HashMap<>();
//
//    private Alchemy() {
//    }
//
//    /**
//     * Finish all active brews.  Used upon Disable to prevent vanilla potions from being brewed upon next Enable.
//     */
//    public static void finishAllBrews() {
//        mcMMO.p.debug("Completing " + brewingStandMap.size() + " unfinished Alchemy brews.");
//
//        List<AlchemyBrewTask> toFinish = new ArrayList<>();
//
//        toFinish.addAll(brewingStandMap.values());
//
//        for (AlchemyBrewTask alchemyBrewTask : toFinish) {
//            alchemyBrewTask.finishImmediately();
//        }
//    }
}