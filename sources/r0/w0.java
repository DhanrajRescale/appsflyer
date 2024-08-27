package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f32791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f32792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j10, float f10) {
        super(1);
        this.f32791a = f10;
        this.f32792b = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p1.h hVar = (p1.h) obj;
        float f10 = this.f32791a;
        float f11 = 2;
        p1.h.v0(hVar, this.f32792b, t0.t.g(s0.g.f34069a, hVar.c0(f10) / f11), t0.t.g(m1.f.e(hVar.d()), hVar.c0(f10) / f11), hVar.c0(f10), 0, 496);
        return Unit.f23355a;
    }
}
