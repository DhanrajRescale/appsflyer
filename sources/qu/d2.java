package qu;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.coroutines.a implements o1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d2 f32198b = new kotlin.coroutines.a(c0.f32192b);

    @Override // qu.o1
    public final t0 I(Function1 function1) {
        return e2.f32201a;
    }

    @Override // qu.o1
    public final Object S(yt.a aVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // qu.o1
    public final void a(CancellationException cancellationException) {
    }

    @Override // qu.o1
    public final boolean b() {
        return true;
    }

    @Override // qu.o1
    public final m d(x1 x1Var) {
        return e2.f32201a;
    }

    @Override // qu.o1
    public final o1 getParent() {
        return null;
    }

    @Override // qu.o1
    public final t0 j(boolean z10, boolean z11, i0.g2 g2Var) {
        return e2.f32201a;
    }

    @Override // qu.o1
    public final Sequence n() {
        return pu.m.c();
    }

    @Override // qu.o1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // qu.o1
    public final CancellationException v() {
        throw new IllegalStateException("This job is always active");
    }
}
