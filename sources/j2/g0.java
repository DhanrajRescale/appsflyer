package j2;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.Intrinsics;
import n1.w0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f20721d = new g0(0, 0, null, null, 0, 0, null, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final b0 f20722a;

    /* renamed from: b, reason: collision with root package name */
    public final s f20723b;

    /* renamed from: c, reason: collision with root package name */
    public final x f20724c;

    public g0(b0 b0Var, s sVar, x xVar) {
        this.f20722a = b0Var;
        this.f20723b = sVar;
        this.f20724c = xVar;
    }

    public static g0 a(int i10, int i11, long j10, long j11, long j12, long j13, x xVar, g0 g0Var, o2.s sVar, o2.d0 d0Var, u2.g gVar) {
        long j14;
        long j15;
        o2.d0 d0Var2;
        o2.z zVar;
        o2.a0 a0Var;
        o2.s sVar2;
        String str;
        long j16;
        u2.a aVar;
        u2.o oVar;
        q2.d dVar;
        long j17;
        u2.j jVar;
        w0 w0Var;
        p1.i iVar;
        int i12;
        int i13;
        long j18;
        u2.p pVar;
        x xVar2;
        u2.g gVar2;
        int i14;
        int i15;
        u2.q qVar;
        u2.n nVar;
        x xVar3;
        w wVar;
        v vVar;
        if ((i11 & 1) != 0) {
            j14 = g0Var.f20722a.f20659a.a();
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            j15 = g0Var.f20722a.f20660b;
        } else {
            j15 = j11;
        }
        if ((i11 & 4) != 0) {
            d0Var2 = g0Var.f20722a.f20661c;
        } else {
            d0Var2 = d0Var;
        }
        if ((i11 & 8) != 0) {
            zVar = g0Var.f20722a.f20662d;
        } else {
            zVar = null;
        }
        if ((i11 & 16) != 0) {
            a0Var = g0Var.f20722a.f20663e;
        } else {
            a0Var = null;
        }
        if ((i11 & 32) != 0) {
            sVar2 = g0Var.f20722a.f20664f;
        } else {
            sVar2 = sVar;
        }
        if ((i11 & 64) != 0) {
            str = g0Var.f20722a.f20665g;
        } else {
            str = null;
        }
        if ((i11 & 128) != 0) {
            j16 = g0Var.f20722a.f20666h;
        } else {
            j16 = j12;
        }
        if ((i11 & 256) != 0) {
            aVar = g0Var.f20722a.f20667i;
        } else {
            aVar = null;
        }
        if ((i11 & 512) != 0) {
            oVar = g0Var.f20722a.f20668j;
        } else {
            oVar = null;
        }
        if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            dVar = g0Var.f20722a.f20669k;
        } else {
            dVar = null;
        }
        if ((i11 & 2048) != 0) {
            j17 = g0Var.f20722a.f20670l;
        } else {
            j17 = 0;
        }
        long j19 = j17;
        if ((i11 & 4096) != 0) {
            jVar = g0Var.f20722a.f20671m;
        } else {
            jVar = null;
        }
        if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            w0Var = g0Var.f20722a.f20672n;
        } else {
            w0Var = null;
        }
        if ((i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            iVar = g0Var.f20722a.f20674p;
        } else {
            iVar = null;
        }
        if ((32768 & i11) != 0) {
            i12 = g0Var.f20723b.f20755a;
        } else {
            i12 = i10;
        }
        if ((65536 & i11) != 0) {
            i13 = g0Var.f20723b.f20756b;
        } else {
            i13 = 0;
        }
        if ((131072 & i11) != 0) {
            j18 = g0Var.f20723b.f20757c;
        } else {
            j18 = j13;
        }
        if ((262144 & i11) != 0) {
            pVar = g0Var.f20723b.f20758d;
        } else {
            pVar = null;
        }
        if ((524288 & i11) != 0) {
            xVar2 = g0Var.f20724c;
        } else {
            xVar2 = xVar;
        }
        if ((i11 & 1048576) != 0) {
            gVar2 = g0Var.f20723b.f20760f;
        } else {
            gVar2 = gVar;
        }
        if ((2097152 & i11) != 0) {
            i14 = g0Var.f20723b.f20761g;
        } else {
            i14 = 0;
        }
        if ((4194304 & i11) != 0) {
            i15 = g0Var.f20723b.f20762h;
        } else {
            i15 = 0;
        }
        if ((i11 & 8388608) != 0) {
            qVar = g0Var.f20723b.f20763i;
        } else {
            qVar = null;
        }
        u2.q qVar2 = qVar;
        b0 b0Var = g0Var.f20722a;
        int i16 = i12;
        u2.p pVar2 = pVar;
        if (n1.t.d(j14, b0Var.f20659a.a())) {
            nVar = b0Var.f20659a;
        } else if (j14 != 16) {
            nVar = new u2.c(j14);
        } else {
            nVar = u2.l.f36689a;
        }
        u2.n nVar2 = nVar;
        if (xVar2 != null) {
            wVar = xVar2.f20772a;
            xVar3 = xVar2;
        } else {
            xVar3 = xVar2;
            wVar = null;
        }
        b0 b0Var2 = new b0(nVar2, j15, d0Var2, zVar, a0Var, sVar2, str, j16, aVar, oVar, dVar, j19, jVar, w0Var, wVar, iVar);
        if (xVar3 != null) {
            vVar = xVar3.f20773b;
        } else {
            vVar = null;
        }
        return new g0(b0Var2, new s(i16, i13, j18, pVar2, vVar, gVar2, i14, i15, qVar2), xVar3);
    }

    public static g0 e(int i10, int i11, long j10, long j11, long j12, long j13, g0 g0Var, o2.s sVar, o2.z zVar, o2.d0 d0Var, u2.j jVar) {
        long j14;
        long j15;
        o2.d0 d0Var2;
        o2.z zVar2;
        o2.s sVar2;
        long j16;
        long j17;
        u2.j jVar2;
        int i12;
        int i13;
        long j18;
        int i14;
        if ((i11 & 1) != 0) {
            j14 = n1.t.f28177i;
        } else {
            j14 = j10;
        }
        if ((i11 & 2) != 0) {
            j15 = w2.m.f38804c;
        } else {
            j15 = j11;
        }
        if ((i11 & 4) != 0) {
            d0Var2 = null;
        } else {
            d0Var2 = d0Var;
        }
        if ((i11 & 8) != 0) {
            zVar2 = null;
        } else {
            zVar2 = zVar;
        }
        if ((i11 & 32) != 0) {
            sVar2 = null;
        } else {
            sVar2 = sVar;
        }
        if ((i11 & 128) != 0) {
            j16 = w2.m.f38804c;
        } else {
            j16 = j12;
        }
        if ((i11 & 2048) != 0) {
            j17 = n1.t.f28177i;
        } else {
            j17 = 0;
        }
        long j19 = j17;
        if ((i11 & 4096) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((32768 & i11) != 0) {
            i12 = Integer.MIN_VALUE;
        } else {
            i12 = i10;
        }
        if ((65536 & i11) != 0) {
            i13 = Integer.MIN_VALUE;
        } else {
            i13 = 0;
        }
        if ((131072 & i11) != 0) {
            j18 = w2.m.f38804c;
        } else {
            j18 = j13;
        }
        if ((i11 & 2097152) != 0) {
            i14 = Integer.MIN_VALUE;
        } else {
            i14 = 0;
        }
        b0 a10 = c0.a(g0Var.f20722a, j14, null, Float.NaN, j15, d0Var2, zVar2, null, sVar2, null, j16, null, null, null, j19, jVar2, null, null, null);
        s a11 = t.a(g0Var.f20723b, i12, i13, j18, null, null, null, 0, i14, null);
        if (g0Var.f20722a == a10 && g0Var.f20723b == a11) {
            return g0Var;
        }
        return new g0(a10, a11);
    }

    public final long b() {
        return this.f20722a.f20659a.a();
    }

    public final boolean c(g0 g0Var) {
        if (this != g0Var) {
            if (!Intrinsics.a(this.f20723b, g0Var.f20723b) || !this.f20722a.a(g0Var.f20722a)) {
                return false;
            }
        }
        return true;
    }

    public final g0 d(g0 g0Var) {
        if (g0Var != null && !Intrinsics.a(g0Var, f20721d)) {
            return new g0(this.f20722a.c(g0Var.f20722a), this.f20723b.a(g0Var.f20723b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (Intrinsics.a(this.f20722a, g0Var.f20722a) && Intrinsics.a(this.f20723b, g0Var.f20723b) && Intrinsics.a(this.f20724c, g0Var.f20724c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f20723b.hashCode() + (this.f20722a.hashCode() * 31)) * 31;
        x xVar = this.f20724c;
        if (xVar != null) {
            i10 = xVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) n1.t.j(b()));
        sb2.append(", brush=");
        b0 b0Var = this.f20722a;
        sb2.append(b0Var.f20659a.b());
        sb2.append(", alpha=");
        sb2.append(b0Var.f20659a.c());
        sb2.append(", fontSize=");
        sb2.append((Object) w2.m.d(b0Var.f20660b));
        sb2.append(", fontWeight=");
        sb2.append(b0Var.f20661c);
        sb2.append(", fontStyle=");
        sb2.append(b0Var.f20662d);
        sb2.append(", fontSynthesis=");
        sb2.append(b0Var.f20663e);
        sb2.append(", fontFamily=");
        sb2.append(b0Var.f20664f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(b0Var.f20665g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) w2.m.d(b0Var.f20666h));
        sb2.append(", baselineShift=");
        sb2.append(b0Var.f20667i);
        sb2.append(", textGeometricTransform=");
        sb2.append(b0Var.f20668j);
        sb2.append(", localeList=");
        sb2.append(b0Var.f20669k);
        sb2.append(", background=");
        v.e.t(b0Var.f20670l, sb2, ", textDecoration=");
        sb2.append(b0Var.f20671m);
        sb2.append(", shadow=");
        sb2.append(b0Var.f20672n);
        sb2.append(", drawStyle=");
        sb2.append(b0Var.f20674p);
        sb2.append(", textAlign=");
        s sVar = this.f20723b;
        sb2.append((Object) u2.i.c(sVar.f20755a));
        sb2.append(", textDirection=");
        sb2.append((Object) u2.k.b(sVar.f20756b));
        sb2.append(", lineHeight=");
        sb2.append((Object) w2.m.d(sVar.f20757c));
        sb2.append(", textIndent=");
        sb2.append(sVar.f20758d);
        sb2.append(", platformStyle=");
        sb2.append(this.f20724c);
        sb2.append(", lineHeightStyle=");
        sb2.append(sVar.f20760f);
        sb2.append(", lineBreak=");
        sb2.append((Object) u2.e.a(sVar.f20761g));
        sb2.append(", hyphens=");
        sb2.append((Object) u2.d.b(sVar.f20762h));
        sb2.append(", textMotion=");
        sb2.append(sVar.f20763i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0(n1.j0 r32, long r33, o2.v r35, j2.x r36) {
        /*
            r31 = this;
            r0 = r32
            r1 = r36
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            long r22 = w2.m.f38804c
            r13 = 0
            r14 = 0
            r15 = 0
            long r16 = n1.t.f28177i
            r18 = 0
            r19 = 0
            r21 = 0
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
            r25 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = 0
            j2.b0 r11 = new j2.b0
            j2.w r12 = r1.f20772a
            boolean r2 = r0 instanceof n1.z0
            r3 = 2143289344(0x7fc00000, float:NaN)
            if (r2 == 0) goto L45
            n1.z0 r0 = (n1.z0) r0
            long r4 = r0.f28221a
            long r2 = yk.j.h1(r4, r3)
            r4 = 16
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L41
            u2.c r0 = new u2.c
            r0.<init>(r2)
            goto L43
        L41:
            u2.l r0 = u2.l.f36689a
        L43:
            r3 = r0
            goto L4b
        L45:
            u2.b r2 = new u2.b
            r2.<init>(r0, r3)
            r3 = r2
        L4b:
            r2 = r11
            r4 = r33
            r9 = r35
            r0 = r11
            r20 = r12
            r11 = r22
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21)
            j2.s r2 = new j2.s
            j2.v r3 = r1.f20773b
            r11 = r2
            r12 = r24
            r13 = r25
            r14 = r22
            r16 = r26
            r17 = r3
            r18 = r27
            r19 = r28
            r20 = r29
            r21 = r30
            r11.<init>(r12, r13, r14, r16, r17, r18, r19, r20, r21)
            r3 = r31
            r3.<init>(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.g0.<init>(n1.j0, long, o2.v, j2.x):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0(j2.b0 r4, j2.s r5) {
        /*
            r3 = this;
            j2.w r0 = r4.f20673o
            j2.v r1 = r5.f20759e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            j2.x r2 = new j2.x
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.g0.<init>(j2.b0, j2.s):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0(long r35, long r37, o2.d0 r39, o2.s r40, int r41, long r42, j2.x r44, int r45) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.g0.<init>(long, long, o2.d0, o2.s, int, long, j2.x, int):void");
    }
}
