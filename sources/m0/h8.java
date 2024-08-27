package m0;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h8 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f26257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f26259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(float f10, long j10, Function2 function2, boolean z10, long j11) {
        super(2);
        this.f26257a = f10;
        this.f26258b = j10;
        this.f26259c = function2;
        this.f26260d = z10;
        this.f26261e = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f10;
        j2.w wVar;
        j2.g0 g0Var;
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        t0.m3 m3Var = d9.f26076b;
        t0.r rVar2 = (t0.r) nVar;
        j2.g0 g0Var2 = ((c9) rVar2.m(m3Var)).f26016g;
        j2.g0 g0Var3 = ((c9) rVar2.m(m3Var)).f26021l;
        j2.b0 b0Var = g0Var2.f20722a;
        j2.b0 b0Var2 = g0Var3.f20722a;
        int i10 = j2.c0.f20684e;
        u2.n nVar2 = b0Var.f20659a;
        u2.n nVar3 = b0Var2.f20659a;
        boolean z10 = nVar2 instanceof u2.b;
        u2.n nVar4 = u2.l.f36689a;
        float f11 = this.f26257a;
        if (!z10 && !(nVar3 instanceof u2.b)) {
            long s7 = androidx.compose.ui.graphics.a.s(nVar2.a(), nVar3.a(), f11);
            if (s7 != 16) {
                nVar4 = new u2.c(s7);
            }
        } else if (z10 && (nVar3 instanceof u2.b)) {
            n1.p pVar = (n1.p) j2.c0.b(f11, ((u2.b) nVar2).f36668a, ((u2.b) nVar3).f36668a);
            float z02 = hl.f.z0(nVar2.c(), nVar3.c(), f11);
            if (pVar != null) {
                if (pVar instanceof n1.z0) {
                    long h12 = yk.j.h1(((n1.z0) pVar).f28221a, z02);
                    if (h12 != 16) {
                        nVar4 = new u2.c(h12);
                    }
                } else if (pVar instanceof n1.v0) {
                    nVar4 = new u2.b((n1.v0) pVar, z02);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            nVar4 = (u2.n) j2.c0.b(f11, nVar2, nVar3);
        }
        u2.n nVar5 = nVar4;
        o2.s sVar = (o2.s) j2.c0.b(f11, b0Var.f20664f, b0Var2.f20664f);
        long c10 = j2.c0.c(b0Var.f20660b, b0Var2.f20660b, f11);
        o2.d0 d0Var = b0Var.f20661c;
        if (d0Var == null) {
            d0Var = o2.d0.f29464f;
        }
        o2.d0 d0Var2 = b0Var2.f20661c;
        if (d0Var2 == null) {
            d0Var2 = o2.d0.f29464f;
        }
        o2.d0 d0Var3 = new o2.d0(kotlin.ranges.d.f(hl.f.A0(d0Var.f29469a, f11, d0Var2.f29469a), 1, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
        o2.z zVar = (o2.z) j2.c0.b(f11, b0Var.f20662d, b0Var2.f20662d);
        o2.a0 a0Var = (o2.a0) j2.c0.b(f11, b0Var.f20663e, b0Var2.f20663e);
        String str = (String) j2.c0.b(f11, b0Var.f20665g, b0Var2.f20665g);
        long c11 = j2.c0.c(b0Var.f20666h, b0Var2.f20666h, f11);
        float f12 = s0.g.f34069a;
        u2.a aVar = b0Var.f20667i;
        if (aVar != null) {
            f10 = aVar.f36667a;
        } else {
            f10 = 0.0f;
        }
        u2.a aVar2 = b0Var2.f20667i;
        if (aVar2 != null) {
            f12 = aVar2.f36667a;
        }
        float z03 = hl.f.z0(f10, f12, f11);
        u2.o oVar = u2.o.f36692c;
        u2.o oVar2 = b0Var.f20668j;
        if (oVar2 == null) {
            oVar2 = oVar;
        }
        u2.o oVar3 = b0Var2.f20668j;
        if (oVar3 != null) {
            oVar = oVar3;
        }
        u2.o oVar4 = new u2.o(hl.f.z0(oVar2.f36693a, oVar.f36693a, f11), hl.f.z0(oVar2.f36694b, oVar.f36694b, f11));
        q2.d dVar = (q2.d) j2.c0.b(f11, b0Var.f20669k, b0Var2.f20669k);
        long s10 = androidx.compose.ui.graphics.a.s(b0Var.f20670l, b0Var2.f20670l, f11);
        u2.j jVar = (u2.j) j2.c0.b(f11, b0Var.f20671m, b0Var2.f20671m);
        n1.w0 w0Var = b0Var.f20672n;
        if (w0Var == null) {
            w0Var = new n1.w0();
        }
        n1.w0 w0Var2 = b0Var2.f20672n;
        if (w0Var2 == null) {
            w0Var2 = new n1.w0();
        }
        long s11 = androidx.compose.ui.graphics.a.s(w0Var.f28205a, w0Var2.f28205a, f11);
        long j10 = w0Var.f28206b;
        j2.v vVar = null;
        if (j10 != 9205357640488583168L) {
            long j11 = w0Var2.f28206b;
            if (j11 != 9205357640488583168L) {
                n1.w0 w0Var3 = new n1.w0(s11, t0.t.g(hl.f.z0(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f11), hl.f.z0(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f11)), hl.f.z0(w0Var.f28207c, w0Var2.f28207c, f11));
                j2.w wVar2 = b0Var.f20673o;
                if (wVar2 == null && b0Var2.f20673o == null) {
                    wVar = null;
                } else {
                    if (wVar2 == null) {
                        wVar2 = j2.w.f20771a;
                    }
                    wVar = wVar2;
                }
                j2.b0 b0Var3 = new j2.b0(nVar5, c10, d0Var3, zVar, a0Var, sVar, str, c11, new u2.a(z03), oVar4, dVar, s10, jVar, w0Var3, wVar, (p1.i) j2.c0.b(f11, b0Var.f20674p, b0Var2.f20674p));
                int i11 = j2.t.f20765b;
                j2.s sVar2 = g0Var2.f20723b;
                u2.i iVar = new u2.i(sVar2.f20755a);
                j2.s sVar3 = g0Var3.f20723b;
                int i12 = ((u2.i) j2.c0.b(f11, iVar, new u2.i(sVar3.f20755a))).f36683a;
                int i13 = ((u2.k) j2.c0.b(f11, new u2.k(sVar2.f20756b), new u2.k(sVar3.f20756b))).f36688a;
                long c12 = j2.c0.c(sVar2.f20757c, sVar3.f20757c, f11);
                u2.p pVar2 = sVar2.f20758d;
                if (pVar2 == null) {
                    pVar2 = u2.p.f36695c;
                }
                u2.p pVar3 = sVar3.f20758d;
                if (pVar3 == null) {
                    pVar3 = u2.p.f36695c;
                }
                u2.p pVar4 = new u2.p(j2.c0.c(pVar2.f36696a, pVar3.f36696a, f11), j2.c0.c(pVar2.f36697b, pVar3.f36697b, f11));
                j2.v vVar2 = sVar2.f20759e;
                j2.v vVar3 = sVar3.f20759e;
                if (vVar2 != null || vVar3 != null) {
                    j2.v vVar4 = j2.v.f20768c;
                    if (vVar2 == null) {
                        vVar2 = vVar4;
                    }
                    if (vVar3 == null) {
                        vVar3 = vVar4;
                    }
                    boolean z11 = vVar2.f20769a;
                    boolean z12 = vVar3.f20769a;
                    if (z11 == z12) {
                        vVar = vVar2;
                    } else {
                        vVar = new j2.v(((j2.h) j2.c0.b(f11, new j2.h(vVar2.f20770b), new j2.h(vVar3.f20770b))).f20725a, ((Boolean) j2.c0.b(f11, Boolean.valueOf(z11), Boolean.valueOf(z12))).booleanValue());
                    }
                }
                j2.g0 g0Var4 = new j2.g0(b0Var3, new j2.s(i12, i13, c12, pVar4, vVar, (u2.g) j2.c0.b(f11, sVar2.f20760f, sVar3.f20760f), ((u2.e) j2.c0.b(f11, new u2.e(sVar2.f20761g), new u2.e(sVar3.f20761g))).f36673a, ((u2.d) j2.c0.b(f11, new u2.d(sVar2.f20762h), new u2.d(sVar3.f20762h))).f36671a, (u2.q) j2.c0.b(f11, sVar2.f20763i, sVar3.f20763i)));
                long j12 = this.f26261e;
                if (this.f26260d) {
                    g0Var = j2.g0.a(0, 16777214, j12, 0L, 0L, 0L, null, g0Var4, null, null, null);
                } else {
                    g0Var = g0Var4;
                }
                m8.b(this.f26258b, g0Var, null, this.f26259c, nVar, 384, 0);
                return Unit.f23355a;
            }
        }
        t0.t.B0("Offset is unspecified");
        throw null;
    }
}
