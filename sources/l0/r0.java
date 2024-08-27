package l0;

import i0.s2;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class r0 extends i {

    /* renamed from: h, reason: collision with root package name */
    public final p2.c0 f23817h;

    /* renamed from: i, reason: collision with root package name */
    public final s2 f23818i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r0(p2.c0 r8, p2.v r9, i0.s2 r10, l0.a1 r11) {
        /*
            r7 = this;
            j2.e r1 = r8.f30522a
            long r2 = r8.f30523b
            if (r10 == 0) goto La
            j2.e0 r0 = r10.f19194a
        L8:
            r4 = r0
            goto Lc
        La:
            r0 = 0
            goto L8
        Lc:
            r0 = r7
            r5 = r9
            r6 = r11
            r0.<init>(r1, r2, r4, r5, r6)
            r7.f23817h = r8
            r7.f23818i = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.r0.<init>(p2.c0, p2.v, i0.s2, l0.a1):void");
    }

    public final List n(i0.r rVar) {
        if (j2.f0.b(this.f23768f)) {
            p2.i iVar = (p2.i) rVar.invoke(this);
            if (iVar != null) {
                return vt.x.a(iVar);
            }
            return null;
        }
        return vt.y.g(new p2.a(HttpUrl.FRAGMENT_ENCODE_SET, 0), new p2.b0(j2.f0.e(this.f23768f), j2.f0.e(this.f23768f)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(i0.s2 r6, int r7) {
        /*
            r5 = this;
            a2.u r0 = r6.f19195b
            if (r0 == 0) goto L11
            a2.u r1 = r6.f19196c
            if (r1 == 0) goto Le
            r2 = 1
            m1.d r0 = r1.i(r0, r2)
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L13
        L11:
            m1.d r0 = m1.d.f27238e
        L13:
            p2.c0 r1 = r5.f23817h
            long r1 = r1.f30523b
            int r3 = j2.f0.f20711c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            p2.v r2 = r5.f23766d
            int r1 = r2.b(r1)
            j2.e0 r6 = r6.f19194a
            m1.d r1 = r6.c(r1)
            float r3 = r0.c()
            float r0 = r0.b()
            long r3 = t0.t.j(r3, r0)
            float r0 = m1.f.c(r3)
            float r7 = (float) r7
            float r0 = r0 * r7
            float r7 = r1.f27240b
            float r0 = r0 + r7
            float r7 = r1.f27239a
            long r0 = t0.t.g(r7, r0)
            int r6 = r6.l(r0)
            int r6 = r2.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.r0.o(i0.s2, int):int");
    }
}
