package b7;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public boolean f4060c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4061d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4062e;

    /* renamed from: a, reason: collision with root package name */
    public final e5.u f4058a = new e5.u(0);

    /* renamed from: f, reason: collision with root package name */
    public long f4063f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f4064g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f4065h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f4059b = new e5.p();

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(e5.p pVar) {
        int i10 = pVar.f15037b;
        if (pVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        pVar.e(bArr, 0, 9);
        pVar.F(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j10 = b10;
                    long j11 = b11;
                    return ((j11 & 3) << 13) | ((j10 & 3) << 28) | (((56 & j10) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j11 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(z5.q qVar) {
        byte[] bArr = e5.x.f15055f;
        e5.p pVar = this.f4059b;
        pVar.getClass();
        pVar.D(bArr.length, bArr);
        this.f4060c = true;
        qVar.i();
    }
}
