package j9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21133a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f21134b;

    public c0(i iVar) {
        this.f21133a = iVar;
        this.f21134b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        Object obj2 = this.f21133a;
        if (obj2 != null && obj2.equals(c0Var.f21133a)) {
            return true;
        }
        Throwable th2 = this.f21134b;
        if (th2 == null || c0Var.f21134b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21133a, this.f21134b});
    }

    public c0(Throwable th2) {
        this.f21134b = th2;
        this.f21133a = null;
    }
}
