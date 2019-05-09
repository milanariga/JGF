package JsonReaderWithGson;

import java.util.List;

public class Point {

    private String originDataSourceId;
    private List<Value> values;

    public String getOriginDataSourceId() {
        return originDataSourceId;
    }

    public void setOriginDataSourceId(String originDataSourceId) {
        this.originDataSourceId = originDataSourceId;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }
}
