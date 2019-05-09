package JsonReaderWithGson;

import java.util.List;

public class Bucket {

    private String startTimeMillis;
    private String endTimeMillis;
    private List<Dataset> dataset;

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

    public List<Dataset> getDataset() {
        return dataset;
    }

    public void setDataset(List<Dataset> dataset) {
        this.dataset = dataset;
    }

//    @Override
//    public String toString() {
//        return this.getStartTimeMillis() + " - " + this.getEndTimeMillis() + " - "
//                + this.getDataset().get(0).getPoint().get(0).getOriginDataSourceId()
//                + this.getDataset().get(0).getPoint().get(0).getValues().get(0).getValue().get(0).getIntVal().get(1);
//    }
}
