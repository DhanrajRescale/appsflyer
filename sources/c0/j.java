package c0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j extends bl.j implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public final d0.p0 f7512b = new d0.p0();

    public j(Function1 function1) {
        function1.invoke(this);
    }

    @Override // bl.j
    public final d0.p0 E() {
        return this.f7512b;
    }

    public final void a0(int i10, Function1 function1, Function1 function12, b1.c cVar) {
        this.f7512b.a(i10, new g(function1, function12, cVar));
    }
}
