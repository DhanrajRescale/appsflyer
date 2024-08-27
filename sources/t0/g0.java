package t0;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import ut.l;

/* loaded from: classes.dex */
public final class g0 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu.h f35022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f35023b;

    public g0(qu.i iVar, Function1 function1) {
        this.f35022a = iVar;
        this.f35023b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Object a10;
        h0 h0Var = h0.f35031a;
        Function1 function1 = this.f35023b;
        try {
            l.Companion companion = ut.l.INSTANCE;
            a10 = function1.invoke(Long.valueOf(j10));
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        this.f35022a.resumeWith(a10);
    }
}
