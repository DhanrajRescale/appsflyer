package c;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class n extends e.c {

    /* renamed from: a, reason: collision with root package name */
    public final a f7434a;

    public n(a launcher, g1 contract) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f7434a = launcher;
    }

    @Override // e.c
    public final void a(Object obj) {
        Unit unit;
        e.c cVar = this.f7434a.f7405a;
        if (cVar != null) {
            cVar.a(obj);
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit != null) {
        } else {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    @Override // e.c
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
