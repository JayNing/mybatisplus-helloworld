package com.ning.samples.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * ClassName: Role
 * Description:
 * date: 2021/3/29 17:19
 *
 * @author ningjianjian
 */
@ApiModel(description = "角色类")
@Data
public class Role {

    @ApiModelProperty(value = "角色主键ID", example = "100")
    private Long id;
    @ApiModelProperty(value = "角色名", example = "admin")
    private String name;
    @ApiModelProperty(value = "角色等级", example = "1")
    private Integer lv;
}
