package com.almasb.cscalc;

import io.javalin.Javalin;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class ServerApp {

    public static void main(String[] args) {
        Model model = new Model();

        var app = Javalin.create().start(55555);
        app.get("/calc/add", ctx -> {
            var num1 = ctx.req.getParameter("num1");
            var num2 = ctx.req.getParameter("num2");

            var result = model.add(Integer.parseInt(num1), Integer.parseInt(num2));

            ctx.result(String.valueOf(result));
        });

        app.get("/calc/sub", ctx -> {
            var num1 = ctx.req.getParameter("num1");
            var num2 = ctx.req.getParameter("num2");

            var result = model.sub(Integer.parseInt(num1), Integer.parseInt(num2));

            ctx.result(String.valueOf(result));
        });
    }
}
