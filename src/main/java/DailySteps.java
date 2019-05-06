public class DailySteps {

    private int Id;
    private String startTimeMillis;
    private String endTimeMillis;
    private String originDataSourceId; //deviceId
    private Long intVal; //steps

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStartTimeMillis() {
        return startTimeMillis;
    }

    public void setStartTimeMillis(String startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
    }

    public String getEndTimeMillis() {
        return endTimeMillis;
    }

    public void setEndTimeMillis(String endTimeMillis) {
        this.endTimeMillis = endTimeMillis;
    }

    public String getOriginDataSourceId() {
        return originDataSourceId;
    }

    public void setOriginDataSourceId(String originDataSourceId) {
        this.originDataSourceId = originDataSourceId;
    }

    public Long getIntVal() {
        return intVal;
    }

    public void setIntVal(Long intVal) {
        this.intVal = intVal;
    }

    @Override
    public String toString() {
        return startTimeMillis + " - " + endTimeMillis + " - " + originDataSourceId + " - " + intVal;
    }
}
