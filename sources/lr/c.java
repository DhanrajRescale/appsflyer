package lr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f25092b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f25093c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f25094d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f25095e;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25096a;

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        f25094d = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f25094d[0][i10] = i10 - 63;
        }
        f25094d[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f25094d[1][i11] = i11 - 95;
        }
        f25094d[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f25094d[2][i12] = i12 - 46;
        }
        int[] iArr2 = f25094d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f25094d[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f25094d[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f25095e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f25095e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public c(byte[] bArr) {
        this.f25096a = bArr;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    e eVar2 = (e) it2.next();
                    if (eVar2.c(eVar)) {
                        break;
                    }
                    if (eVar.c(eVar2)) {
                        it2.remove();
                    }
                } else {
                    linkedList2.add(eVar);
                    break;
                }
            }
        }
        return linkedList2;
    }
}
