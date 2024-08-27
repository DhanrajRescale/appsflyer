package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f32758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f32759b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(float f10, float f11) {
        super(2);
        this.f32758a = f10;
        this.f32759b = f11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        b0.s.a(androidx.compose.foundation.layout.d.n(g1.l.f16404b, this.f32758a, this.f32759b), nVar, 0);
        return Unit.f23355a;
    }
}
