package y8;

import androidx.lifecycle.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends androidx.lifecycle.o {

    /* renamed from: b, reason: collision with root package name */
    public static final g f41334b = new androidx.lifecycle.o();

    /* renamed from: c, reason: collision with root package name */
    public static final f f41335c = new Object();

    @Override // androidx.lifecycle.o
    public final void a(s sVar) {
        if (sVar instanceof androidx.lifecycle.e) {
            androidx.lifecycle.e eVar = (androidx.lifecycle.e) sVar;
            eVar.getClass();
            f owner = f41335c;
            Intrinsics.checkNotNullParameter(owner, "owner");
            eVar.g(owner);
            eVar.b(owner);
            return;
        }
        throw new IllegalArgumentException((sVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.o
    public final androidx.lifecycle.n b() {
        return androidx.lifecycle.n.f1951e;
    }

    @Override // androidx.lifecycle.o
    public final void c(s sVar) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
