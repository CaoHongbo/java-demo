package com.example.demo.source;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * teech_push_action_conf
 * @author Caohongbo
 */
@Data
@JsonIgnoreProperties(ignoreUnknown=true) // 忽略未知的字段
public class TeechPushActionConf implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 动作名称
     */
    private String actionName;

    /**
     * 动作疲劳频次限制
     */
    private Integer actionFatigueLimit;

    /**
     * 等待反馈时间
     */
    private Long timeToResult;

    /**
     * 执行时间段
     */
    private String timeQuantum;

    /**
     * 是否减免 0-非减免 1-减免
     */
    private Short isReduced;

    /**
     * 租赁状态 0-非在租中 1-在租中
     */
    private Short rentStatus;

    /**
     * 分层 1低危 2中危 3高危
     */
    private Short level;

    /**
     * 1-短信 2-语音 3-客服
     */
    private Short pushType;

    /**
     * 触达文案id
     */
    private Long pushContentId;

    /**
     * 触达文案
     */
    private String pushContent;

    /**
     * 其他说明
     */
    private String remark;

    /**
     * 1.蓝盾 2.后蓝盾 3.网约车 5.租买灵活
     */
    private Short rentMode;

    /**
     * 创建员工
     */
    private String staffCreated;

    /**
     * 修改员工
     */
    private String staffModified;

    /**
     * 0-未删除 1-已删除
     */
    private Short isDeleted;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone="GMT+8")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm", timezone="GMT+8")
    private Date updateTime;

    // TODO
    private static final long serialVersionUID = 1L;
}