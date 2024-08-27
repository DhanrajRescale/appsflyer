package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26610a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f26612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f26617h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f26618i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f26619j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f26620k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f26621l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f26622m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(String str, String str2, String str3, boolean z10, String str4, hb.b bVar, String str5, String str6, hb.b0 b0Var, g1.o oVar, int i10, int i11) {
        super(2);
        this.f26611b = str;
        this.f26617h = str2;
        this.f26621l = str3;
        this.f26613d = z10;
        this.f26614e = str4;
        this.f26615f = bVar;
        this.f26622m = str5;
        this.f26616g = str6;
        this.f26618i = b0Var;
        this.f26612c = oVar;
        this.f26619j = i10;
        this.f26620k = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26610a;
        int i12 = this.f26619j;
        Object obj = this.f26618i;
        Object obj2 = this.f26616g;
        Object obj3 = this.f26622m;
        Object obj4 = this.f26615f;
        Object obj5 = this.f26614e;
        Object obj6 = this.f26621l;
        Object obj7 = this.f26617h;
        Object obj8 = this.f26611b;
        switch (i11) {
            case 0:
                pp.b.a((Function0) obj8, this.f26612c, this.f26613d, (a0.l) obj7, (j1) obj6, (n1.x0) obj5, (x.d0) obj4, (f1) obj3, (b0.h1) obj2, (hu.c) obj, nVar, t0.t.H0(i12 | 1), this.f26620k);
                return;
            case 1:
                dp.b.e((Function0) obj8, this.f26612c, this.f26613d, (n1.x0) obj5, (r0.y) obj6, (r0.c0) obj3, (x.d0) obj4, (b0.h1) obj2, (a0.l) obj7, (hu.c) obj, nVar, t0.t.H0(i12 | 1), this.f26620k);
                return;
            default:
                kp.j.n((String) obj8, (String) obj7, (String) obj6, this.f26613d, (String) obj5, (hb.b) obj4, (String) obj3, (String) obj2, (hb.b0) obj, this.f26612c, nVar, t0.t.H0(i12 | 1), this.f26620k);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26610a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Function0 function0, g1.o oVar, boolean z10, a0.l lVar, j1 j1Var, n1.x0 x0Var, x.d0 d0Var, f1 f1Var, b0.h1 h1Var, hu.c cVar, int i10, int i11) {
        super(2);
        this.f26611b = function0;
        this.f26612c = oVar;
        this.f26613d = z10;
        this.f26617h = lVar;
        this.f26621l = j1Var;
        this.f26614e = x0Var;
        this.f26615f = d0Var;
        this.f26622m = f1Var;
        this.f26616g = h1Var;
        this.f26618i = cVar;
        this.f26619j = i10;
        this.f26620k = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Function0 function0, g1.o oVar, boolean z10, n1.x0 x0Var, r0.y yVar, r0.c0 c0Var, x.d0 d0Var, b0.h1 h1Var, a0.l lVar, hu.c cVar, int i10, int i11) {
        super(2);
        this.f26611b = function0;
        this.f26612c = oVar;
        this.f26613d = z10;
        this.f26614e = x0Var;
        this.f26621l = yVar;
        this.f26622m = c0Var;
        this.f26615f = d0Var;
        this.f26616g = h1Var;
        this.f26617h = lVar;
        this.f26618i = cVar;
        this.f26619j = i10;
        this.f26620k = i11;
    }
}
