package com.manuel.springboot.interceptor.springbootinterceptor.interceptors;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Component("timeInterceptor")
public class LoadingTimeInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoadingTimeInterceptor.class);



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod controller = ((HandlerMethod) handler);
        logger.info("LoadingTimeInterceptor preHandle entrando ...." + controller.getMethod().getName());

        long start = System.currentTimeMillis(); // Tiempo en milisegundos de Enero de 1970 hasta ahora
        request.setAttribute("start", start);

        // Es para simular una demora
        Random random = new Random();
        int delay =  random.nextInt(500);
        Thread.sleep(delay);

        // Para el caso si es false, permite personales lo que se devuelve en caso de ser false
        Map<String, String> json = new HashMap<>();
        json.put("error","no tienes acceso a este recurso!");
        json.put("date",new Date().toString());

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(json);
        response.setContentType("application/json");
        response.setStatus(401);
        response.getWriter().write(jsonString);

//        return true;
        return false;     // Si devuelve false no continua con la ejecución, no devuelve el json, no devuelve nada
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long end = System.currentTimeMillis();
        long start = (long) request.getAttribute("start");
        long result = end - start;
        logger.info("Tiempo trnascurrido : "+result+" milisegundos.");
        logger.info("LoadingTimeInterceptor postHandle saliendo ...." + ((HandlerMethod) handler).getMethod().getName());
    }

}
