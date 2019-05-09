package JsonReaderWithGson;

import java.util.List;

public class StepCount {

    private Bucket[] bucket;

    public Bucket[] getBucket() {
        return bucket;
    }

    public void setBucket(Bucket[] bucket) {
        this.bucket = bucket;
    }

//    @Override
//    public String toString() {
//        return bucket.getStartTimeMillis() + " - " + bucket.getEndTimeMillis() + " - "
//                + bucket.getDataset().get(0).getPoint().get(0).getOriginDataSourceId()
//                + bucket.getDataset().get(0).getPoint().get(0).getValues().get(0).getValue().get(0).getIntVal().get(1);
//    }
}
