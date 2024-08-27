package b7;

import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class c implements z5.p {

    /* renamed from: a, reason: collision with root package name */
    public final d f3769a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f3770b = new e5.p(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3771c;

    @Override // z5.p
    public final void d(z5.r rVar) {
        this.f3769a.g(rVar, new h0(0, 1));
        rVar.c();
        rVar.d(new z5.t(-9223372036854775807L));
    }

    @Override // z5.p
    public final int e(z5.q qVar, mj.b bVar) {
        e5.p pVar = this.f3770b;
        int read = qVar.read(pVar.f15036a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (read == -1) {
            return -1;
        }
        pVar.F(0);
        pVar.E(read);
        boolean z10 = this.f3771c;
        d dVar = this.f3769a;
        if (!z10) {
            dVar.f(4, 0L);
            this.f3771c = true;
        }
        dVar.b(pVar);
        return 0;
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        this.f3771c = false;
        this.f3769a.d();
    }

    @Override // z5.p
    public final boolean g(z5.q qVar) {
        z5.l lVar;
        int i10;
        e5.p pVar = new e5.p(10);
        int i11 = 0;
        while (true) {
            lVar = (z5.l) qVar;
            lVar.b(pVar.f15036a, 0, 10, false);
            pVar.F(0);
            if (pVar.w() != 4801587) {
                break;
            }
            pVar.G(3);
            int t10 = pVar.t();
            i11 += t10 + 10;
            lVar.k(t10, false);
        }
        lVar.f42108f = 0;
        lVar.k(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            lVar.b(pVar.f15036a, 0, 7, false);
            pVar.F(0);
            int z10 = pVar.z();
            if (z10 != 44096 && z10 != 44097) {
                lVar.f42108f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                lVar.k(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = pVar.f15036a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (z10 == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                lVar.k(i10 - 7, false);
            }
        }
    }

    @Override // z5.p
    public final void release() {
    }
}
