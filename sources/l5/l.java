package l5;

import androidx.media3.exoplayer.source.BehindLiveWindowException;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final s5.g f24048a;

    /* renamed from: b, reason: collision with root package name */
    public final m5.m f24049b;

    /* renamed from: c, reason: collision with root package name */
    public final m5.b f24050c;

    /* renamed from: d, reason: collision with root package name */
    public final i f24051d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24052e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24053f;

    public l(long j10, m5.m mVar, m5.b bVar, s5.g gVar, long j11, i iVar) {
        this.f24052e = j10;
        this.f24049b = mVar;
        this.f24050c = bVar;
        this.f24053f = j11;
        this.f24048a = gVar;
        this.f24051d = iVar;
    }

    public final l a(long j10, m5.m mVar) {
        long t10;
        i c10 = this.f24049b.c();
        i c11 = mVar.c();
        if (c10 == null) {
            return new l(j10, mVar, this.f24050c, this.f24048a, this.f24053f, c10);
        }
        if (!c10.E()) {
            return new l(j10, mVar, this.f24050c, this.f24048a, this.f24053f, c11);
        }
        long H = c10.H(j10);
        if (H == 0) {
            return new l(j10, mVar, this.f24050c, this.f24048a, this.f24053f, c11);
        }
        long F = c10.F();
        long b10 = c10.b(F);
        long j11 = H + F;
        long j12 = j11 - 1;
        long e10 = c10.e(j12, j10) + c10.b(j12);
        long F2 = c11.F();
        long b11 = c11.b(F2);
        long j13 = this.f24053f;
        if (e10 != b11) {
            if (e10 >= b11) {
                if (b11 < b10) {
                    t10 = j13 - (c11.t(b10, j10) - F);
                    return new l(j10, mVar, this.f24050c, this.f24048a, t10, c11);
                }
                j11 = c10.t(b11, j10);
            } else {
                throw new BehindLiveWindowException();
            }
        }
        t10 = (j11 - F2) + j13;
        return new l(j10, mVar, this.f24050c, this.f24048a, t10, c11);
    }

    public final long b(long j10) {
        i iVar = this.f24051d;
        long j11 = this.f24052e;
        return (iVar.I(j11, j10) + (iVar.h(j11, j10) + this.f24053f)) - 1;
    }

    public final long c(long j10) {
        return this.f24051d.e(j10 - this.f24053f, this.f24052e) + d(j10);
    }

    public final long d(long j10) {
        return this.f24051d.b(j10 - this.f24053f);
    }
}
