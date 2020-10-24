package Core;

import java.lang.annotation.*;

/**
 * Created by nima on 10/24/2020 AD.
 */

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tool {
    String name() default "UXTool";
}
