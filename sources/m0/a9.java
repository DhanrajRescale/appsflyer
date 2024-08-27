package m0;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a9 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2.e f25895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f25896c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o2.z f25899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o2.d0 f25900g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o2.s f25901h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f25902i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.j f25903j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.i f25904k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f25905l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f25906m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f25907n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f25908o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f25909p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Map f25910q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function1 f25911r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j2.g0 f25912s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f25913t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25914u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f25915v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(j2.e eVar, g1.o oVar, long j10, long j11, o2.z zVar, o2.d0 d0Var, o2.s sVar, long j12, u2.j jVar, u2.i iVar, long j13, int i10, boolean z10, int i11, int i12, Map map, Function1 function1, j2.g0 g0Var, int i13, int i14, int i15, int i16) {
        super(2);
        this.f25894a = i16;
        this.f25895b = eVar;
        this.f25896c = oVar;
        this.f25897d = j10;
        this.f25898e = j11;
        this.f25899f = zVar;
        this.f25900g = d0Var;
        this.f25901h = sVar;
        this.f25902i = j12;
        this.f25903j = jVar;
        this.f25904k = iVar;
        this.f25905l = j13;
        this.f25906m = i10;
        this.f25907n = z10;
        this.f25908o = i11;
        this.f25909p = i12;
        this.f25910q = map;
        this.f25911r = function1;
        this.f25912s = g0Var;
        this.f25913t = i13;
        this.f25914u = i14;
        this.f25915v = i15;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f25894a;
        int i12 = this.f25914u;
        int i13 = this.f25913t;
        switch (i11) {
            case 0:
                b9.c(this.f25895b, this.f25896c, this.f25897d, this.f25898e, this.f25899f, this.f25900g, this.f25901h, this.f25902i, this.f25903j, this.f25904k, this.f25905l, this.f25906m, this.f25907n, this.f25908o, this.f25909p, this.f25910q, this.f25911r, this.f25912s, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f25915v);
                return;
            default:
                r0.n3.b(this.f25895b, this.f25896c, this.f25897d, this.f25898e, this.f25899f, this.f25900g, this.f25901h, this.f25902i, this.f25903j, this.f25904k, this.f25905l, this.f25906m, this.f25907n, this.f25908o, this.f25909p, this.f25910q, this.f25911r, this.f25912s, nVar, t0.t.H0(i13 | 1), t0.t.H0(i12), this.f25915v);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25894a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
