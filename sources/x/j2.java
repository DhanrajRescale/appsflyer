package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o2 f39599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f39600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f39601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(boolean z10, o2 o2Var, float f10, float f11, yt.a aVar) {
        super(2, aVar);
        this.f39598b = z10;
        this.f39599c = o2Var;
        this.f39600d = f10;
        this.f39601e = f11;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j2(this.f39598b, this.f39599c, this.f39600d, this.f39601e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object j10;
        Object j11;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39597a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            boolean z10 = this.f39598b;
            o2 o2Var = this.f39599c;
            if (z10) {
                Intrinsics.d(o2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                this.f39597a = 1;
                j11 = iu.j.j(o2Var, this.f39600d, w.e.v(s0.g.f34069a, null, 7), this);
                if (j11 == aVar) {
                    return aVar;
                }
            } else {
                Intrinsics.d(o2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                this.f39597a = 2;
                j10 = iu.j.j(o2Var, this.f39601e, w.e.v(s0.g.f34069a, null, 7), this);
                if (j10 == aVar) {
                    return aVar;
                }
            }
        }
        return Unit.f23355a;
    }
}
