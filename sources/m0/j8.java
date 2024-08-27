package m0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j8 extends iu.k implements hu.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f26352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f26353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f26355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f26357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f26358g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function2 f26359h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u8 f26360i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f26361j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f26362k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0.h1 f26363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f26364m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function2 f26365n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(Function2 function2, Function2 function22, String str, s1 s1Var, boolean z10, boolean z11, a0.k kVar, Function2 function23, Function2 function24, u8 u8Var, Function2 function25, boolean z12, b0.h1 h1Var, boolean z13, Function2 function26) {
        super(6);
        this.f26352a = function2;
        this.f26353b = function22;
        this.f26354c = str;
        this.f26355d = s1Var;
        this.f26356e = z10;
        this.f26357f = z11;
        this.f26358g = function23;
        this.f26359h = function24;
        this.f26360i = u8Var;
        this.f26361j = function25;
        this.f26362k = z12;
        this.f26363l = h1Var;
        this.f26364m = z13;
        this.f26365n = function26;
    }

    @Override // hu.e
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Integer num) {
        int i10;
        b1.c cVar;
        b1.c cVar2;
        long j10;
        b1.c cVar3;
        long j11;
        b1.c cVar4;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        float floatValue = ((Number) obj).floatValue();
        long j12 = ((n1.t) obj2).f28179a;
        long j13 = ((n1.t) obj3).f28179a;
        float floatValue2 = ((Number) obj4).floatValue();
        t0.n nVar = (t0.n) obj5;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            if (((t0.r) nVar).e(floatValue)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 48) == 0) {
            if (((t0.r) nVar).g(j12)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((intValue & 384) == 0) {
            if (((t0.r) nVar).g(j13)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((intValue & 3072) == 0) {
            if (((t0.r) nVar).e(floatValue2)) {
                i11 = 2048;
            } else {
                i11 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i10 |= i11;
        }
        int i15 = i10;
        if ((i15 & 9363) == 9362) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        Function2 function2 = this.f26352a;
        if (function2 != null) {
            cVar = b1.d.b(nVar, 362863774, new h8(floatValue, j13, function2, this.f26364m, j12));
        } else {
            cVar = null;
        }
        Function2 function22 = this.f26353b;
        boolean z11 = this.f26356e;
        s1 s1Var = this.f26355d;
        if (function22 != null && this.f26354c.length() == 0 && floatValue2 > s0.g.f34069a) {
            cVar2 = b1.d.b(nVar, 1120552650, new i8(floatValue2, s1Var, z11, function22));
        } else {
            cVar2 = null;
        }
        s1Var.getClass();
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-1519634405);
        boolean z12 = this.f26357f;
        if (!z11) {
            j10 = s1Var.f26766j;
        } else if (z12) {
            j10 = s1Var.f26767k;
        } else {
            j10 = s1Var.f26765i;
        }
        t0.g1 r02 = t0.t.r0(new n1.t(j10), rVar2);
        rVar2.s(false);
        long j14 = ((n1.t) r02.getValue()).f28179a;
        int i16 = 1;
        Function2 function23 = this.f26358g;
        if (function23 != null) {
            cVar3 = b1.d.b(nVar, 1505327088, new l3(j14, function23, i16));
        } else {
            cVar3 = null;
        }
        rVar2.b0(1383318157);
        if (!z11) {
            j11 = s1Var.f26769m;
        } else if (z12) {
            j11 = s1Var.f26770n;
        } else {
            j11 = s1Var.f26768l;
        }
        t0.g1 r03 = t0.t.r0(new n1.t(j11), rVar2);
        rVar2.s(false);
        long j15 = ((n1.t) r03.getValue()).f28179a;
        Function2 function24 = this.f26359h;
        if (function24 != null) {
            cVar4 = b1.d.b(nVar, -1894727196, new l3(j15, function24, 2));
        } else {
            cVar4 = null;
        }
        int ordinal = this.f26360i.ordinal();
        g1.l lVar = g1.l.f16404b;
        if (ordinal != 0) {
            if (ordinal != 1) {
                rVar2.b0(-1083195535);
                rVar2.s(false);
            } else {
                Object g10 = v.e.g(rVar2, -1083197009, -1083196940);
                to.e eVar = t0.m.f35080a;
                if (g10 == eVar) {
                    g10 = t0.t.n0(new m1.f(m1.f.f27251b), t0.o3.f35116a);
                    rVar2.k0(g10);
                }
                t0.g1 g1Var = (t0.g1) g10;
                rVar2.s(false);
                b1.c b10 = b1.d.b(rVar2, 139886979, new o0(2, g1Var, this.f26363l, this.f26365n));
                Function2 function25 = this.f26361j;
                boolean z13 = this.f26362k;
                rVar2.b0(-1083196145);
                if ((i15 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object Q = rVar2.Q();
                if (z10 || Q == eVar) {
                    Q = new s4(floatValue, g1Var, 1);
                    rVar2.k0(Q);
                }
                rVar2.s(false);
                f5.b(lVar, function25, cVar2, cVar, cVar3, cVar4, z13, floatValue, (Function1) Q, b10, this.f26363l, rVar2, 805306374 | ((i15 << 21) & 29360128), 0);
                rVar2.s(false);
            }
        } else {
            rVar2.b0(-1083197552);
            p8.b(lVar, this.f26361j, cVar, cVar2, cVar3, cVar4, this.f26362k, floatValue, this.f26363l, rVar2, ((i15 << 21) & 29360128) | 6);
            rVar2.s(false);
        }
        return Unit.f23355a;
    }
}
