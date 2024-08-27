package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j5 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26328a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.m f26330c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f26331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f26332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f26333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f26334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f26335h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f26336i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(long j10, p1.m mVar, float f10, long j11, w.l0 l0Var, w.l0 l0Var2, w.l0 l0Var3, w.l0 l0Var4) {
        super(1);
        this.f26329b = j10;
        this.f26330c = mVar;
        this.f26335h = f10;
        this.f26336i = j11;
        this.f26331d = l0Var;
        this.f26332e = l0Var2;
        this.f26333f = l0Var3;
        this.f26334g = l0Var4;
    }

    public final void a(p1.h hVar) {
        p1.m mVar = this.f26330c;
        int i10 = this.f26328a;
        float f10 = this.f26335h;
        float f11 = s0.g.f34069a;
        t0.l3 l3Var = this.f26334g;
        t0.l3 l3Var2 = this.f26333f;
        t0.l3 l3Var3 = this.f26332e;
        t0.l3 l3Var4 = this.f26331d;
        switch (i10) {
            case 0:
                l5.b(hVar, s0.g.f34069a, 360.0f, this.f26329b, mVar);
                float abs = Math.abs(((Number) l3Var3.getValue()).floatValue() - ((Number) l3Var2.getValue()).floatValue());
                float floatValue = ((Number) l3Var2.getValue()).floatValue() + ((Number) l3Var.getValue()).floatValue() + (((((Number) l3Var4.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
                long j10 = this.f26336i;
                if (!n1.s0.e(mVar.f30513c, 0)) {
                    f11 = ((f10 / (l5.f26451a / 2)) * 57.29578f) / 2.0f;
                }
                l5.b(hVar, floatValue + f11, Math.max(abs, 0.1f), j10, mVar);
                return;
            default:
                r0.h2.b(hVar, s0.g.f34069a, 360.0f, this.f26329b, mVar);
                float floatValue2 = (((Number) l3Var4.getValue()).floatValue() * 216.0f) % 360.0f;
                float abs2 = Math.abs(((Number) l3Var3.getValue()).floatValue() - ((Number) l3Var2.getValue()).floatValue());
                float floatValue3 = ((Number) l3Var2.getValue()).floatValue() + ((Number) l3Var.getValue()).floatValue() + (floatValue2 - 90.0f);
                long j11 = this.f26336i;
                if (!n1.s0.e(mVar.f30513c, 0)) {
                    f11 = ((f10 / (r0.h2.f32432b / 2)) * 57.29578f) / 2.0f;
                }
                r0.h2.b(hVar, floatValue3 + f11, Math.max(abs2, 0.1f), j11, mVar);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f26328a) {
            case 0:
                a((p1.h) obj);
                return Unit.f23355a;
            default:
                a((p1.h) obj);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(long j10, p1.m mVar, w.l0 l0Var, w.l0 l0Var2, w.l0 l0Var3, w.l0 l0Var4, float f10, long j11) {
        super(1);
        this.f26329b = j10;
        this.f26330c = mVar;
        this.f26331d = l0Var;
        this.f26332e = l0Var2;
        this.f26333f = l0Var3;
        this.f26334g = l0Var4;
        this.f26335h = f10;
        this.f26336i = j11;
    }
}
