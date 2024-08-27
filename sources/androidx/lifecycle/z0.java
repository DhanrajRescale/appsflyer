package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements f0, iu.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f2004a;

    public z0(d2.y0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f2004a = function;
    }

    @Override // iu.f
    public final ut.d b() {
        return this.f2004a;
    }

    @Override // androidx.lifecycle.f0
    public final /* synthetic */ void d(Object obj) {
        this.f2004a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0) || !(obj instanceof iu.f)) {
            return false;
        }
        return Intrinsics.a(this.f2004a, ((iu.f) obj).b());
    }

    public final int hashCode() {
        return this.f2004a.hashCode();
    }
}
