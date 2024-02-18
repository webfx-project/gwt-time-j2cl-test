package dev.webfx.gwttimej2cltest;

import elemental2.dom.DomGlobal;
import org.treblereel.j2cl.processors.annotations.GWT3EntryPoint;

import java.time.LocalDate;

/**
 * @author Bruno Salmon
 */
public class GwtTimeJ2clTest {

    @GWT3EntryPoint
    public void entryPoint() {
        DomGlobal.console.log("Today is " + LocalDate.now());
    }

}