package c3;

import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7928a;

    /* renamed from: e, reason: collision with root package name */
    public float f7932e;

    /* renamed from: l, reason: collision with root package name */
    public int f7939l;

    /* renamed from: b, reason: collision with root package name */
    public int f7929b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f7930c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f7931d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7933f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f7934g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f7935h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public c[] f7936i = new c[16];

    /* renamed from: j, reason: collision with root package name */
    public int f7937j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f7938k = 0;

    public g(int i10) {
        this.f7939l = i10;
    }

    public final void a(c cVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f7937j;
            if (i10 < i11) {
                if (this.f7936i[i10] == cVar) {
                    return;
                } else {
                    i10++;
                }
            } else {
                c[] cVarArr = this.f7936i;
                if (i11 >= cVarArr.length) {
                    this.f7936i = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f7936i;
                int i12 = this.f7937j;
                cVarArr2[i12] = cVar;
                this.f7937j = i12 + 1;
                return;
            }
        }
    }

    public final void b(c cVar) {
        int i10 = this.f7937j;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f7936i[i11] == cVar) {
                while (i11 < i10 - 1) {
                    c[] cVarArr = this.f7936i;
                    int i12 = i11 + 1;
                    cVarArr[i11] = cVarArr[i12];
                    i11 = i12;
                }
                this.f7937j--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.f7939l = 5;
        this.f7931d = 0;
        this.f7929b = -1;
        this.f7930c = -1;
        this.f7932e = s0.g.f34069a;
        this.f7933f = false;
        int i10 = this.f7937j;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7936i[i11] = null;
        }
        this.f7937j = 0;
        this.f7938k = 0;
        this.f7928a = false;
        Arrays.fill(this.f7935h, s0.g.f34069a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7929b - ((g) obj).f7929b;
    }

    public final void d(d dVar, float f10) {
        this.f7932e = f10;
        this.f7933f = true;
        int i10 = this.f7937j;
        this.f7930c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7936i[i11].h(dVar, this, false);
        }
        this.f7937j = 0;
    }

    public final void e(d dVar, c cVar) {
        int i10 = this.f7937j;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7936i[i11].i(dVar, cVar, false);
        }
        this.f7937j = 0;
    }

    public final String toString() {
        return HttpUrl.FRAGMENT_ENCODE_SET + this.f7929b;
    }
}
