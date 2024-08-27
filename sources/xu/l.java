package xu;

import kotlin.coroutines.CoroutineContext;
import qu.b0;

/* loaded from: classes2.dex */
public final class l extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f40600c = new b0();

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        e eVar = e.f40586d;
        eVar.f40588c.b(runnable, k.f40599h, false);
    }

    @Override // qu.b0
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        e eVar = e.f40586d;
        eVar.f40588c.b(runnable, k.f40599h, true);
    }

    @Override // qu.b0
    public final b0 e0(int i10) {
        hl.f.C(i10);
        if (i10 >= k.f40595d) {
            return this;
        }
        return super.e0(i10);
    }
}
