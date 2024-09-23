package net.zjitc.config;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

/**
 * http会话配置
 *
 * @author WuLian
 * @date 2023/12/22
 */
@Component
public class HttpSessionConfig extends ServerEndpointConfig.Configurator implements ServletRequestListener {

    /**
     * 请求初始化
     *
     * @param sre 行为
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        //获取HttpSession，将所有request请求都携带上HttpSession
        //从ServletRequestEvent中获取HttpServletRequest对象，并从中获取HttpSession对象。
        HttpSession session = ((HttpServletRequest) sre.getServletRequest()).getSession();
    }

    /**
     * 修改握手
     *
     * @param request  请求
     * @param response 响应
     */
    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        // 获取session
        HttpSession httpSession = (HttpSession) request.getHttpSession();
        if (httpSession != null) {
            // session放入serverEndpointConfig
            sec.getUserProperties().put(HttpSession.class.getName(), httpSession);
        }
        super.modifyHandshake(sec, request, response);
    }

}