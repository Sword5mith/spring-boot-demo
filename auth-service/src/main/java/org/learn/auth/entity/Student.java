package org.learn.auth.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author tanjie
 * @since 2019/04/04
 */
@Data
@TableName("student")
public class Student {
    @TableId
    private Long id;

    @TableField("age")
    private Integer age;

    @TableField("name")
    private String name;
}
