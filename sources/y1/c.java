package y1;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.NoWhenBranchMatchedException;
import s0.g;
import t0.t;
import w.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41054a = false;

    /* renamed from: b, reason: collision with root package name */
    public final int f41055b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f41056c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f41057d;

    /* renamed from: e, reason: collision with root package name */
    public int f41058e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f41059f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f41060g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f41061h;

    public c() {
        int i10;
        int e10 = k.e(1);
        if (e10 != 0) {
            if (e10 == 1) {
                i10 = 2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i10 = 3;
        }
        this.f41056c = i10;
        this.f41057d = new a[20];
        this.f41059f = new float[20];
        this.f41060g = new float[20];
        this.f41061h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, y1.a] */
    public final void a(long j10, float f10) {
        int i10 = (this.f41058e + 1) % 20;
        this.f41058e = i10;
        a[] aVarArr = this.f41057d;
        a aVar = aVarArr[i10];
        if (aVar == 0) {
            ?? obj = new Object();
            obj.f41050a = j10;
            obj.f41051b = f10;
            aVarArr[i10] = obj;
            return;
        }
        aVar.f41050a = j10;
        aVar.f41051b = f10;
    }

    public final float b(float f10) {
        int i10;
        float[] fArr;
        float[] fArr2;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = g.f34069a;
        if (f10 > g.f34069a) {
            int i11 = this.f41058e;
            a[] aVarArr = this.f41057d;
            a aVar = aVarArr[i11];
            if (aVar == null) {
                f11 = 0.0f;
            } else {
                a aVar2 = aVar;
                int i12 = 0;
                while (true) {
                    a aVar3 = aVarArr[i11];
                    boolean z11 = this.f41054a;
                    i10 = this.f41055b;
                    fArr = this.f41059f;
                    fArr2 = this.f41060g;
                    if (aVar3 == null) {
                        z10 = z11;
                        break;
                    }
                    int i13 = i11;
                    long j10 = aVar.f41050a;
                    z10 = z11;
                    long j11 = aVar3.f41050a;
                    float f16 = (float) (j10 - j11);
                    float abs = (float) Math.abs(j11 - aVar2.f41050a);
                    if (i10 != 1 && !z10) {
                        aVar2 = aVar;
                    } else {
                        aVar2 = aVar3;
                    }
                    if (f16 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i12] = aVar3.f41051b;
                    fArr2[i12] = -f16;
                    if (i13 == 0) {
                        i13 = 20;
                    }
                    int i14 = i13 - 1;
                    i12++;
                    if (i12 >= 20) {
                        break;
                    }
                    i11 = i14;
                }
                if (i12 >= this.f41056c) {
                    int e10 = k.e(i10);
                    if (e10 != 0) {
                        if (e10 == 1) {
                            if (i12 >= 2) {
                                if (i12 == 2) {
                                    float f17 = fArr2[0];
                                    float f18 = fArr2[1];
                                    if (f17 != f18) {
                                        if (z10) {
                                            f14 = fArr[0];
                                        } else {
                                            f14 = fArr[0] - fArr[1];
                                        }
                                        f12 = f14 / (f17 - f18);
                                    }
                                } else {
                                    int i15 = i12 - 1;
                                    float f19 = g.f34069a;
                                    for (int i16 = i15; i16 > 0; i16--) {
                                        int i17 = i16 - 1;
                                        if (fArr2[i16] != fArr2[i17]) {
                                            float signum = Math.signum(f19) * ((float) Math.sqrt(Math.abs(f19) * 2));
                                            if (z10) {
                                                f13 = -fArr[i17];
                                            } else {
                                                f13 = fArr[i16] - fArr[i17];
                                            }
                                            float f20 = f13 / (fArr2[i16] - fArr2[i17]);
                                            f19 += Math.abs(f20) * (f20 - signum);
                                            if (i16 == i15) {
                                                f19 *= 0.5f;
                                            }
                                        }
                                    }
                                    f12 = Math.signum(f19) * ((float) Math.sqrt(Math.abs(f19) * 2));
                                }
                            }
                            f12 = g.f34069a;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        try {
                            float[] fArr3 = this.f41061h;
                            vl.b.a0(fArr2, fArr, i12, fArr3);
                            f12 = fArr3[1];
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    f11 = f12 * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                    f15 = g.f34069a;
                } else {
                    f15 = g.f34069a;
                    f11 = g.f34069a;
                }
            }
            if (f11 != f15) {
                if (f11 > f15) {
                    return kotlin.ranges.d.c(f11, f10);
                }
                return kotlin.ranges.d.a(f11, -f10);
            }
            return f15;
        }
        t.C0("maximumVelocity should be a positive value. You specified=" + f10);
        throw null;
    }
}
