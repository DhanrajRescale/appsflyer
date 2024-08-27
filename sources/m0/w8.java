package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w8 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f27053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f27055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o2.z f27056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o2.d0 f27057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o2.s f27058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f27059i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.j f27060j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.i f27061k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f27062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f27063m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f27064n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f27065o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f27066p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function1 f27067q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j2.g0 f27068r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27069s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f27070t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27071u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, long j11, long j12, long j13, g1.o oVar, j2.g0 g0Var, o2.s sVar, o2.z zVar, o2.d0 d0Var, u2.i iVar, u2.j jVar, String str, Function1 function1, boolean z10) {
        super(2);
        this.f27051a = i16;
        this.f27052b = str;
        this.f27053c = oVar;
        this.f27054d = j10;
        this.f27055e = j11;
        this.f27056f = zVar;
        this.f27057g = d0Var;
        this.f27058h = sVar;
        this.f27059i = j12;
        this.f27060j = jVar;
        this.f27061k = iVar;
        this.f27062l = j13;
        this.f27063m = i10;
        this.f27064n = z10;
        this.f27065o = i11;
        this.f27066p = i12;
        this.f27067q = function1;
        this.f27068r = g0Var;
        this.f27069s = i13;
        this.f27070t = i14;
        this.f27071u = i15;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f27051a;
        int i12 = this.f27070t;
        int i13 = this.f27069s;
        switch (i11) {
            case 0:
                b9.b(this.f27052b, this.f27053c, this.f27054d, this.f27055e, this.f27056f, this.f27057g, this.f27058h, this.f27059i, this.f27060j, this.f27061k, this.f27062l, this.f27063m, this.f27064n, this.f27065o, this.f27066p, this.f27067q, this.f27068r, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f27071u);
                return;
            case 1:
                r0.n3.a(this.f27052b, this.f27053c, this.f27054d, this.f27055e, this.f27056f, this.f27057g, this.f27058h, this.f27059i, this.f27060j, this.f27061k, this.f27062l, this.f27063m, this.f27064n, this.f27065o, this.f27066p, this.f27067q, this.f27068r, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f27071u);
                return;
            default:
                al.d.C(this.f27052b, this.f27053c, this.f27054d, this.f27055e, this.f27056f, this.f27057g, this.f27058h, this.f27059i, this.f27060j, this.f27061k, this.f27062l, this.f27063m, this.f27064n, this.f27065o, this.f27066p, this.f27067q, this.f27068r, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f27071u);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27051a) {
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
}
