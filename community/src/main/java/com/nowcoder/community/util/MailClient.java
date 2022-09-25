package com.nowcoder.community.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

/**
 * 邮箱客户端，用于提供发邮件的功能
 * 需要的信息包含：
 * 1.发邮件的人（为固定）
 * 2.收邮件的人； 3. 邮件标题； 4. 邮件内容。
 */
@Component
public class MailClient {

    private static final Logger logger = LoggerFactory.getLogger(MailClient.class);

    @Resource
    private JavaMailSender mailSender;  //从Spring获取JavaMailSender，由Spring容器管理

    //设置发件人，从配置文件读取
    @Value("${spring.mail.username}")
    private String from;

    public void sendMail(String to,String subject,String content){

        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content,true);
            mailSender.send(helper.getMimeMessage());
        } catch (Exception e) {
            logger.error("邮件发送失败：" + e.getMessage());
        }
    }
}
