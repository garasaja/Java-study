
package virus;

import java.util.List;

import lombok.Data;

@Data
public class Corona {

    public Integer count;
    public String page;
    public List<StoreInfo> storeInfos = null;
    public Integer totalCount;
    public Integer totalPages;

}
