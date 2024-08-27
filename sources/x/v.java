package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.e5;
import m0.f5;

/* loaded from: classes.dex */
public final class v extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f39739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, int i10, long j10) {
        super(1);
        this.f39738a = i10;
        this.f39739b = j10;
        this.f39740c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float a10;
        long j10 = this.f39739b;
        int i10 = this.f39738a;
        Object obj2 = this.f39740c;
        switch (i10) {
            case 2:
                p1.h.U((p1.h) obj, j10, 0L, 0L, ((Number) ((Function0) obj2).mo2invoke()).floatValue(), null, 0, 118);
                return Unit.f23355a;
            default:
                p1.e eVar = (p1.e) obj;
                float e10 = m1.f.e(j10);
                if (e10 > s0.g.f34069a) {
                    c2.j0 j0Var = (c2.j0) eVar;
                    float c02 = j0Var.c0(f5.f26167a);
                    float c03 = j0Var.c0(((b0.h1) obj2).d(j0Var.getLayoutDirection())) - c02;
                    float f10 = 2;
                    float f11 = (c02 * f10) + e10 + c03;
                    w2.k layoutDirection = j0Var.getLayoutDirection();
                    int[] iArr = e5.f26102a;
                    int i11 = iArr[layoutDirection.ordinal()];
                    p1.c cVar = j0Var.f7740a;
                    if (i11 == 1) {
                        a10 = m1.f.e(cVar.d()) - f11;
                    } else {
                        a10 = kotlin.ranges.d.a(c03, s0.g.f34069a);
                    }
                    float f12 = a10;
                    if (iArr[j0Var.getLayoutDirection().ordinal()] == 1) {
                        f11 = m1.f.e(cVar.d()) - kotlin.ranges.d.a(c03, s0.g.f34069a);
                    }
                    float c10 = m1.f.c(j10);
                    float f13 = (-c10) / f10;
                    float f14 = c10 / f10;
                    p1.b bVar = cVar.f30501b;
                    long b10 = bVar.b();
                    bVar.a().h();
                    bVar.f30498a.f30504a.a().q(f12, f13, f11, f14, 0);
                    j0Var.a();
                    bVar.a().s();
                    bVar.c(b10);
                } else {
                    ((c2.j0) eVar).a();
                }
                return Unit.f23355a;
        }
    }
}
