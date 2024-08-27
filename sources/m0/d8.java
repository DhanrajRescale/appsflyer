package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d8 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26056a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f26058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p2.l0 f26059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f26060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f26061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f26062g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f26063h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f26064i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f26065j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f26066k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.k f26067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0.h1 f26068m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s1 f26069n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function2 f26070o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f26071p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f26072q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f26073r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f26074s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(g8 g8Var, String str, Function2 function2, boolean z10, boolean z11, p2.l0 l0Var, a0.k kVar, boolean z12, Function2 function22, Function2 function23, Function2 function24, Function2 function25, s1 s1Var, b0.h1 h1Var, Function2 function26, int i10, int i11, int i12) {
        super(2);
        this.f26074s = g8Var;
        this.f26057b = str;
        this.f26058c = function2;
        this.f26064i = z10;
        this.f26065j = z11;
        this.f26059d = l0Var;
        this.f26067l = kVar;
        this.f26066k = z12;
        this.f26060e = function22;
        this.f26061f = function23;
        this.f26062g = function24;
        this.f26063h = function25;
        this.f26069n = s1Var;
        this.f26068m = h1Var;
        this.f26070o = function26;
        this.f26071p = i10;
        this.f26072q = i11;
        this.f26073r = i12;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f26056a;
        int i12 = this.f26072q;
        int i13 = this.f26071p;
        Object obj = this.f26074s;
        switch (i11) {
            case 0:
                ((g8) obj).b(this.f26057b, this.f26058c, this.f26064i, this.f26065j, this.f26059d, this.f26067l, this.f26066k, this.f26060e, this.f26061f, this.f26062g, this.f26063h, this.f26069n, this.f26068m, this.f26070o, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f26073r);
                return;
            default:
                m8.a((u8) obj, this.f26057b, this.f26058c, this.f26059d, this.f26060e, this.f26061f, this.f26062g, this.f26063h, this.f26064i, this.f26065j, this.f26066k, this.f26067l, this.f26068m, this.f26069n, this.f26070o, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f26073r);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26056a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(u8 u8Var, String str, Function2 function2, p2.l0 l0Var, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z10, boolean z11, boolean z12, a0.k kVar, b0.h1 h1Var, s1 s1Var, Function2 function26, int i10, int i11, int i12) {
        super(2);
        this.f26074s = u8Var;
        this.f26057b = str;
        this.f26058c = function2;
        this.f26059d = l0Var;
        this.f26060e = function22;
        this.f26061f = function23;
        this.f26062g = function24;
        this.f26063h = function25;
        this.f26064i = z10;
        this.f26065j = z11;
        this.f26066k = z12;
        this.f26067l = kVar;
        this.f26068m = h1Var;
        this.f26069n = s1Var;
        this.f26070o = function26;
        this.f26071p = i10;
        this.f26072q = i11;
        this.f26073r = i12;
    }
}
