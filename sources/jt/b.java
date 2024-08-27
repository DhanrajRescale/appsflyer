package jt;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class b extends AtomicInteger implements ht.a {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // ht.c
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
