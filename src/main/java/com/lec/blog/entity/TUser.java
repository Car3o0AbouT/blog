package com.lec.blog.entity;

    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author lec
* @since 2019-06-20
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 创建日期
            */
    private LocalDateTime cTime;

            /**
            * 修改日期
            */
    private LocalDateTime uTime;

            /**
            * 昵称
            */
    private String nickname;

            /**
            * 账号
            */
    private String account;

            /**
            * 性别
            */
    private Integer sex;

            /**
            * 年龄
            */
    private Integer age;

            /**
            * 密码
            */
    private String pwd;


}
