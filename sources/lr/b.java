package lr;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f25091a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(mr.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.b(i14, i13);
                    bVar.b(i14, i15);
                    bVar.b(i13, i14);
                    bVar.b(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.b(i16, i16);
        int i17 = i16 + 1;
        bVar.b(i17, i16);
        bVar.b(i16, i17);
        int i18 = i10 + i11;
        bVar.b(i18, i16);
        bVar.b(i18, i17);
        bVar.b(i18, i18 - 1);
    }

    public static mr.a b(mr.a aVar, int i10, int i11) {
        nr.a aVar2;
        int i12;
        int i13 = aVar.f27984b / i11;
        if (i11 != 4) {
            if (i11 != 6) {
                if (i11 != 8) {
                    if (i11 != 10) {
                        if (i11 == 12) {
                            aVar2 = nr.a.f29101g;
                        } else {
                            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i11)));
                        }
                    } else {
                        aVar2 = nr.a.f29102h;
                    }
                } else {
                    aVar2 = nr.a.f29106l;
                }
            } else {
                aVar2 = nr.a.f29103i;
            }
        } else {
            aVar2 = nr.a.f29104j;
        }
        wn.e eVar = new wn.e(aVar2);
        int i14 = i10 / i11;
        int[] iArr = new int[i14];
        int i15 = aVar.f27984b / i11;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                if (aVar.d((i16 * i11) + i18)) {
                    i12 = 1 << ((i11 - i18) - 1);
                } else {
                    i12 = 0;
                }
                i17 |= i12;
            }
            iArr[i16] = i17;
        }
        eVar.l(iArr, i14 - i13);
        mr.a aVar3 = new mr.a();
        aVar3.b(0, i10 % i11);
        for (int i19 = 0; i19 < i14; i19++) {
            aVar3.b(iArr[i19], i11);
        }
        return aVar3;
    }

    public static mr.a c(int i10, mr.a aVar) {
        mr.a aVar2 = new mr.a();
        int i11 = aVar.f27984b;
        int i12 = (1 << i10) - 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = i13 + i15;
                if (i16 >= i11 || aVar.d(i16)) {
                    i14 |= 1 << ((i10 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                aVar2.b(i17, i10);
            } else if (i17 == 0) {
                aVar2.b(i14 | 1, i10);
            } else {
                aVar2.b(i14, i10);
                i13 += i10;
            }
            i13--;
            i13 += i10;
        }
        return aVar2;
    }
}
