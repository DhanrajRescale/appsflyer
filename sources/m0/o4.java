package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o4 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0.l3 f26582c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(long j10, t0.l3 l3Var, int i10) {
        super(1);
        this.f26580a = i10;
        this.f26581b = j10;
        this.f26582c = l3Var;
    }

    public final void a(p1.h hVar) {
        int i10 = this.f26580a;
        t0.l3 l3Var = this.f26582c;
        switch (i10) {
            case 0:
                p1.h.U(hVar, this.f26581b, 0L, 0L, ((Number) l3Var.getValue()).floatValue(), null, 0, 118);
                return;
            default:
                p1.h.U(hVar, this.f26581b, 0L, 0L, ((Number) l3Var.getValue()).floatValue(), null, 0, 118);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f26580a) {
            case 0:
                a((p1.h) obj);
                return Unit.f23355a;
            default:
                a((p1.h) obj);
                return Unit.f23355a;
        }
    }
}
