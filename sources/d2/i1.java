package d2;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;
import ut.l;

/* loaded from: classes.dex */
public final class i1 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu.h f13457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f13458b;

    public i1(qu.i iVar, j1 j1Var, Function1 function1) {
        this.f13457a = iVar;
        this.f13458b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Object a10;
        Function1 function1 = this.f13458b;
        try {
            l.Companion companion = ut.l.INSTANCE;
            a10 = function1.invoke(Long.valueOf(j10));
        } catch (Throwable th2) {
            l.Companion companion2 = ut.l.INSTANCE;
            a10 = ut.n.a(th2);
        }
        this.f13457a.resumeWith(a10);
    }
}
