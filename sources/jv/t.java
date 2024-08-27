package jv;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f21730a;

    static {
        AtomicReference atomicReference = u.f21731a;
        y yVar = new y();
        while (!atomicReference.compareAndSet(null, yVar) && atomicReference.get() == null) {
        }
        f21730a = (u) u.f21731a.get();
    }
}
