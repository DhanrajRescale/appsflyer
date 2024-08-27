package o6;

import z5.q;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f29754d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f29755a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f29756b;

    /* renamed from: c, reason: collision with root package name */
    public int f29757c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f29754d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int b(int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            if ((f29754d[i11] & i10) != 0) {
                return i11 + 1;
            }
        }
        return -1;
    }

    public final long c(q qVar, boolean z10, boolean z11, int i10) {
        int i11 = this.f29756b;
        byte[] bArr = this.f29755a;
        if (i11 == 0) {
            if (!qVar.a(bArr, 0, 1, z10)) {
                return -1L;
            }
            int b10 = b(bArr[0] & 255);
            this.f29757c = b10;
            if (b10 != -1) {
                this.f29756b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i12 = this.f29757c;
        if (i12 > i10) {
            this.f29756b = 0;
            return -2L;
        }
        if (i12 != 1) {
            qVar.readFully(bArr, 1, i12 - 1);
        }
        this.f29756b = 0;
        return a(bArr, this.f29757c, z11);
    }
}
