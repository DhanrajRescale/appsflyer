package nr;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f29101g = new a(4201, 4096, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final a f29102h = new a(1033, UserMetadata.MAX_ATTRIBUTE_SIZE, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f29103i = new a(67, 64, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f29104j = new a(19, 16, 1);

    /* renamed from: k, reason: collision with root package name */
    public static final a f29105k = new a(285, 256, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final a f29106l = new a(301, 256, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f29107a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f29108b;

    /* renamed from: c, reason: collision with root package name */
    public final b f29109c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29110d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29111e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29112f;

    public a(int i10, int i11, int i12) {
        this.f29111e = i10;
        this.f29110d = i11;
        this.f29112f = i12;
        this.f29107a = new int[i11];
        this.f29108b = new int[i11];
        int i13 = 1;
        int i14 = 1;
        for (int i15 = 0; i15 < i11; i15++) {
            this.f29107a[i15] = i14;
            i14 <<= 1;
            if (i14 >= i11) {
                i14 = (i14 ^ i10) & (i11 - 1);
            }
        }
        for (int i16 = 0; i16 < i11 - 1; i16++) {
            this.f29108b[this.f29107a[i16]] = i16;
        }
        this.f29109c = new b(this, new int[]{0});
        int[] iArr = {1};
        if (iArr.length != 0) {
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                while (i13 < length && iArr[i13] == 0) {
                    i13++;
                }
                if (i13 != length) {
                    int[] iArr2 = new int[length - i13];
                    System.arraycopy(iArr, i13, iArr2, 0, iArr2.length);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int a(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            int[] iArr = this.f29108b;
            return this.f29107a[(iArr[i10] + iArr[i11]) % (this.f29110d - 1)];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f29111e));
        sb2.append(',');
        return a3.a.i(sb2, this.f29110d, ')');
    }
}
