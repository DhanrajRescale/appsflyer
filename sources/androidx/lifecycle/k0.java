package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.o1;
import ut.l;

/* loaded from: classes.dex */
public final class k0 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iu.z f1927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f1928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f1929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qu.h f1930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yu.a f1931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f1932g;

    public k0(m mVar, iu.z zVar, qu.f0 f0Var, m mVar2, qu.i iVar, yu.d dVar, Function2 function2) {
        this.f1926a = mVar;
        this.f1927b = zVar;
        this.f1928c = f0Var;
        this.f1929d = mVar2;
        this.f1930e = iVar;
        this.f1931f = dVar;
        this.f1932g = function2;
    }

    @Override // androidx.lifecycle.r
    public final void c(t tVar, m event) {
        Intrinsics.checkNotNullParameter(tVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        m mVar = this.f1926a;
        iu.z zVar = this.f1927b;
        if (event == mVar) {
            zVar.f20560a = yk.g.H(this.f1928c, null, null, new j0(this.f1931f, this.f1932g, null), 3);
            return;
        }
        if (event == this.f1929d) {
            o1 o1Var = (o1) zVar.f20560a;
            if (o1Var != null) {
                o1Var.a(null);
            }
            zVar.f20560a = null;
        }
        if (event == m.ON_DESTROY) {
            l.Companion companion = ut.l.INSTANCE;
            this.f1930e.resumeWith(Unit.f23355a);
        }
    }
}
