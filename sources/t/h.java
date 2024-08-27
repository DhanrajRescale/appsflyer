package t;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f34861a;

    static {
        int i10;
        long[] jArr = f0.f34855a;
        int d10 = f0.d(0);
        if (d10 > 0) {
            i10 = Math.max(7, f0.c(d10));
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            jArr = new long[((i10 + 15) & (-8)) >> 3];
            vt.t.l(jArr);
        }
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        f0.a(i10);
        float[] fArr = new float[i10];
        f34861a = new float[0];
    }
}
