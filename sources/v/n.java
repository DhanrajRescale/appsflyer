package v;

import b0.p1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f37571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f37572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f37573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f37574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f37575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37576h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f37577i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f37578j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, boolean z10, g1.o oVar, h0 h0Var, i0 i0Var, String str, hu.c cVar, int i10, int i11, int i12) {
        super(2);
        this.f37569a = i12;
        this.f37578j = obj;
        this.f37570b = z10;
        this.f37571c = oVar;
        this.f37572d = h0Var;
        this.f37573e = i0Var;
        this.f37574f = str;
        this.f37575g = cVar;
        this.f37576h = i10;
        this.f37577i = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f37569a;
        int i12 = this.f37576h;
        Object obj = this.f37578j;
        switch (i11) {
            case 0:
                iu.j.c((p1) obj, this.f37570b, this.f37571c, this.f37572d, this.f37573e, this.f37574f, this.f37575g, nVar, t0.t.H0(i12 | 1), this.f37577i);
                return;
            default:
                iu.j.b((b0.z) obj, this.f37570b, this.f37571c, this.f37572d, this.f37573e, this.f37574f, this.f37575g, nVar, t0.t.H0(i12 | 1), this.f37577i);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f37569a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
