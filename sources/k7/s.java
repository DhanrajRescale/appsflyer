package k7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final List f22559a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f22560b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f22561c;

    /* renamed from: d, reason: collision with root package name */
    public final w f22562d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22563e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22564f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22565g;

    public s(w wVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        r rVar;
        int[] iArr3;
        int[] iArr4;
        w wVar2;
        int i10;
        r rVar2;
        int i11;
        int i12;
        int i13;
        this.f22559a = arrayList;
        this.f22560b = iArr;
        this.f22561c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f22562d = wVar;
        int h10 = wVar.h();
        this.f22563e = h10;
        int g10 = wVar.g();
        this.f22564f = g10;
        this.f22565g = true;
        if (arrayList.isEmpty()) {
            rVar = null;
        } else {
            rVar = (r) arrayList.get(0);
        }
        if (rVar == null || rVar.f22555a != 0 || rVar.f22556b != 0) {
            arrayList.add(0, new r(0, 0, 0));
        }
        arrayList.add(new r(h10, g10, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iArr3 = this.f22561c;
            iArr4 = this.f22560b;
            wVar2 = this.f22562d;
            if (!hasNext) {
                break;
            }
            r rVar3 = (r) it.next();
            for (int i14 = 0; i14 < rVar3.f22557c; i14++) {
                int i15 = rVar3.f22555a + i14;
                int i16 = rVar3.f22556b + i14;
                if (wVar2.a(i15, i16)) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                iArr4[i15] = (i16 << 4) | i13;
                iArr3[i16] = (i15 << 4) | i13;
            }
        }
        if (this.f22565g) {
            Iterator it2 = arrayList.iterator();
            int i17 = 0;
            while (it2.hasNext()) {
                r rVar4 = (r) it2.next();
                while (true) {
                    i10 = rVar4.f22555a;
                    if (i17 < i10) {
                        if (iArr4[i17] == 0) {
                            int size = arrayList.size();
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                if (i18 < size) {
                                    rVar2 = (r) arrayList.get(i18);
                                    while (true) {
                                        i11 = rVar2.f22556b;
                                        if (i19 < i11) {
                                            if (iArr3[i19] == 0 && wVar2.c(i17, i19)) {
                                                if (wVar2.a(i17, i19)) {
                                                    i12 = 8;
                                                } else {
                                                    i12 = 4;
                                                }
                                                iArr4[i17] = (i19 << 4) | i12;
                                                iArr3[i19] = i12 | (i17 << 4);
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                }
                                i19 = rVar2.f22557c + i11;
                                i18++;
                            }
                        }
                        i17++;
                    }
                }
                i17 = rVar4.f22557c + i10;
            }
        }
    }

    public static t b(ArrayDeque arrayDeque, int i10, boolean z10) {
        t tVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (it.hasNext()) {
                tVar = (t) it.next();
                if (tVar.f22574a == i10 && tVar.f22576c == z10) {
                    it.remove();
                    break;
                }
            } else {
                tVar = null;
                break;
            }
        }
        while (it.hasNext()) {
            t tVar2 = (t) it.next();
            if (z10) {
                tVar2.f22575b--;
            } else {
                tVar2.f22575b++;
            }
        }
        return tVar;
    }

    public final void a(r0 r0Var) {
        i iVar;
        int[] iArr;
        w wVar;
        int i10;
        int i11;
        List list;
        int i12;
        s sVar = this;
        if (r0Var instanceof i) {
            iVar = (i) r0Var;
        } else {
            iVar = new i(r0Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        List list2 = sVar.f22559a;
        int size = list2.size() - 1;
        int i13 = sVar.f22563e;
        int i14 = sVar.f22564f;
        int i15 = i13;
        while (size >= 0) {
            r rVar = (r) list2.get(size);
            int i16 = rVar.f22555a;
            int i17 = rVar.f22557c;
            int i18 = i16 + i17;
            int i19 = rVar.f22556b;
            int i20 = i19 + i17;
            while (true) {
                iArr = sVar.f22560b;
                wVar = sVar.f22562d;
                i10 = 0;
                if (i15 <= i18) {
                    break;
                }
                i15--;
                int i21 = iArr[i15];
                if ((i21 & 12) != 0) {
                    list = list2;
                    int i22 = i21 >> 4;
                    t b10 = b(arrayDeque, i22, false);
                    if (b10 != null) {
                        i12 = i14;
                        int i23 = (i13 - b10.f22575b) - 1;
                        iVar.a(i15, i23);
                        if ((i21 & 4) != 0) {
                            iVar.d(i23, 1, wVar.f(i15, i22));
                        }
                    } else {
                        i12 = i14;
                        arrayDeque.add(new t(i15, (i13 - i15) - 1, true));
                    }
                } else {
                    list = list2;
                    i12 = i14;
                    iVar.c(i15, 1);
                    i13--;
                }
                list2 = list;
                i14 = i12;
            }
            List list3 = list2;
            while (i14 > i20) {
                i14--;
                int i24 = sVar.f22561c[i14];
                if ((i24 & 12) != 0) {
                    int i25 = i24 >> 4;
                    t b11 = b(arrayDeque, i25, true);
                    if (b11 == null) {
                        arrayDeque.add(new t(i14, i13 - i15, false));
                        i11 = 0;
                    } else {
                        i11 = 0;
                        iVar.a((i13 - b11.f22575b) - 1, i15);
                        if ((i24 & 4) != 0) {
                            iVar.d(i15, 1, wVar.f(i25, i14));
                        }
                    }
                } else {
                    i11 = i10;
                    iVar.b(i15, 1);
                    i13++;
                }
                sVar = this;
                i10 = i11;
            }
            i15 = rVar.f22555a;
            int i26 = i15;
            int i27 = i19;
            while (i10 < i17) {
                if ((iArr[i26] & 15) == 2) {
                    iVar.d(i26, 1, wVar.f(i26, i27));
                }
                i26++;
                i27++;
                i10++;
            }
            size--;
            sVar = this;
            i14 = i19;
            list2 = list3;
        }
        iVar.e();
    }
}
