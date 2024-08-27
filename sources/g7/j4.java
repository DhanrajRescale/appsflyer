package g7;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j4 implements qu.f0, su.p {

    /* renamed from: a, reason: collision with root package name */
    public final su.p f16853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f16854b;

    public j4(qu.f0 scope, su.g channel) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f16853a = channel;
        this.f16854b = scope;
    }

    @Override // qu.f0
    public final CoroutineContext H() {
        return this.f16854b.H();
    }

    @Override // su.p
    public final Object h(Object obj, yt.a aVar) {
        return this.f16853a.h(obj, aVar);
    }

    @Override // su.p
    public final boolean k(Throwable th2) {
        return this.f16853a.k(th2);
    }

    @Override // su.p
    public final Object o(Object obj) {
        return this.f16853a.o(obj);
    }
}
