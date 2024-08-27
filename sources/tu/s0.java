package tu;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class s0 implements i1, f, uu.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f36547a;

    public s0(i1 i1Var) {
        this.f36547a = i1Var;
    }

    @Override // tu.t0
    public final List b() {
        return this.f36547a.b();
    }

    @Override // tu.f
    public final Object c(g gVar, yt.a aVar) {
        return this.f36547a.c(gVar, aVar);
    }

    @Override // uu.r
    public final f e(CoroutineContext coroutineContext, int i10, su.a aVar) {
        kp.g gVar = l1.f36497a;
        if (((i10 >= 0 && i10 < 2) || i10 == -2) && aVar == su.a.f34777b) {
            return this;
        }
        return x0.d(this, coroutineContext, i10, aVar);
    }

    @Override // tu.i1
    public final Object getValue() {
        return this.f36547a.getValue();
    }
}
