package vu;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public class y extends qu.a implements au.d {

    /* renamed from: d, reason: collision with root package name */
    public final yt.a f38410d;

    public y(yt.a aVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f38410d = aVar;
    }

    @Override // qu.x1
    public final boolean Y() {
        return true;
    }

    @Override // au.d
    public final au.d getCallerFrame() {
        yt.a aVar = this.f38410d;
        if (aVar instanceof au.d) {
            return (au.d) aVar;
        }
        return null;
    }

    @Override // qu.x1
    public void s(Object obj) {
        i.a(zt.f.b(this.f38410d), qu.v.a(obj), null);
    }

    @Override // qu.x1
    public void t(Object obj) {
        this.f38410d.resumeWith(qu.v.a(obj));
    }
}
