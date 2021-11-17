package section_03

import java.util.jar.Attributes
import javax.naming.Context

class Secretive private constructor() {}

open class ViewTest {
    constructor(context: Context) {
        // some code
    }
    constructor(context: Context,attribute: Attributes) {
        // some code
    }
}

class ButtonTest: ViewTest {
    constructor(context: Context) : super(context) {}
    constructor(context: Context, attribute: Attributes) : super(context, attribute) {}
}
