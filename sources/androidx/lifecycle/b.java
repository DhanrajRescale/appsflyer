package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1879a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1880b;

    public b(Method method, int i10) {
        this.f1879a = i10;
        this.f1880b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1879a == bVar.f1879a && this.f1880b.getName().equals(bVar.f1880b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1880b.getName().hashCode() + (this.f1879a * 31);
    }
}
