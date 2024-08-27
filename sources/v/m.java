package v;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.c3;
import m0.k1;
import r0.z0;
import x.o2;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37560a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f37561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f37565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f37566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f37567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f37568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i2.a aVar, Function0 function0, g1.o oVar, boolean z10, a0.l lVar, k1 k1Var, int i10, int i11) {
        super(2);
        this.f37565f = aVar;
        this.f37566g = function0;
        this.f37561b = oVar;
        this.f37562c = z10;
        this.f37567h = lVar;
        this.f37568i = k1Var;
        this.f37563d = i10;
        this.f37564e = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f37560a;
        int i12 = this.f37563d;
        Object obj = this.f37568i;
        Object obj2 = this.f37566g;
        Object obj3 = this.f37565f;
        Object obj4 = this.f37567h;
        switch (i11) {
            case 0:
                iu.j.d(this.f37562c, this.f37561b, (h0) obj3, (i0) obj2, (String) obj4, (hu.c) obj, nVar, t0.t.H0(i12 | 1), this.f37564e);
                return;
            case 1:
                m0.u0.c((i2.a) obj3, (Function0) obj2, this.f37561b, this.f37562c, (a0.l) obj4, (k1) obj, nVar, t0.t.H0(i12 | 1), this.f37564e);
                return;
            case 2:
                ((c3) obj3).a(this.f37562c, (Function0) obj2, this.f37561b, (o2) obj4, (hu.c) obj, nVar, t0.t.H0(i12 | 1), this.f37564e);
                return;
            case 3:
                al.d.e((Function0) obj3, this.f37561b, this.f37562c, (z0) obj2, (a0.l) obj4, (Function2) obj, nVar, t0.t.H0(i12 | 1), this.f37564e);
                return;
            default:
                yk.j.t((String) obj4, (j2.e) obj3, (String) obj2, (q1.b) obj, this.f37562c, this.f37561b, nVar, t0.t.H0(i12 | 1), this.f37564e);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f37560a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, j2.e eVar, String str2, q1.b bVar, boolean z10, g1.o oVar, int i10, int i11) {
        super(2);
        this.f37567h = str;
        this.f37565f = eVar;
        this.f37566g = str2;
        this.f37568i = bVar;
        this.f37562c = z10;
        this.f37561b = oVar;
        this.f37563d = i10;
        this.f37564e = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Function0 function0, g1.o oVar, boolean z10, z0 z0Var, a0.l lVar, Function2 function2, int i10, int i11) {
        super(2);
        this.f37565f = function0;
        this.f37561b = oVar;
        this.f37562c = z10;
        this.f37566g = z0Var;
        this.f37567h = lVar;
        this.f37568i = function2;
        this.f37563d = i10;
        this.f37564e = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c3 c3Var, boolean z10, Function0 function0, g1.o oVar, o2 o2Var, hu.c cVar, int i10, int i11) {
        super(2);
        this.f37565f = c3Var;
        this.f37562c = z10;
        this.f37566g = function0;
        this.f37561b = oVar;
        this.f37567h = o2Var;
        this.f37568i = cVar;
        this.f37563d = i10;
        this.f37564e = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, g1.o oVar, h0 h0Var, i0 i0Var, String str, hu.c cVar, int i10, int i11) {
        super(2);
        this.f37562c = z10;
        this.f37561b = oVar;
        this.f37565f = h0Var;
        this.f37566g = i0Var;
        this.f37567h = str;
        this.f37568i = cVar;
        this.f37563d = i10;
        this.f37564e = i11;
    }
}
