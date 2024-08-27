package kj;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23227a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23228b = new AtomicBoolean(false);

    public j(Object obj) {
        this.f23227a = obj;
    }

    public final Object a() {
        if (this.f23228b.getAndSet(true)) {
            return null;
        }
        return this.f23227a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.a(this.f23227a, ((j) obj).f23227a);
    }

    public final int hashCode() {
        Object obj = this.f23227a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SingleLiveEvent(content=" + this.f23227a + ")";
    }
}
