package JsonReaderWithGson;

public class StepsPerDay {
    private String startTimeMillis;
    private String endTimeMillis;
    //private Dataset dataset;

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

//    public Dataset getDataset() {
//        return dataset;
//    }
//
//    public void setDataset(Dataset dataset) {
//        this.dataset = dataset;
//    }

    @Override
    public String toString() {
        return startTimeMillis + " - " + endTimeMillis + " - "
                ;
    }
}
