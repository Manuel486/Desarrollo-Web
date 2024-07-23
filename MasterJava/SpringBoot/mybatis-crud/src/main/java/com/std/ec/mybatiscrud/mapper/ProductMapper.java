package com.std.ec.mybatiscrud.mapper;

import com.std.ec.mybatiscrud.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Results({
            @Result(property = "category.id", column = "category_id"),
            @Result(property = "category.name", column = "category_name"),
            @Result(property = "category.description", column = "category_description")
    })
    @Select("SELECT p.*, c.name as category_name, c.description as category_description FROM Product p INNER JOIN Category c ON p.category_id = c.id")
    List<Product> findAll();

    @Select("SELECT * FROM Product WHERE id = #{id}")
    Product findById(@Param("id") int id);

    @Delete("DELETE FROM Product WHERE id = #{id}")
    int deleteById(@Param("id") int id);

    @Insert("INSERT INTO Product(id, name, status, category_id) VALUES (#{id}, #{name}, #{status}, #{category_id})")
    int save(Product item);

    @Update("UPDATE Product SET name=#{name}, status=#{status}, category_id=#{category_id} WHERE id=#{id}")
    int update(Product item);
}
