package com.scc.events.models;

import com.scc.agria.model.Dog;

public class DogChangeModel {

    private String type;
    private String action;
    private Dog dog;
    private String traceId;
    private long timestamp;

    public DogChangeModel(){
        super();
    }

    public DogChangeModel(String type, String action, Dog dog, String traceId, long timestamp) {
        super();
        this.type   = type;
        this.action = action;
        this.dog = dog;
        this.traceId = traceId;
        this.timestamp = timestamp;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public Dog getDog() { return dog; }
    public void setDog(Dog dog) { this.dog = dog; }

    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }

	public long getTimestamp() { return timestamp; }
	public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
	
    @Override
    public String toString() {
        return "DogChangeModel [type=" + type +
                ", action=" + action +
                ", dogId="  + dog.toString() +
                ", traceId=" + traceId + 
                ", timestamp=" + timestamp + "]";
    }

}
