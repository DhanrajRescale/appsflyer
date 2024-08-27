package e3;

import java.util.Arrays;
import nn.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f14959a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14960b;

    /* renamed from: c, reason: collision with root package name */
    public int f14961c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f14962d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f14963e;

    /* renamed from: f, reason: collision with root package name */
    public int f14964f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f14965g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f14966h;

    /* renamed from: i, reason: collision with root package name */
    public int f14967i;

    public final void a(int i10, float f10) {
        int i11 = this.f14964f;
        int[] iArr = this.f14962d;
        if (i11 >= iArr.length) {
            this.f14962d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f14963e;
            this.f14963e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f14962d;
        int i12 = this.f14964f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f14963e;
        this.f14964f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f14961c;
        int[] iArr = this.f14959a;
        if (i12 >= iArr.length) {
            this.f14959a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f14960b;
            this.f14960b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f14959a;
        int i13 = this.f14961c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f14960b;
        this.f14961c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f14967i;
        int[] iArr = this.f14965g;
        if (i11 >= iArr.length) {
            this.f14965g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f14966h;
            this.f14966h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f14965g;
        int i12 = this.f14967i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f14966h;
        this.f14967i = i12 + 1;
        strArr2[i12] = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypedBundle{mCountInt=");
        sb2.append(this.f14961c);
        sb2.append(", mCountFloat=");
        sb2.append(this.f14964f);
        sb2.append(", mCountString=");
        return d.m(sb2, this.f14967i, ", mCountBoolean=0}");
    }
}
