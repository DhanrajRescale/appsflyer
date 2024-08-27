package b7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3883e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f3884a;

    /* renamed from: b, reason: collision with root package name */
    public int f3885b;

    /* renamed from: c, reason: collision with root package name */
    public int f3886c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3887d;

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f3884a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f3887d;
        int length = bArr2.length;
        int i13 = this.f3885b;
        if (length < i13 + i12) {
            this.f3887d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f3887d, this.f3885b, i12);
        this.f3885b += i12;
    }
}
