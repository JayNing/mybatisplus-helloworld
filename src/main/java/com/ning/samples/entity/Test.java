package com.ning.samples.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author JayNing
 * @since 2023-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Test对象", description="")
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "test名称")
    private String name;

    @ApiModelProperty(value = "test等级")
    private Integer lv;


}
