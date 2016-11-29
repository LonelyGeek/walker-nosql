package club.iwalker.nosql.mongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by wangchen on 2016/11/29.
 */
@Document
public class Customer implements Serializable {

    /**
     * cid：该字段用于mongodb的"_id"索引
     * 1、需要@Id注解
     * 2、取名无所谓，反正在mongodb中最后都会转化为"_id"
     * 3、定义为String类型，如果定义为Integer可能索引只会是0，会出现key重复导致数据库插不进去的情况；
     * 4、该类型也是MongoRepository泛型中主键的ID
     */
    @Id
    private String cid;
    private String firstname;
    private String secondname;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
}
