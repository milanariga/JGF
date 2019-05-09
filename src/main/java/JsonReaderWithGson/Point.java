package JsonReaderWithGson;

import java.util.List;

public class Point {

    private String originDataSourceId;
    private List<Value> value;

    public String getOriginDataSourceId() {
        return originDataSourceId;
    }

    public void setOriginDataSourceId(String originDataSourceId) {
        this.originDataSourceId = originDataSourceId;
    }

    public List<Value> getValue() {
        return value;
    }

    public void setValues(List<Value> value) {
        this.value = value;
    }
}
