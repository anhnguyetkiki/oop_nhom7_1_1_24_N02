// File: com/mycompany/interfaces/CharacterSwapper.java
package com.mycompany.interfaces;

public class CharacterSwapper {
    public String swap(String s) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < result.length() - 1; i += 2) {
            char temp = result.charAt(i);
            result.setCharAt(i, result.charAt(i + 1));
            result.setCharAt(i + 1, temp);
        }
        return result.toString();
    }
}
// File: com/mycompany/interfaces/StringSwapperAdapter.java
package com.mycompany.interfaces;

import com.mycompany.interfaceprocessor.Apply;
import com.mycompany.interfaceprocessor.Processor;

class StringSwapperAdapter implements Processor {
    private CharacterSwapper swapper = new CharacterSwapper();

    @Override
    public String name() {
        return "StringSwapperAdapter";
    }

    @Override
    public String process(Object input) {
        return swapper.swap((String) input);
    }
}

public class StringSwapperTest {
    public static void main(String[] args) {
        String s = "hello world";
        Apply.process(new StringSwapperAdapter(), s);
    }
}
// File: com/mycompany/interfaceprocessor/Apply.java
package com.mycompany.interfaceprocessor;

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
// File: com/mycompany/interfaceprocessor/Processor.java
package com.mycompany.interfaceprocessor;

public interface Processor {
    String name();
    Object process(Object input);
}
