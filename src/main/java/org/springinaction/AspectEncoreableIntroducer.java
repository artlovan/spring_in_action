package org.springinaction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class AspectEncoreableIntroducer {

    @DeclareParents(value = "org.springinaction.Performance+", defaultImpl = EncoreableImpl.class)
    public static Encoreable encoreable;
}
