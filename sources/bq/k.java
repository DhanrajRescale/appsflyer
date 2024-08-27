package bq;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class k implements jq.c, jq.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7263a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f7264b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f7265c;

    public k(Executor executor) {
        this.f7265c = executor;
    }

    public final synchronized void a(Executor executor, jq.a aVar) {
        try {
            executor.getClass();
            if (!this.f7263a.containsKey(pp.b.class)) {
                this.f7263a.put(pp.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f7263a.get(pp.b.class)).put(aVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
