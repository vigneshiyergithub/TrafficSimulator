package fuzzy

import org.junit.Test

/**
 * Created by vignesh on 21/6/17.
 */
class RulesTest {
    private Rules rules = new Rules()

    @Test
    void "can display all the rules"() throws Exception {
        print(rules.getLowCongestionRuleSet())
        print(rules.getMediumCongestionRuleSet())
        print(rules.getHighCongestionRuleSet())
    }
}
