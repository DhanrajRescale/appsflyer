package tu;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class r0 implements t0, f, uu.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f36542a;

    public r0(w0 w0Var) {
        this.f36542a = w0Var;
    }

    @Override // tu.t0
    public final List b() {
        return this.f36542a.b();
    }

    @Override // tu.f
    public final Object c(g gVar, yt.a aVar) {
        return this.f36542a.c(gVar, aVar);
    }

    @Override // uu.r
    public final f e(CoroutineContext coroutineContext, int i10, su.a aVar) {
        return x0.d(this, coroutineContext, i10, aVar);
    }
}
