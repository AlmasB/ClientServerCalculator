package com.almasb.cscalc;

import java.util.concurrent.CompletableFuture;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class LocalController implements Controller {
    @Override
    public CompletableFuture<Integer> onAdd(int num1, int num2) {
        var future = new CompletableFuture<Integer>();
        future.complete(num1 + num2);
        return future;
    }

    @Override
    public CompletableFuture<Integer> onSub(int num1, int num2) {
        var future = new CompletableFuture<Integer>();
        future.complete(num1 - num2);
        return future;
    }
}
