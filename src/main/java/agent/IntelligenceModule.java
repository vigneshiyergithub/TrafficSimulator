package agent;

import fuzzy.FuzzyEngine;
import qlearning.QLearningModule;

/**
 * Created by vignesh on 20/6/17.
 */
public class IntelligenceModule {
    private FuzzyEngine fuzzyEngine;
    private QLearningModule qLearningModule;

    public IntelligenceModule() {
        this.fuzzyEngine = defaultFuzzyEngine();
        this.qLearningModule = defaultQLearningModule();
    }

    private QLearningModule defaultQLearningModule() {
        return new QLearningModule();
    }

    private FuzzyEngine defaultFuzzyEngine() {
        return new FuzzyEngine();
    }

}
