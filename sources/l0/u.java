package l0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f23827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f23830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut.g f23831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o oVar, int i10, int i11, q0 q0Var, ut.g gVar) {
        super(0);
        this.f23827a = oVar;
        this.f23828b = i10;
        this.f23829c = i11;
        this.f23830d = q0Var;
        this.f23831e = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        boolean z10;
        int intValue = ((Number) this.f23831e.getValue()).intValue();
        q0 q0Var = (q0) this.f23830d;
        boolean z11 = q0Var.f23811a;
        if (q0Var.f23813c.b() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        o oVar = this.f23827a;
        j2.e0 e0Var = oVar.f23798d;
        int i10 = this.f23828b;
        long o10 = e0Var.o(i10);
        int i11 = j2.f0.f20711c;
        int i12 = (int) (o10 >> 32);
        j2.e0 e0Var2 = oVar.f23798d;
        int f10 = e0Var2.f(i12);
        j2.l lVar = e0Var2.f20704b;
        if (f10 != intValue) {
            int i13 = lVar.f20735f;
            if (intValue >= i13) {
                i12 = e0Var2.j(i13 - 1);
            } else {
                i12 = e0Var2.j(intValue);
            }
        }
        int i14 = (int) (o10 & 4294967295L);
        if (e0Var2.f(i14) != intValue) {
            int i15 = lVar.f20735f;
            if (intValue >= i15) {
                i14 = e0Var2.e(i15 - 1, false);
            } else {
                i14 = e0Var2.e(intValue, false);
            }
        }
        int i16 = this.f23829c;
        if (i12 == i16) {
            return oVar.a(i14);
        }
        if (i14 == i16) {
            return oVar.a(i12);
        }
        if (!(z11 ^ z10) ? i10 >= i12 : i10 > i14) {
            i12 = i14;
        }
        return oVar.a(i12);
    }
}
