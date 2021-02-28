package com.java.javareact.service;

import com.java.javareact.dao.MemberDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    @Transactional(readOnly = true)
    public Map<String,Object> login(Map<String,Object> param, HttpSession session) {
        Map<String,Object> result = null;
        try {
            if(param != null){
                result = memberDao.login(param);
                if(result != null && !"".equals(result.get("memId"))){
                    result.put("msg","OK");
                }else{
                    result = new HashMap<>();
                    result.put("msg","FAILED");
                }
                session.setAttribute("loginResult", result);
            }
        }catch (IllegalArgumentException e){
            log.error(e.getMessage(),e);
        }catch (Exception e){
            log.error(e.getMessage(),e);
        }
        return result;
    }

}
