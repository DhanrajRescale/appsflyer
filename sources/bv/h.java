package bv;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public j f7353a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7354b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f7355c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f7357e;

    /* renamed from: d, reason: collision with root package name */
    public long f7356d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f7358f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f7359g = -1;

    public final void a(long j10) {
        j jVar = this.f7353a;
        if (jVar != null) {
            if (this.f7354b) {
                long j11 = jVar.f7365b;
                if (j10 <= j11) {
                    if (j10 >= 0) {
                        long j12 = j11 - j10;
                        while (true) {
                            if (j12 <= 0) {
                                break;
                            }
                            f0 f0Var = jVar.f7364a;
                            Intrinsics.c(f0Var);
                            f0 f0Var2 = f0Var.f7349g;
                            Intrinsics.c(f0Var2);
                            int i10 = f0Var2.f7345c;
                            long j13 = i10 - f0Var2.f7344b;
                            if (j13 <= j12) {
                                jVar.f7364a = f0Var2.a();
                                g0.a(f0Var2);
                                j12 -= j13;
                            } else {
                                f0Var2.f7345c = i10 - ((int) j12);
                                break;
                            }
                        }
                        this.f7355c = null;
                        this.f7356d = j10;
                        this.f7357e = null;
                        this.f7358f = -1;
                        this.f7359g = -1;
                    } else {
                        throw new IllegalArgumentException(nn.d.j("newSize < 0: ", j10).toString());
                    }
                } else if (j10 > j11) {
                    long j14 = j10 - j11;
                    int i11 = 1;
                    boolean z10 = true;
                    for (long j15 = 0; j14 > j15; j15 = 0) {
                        f0 R = jVar.R(i11);
                        int min = (int) Math.min(j14, 8192 - R.f7345c);
                        int i12 = R.f7345c + min;
                        R.f7345c = i12;
                        j14 -= min;
                        if (z10) {
                            this.f7355c = R;
                            this.f7356d = j11;
                            this.f7357e = R.f7343a;
                            this.f7358f = i12 - min;
                            this.f7359g = i12;
                            z10 = false;
                        }
                        i11 = 1;
                    }
                }
                jVar.f7365b = j10;
                return;
            }
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    public final int b(long j10) {
        j jVar = this.f7353a;
        if (jVar != null) {
            if (j10 >= -1) {
                long j11 = jVar.f7365b;
                if (j10 <= j11) {
                    if (j10 != -1 && j10 != j11) {
                        f0 f0Var = jVar.f7364a;
                        f0 f0Var2 = this.f7355c;
                        long j12 = 0;
                        if (f0Var2 != null) {
                            long j13 = this.f7356d - (this.f7358f - f0Var2.f7344b);
                            if (j13 > j10) {
                                j11 = j13;
                                f0Var2 = f0Var;
                                f0Var = f0Var2;
                            } else {
                                j12 = j13;
                            }
                        } else {
                            f0Var2 = f0Var;
                        }
                        if (j11 - j10 > j10 - j12) {
                            while (true) {
                                Intrinsics.c(f0Var2);
                                long j14 = (f0Var2.f7345c - f0Var2.f7344b) + j12;
                                if (j10 < j14) {
                                    break;
                                }
                                f0Var2 = f0Var2.f7348f;
                                j12 = j14;
                            }
                        } else {
                            while (j11 > j10) {
                                Intrinsics.c(f0Var);
                                f0Var = f0Var.f7349g;
                                Intrinsics.c(f0Var);
                                j11 -= f0Var.f7345c - f0Var.f7344b;
                            }
                            f0Var2 = f0Var;
                            j12 = j11;
                        }
                        if (this.f7354b) {
                            Intrinsics.c(f0Var2);
                            if (f0Var2.f7346d) {
                                byte[] bArr = f0Var2.f7343a;
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                                f0 f0Var3 = new f0(copyOf, f0Var2.f7344b, f0Var2.f7345c, false, true);
                                if (jVar.f7364a == f0Var2) {
                                    jVar.f7364a = f0Var3;
                                }
                                f0Var2.b(f0Var3);
                                f0 f0Var4 = f0Var3.f7349g;
                                Intrinsics.c(f0Var4);
                                f0Var4.a();
                                f0Var2 = f0Var3;
                            }
                        }
                        this.f7355c = f0Var2;
                        this.f7356d = j10;
                        Intrinsics.c(f0Var2);
                        this.f7357e = f0Var2.f7343a;
                        int i10 = f0Var2.f7344b + ((int) (j10 - j12));
                        this.f7358f = i10;
                        int i11 = f0Var2.f7345c;
                        this.f7359g = i11;
                        return i11 - i10;
                    }
                    this.f7355c = null;
                    this.f7356d = j10;
                    this.f7357e = null;
                    this.f7358f = -1;
                    this.f7359g = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + jVar.f7365b);
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7353a != null) {
            this.f7353a = null;
            this.f7355c = null;
            this.f7356d = -1L;
            this.f7357e = null;
            this.f7358f = -1;
            this.f7359g = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }
}
