package m4;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f27469a;

    /* renamed from: b, reason: collision with root package name */
    public long f27470b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f27471c;

    /* renamed from: d, reason: collision with root package name */
    public int f27472d;

    /* renamed from: e, reason: collision with root package name */
    public final vl.b f27473e;

    public b() {
        f fVar = g.f27475f;
        this.f27469a = new ArrayList();
        this.f27470b = 0L;
        this.f27473e = fVar;
    }

    public final boolean a(int i10) {
        int i11;
        if (i10 < 64) {
            if (((1 << i10) & this.f27470b) != 0) {
                return true;
            }
            return false;
        }
        long[] jArr = this.f27471c;
        if (jArr == null || (i11 = (i10 / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (i10 % 64)) & jArr[i11]) != 0) {
            return true;
        }
        return false;
    }

    public final void b(m mVar, int i10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f27473e.N(i10, this.f27469a.get(i11), mVar);
            }
            j11 <<= 1;
            i11++;
        }
    }

    public final void c(m mVar, int i10, int i11) {
        if (i11 < 0) {
            b(mVar, i10, 0, Math.min(64, this.f27469a.size()), this.f27470b);
            return;
        }
        long j10 = this.f27471c[i11];
        int i12 = (i11 + 1) * 64;
        int min = Math.min(this.f27469a.size(), i12 + 64);
        c(mVar, i10, i11 - 1);
        b(mVar, i10, i12, min, j10);
    }

    public final Object clone() {
        b bVar;
        CloneNotSupportedException e10;
        synchronized (this) {
            try {
                bVar = (b) super.clone();
                try {
                    bVar.f27470b = 0L;
                    bVar.f27471c = null;
                    bVar.f27472d = 0;
                    bVar.f27469a = new ArrayList();
                    int size = this.f27469a.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (!a(i10)) {
                            bVar.f27469a.add(this.f27469a.get(i10));
                        }
                    }
                } catch (CloneNotSupportedException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                    return bVar;
                }
            } catch (CloneNotSupportedException e12) {
                bVar = null;
                e10 = e12;
            }
        }
        return bVar;
    }

    public final void d(int i10, long j10) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = i10 + 63; i11 >= i10; i11--) {
            if ((j10 & j11) != 0) {
                this.f27469a.remove(i11);
            }
            j11 >>>= 1;
        }
    }

    public final void e(int i10) {
        if (i10 < 64) {
            this.f27470b = (1 << i10) | this.f27470b;
            return;
        }
        int i11 = (i10 / 64) - 1;
        long[] jArr = this.f27471c;
        if (jArr == null) {
            this.f27471c = new long[this.f27469a.size() / 64];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[this.f27469a.size() / 64];
            long[] jArr3 = this.f27471c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f27471c = jArr2;
        }
        long j10 = 1 << (i10 % 64);
        long[] jArr4 = this.f27471c;
        jArr4[i11] = j10 | jArr4[i11];
    }
}
