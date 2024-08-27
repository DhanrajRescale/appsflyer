package d6;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import b4.l;
import b5.u;
import b5.v;
import e5.p;
import f5.g;
import jr.h;
import z5.b0;

/* loaded from: classes.dex */
public final class d extends l {

    /* renamed from: c, reason: collision with root package name */
    public final p f13950c;

    /* renamed from: d, reason: collision with root package name */
    public final p f13951d;

    /* renamed from: e, reason: collision with root package name */
    public int f13952e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13953f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13954g;

    /* renamed from: h, reason: collision with root package name */
    public int f13955h;

    public d(b0 b0Var) {
        super(b0Var, 2);
        this.f13950c = new p(g.f15954a);
        this.f13951d = new p(4);
    }

    public final boolean h(p pVar) {
        int u10 = pVar.u();
        int i10 = (u10 >> 4) & 15;
        int i11 = u10 & 15;
        if (i11 == 7) {
            this.f13955h = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader$UnsupportedFormatException(h.n("Video format not supported: ", i11));
    }

    public final boolean i(long j10, p pVar) {
        int i10;
        int u10 = pVar.u();
        byte[] bArr = pVar.f15036a;
        int i11 = pVar.f15037b;
        int i12 = ((bArr[i11 + 1] & 255) << 8) | (((bArr[i11] & 255) << 24) >> 8);
        pVar.f15037b = i11 + 3;
        long j11 = (((bArr[i11 + 2] & 255) | i12) * 1000) + j10;
        if (u10 == 0 && !this.f13953f) {
            byte[] bArr2 = new byte[pVar.a()];
            p pVar2 = new p(bArr2);
            pVar.e(bArr2, 0, pVar.a());
            z5.c a10 = z5.c.a(pVar2);
            this.f13952e = a10.f42045b;
            u uVar = new u();
            uVar.f3600k = "video/avc";
            uVar.f3597h = a10.f42052i;
            uVar.f3605p = a10.f42046c;
            uVar.f3606q = a10.f42047d;
            uVar.f3609t = a10.f42051h;
            uVar.f3602m = a10.f42044a;
            ((b0) this.f3178b).e(new v(uVar));
            this.f13953f = true;
            return false;
        }
        if (u10 != 1 || !this.f13953f) {
            return false;
        }
        if (this.f13955h == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (!this.f13954g && i10 == 0) {
            return false;
        }
        p pVar3 = this.f13951d;
        byte[] bArr3 = pVar3.f15036a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i13 = 4 - this.f13952e;
        int i14 = 0;
        while (pVar.a() > 0) {
            pVar.e(pVar3.f15036a, i13, this.f13952e);
            pVar3.F(0);
            int x10 = pVar3.x();
            p pVar4 = this.f13950c;
            pVar4.F(0);
            ((b0) this.f3178b).c(4, pVar4);
            ((b0) this.f3178b).c(x10, pVar);
            i14 = i14 + 4 + x10;
        }
        ((b0) this.f3178b).b(j11, i10, i14, 0, null);
        this.f13954g = true;
        return true;
    }
}
