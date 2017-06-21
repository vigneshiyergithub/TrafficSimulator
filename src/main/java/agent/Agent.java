package agent;

import constants.AgentID;
import constants.AgentType;
import constants.Directions;
import java.util.Set;

/*
This is the code for Traffic signal module
 */
public class Agent {
    private AgentType type;
    private Double congestionFactor;
    private Integer cycleTime;

    private AgentID agentId;

    private Set<AgentID> neighboringAgents;
    private Set<Directions> directionsMap;
    private IntelligenceModule intelligenceModule;

    private final static Double DEFAULT_CONGESTION = 0.0;

    public Agent(AgentType type, Integer cycleTime, AgentID agentId, Set<AgentID> neighboringAgents, Set<Directions> directionsMap) {
        this.type = type;
        this.cycleTime = cycleTime;
        this.agentId = agentId;
        this.neighboringAgents = neighboringAgents;
        this.directionsMap = directionsMap;
        this.congestionFactor = DEFAULT_CONGESTION;
        this.intelligenceModule = defaultIntelligenceModule();
    }

    private IntelligenceModule defaultIntelligenceModule() {
        // Load existing intelligence module for this agent
        return new IntelligenceModule();
    }


    public AgentID getAgentId() {
        return agentId;
    }

    public Set<AgentID> getNeighboringAgents() {
        return neighboringAgents;
    }

    public Set<Directions> getDirectionsMap() {
        return directionsMap;
    }

    public Integer getCycleTime() {
        return cycleTime;
    }

    public AgentType getType() {
        return type;
    }

    public Double getCongestionFactor() {
        return congestionFactor;
    }
}
