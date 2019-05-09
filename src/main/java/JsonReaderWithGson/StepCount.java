package JsonReaderWithGson;

import java.util.List;

public class StepCount {

    private List<Bucket> buckets;

    public List<Bucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
    }

    @Override
    public String toString() {
        return buckets.get(0).getStartTimeMillis() + " - " + buckets.get(0).getEndTimeMillis() + " - "
                + buckets.get(0).getDataset().get(0).getPoint().get(0).getOriginDataSourceId()
                + buckets.get(0).getDataset().get(0).getPoint().get(0).getValues().get(0).getValue().get(0).getIntVal().get(1);
    }
}
