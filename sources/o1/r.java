package o1;

import i5.w;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends d {

    /* renamed from: r, reason: collision with root package name */
    public static final w f29424r = new w(7);

    /* renamed from: d, reason: collision with root package name */
    public final t f29425d;

    /* renamed from: e, reason: collision with root package name */
    public final float f29426e;

    /* renamed from: f, reason: collision with root package name */
    public final float f29427f;

    /* renamed from: g, reason: collision with root package name */
    public final s f29428g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f29429h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f29430i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f29431j;

    /* renamed from: k, reason: collision with root package name */
    public final j f29432k;

    /* renamed from: l, reason: collision with root package name */
    public final q f29433l;

    /* renamed from: m, reason: collision with root package name */
    public final n f29434m;

    /* renamed from: n, reason: collision with root package name */
    public final j f29435n;

    /* renamed from: o, reason: collision with root package name */
    public final q f29436o;

    /* renamed from: p, reason: collision with root package name */
    public final n f29437p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f29438q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0217, code lost:
    
        if (mt.p.t(r3[4] - r3[0], r3[5] - r3[1], r13[4], r13[5]) >= s0.g.f34069a) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(java.lang.String r33, float[] r34, o1.t r35, float[] r36, o1.j r37, o1.j r38, float r39, float r40, o1.s r41, int r42) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.r.<init>(java.lang.String, float[], o1.t, float[], o1.j, o1.j, float, float, o1.s, int):void");
    }

    @Override // o1.d
    public final float a(int i10) {
        return this.f29427f;
    }

    @Override // o1.d
    public final float b(int i10) {
        return this.f29426e;
    }

    @Override // o1.d
    public final boolean c() {
        return this.f29438q;
    }

    @Override // o1.d
    public final long d(float f10, float f11, float f12) {
        double d10 = f10;
        n nVar = this.f29437p;
        float h10 = (float) nVar.h(d10);
        float h11 = (float) nVar.h(f11);
        float h12 = (float) nVar.h(f12);
        float[] fArr = this.f29430i;
        float f13 = (fArr[6] * h12) + (fArr[3] * h11) + (fArr[0] * h10);
        float f14 = (fArr[7] * h12) + (fArr[4] * h11) + (fArr[1] * h10);
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // o1.d
    public final float e(float f10, float f11, float f12) {
        double d10 = f10;
        n nVar = this.f29437p;
        float h10 = (float) nVar.h(d10);
        float h11 = (float) nVar.h(f11);
        float h12 = (float) nVar.h(f12);
        float[] fArr = this.f29430i;
        return (fArr[8] * h12) + (fArr[5] * h11) + (fArr[2] * h10);
    }

    @Override // o1.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        if (Float.compare(rVar.f29426e, this.f29426e) != 0 || Float.compare(rVar.f29427f, this.f29427f) != 0 || !Intrinsics.a(this.f29425d, rVar.f29425d) || !Arrays.equals(this.f29429h, rVar.f29429h)) {
            return false;
        }
        s sVar = rVar.f29428g;
        s sVar2 = this.f29428g;
        if (sVar2 != null) {
            return Intrinsics.a(sVar2, sVar);
        }
        if (sVar == null) {
            return true;
        }
        if (!Intrinsics.a(this.f29432k, rVar.f29432k)) {
            return false;
        }
        return Intrinsics.a(this.f29435n, rVar.f29435n);
    }

    @Override // o1.d
    public final long f(float f10, float f11, float f12, float f13, d dVar) {
        float[] fArr = this.f29431j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        n nVar = this.f29434m;
        return androidx.compose.ui.graphics.a.b((float) nVar.h(f14), (float) nVar.h(f15), (float) nVar.h(f16), f13, dVar);
    }

    @Override // o1.d
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.f29429h) + ((this.f29425d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f29426e;
        int i10 = 0;
        if (f10 == s0.g.f34069a) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f10);
        }
        int i11 = (hashCode + floatToIntBits) * 31;
        float f11 = this.f29427f;
        if (f11 == s0.g.f34069a) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f11);
        }
        int i12 = (i11 + floatToIntBits2) * 31;
        s sVar = this.f29428g;
        if (sVar != null) {
            i10 = sVar.hashCode();
        }
        int i13 = i12 + i10;
        if (sVar == null) {
            return this.f29435n.hashCode() + ((this.f29432k.hashCode() + (i13 * 31)) * 31);
        }
        return i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(java.lang.String r12, float[] r13, o1.t r14, final o1.s r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            r4 = 0
            double r0 = r9.f29444f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            double r5 = r9.f29445g
            if (r0 != 0) goto L18
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            o1.o r1 = new o1.o
            r7 = 0
            r1.<init>()
        L16:
            r7 = r1
            goto L1f
        L18:
            o1.o r1 = new o1.o
            r7 = 1
            r1.<init>()
            goto L16
        L1f:
            if (r0 != 0) goto L2d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L2d
            o1.o r0 = new o1.o
            r1 = 2
            r0.<init>()
        L2b:
            r6 = r0
            goto L34
        L2d:
            o1.o r0 = new o1.o
            r1 = 3
            r0.<init>()
            goto L2b
        L34:
            r8 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r7
            r7 = r8
            r8 = r10
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.r.<init>(java.lang.String, float[], o1.t, o1.s, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o1.p] */
    /* JADX WARN: Type inference failed for: r4v0, types: [o1.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(java.lang.String r16, float[] r17, o1.t r18, final double r19, float r21, float r22, int r23) {
        /*
            r15 = this;
            r1 = r19
            r11 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            i5.w r3 = o1.r.f29424r
            if (r0 != 0) goto Ld
            r12 = r3
            goto L14
        Ld:
            o1.p r4 = new o1.p
            r5 = 0
            r4.<init>()
            r12 = r4
        L14:
            if (r0 != 0) goto L18
            r13 = r3
            goto L1f
        L18:
            o1.p r0 = new o1.p
            r3 = 1
            r0.<init>()
            r13 = r0
        L1f:
            o1.s r14 = new o1.s
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r0 = r14
            r1 = r19
            r0.<init>(r1, r3, r5, r7, r9)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r21
            r8 = r22
            r9 = r14
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.r.<init>(java.lang.String, float[], o1.t, double, float, float, int):void");
    }
}
