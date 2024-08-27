package c6;

import androidx.media3.common.ParserException;
import b5.m;
import b5.q0;
import e.l;
import e5.x;
import hr.c;
import j5.d;
import java.util.Arrays;
import l0.j;
import lp.o0;
import z5.b0;
import z5.i;
import z5.p;
import z5.q;
import z5.r;
import z5.t;
import z5.u;
import z5.y;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: e, reason: collision with root package name */
    public r f8005e;

    /* renamed from: f, reason: collision with root package name */
    public b0 f8006f;

    /* renamed from: h, reason: collision with root package name */
    public q0 f8008h;

    /* renamed from: i, reason: collision with root package name */
    public u f8009i;

    /* renamed from: j, reason: collision with root package name */
    public int f8010j;

    /* renamed from: k, reason: collision with root package name */
    public int f8011k;

    /* renamed from: l, reason: collision with root package name */
    public a f8012l;

    /* renamed from: m, reason: collision with root package name */
    public int f8013m;

    /* renamed from: n, reason: collision with root package name */
    public long f8014n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8001a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final e5.p f8002b = new e5.p(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8003c = false;

    /* renamed from: d, reason: collision with root package name */
    public final mj.b f8004d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public int f8007g = 0;

    @Override // z5.p
    public final void d(r rVar) {
        this.f8005e = rVar;
        this.f8006f = rVar.f(0, 1);
        rVar.c();
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [c6.a, z5.i] */
    @Override // z5.p
    public final int e(q qVar, mj.b bVar) {
        d dVar;
        q0 q0Var;
        y tVar;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        boolean z11;
        int i10 = this.f8007g;
        Object obj = null;
        int i11 = 1;
        if (i10 != 0) {
            byte[] bArr = this.f8001a;
            if (i10 != 1) {
                int i12 = 4;
                int i13 = 3;
                if (i10 != 2) {
                    int i14 = 7;
                    if (i10 != 3) {
                        long j16 = 0;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                this.f8006f.getClass();
                                this.f8009i.getClass();
                                a aVar = this.f8012l;
                                if (aVar != null && aVar.f42088c != null) {
                                    return aVar.a(qVar, bVar);
                                }
                                if (this.f8014n == -1) {
                                    u uVar = this.f8009i;
                                    qVar.i();
                                    qVar.d(1);
                                    byte[] bArr2 = new byte[1];
                                    qVar.n(bArr2, 0, 1);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    qVar.d(2);
                                    if (!z11) {
                                        i14 = 6;
                                    }
                                    e5.p pVar = new e5.p(i14);
                                    byte[] bArr3 = pVar.f15036a;
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        int g10 = qVar.g(bArr3, i15, i14 - i15);
                                        if (g10 == -1) {
                                            break;
                                        }
                                        i15 += g10;
                                    }
                                    pVar.E(i15);
                                    qVar.i();
                                    try {
                                        long A = pVar.A();
                                        if (!z11) {
                                            A *= uVar.f42120b;
                                        }
                                        j16 = A;
                                    } catch (NumberFormatException unused) {
                                        i11 = 0;
                                    }
                                    if (i11 != 0) {
                                        this.f8014n = j16;
                                        return 0;
                                    }
                                    throw ParserException.a(null, null);
                                }
                                e5.p pVar2 = this.f8002b;
                                int i16 = pVar2.f15038c;
                                if (i16 < 32768) {
                                    int read = qVar.read(pVar2.f15036a, i16, 32768 - i16);
                                    if (read != -1) {
                                        i11 = 0;
                                    }
                                    if (i11 == 0) {
                                        pVar2.E(i16 + read);
                                    } else if (pVar2.a() == 0) {
                                        long j17 = this.f8014n * 1000000;
                                        u uVar2 = this.f8009i;
                                        int i17 = x.f15050a;
                                        this.f8006f.b(j17 / uVar2.f42123e, 1, this.f8013m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    i11 = 0;
                                }
                                int i18 = pVar2.f15037b;
                                int i19 = this.f8013m;
                                int i20 = this.f8010j;
                                if (i19 < i20) {
                                    pVar2.G(Math.min(i20 - i19, pVar2.a()));
                                }
                                this.f8009i.getClass();
                                int i21 = pVar2.f15037b;
                                while (true) {
                                    int i22 = pVar2.f15038c - 16;
                                    mj.b bVar2 = this.f8004d;
                                    if (i21 <= i22) {
                                        pVar2.F(i21);
                                        if (vl.b.f(pVar2, this.f8009i, this.f8011k, bVar2)) {
                                            pVar2.F(i21);
                                            j15 = bVar2.f27810a;
                                            break;
                                        }
                                        i21++;
                                    } else {
                                        if (i11 != 0) {
                                            while (true) {
                                                int i23 = pVar2.f15038c;
                                                if (i21 <= i23 - this.f8010j) {
                                                    pVar2.F(i21);
                                                    try {
                                                        z10 = vl.b.f(pVar2, this.f8009i, this.f8011k, bVar2);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z10 = false;
                                                    }
                                                    if (pVar2.f15037b <= pVar2.f15038c && z10) {
                                                        pVar2.F(i21);
                                                        j15 = bVar2.f27810a;
                                                        break;
                                                    }
                                                    i21++;
                                                } else {
                                                    pVar2.F(i23);
                                                    break;
                                                }
                                            }
                                        } else {
                                            pVar2.F(i21);
                                        }
                                        j15 = -1;
                                    }
                                }
                                int i24 = pVar2.f15037b - i18;
                                pVar2.F(i18);
                                this.f8006f.c(i24, pVar2);
                                int i25 = this.f8013m + i24;
                                this.f8013m = i25;
                                if (j15 != -1) {
                                    long j18 = this.f8014n * 1000000;
                                    u uVar3 = this.f8009i;
                                    int i26 = x.f15050a;
                                    this.f8006f.b(j18 / uVar3.f42123e, 1, i25, 0, null);
                                    this.f8013m = 0;
                                    this.f8014n = j15;
                                }
                                if (pVar2.a() >= 16) {
                                    return 0;
                                }
                                int a10 = pVar2.a();
                                byte[] bArr4 = pVar2.f15036a;
                                System.arraycopy(bArr4, pVar2.f15037b, bArr4, 0, a10);
                                pVar2.F(0);
                                pVar2.E(a10);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        qVar.i();
                        e5.p pVar3 = new e5.p(2);
                        qVar.n(pVar3.f15036a, 0, 2);
                        int z12 = pVar3.z();
                        if ((z12 >> 2) == 16382) {
                            qVar.i();
                            this.f8011k = z12;
                            r rVar = this.f8005e;
                            int i27 = x.f15050a;
                            long position = qVar.getPosition();
                            long f10 = qVar.f();
                            this.f8009i.getClass();
                            u uVar4 = this.f8009i;
                            if (uVar4.f42129k != null) {
                                tVar = new t(uVar4, 0, position);
                            } else if (f10 != -1 && uVar4.f42128j > 0) {
                                int i28 = this.f8011k;
                                b3.t tVar2 = new b3.t(uVar4, 15);
                                j jVar = new j(uVar4, i28);
                                long b10 = uVar4.b();
                                long j19 = uVar4.f42128j;
                                int i29 = uVar4.f42121c;
                                int i30 = uVar4.f42122d;
                                if (i30 > 0) {
                                    j10 = position;
                                    j11 = j19;
                                    j13 = (i30 + i29) / 2;
                                    j14 = 1;
                                } else {
                                    j10 = position;
                                    j11 = j19;
                                    int i31 = uVar4.f42120b;
                                    int i32 = uVar4.f42119a;
                                    if (i32 == i31 && i32 > 0) {
                                        j12 = i32;
                                    } else {
                                        j12 = 4096;
                                    }
                                    j13 = ((j12 * uVar4.f42125g) * uVar4.f42126h) / 8;
                                    j14 = 64;
                                }
                                ?? iVar = new i(tVar2, jVar, b10, j11, j10, f10, j13 + j14, Math.max(6, i29));
                                this.f8012l = iVar;
                                tVar = iVar.f42086a;
                            } else {
                                tVar = new t(uVar4.b());
                            }
                            rVar.d(tVar);
                            this.f8007g = 5;
                            return 0;
                        }
                        qVar.i();
                        throw ParserException.a("First frame does not start with sync code.", null);
                    }
                    c cVar = new c(this.f8009i, 16);
                    while (true) {
                        qVar.i();
                        m mVar = new m(new byte[i12], i11, obj);
                        qVar.n(mVar.f3433b, 0, i12);
                        boolean h10 = mVar.h();
                        int i33 = mVar.i(i14);
                        int i34 = mVar.i(24) + i12;
                        if (i33 == 0) {
                            byte[] bArr5 = new byte[38];
                            qVar.readFully(bArr5, 0, 38);
                            cVar.f18690b = new u(bArr5, i12);
                        } else {
                            u uVar5 = (u) cVar.f18690b;
                            if (uVar5 != null) {
                                if (i33 == i13) {
                                    e5.p pVar4 = new e5.p(i34);
                                    qVar.readFully(pVar4.f15036a, 0, i34);
                                    cVar.f18690b = new u(uVar5.f42119a, uVar5.f42120b, uVar5.f42121c, uVar5.f42122d, uVar5.f42123e, uVar5.f42125g, uVar5.f42126h, uVar5.f42128j, e5.a.s(pVar4), uVar5.f42130l);
                                } else {
                                    q0 q0Var2 = uVar5.f42130l;
                                    if (i33 == 4) {
                                        e5.p pVar5 = new e5.p(i34);
                                        qVar.readFully(pVar5.f15036a, 0, i34);
                                        pVar5.G(4);
                                        q0 r10 = e5.a.r(Arrays.asList((String[]) e5.a.t(pVar5, false, false).f23775c));
                                        if (q0Var2 == null) {
                                            q0Var = r10;
                                        } else {
                                            if (r10 != null) {
                                                q0Var2 = q0Var2.a(r10.f3577a);
                                            }
                                            q0Var = q0Var2;
                                        }
                                        cVar.f18690b = new u(uVar5.f42119a, uVar5.f42120b, uVar5.f42121c, uVar5.f42122d, uVar5.f42123e, uVar5.f42125g, uVar5.f42126h, uVar5.f42128j, uVar5.f42129k, q0Var);
                                    } else if (i33 == 6) {
                                        e5.p pVar6 = new e5.p(i34);
                                        qVar.readFully(pVar6.f15036a, 0, i34);
                                        pVar6.G(4);
                                        q0 q0Var3 = new q0(o0.v(i6.a.a(pVar6)));
                                        if (q0Var2 != null) {
                                            q0Var3 = q0Var2.a(q0Var3.f3577a);
                                        }
                                        cVar.f18690b = new u(uVar5.f42119a, uVar5.f42120b, uVar5.f42121c, uVar5.f42122d, uVar5.f42123e, uVar5.f42125g, uVar5.f42126h, uVar5.f42128j, uVar5.f42129k, q0Var3);
                                    } else {
                                        qVar.j(i34);
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        u uVar6 = (u) cVar.f18690b;
                        int i35 = x.f15050a;
                        this.f8009i = uVar6;
                        if (!h10) {
                            obj = null;
                            i11 = 1;
                            i12 = 4;
                            i13 = 3;
                            i14 = 7;
                        } else {
                            uVar6.getClass();
                            this.f8010j = Math.max(this.f8009i.f42121c, 6);
                            this.f8006f.e(this.f8009i.c(bArr, this.f8008h));
                            this.f8007g = 4;
                            return 0;
                        }
                    }
                } else {
                    e5.p pVar7 = new e5.p(4);
                    qVar.readFully(pVar7.f15036a, 0, 4);
                    if (pVar7.v() == 1716281667) {
                        this.f8007g = 3;
                        return 0;
                    }
                    throw ParserException.a("Failed to read FLAC stream marker.", null);
                }
            } else {
                qVar.n(bArr, 0, bArr.length);
                qVar.i();
                this.f8007g = 2;
                return 0;
            }
        } else {
            q0 q0Var4 = null;
            boolean z13 = !this.f8003c;
            qVar.i();
            long c10 = qVar.c();
            if (z13) {
                dVar = null;
            } else {
                dVar = k6.j.f22248c;
            }
            q0 N = new l(19).N(qVar, dVar);
            if (N != null && N.f3577a.length != 0) {
                q0Var4 = N;
            }
            qVar.j((int) (qVar.c() - c10));
            this.f8008h = q0Var4;
            this.f8007g = 1;
            return 0;
        }
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f8007g = 0;
        } else {
            a aVar = this.f8012l;
            if (aVar != null) {
                aVar.c(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f8014n = j12;
        this.f8013m = 0;
        this.f8002b.C(0);
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        q0 N = new l(19).N(qVar, k6.j.f22248c);
        if (N != null) {
            int length = N.f3577a.length;
        }
        e5.p pVar = new e5.p(4);
        ((z5.l) qVar).b(pVar.f15036a, 0, 4, false);
        if (pVar.v() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // z5.p
    public final void release() {
    }
}
