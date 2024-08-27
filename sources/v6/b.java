package v6;

import android.graphics.Bitmap;
import e5.p;
import e5.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import s0.g;
import t6.j;

/* loaded from: classes.dex */
public final class b extends s6.a {

    /* renamed from: m, reason: collision with root package name */
    public final p f37785m = new p();

    /* renamed from: n, reason: collision with root package name */
    public final p f37786n = new p();

    /* renamed from: o, reason: collision with root package name */
    public final a f37787o = new a();

    /* renamed from: p, reason: collision with root package name */
    public Inflater f37788p;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s6.a
    public final s6.b f(byte[] bArr, int i10, boolean z10) {
        char c10;
        boolean z11;
        d5.b bVar;
        int i11;
        int i12;
        int u10;
        int i13;
        int i14;
        int w10;
        int i15;
        p pVar = this.f37785m;
        pVar.D(i10, bArr);
        char c11 = 255;
        if (pVar.a() > 0 && (pVar.f15036a[pVar.f15037b] & 255) == 120) {
            if (this.f37788p == null) {
                this.f37788p = new Inflater();
            }
            Inflater inflater = this.f37788p;
            p pVar2 = this.f37786n;
            if (x.C(pVar, pVar2, inflater)) {
                pVar.D(pVar2.f15038c, pVar2.f15036a);
            }
        }
        a aVar = this.f37787o;
        int i16 = 0;
        aVar.f37779d = 0;
        aVar.f37780e = 0;
        aVar.f37781f = 0;
        aVar.f37782g = 0;
        aVar.f37783h = 0;
        aVar.f37784i = 0;
        p pVar3 = aVar.f37776a;
        pVar3.C(0);
        aVar.f37778c = false;
        ArrayList arrayList = new ArrayList();
        while (pVar.a() >= 3) {
            int i17 = pVar.f15038c;
            int u11 = pVar.u();
            int z12 = pVar.z();
            int i18 = pVar.f15037b + z12;
            if (i18 > i17) {
                pVar.F(i17);
                c10 = c11;
                i15 = i16;
                bVar = null;
            } else {
                int[] iArr = aVar.f37777b;
                if (u11 != 128) {
                    int i19 = 1;
                    switch (u11) {
                        case 20:
                            if (z12 % 5 == 2) {
                                pVar.G(2);
                                Arrays.fill(iArr, i16);
                                int i20 = i16;
                                for (int i21 = z12 / 5; i20 < i21; i21 = i21) {
                                    int u12 = pVar.u();
                                    int[] iArr2 = iArr;
                                    double u13 = pVar.u();
                                    double u14 = pVar.u() - 128;
                                    double u15 = pVar.u() - 128;
                                    iArr2[u12] = (x.i((int) ((u13 - (0.34414d * u15)) - (u14 * 0.71414d)), 0, 255) << 8) | (pVar.u() << 24) | (x.i((int) ((1.402d * u14) + u13), 0, 255) << 16) | x.i((int) ((u15 * 1.772d) + u13), 0, 255);
                                    i20++;
                                    iArr = iArr2;
                                    c11 = 255;
                                }
                                c10 = c11;
                                aVar.f37778c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (z12 >= 4) {
                                pVar.G(3);
                                if ((128 & pVar.u()) == 0) {
                                    i19 = i16;
                                }
                                int i22 = z12 - 4;
                                if (i19 != 0) {
                                    if (i22 >= 7 && (w10 = pVar.w()) >= 4) {
                                        aVar.f37783h = pVar.z();
                                        aVar.f37784i = pVar.z();
                                        pVar3.C(w10 - 4);
                                        i22 = z12 - 11;
                                    }
                                }
                                int i23 = pVar3.f15037b;
                                int i24 = pVar3.f15038c;
                                if (i23 < i24 && i22 > 0) {
                                    int min = Math.min(i22, i24 - i23);
                                    pVar.e(pVar3.f15036a, i23, min);
                                    pVar3.F(i23 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (z12 >= 19) {
                                aVar.f37779d = pVar.z();
                                aVar.f37780e = pVar.z();
                                pVar.G(11);
                                aVar.f37781f = pVar.z();
                                aVar.f37782g = pVar.z();
                                break;
                            }
                            break;
                    }
                    c10 = c11;
                    i14 = 0;
                    bVar = null;
                } else {
                    c10 = c11;
                    if (aVar.f37779d != 0 && aVar.f37780e != 0 && aVar.f37783h != 0 && aVar.f37784i != 0 && (i11 = pVar3.f15038c) != 0 && pVar3.f15037b == i11 && aVar.f37778c) {
                        pVar3.F(0);
                        int i25 = aVar.f37783h * aVar.f37784i;
                        int[] iArr3 = new int[i25];
                        int i26 = 0;
                        while (i26 < i25) {
                            int u16 = pVar3.u();
                            if (u16 != 0) {
                                i12 = i26 + 1;
                                iArr3[i26] = iArr[u16];
                            } else {
                                int u17 = pVar3.u();
                                if (u17 != 0) {
                                    if ((u17 & 64) == 0) {
                                        u10 = u17 & 63;
                                    } else {
                                        u10 = ((u17 & 63) << 8) | pVar3.u();
                                    }
                                    if ((u17 & 128) == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = iArr[pVar3.u()];
                                    }
                                    i12 = u10 + i26;
                                    Arrays.fill(iArr3, i26, i12, i13);
                                }
                            }
                            i26 = i12;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr3, aVar.f37783h, aVar.f37784i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.f37781f;
                        float f11 = aVar.f37779d;
                        float f12 = f10 / f11;
                        float f13 = aVar.f37782g;
                        float f14 = aVar.f37780e;
                        bVar = new d5.b(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.f37783h / f11, aVar.f37784i / f14, false, -16777216, Integer.MIN_VALUE, g.f34069a);
                        z11 = 0;
                    } else {
                        z11 = 0;
                        bVar = null;
                    }
                    aVar.f37779d = z11 ? 1 : 0;
                    aVar.f37780e = z11 ? 1 : 0;
                    aVar.f37781f = z11 ? 1 : 0;
                    aVar.f37782g = z11 ? 1 : 0;
                    aVar.f37783h = z11 ? 1 : 0;
                    aVar.f37784i = z11 ? 1 : 0;
                    pVar3.C(z11 ? 1 : 0);
                    aVar.f37778c = z11;
                    i14 = z11;
                }
                pVar.F(i18);
                i15 = i14;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i16 = i15;
            c11 = c10;
        }
        return new j(2, Collections.unmodifiableList(arrayList));
    }
}
