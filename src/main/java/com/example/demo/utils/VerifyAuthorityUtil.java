package com.example.demo.utils;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.entity.Essay;
import com.example.demo.entity.Story;
import com.example.demo.entity.Topic;
import com.example.demo.entity.User;





/**
 * 用于判断当前用户拥有的权限的类
 */
public class VerifyAuthorityUtil {

    /**
     * 判断session中security权限中是否有管理员权限的方法,是则返回true;
     * @param request
     * @return
     */
    public static Boolean isAdmin(HttpServletRequest request) {
        // TODO 判断是否有admin角色信息,开发时写死:
        
        return true;
    }

    /**
     * 判断当前用户是否是此专辑稿件的作者；
     * @param request
     * @param topic
     * @return
     */
    public static Boolean isAuthorForThisTopic(HttpServletRequest request, Topic topic) {
        if(null != request.getSession().getAttribute("user") && topic.getAuthor().getId() == ((User)request.getSession().getAttribute("user")).getId()){
            return true;
        }
        return false;
    }

    /**
     * 判断当前用户是否是此随笔稿件的作者；
     * @param request
     * @param essay
     * @return
     */
    public static Boolean isAuthorForThisEssay(HttpServletRequest request, Essay essay) {
        if(null != request.getSession().getAttribute("user") && essay.getAuthor().getId() == ((User)request.getSession().getAttribute("user")).getId()){
            return true;
        }
        return false;
    }

    /**
     * 判断当前用户是否是此故事稿件的作者；
     * @param request
     * @param story
     * @return
     */
    public static Boolean isAuthorForThisStory(HttpServletRequest request, Story story) {
        if(null != request.getSession().getAttribute("user") && story.getAuthor().getId() == ((User)request.getSession().getAttribute("user")).getId()){
            return true;
        }
        return false;
    }

        /* Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication);
        if(authentication!=null && authentication.isAuthenticated()) {
            System.out.println(authentication.getName());
            System.out.println(authentication.getPrincipal());
        }
         UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        */


       /* 这是传统的自定义session信息的方法
        if (null == request.getSession().getAttribute("user")){
            return Msg.fail().setCode(101).setMsg("操作失败,请重新登录后再尝试");
        }
        User user = (User) request.getSession().getAttribute("user");*/

}
