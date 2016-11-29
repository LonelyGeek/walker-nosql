package club.iwalker.nosql.mongo.repository;

/**
 * Created by wangchen on 2016/11/29.
 */

import club.iwalker.nosql.mongo.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MongoRepository<Customer, Integer>
 * 第一个参数：T 操作的vo
 * 第二个参数：ID T的主键类型
 * 作用：该接口实现了CRUD方法
 *
 * 注意：
 * 1、由于boot使用了spring-data-mongodb，所以我们不需要写该接口的实现，
 *   当我们运行程序的时候，spring-data-mongodb会动态创建
 * 2、findBySecondname命名是有讲究的，Secondname（是Customer的属性）若改为lastname就会报找不到属性lastname的错误
 */

public interface CustomerRepository extends MongoRepository<Customer, String> {
    public Customer findByFirstname(String firstname);
    public List<Customer> findBySecondname(String secondname);
}
