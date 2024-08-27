package z5;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f42044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42046c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42047d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42048e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42049f;

    /* renamed from: g, reason: collision with root package name */
    public final int f42050g;

    /* renamed from: h, reason: collision with root package name */
    public final float f42051h;

    /* renamed from: i, reason: collision with root package name */
    public final String f42052i;

    public /* synthetic */ c(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.f42044a = list;
        this.f42045b = i10;
        this.f42046c = i11;
        this.f42047d = i12;
        this.f42048e = i13;
        this.f42049f = i14;
        this.f42050g = i15;
        this.f42051h = f10;
        this.f42052i = str;
    }

    public static c a(e5.p pVar) {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        String str;
        try {
            pVar.G(4);
            int u10 = (pVar.u() & 3) + 1;
            if (u10 != 3) {
                ArrayList arrayList = new ArrayList();
                int u11 = pVar.u() & 31;
                int i15 = 0;
                while (true) {
                    bArr = e5.a.f14999a;
                    if (i15 >= u11) {
                        break;
                    }
                    int z10 = pVar.z();
                    int i16 = pVar.f15037b;
                    pVar.G(z10);
                    byte[] bArr2 = pVar.f15036a;
                    byte[] bArr3 = new byte[z10 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i16, bArr3, 4, z10);
                    arrayList.add(bArr3);
                    i15++;
                }
                int u12 = pVar.u();
                for (int i17 = 0; i17 < u12; i17++) {
                    int z11 = pVar.z();
                    int i18 = pVar.f15037b;
                    pVar.G(z11);
                    byte[] bArr4 = pVar.f15036a;
                    byte[] bArr5 = new byte[z11 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i18, bArr5, 4, z11);
                    arrayList.add(bArr5);
                }
                if (u11 > 0) {
                    f5.f d10 = f5.g.d((byte[]) arrayList.get(0), u10, ((byte[]) arrayList.get(0)).length);
                    int i19 = d10.f15942e;
                    int i20 = d10.f15943f;
                    int i21 = d10.f15951n;
                    int i22 = d10.f15952o;
                    int i23 = d10.f15953p;
                    float f11 = d10.f15944g;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(d10.f15938a), Integer.valueOf(d10.f15939b), Integer.valueOf(d10.f15940c));
                    i12 = i21;
                    i13 = i22;
                    i14 = i23;
                    f10 = f11;
                    i10 = i19;
                    i11 = i20;
                } else {
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    f10 = 1.0f;
                    str = null;
                }
                return new c(arrayList, u10, i10, i11, i12, i13, i14, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }

    public static c b(e5.p pVar) {
        List singletonList;
        int i10;
        int i11;
        try {
            pVar.G(21);
            int u10 = pVar.u() & 3;
            int u11 = pVar.u();
            int i12 = pVar.f15037b;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < u11; i15++) {
                pVar.G(1);
                int z10 = pVar.z();
                for (int i16 = 0; i16 < z10; i16++) {
                    int z11 = pVar.z();
                    i14 += z11 + 4;
                    pVar.G(z11);
                }
            }
            pVar.F(i12);
            byte[] bArr = new byte[i14];
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            float f10 = 1.0f;
            String str = null;
            int i22 = 0;
            int i23 = 0;
            while (i22 < u11) {
                int u12 = pVar.u() & 63;
                int z12 = pVar.z();
                int i24 = i13;
                while (i24 < z12) {
                    int z13 = pVar.z();
                    int i25 = u11;
                    System.arraycopy(f5.g.f15954a, i13, bArr, i23, 4);
                    int i26 = i23 + 4;
                    System.arraycopy(pVar.f15036a, pVar.f15037b, bArr, i26, z13);
                    if (u12 == 33 && i24 == 0) {
                        f5.d c10 = f5.g.c(bArr, i26, i26 + z13);
                        int i27 = c10.f15930g;
                        i18 = c10.f15931h;
                        i19 = c10.f15933j;
                        int i28 = c10.f15934k;
                        int i29 = c10.f15935l;
                        float f11 = c10.f15932i;
                        i10 = u12;
                        i11 = z12;
                        i17 = i27;
                        str = e5.a.c(c10.f15924a, c10.f15926c, c10.f15927d, c10.f15929f, c10.f15925b, c10.f15928e);
                        i21 = i29;
                        i20 = i28;
                        f10 = f11;
                    } else {
                        i10 = u12;
                        i11 = z12;
                    }
                    i23 = i26 + z13;
                    pVar.G(z13);
                    i24++;
                    u11 = i25;
                    u12 = i10;
                    z12 = i11;
                    i13 = 0;
                }
                i22++;
                i13 = 0;
            }
            if (i14 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new c(singletonList, u10 + 1, i17, i18, i19, i20, i21, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing HEVC config", e10);
        }
    }
}
