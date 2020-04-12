package com.almasb.cscalc;

import java.util.concurrent.CompletableFuture;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public interface Controller {

    CompletableFuture<Integer> onAdd(int num1, int num2);

    CompletableFuture<Integer> onSub(int num1, int num2);
}
