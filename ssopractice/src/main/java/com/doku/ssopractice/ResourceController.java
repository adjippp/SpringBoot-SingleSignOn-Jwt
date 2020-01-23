package com.doku.ssopractice;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

public class ResourceController {
    private static final String jwtTokenCookieName = "JWT-TOKEN";

    @RequestMapping("/")
    public String home() {
        return "redirect:/protected-resource";
    }

    @RequestMapping("/protected-resource")
    public String protectedResource() {
        return "protected-resource";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletResponse httpServletResponse) {
        CookieService.clearCookies(httpServletResponse, jwtTokenCookieName);
        return "redirect:/";
    }
}
