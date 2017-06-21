package fuzzy;


import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import static constants.FlowConstants.*;
import static constants.GreenTimeConstants.*;
import static constants.QueueConstants.*;


/**
 * Created by vignesh on 20/6/17.
 */
public class Rules {
    private Table<String,String,String> lowCongestionRuleSet;
    private Table<String,String,String> mediumCongestionRuleSet;
    private Table<String,String,String> highCongestionRuleSet;

    public Rules() {
        this.lowCongestionRuleSet = populateLowCongestionRuleSet();
        this.mediumCongestionRuleSet = populateMediumCongestionRuleSet();
        this.highCongestionRuleSet = populateHighCongestionRuleSet();
    }

    private Table<String,String,String> populateHighCongestionRuleSet() {
        Table<String, String, String > temp = HashBasedTable.create();
        temp.put(LOW_FLOW,LOW_QUEUE,LOW_GREEN_TIME);
        temp.put(LOW_FLOW,MEDIUM_QUEUE,LOW_GREEN_TIME);
        temp.put(LOW_FLOW,HIGH_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(MEDIUM_FLOW,LOW_QUEUE,HIGH_GREEN_TIME);
        temp.put(MEDIUM_FLOW,MEDIUM_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(MEDIUM_FLOW,HIGH_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(HIGH_FLOW,LOW_QUEUE,HIGH_GREEN_TIME);
        temp.put(HIGH_FLOW,MEDIUM_QUEUE,HIGH_GREEN_TIME);
        temp.put(HIGH_FLOW,HIGH_QUEUE,MEDIUM_GREEN_TIME);
        return temp;
    }

    private Table<String,String,String> populateMediumCongestionRuleSet() {
        Table<String,String,String> temp = HashBasedTable.create();
        temp.put(LOW_FLOW,LOW_QUEUE,LOW_GREEN_TIME);
        temp.put(LOW_FLOW,MEDIUM_QUEUE,LOW_GREEN_TIME);
        temp.put(LOW_FLOW,HIGH_QUEUE,LOW_GREEN_TIME);
        temp.put(MEDIUM_FLOW,LOW_QUEUE,HIGH_GREEN_TIME);
        temp.put(MEDIUM_FLOW,MEDIUM_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(MEDIUM_FLOW,HIGH_QUEUE,LOW_GREEN_TIME);
        temp.put(HIGH_FLOW,LOW_QUEUE,HIGH_GREEN_TIME);
        temp.put(HIGH_FLOW,MEDIUM_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(HIGH_FLOW,HIGH_QUEUE,MEDIUM_GREEN_TIME);
        return temp;
    }

    private Table<String,String,String> populateLowCongestionRuleSet() {
        Table<String,String,String> temp = HashBasedTable.create();
        temp.put(LOW_FLOW,LOW_QUEUE,LOW_GREEN_TIME);
        temp.put(LOW_FLOW,MEDIUM_QUEUE,LOW_GREEN_TIME);
        temp.put(LOW_FLOW,HIGH_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(MEDIUM_FLOW,LOW_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(MEDIUM_FLOW,MEDIUM_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(MEDIUM_FLOW,HIGH_QUEUE,MEDIUM_GREEN_TIME);
        temp.put(HIGH_FLOW,LOW_QUEUE,HIGH_GREEN_TIME);
        temp.put(HIGH_FLOW,MEDIUM_QUEUE,HIGH_GREEN_TIME);
        temp.put(HIGH_FLOW,HIGH_QUEUE,MEDIUM_GREEN_TIME);
        return temp;
    }

    public Table<String, String, String> getLowCongestionRuleSet() {
        return lowCongestionRuleSet;
    }

    public void setLowCongestionRuleSet(Table<String, String, String> lowCongestionRuleSet) {
        this.lowCongestionRuleSet = lowCongestionRuleSet;
    }

    public Table<String, String, String> getMediumCongestionRuleSet() {
        return mediumCongestionRuleSet;
    }

    public void setMediumCongestionRuleSet(Table<String, String, String> mediumCongestionRuleSet) {
        this.mediumCongestionRuleSet = mediumCongestionRuleSet;
    }

    public Table<String, String, String> getHighCongestionRuleSet() {
        return highCongestionRuleSet;
    }

    public void setHighCongestionRuleSet(Table<String, String, String> highCongestionRuleSet) {
        this.highCongestionRuleSet = highCongestionRuleSet;
    }
}
