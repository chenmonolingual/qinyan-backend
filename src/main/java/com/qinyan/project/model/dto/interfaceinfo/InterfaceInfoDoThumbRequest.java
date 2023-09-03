package com.qinyan.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 点赞 / 取消点赞请求
 *
 * @author qinyan
 */
@Data
public class InterfaceInfoDoThumbRequest implements Serializable {

    /**
     * 帖子 id
     */
    private long postId;

    private static final long serialVersionUID = 1L;
}