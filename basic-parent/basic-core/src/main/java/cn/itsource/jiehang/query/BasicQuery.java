package cn.itsource.jiehang.query;

/**
 * @author solargen
 * @version V1.0
 * @className BaseQuery
 * @description TODO
 * @date 2019/5/16
 */
public class BasicQuery {

    private Integer page = 1;

    private Integer size = 10;

    private String keyword;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
