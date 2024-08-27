package x;

import android.text.Layout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import t0.l3;

/* loaded from: classes.dex */
public final class a0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f39490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j10, float[] fArr, iu.x xVar, iu.w wVar) {
        super(1);
        this.f39489a = 2;
        this.f39490b = j10;
        this.f39491c = fArr;
        this.f39492d = xVar;
        this.f39493e = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int e10;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        float a10;
        float f10;
        int i11 = this.f39489a;
        Object obj2 = this.f39493e;
        Object obj3 = this.f39492d;
        Object obj4 = this.f39491c;
        switch (i11) {
            case 0:
                c2.j0 j0Var = (c2.j0) ((p1.e) obj);
                j0Var.a();
                m1.d dVar = (m1.d) obj4;
                float f11 = dVar.f27239a;
                long j10 = this.f39490b;
                n1.u uVar = (n1.u) obj2;
                p1.c cVar = j0Var.f7740a;
                p1.d dVar2 = cVar.f30501b.f30498a;
                float f12 = dVar.f27240b;
                dVar2.d(f11, f12);
                p1.h.z0(j0Var, (n1.h0) ((iu.z) obj3).f20560a, 0L, j10, 0L, 0L, s0.g.f34069a, uVar, 0, 890);
                cVar.f30501b.f30498a.d(-f11, -f12);
                return Unit.f23355a;
            case 1:
                p1.h hVar = (p1.h) obj;
                p0.o oVar = (p0.o) obj4;
                float a11 = oVar.a() / oVar.b();
                float f13 = p0.h.f30458a;
                float max = (Math.max(Math.min(1.0f, a11) - 0.4f, s0.g.f34069a) * 5) / 3;
                float abs = Math.abs(a11) - 1.0f;
                if (abs < s0.g.f34069a) {
                    abs = 0.0f;
                }
                if (abs > 2.0f) {
                    abs = 2.0f;
                }
                float pow = (((0.4f * max) - 0.25f) + (abs - (((float) Math.pow(abs, 2)) / 4))) * 0.5f;
                float f14 = 360;
                float f15 = pow * f14;
                float f16 = ((0.8f * max) + pow) * f14;
                float min = Math.min(1.0f, max);
                float floatValue = ((Number) ((l3) obj3).getValue()).floatValue();
                long j11 = this.f39490b;
                long p02 = hVar.p0();
                p1.b f02 = hVar.f0();
                long b10 = f02.b();
                f02.a().h();
                f02.f30498a.b(p02, pow);
                float c02 = hVar.c0(p0.h.f30460c);
                float f17 = p0.h.f30461d;
                float c03 = (hVar.c0(f17) / 2.0f) + c02;
                float d10 = m1.c.d(t0.t.U(hVar.d())) - c03;
                float e11 = m1.c.e(t0.t.U(hVar.d())) - c03;
                m1.d dVar3 = new m1.d(d10, e11, m1.c.d(t0.t.U(hVar.d())) + c03, m1.c.e(t0.t.U(hVar.d())) + c03);
                p1.h.y0(hVar, j11, f15, f16 - f15, t0.t.g(d10, e11), t0.t.j(dVar3.c(), dVar3.b()), floatValue, new p1.m(hVar.c0(f17), s0.g.f34069a, 2, 0, null, 26), 768);
                n1.h hVar2 = (n1.h) ((n1.p0) obj2);
                hVar2.h();
                hVar2.f(s0.g.f34069a, s0.g.f34069a);
                float f18 = p0.h.f30462e;
                hVar2.e(hVar.c0(f18) * min, s0.g.f34069a);
                hVar2.e((hVar.c0(f18) * min) / 2, hVar.c0(p0.h.f30463f) * min);
                hVar2.j(t0.t.g((m1.c.d(dVar3.a()) + (Math.min(dVar3.c(), dVar3.b()) / 2.0f)) - ((hVar.c0(f18) * min) / 2.0f), (hVar.c0(f17) / 2.0f) + m1.c.e(dVar3.a())));
                hVar2.c();
                long p03 = hVar.p0();
                p1.b f03 = hVar.f0();
                long b11 = f03.b();
                f03.a().h();
                f03.f30498a.b(p03, f16);
                p1.h.C(hVar, hVar2, j11, floatValue, null, 56);
                f03.a().s();
                f03.c(b11);
                f02.a().s();
                f02.c(b10);
                return Unit.f23355a;
            default:
                j2.p pVar = (j2.p) obj;
                float[] fArr = (float[]) obj4;
                iu.x xVar = (iu.x) obj3;
                iu.w wVar = (iu.w) obj2;
                int i12 = pVar.f20746b;
                long j12 = this.f39490b;
                if (i12 > j2.f0.e(j12)) {
                    e10 = pVar.f20746b;
                } else {
                    e10 = j2.f0.e(j12);
                }
                int d11 = j2.f0.d(j12);
                int i13 = pVar.f20747c;
                if (i13 >= d11) {
                    i13 = j2.f0.d(j12);
                }
                long b12 = d2.w0.b(pVar.a(e10), pVar.a(i13));
                int i14 = xVar.f20558a;
                j2.a aVar = (j2.a) pVar.f20745a;
                aVar.getClass();
                int e12 = j2.f0.e(b12);
                int d12 = j2.f0.d(b12);
                k2.t tVar = aVar.f20630d;
                Layout layout = tVar.f21964d;
                int length = layout.getText().length();
                if (e12 >= 0) {
                    if (e12 < length) {
                        if (d12 > e12) {
                            if (d12 <= length) {
                                if (fArr.length - i14 >= (d12 - e12) * 4) {
                                    int lineForOffset = layout.getLineForOffset(e12);
                                    int lineForOffset2 = layout.getLineForOffset(d12 - 1);
                                    k2.d dVar4 = new k2.d(tVar);
                                    if (lineForOffset <= lineForOffset2) {
                                        while (true) {
                                            int lineStart = layout.getLineStart(lineForOffset);
                                            int i15 = i14;
                                            int e13 = tVar.e(lineForOffset);
                                            int max2 = Math.max(e12, lineStart);
                                            int min2 = Math.min(d12, e13);
                                            float f19 = tVar.f(lineForOffset);
                                            float d13 = tVar.d(lineForOffset);
                                            int i16 = e12;
                                            int i17 = d12;
                                            boolean z13 = false;
                                            if (layout.getParagraphDirection(lineForOffset) == 1) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            boolean z14 = !z10;
                                            int i18 = max2;
                                            int i19 = i15;
                                            while (i18 < min2) {
                                                boolean isRtlCharAt = layout.isRtlCharAt(i18);
                                                if (z10 && !isRtlCharAt) {
                                                    i10 = min2;
                                                    z11 = z10;
                                                    f10 = dVar4.a(i18, z13, z13, true);
                                                    z12 = false;
                                                    a10 = dVar4.a(i18 + 1, true, true, true);
                                                } else {
                                                    i10 = min2;
                                                    if (z10 && isRtlCharAt) {
                                                        z11 = z10;
                                                        a10 = dVar4.a(i18, false, false, false);
                                                        f10 = dVar4.a(i18 + 1, true, true, false);
                                                        z12 = false;
                                                    } else {
                                                        z11 = z10;
                                                        if (z14 && isRtlCharAt) {
                                                            float a12 = dVar4.a(i18, false, false, true);
                                                            f10 = dVar4.a(i18 + 1, true, true, true);
                                                            a10 = a12;
                                                            z12 = false;
                                                        } else {
                                                            z12 = false;
                                                            float a13 = dVar4.a(i18, false, false, false);
                                                            a10 = dVar4.a(i18 + 1, true, true, false);
                                                            f10 = a13;
                                                        }
                                                    }
                                                }
                                                fArr[i19] = f10;
                                                fArr[i19 + 1] = f19;
                                                fArr[i19 + 2] = a10;
                                                fArr[i19 + 3] = d13;
                                                i19 += 4;
                                                i18++;
                                                min2 = i10;
                                                z13 = z12;
                                                z10 = z11;
                                            }
                                            if (lineForOffset != lineForOffset2) {
                                                lineForOffset++;
                                                i14 = i19;
                                                e12 = i16;
                                                d12 = i17;
                                            }
                                        }
                                    }
                                    int c10 = (j2.f0.c(b12) * 4) + xVar.f20558a;
                                    for (int i20 = xVar.f20558a; i20 < c10; i20 += 4) {
                                        int i21 = i20 + 1;
                                        float f20 = fArr[i21];
                                        float f21 = wVar.f20557a;
                                        fArr[i21] = f20 + f21;
                                        int i22 = i20 + 3;
                                        fArr[i22] = fArr[i22] + f21;
                                    }
                                    xVar.f20558a = c10;
                                    wVar.f20557a = aVar.b() + wVar.f20557a;
                                    return Unit.f23355a;
                                }
                                throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                            }
                            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                        }
                        throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                    }
                    throw new IllegalArgumentException("startOffset must be less than text length".toString());
                }
                throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        super(1);
        this.f39489a = i10;
        this.f39491c = obj;
        this.f39492d = obj2;
        this.f39490b = j10;
        this.f39493e = obj3;
    }
}
