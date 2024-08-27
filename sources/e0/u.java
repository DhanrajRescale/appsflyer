package e0;

import d0.p0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f14792b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f14793c;

    public u(hu.d dVar, Function1 function1, int i10) {
        this.f14792b = function1;
        p0 p0Var = new p0();
        p0Var.a(i10, new r(function1, dVar));
        this.f14793c = p0Var;
    }

    @Override // bl.j
    public final p0 E() {
        return this.f14793c;
    }
}
