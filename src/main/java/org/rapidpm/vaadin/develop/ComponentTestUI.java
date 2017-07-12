package org.rapidpm.vaadin.develop;

import java.util.Arrays;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import org.rapidpm.vaadin.trainer.modules.mainview.calc.CalcComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;

/**
 *
 */
@Theme("valo")
//  @PreserveOnRefresh
public class ComponentTestUI extends UI {
  private static final Logger LOGGER = LoggerFactory.getLogger(ComponentTestUI.class);
  @Override
  protected void init(VaadinRequest request) {
//    request
//        .getParameterMap()
//        .forEach((key, value) -> LOGGER.info("init - request - entry = " + key + " -> " + Arrays.toString(value)));
    setContent(new CalcComponent());
    setSizeFull();
  }
}
