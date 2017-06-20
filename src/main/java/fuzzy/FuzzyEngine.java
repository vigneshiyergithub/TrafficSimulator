package fuzzy;

/**
 * Created by vignesh on 20/6/17.
 */
public class FuzzyEngine {
    private MembershipFunction membershipFunction;
    private Rules rules;

    public FuzzyEngine() {
        this.rules = defaultRules();
        this.membershipFunction = defaultMembershipFunctions();
    }

    private Rules defaultRules() {
        return new Rules();
    }

    private MembershipFunction defaultMembershipFunctions() {
        return new MembershipFunction();
    }


}
