package m3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int[] f27362a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f27363b;

    /* renamed from: c, reason: collision with root package name */
    public int f27364c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f27365d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f27366e;

    /* renamed from: f, reason: collision with root package name */
    public int f27367f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f27368g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f27369h;

    /* renamed from: i, reason: collision with root package name */
    public int f27370i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f27371j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f27372k;

    /* renamed from: l, reason: collision with root package name */
    public int f27373l;

    public final void a(int i10, float f10) {
        int i11 = this.f27367f;
        int[] iArr = this.f27365d;
        if (i11 >= iArr.length) {
            this.f27365d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f27366e;
            this.f27366e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f27365d;
        int i12 = this.f27367f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f27366e;
        this.f27367f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f27364c;
        int[] iArr = this.f27362a;
        if (i12 >= iArr.length) {
            this.f27362a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f27363b;
            this.f27363b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f27362a;
        int i13 = this.f27364c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f27363b;
        this.f27364c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f27370i;
        int[] iArr = this.f27368g;
        if (i11 >= iArr.length) {
            this.f27368g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f27369h;
            this.f27369h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f27368g;
        int i12 = this.f27370i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f27369h;
        this.f27370i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f27373l;
        int[] iArr = this.f27371j;
        if (i11 >= iArr.length) {
            this.f27371j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f27372k;
            this.f27372k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f27371j;
        int i12 = this.f27373l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f27372k;
        this.f27373l = i12 + 1;
        zArr2[i12] = z10;
    }
}
