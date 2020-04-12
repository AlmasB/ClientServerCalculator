/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
module calc.client {
    requires javafx.graphics;
    requires javafx.controls;
    requires java.net.http;

    exports com.almasb.cscalc to javafx.graphics;
}