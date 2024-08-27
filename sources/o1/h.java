package o1;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final d f29402a;

    /* renamed from: b, reason: collision with root package name */
    public final d f29403b;

    /* renamed from: c, reason: collision with root package name */
    public final d f29404c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f29405d;

    public h(d dVar, d dVar2, d dVar3, float[] fArr) {
        this.f29402a = dVar;
        this.f29403b = dVar2;
        this.f29404c = dVar3;
        this.f29405d = fArr;
    }

    public long a(long j10) {
        float i10 = n1.t.i(j10);
        float h10 = n1.t.h(j10);
        float f10 = n1.t.f(j10);
        float e10 = n1.t.e(j10);
        d dVar = this.f29403b;
        long d10 = dVar.d(i10, h10, f10);
        float intBitsToFloat = Float.intBitsToFloat((int) (d10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d10 & 4294967295L));
        float e11 = dVar.e(i10, h10, f10);
        float[] fArr = this.f29405d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e11 *= fArr[2];
        }
        float f11 = intBitsToFloat;
        float f12 = intBitsToFloat2;
        return this.f29404c.f(f11, f12, e11, e10, this.f29402a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(o1.d r9, o1.d r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f29376b
            long r2 = o1.c.f29370a
            boolean r0 = o1.c.a(r0, r2)
            if (r0 == 0) goto Lf
            o1.d r0 = t0.t.v(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f29376b
            boolean r1 = o1.c.a(r4, r2)
            if (r1 == 0) goto L1d
            o1.d r1 = t0.t.v(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            r5 = 0
            if (r11 != r4) goto L69
            long r6 = r9.f29376b
            boolean r11 = o1.c.a(r6, r2)
            long r6 = r10.f29376b
            boolean r2 = o1.c.a(r6, r2)
            if (r11 == 0) goto L33
            if (r2 == 0) goto L33
            goto L69
        L33:
            if (r11 != 0) goto L37
            if (r2 == 0) goto L69
        L37:
            if (r11 == 0) goto L3a
            goto L3b
        L3a:
            r9 = r10
        L3b:
            o1.r r9 = (o1.r) r9
            float[] r3 = o1.k.f29411e
            o1.t r9 = r9.f29425d
            if (r11 == 0) goto L48
            float[] r11 = r9.a()
            goto L49
        L48:
            r11 = r3
        L49:
            if (r2 == 0) goto L4f
            float[] r3 = r9.a()
        L4f:
            float[] r5 = new float[r4]
            r9 = 0
            r2 = r11[r9]
            r4 = r3[r9]
            float r2 = r2 / r4
            r5[r9] = r2
            r9 = 1
            r2 = r11[r9]
            r4 = r3[r9]
            float r2 = r2 / r4
            r5[r9] = r2
            r9 = 2
            r11 = r11[r9]
            r2 = r3[r9]
            float r11 = r11 / r2
            r5[r9] = r11
        L69:
            r8.<init>(r10, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.h.<init>(o1.d, o1.d, int):void");
    }
}
