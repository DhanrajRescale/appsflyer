package xu;

import kotlin.coroutines.CoroutineContext;
import qu.e1;

/* loaded from: classes2.dex */
public abstract class h extends e1 {

    /* renamed from: c, reason: collision with root package name */
    public final c f40588c;

    public h(String str, int i10, int i11, long j10) {
        this.f40588c = new c(str, i10, i11, j10);
    }

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        c.c(this.f40588c, runnable, false, 6);
    }

    @Override // qu.b0
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        c.c(this.f40588c, runnable, true, 2);
    }
}
