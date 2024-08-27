package bq;

import java.util.Set;

/* loaded from: classes2.dex */
public interface b {
    default Object a(Class cls) {
        return e(p.a(cls));
    }

    default mq.c b(Class cls) {
        return c(p.a(cls));
    }

    mq.c c(p pVar);

    mq.c d(p pVar);

    default Object e(p pVar) {
        mq.c c10 = c(pVar);
        if (c10 == null) {
            return null;
        }
        return c10.get();
    }

    default Set f(p pVar) {
        return (Set) d(pVar).get();
    }

    mq.b g(p pVar);

    default mq.b h(Class cls) {
        return g(p.a(cls));
    }
}
