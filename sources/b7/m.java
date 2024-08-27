package b7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f3905f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f3906a;

    /* renamed from: b, reason: collision with root package name */
    public int f3907b;

    /* renamed from: c, reason: collision with root package name */
    public int f3908c;

    /* renamed from: d, reason: collision with root package name */
    public int f3909d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f3910e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f3906a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f3910e;
        int length = bArr2.length;
        int i13 = this.f3908c;
        if (length < i13 + i12) {
            this.f3910e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f3910e, this.f3908c, i12);
        this.f3908c += i12;
    }
}
