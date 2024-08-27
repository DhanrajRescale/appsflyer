package r6;

import androidx.media3.common.ParserException;
import e5.p;
import java.io.EOFException;
import z5.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f33373a;

    /* renamed from: b, reason: collision with root package name */
    public long f33374b;

    /* renamed from: c, reason: collision with root package name */
    public int f33375c;

    /* renamed from: d, reason: collision with root package name */
    public int f33376d;

    /* renamed from: e, reason: collision with root package name */
    public int f33377e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f33378f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final p f33379g = new p(255);

    public final boolean a(q qVar, boolean z10) {
        this.f33373a = 0;
        this.f33374b = 0L;
        this.f33375c = 0;
        this.f33376d = 0;
        this.f33377e = 0;
        p pVar = this.f33379g;
        pVar.C(27);
        try {
            if (qVar.b(pVar.f15036a, 0, 27, z10) && pVar.v() == 1332176723) {
                if (pVar.u() != 0) {
                    if (z10) {
                        return false;
                    }
                    throw ParserException.c("unsupported bit stream revision");
                }
                this.f33373a = pVar.u();
                this.f33374b = pVar.j();
                pVar.l();
                pVar.l();
                pVar.l();
                int u10 = pVar.u();
                this.f33375c = u10;
                this.f33376d = u10 + 27;
                pVar.C(u10);
                try {
                    if (qVar.b(pVar.f15036a, 0, this.f33375c, z10)) {
                        for (int i10 = 0; i10 < this.f33375c; i10++) {
                            int u11 = pVar.u();
                            this.f33378f[i10] = u11;
                            this.f33377e += u11;
                        }
                        return true;
                    }
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                }
                return false;
            }
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
        }
        return false;
    }

    public final boolean b(q qVar, long j10) {
        boolean z10;
        if (qVar.getPosition() == qVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        p pVar = this.f33379g;
        pVar.C(4);
        while (true) {
            if (j10 != -1 && qVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                if (!qVar.b(pVar.f15036a, 0, 4, true)) {
                    break;
                }
                pVar.F(0);
                if (pVar.v() == 1332176723) {
                    qVar.i();
                    return true;
                }
                qVar.j(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (j10 != -1 && qVar.getPosition() >= j10) {
                break;
            }
        } while (qVar.e(1) != -1);
        return false;
    }
}
