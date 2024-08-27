package k7;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final c2.p f22609a = new c2.p(3);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37, types: [k7.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [k7.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [k7.v, java.lang.Object] */
    public static s e(w wVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        u uVar;
        v vVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i10;
        u uVar2;
        u uVar3;
        r rVar;
        int i11;
        int i12;
        int i13;
        v vVar2;
        int i14;
        v vVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int h10 = wVar.h();
        int g10 = wVar.g();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ?? obj = new Object();
        int i23 = 0;
        obj.f22580a = 0;
        obj.f22581b = h10;
        obj.f22582c = 0;
        obj.f22583d = g10;
        arrayList6.add(obj);
        int i24 = h10 + g10;
        int i25 = 1;
        int i26 = (((i24 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i26];
        int i27 = i26 / 2;
        int[] iArr2 = new int[i26];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            u uVar4 = (u) arrayList6.remove(arrayList6.size() - i25);
            if (uVar4.b() >= i25 && uVar4.a() >= i25) {
                int a10 = ((uVar4.a() + uVar4.b()) + i25) / 2;
                int i28 = i25 + i27;
                iArr[i28] = uVar4.f22580a;
                iArr2[i28] = uVar4.f22581b;
                int i29 = i23;
                while (i29 < a10) {
                    if (Math.abs(uVar4.b() - uVar4.a()) % 2 == i25) {
                        i11 = i25;
                    } else {
                        i11 = i23;
                    }
                    int b10 = uVar4.b() - uVar4.a();
                    int i30 = -i29;
                    int i31 = i30;
                    while (true) {
                        if (i31 <= i29) {
                            if (i31 != i30 && (i31 == i29 || iArr[i31 + 1 + i27] <= iArr[(i31 - 1) + i27])) {
                                i19 = iArr[(i31 - 1) + i27];
                                i20 = i19 + 1;
                            } else {
                                i19 = iArr[i31 + 1 + i27];
                                i20 = i19;
                            }
                            i13 = a10;
                            arrayList = arrayList6;
                            int i32 = ((i20 - uVar4.f22580a) + uVar4.f22582c) - i31;
                            if (i29 != 0 && i20 == i19) {
                                i21 = i32 - 1;
                            } else {
                                i21 = i32;
                            }
                            arrayList2 = arrayList7;
                            while (i20 < uVar4.f22581b && i32 < uVar4.f22583d && wVar.c(i20, i32)) {
                                i20++;
                                i32++;
                            }
                            iArr[i31 + i27] = i20;
                            if (i11 != 0) {
                                int i33 = b10 - i31;
                                i22 = i11;
                                if (i33 >= i30 + 1 && i33 <= i29 - 1 && iArr2[i33 + i27] <= i20) {
                                    ?? obj2 = new Object();
                                    obj2.f22600a = i19;
                                    obj2.f22601b = i21;
                                    obj2.f22602c = i20;
                                    obj2.f22603d = i32;
                                    i12 = 0;
                                    obj2.f22604e = false;
                                    vVar2 = obj2;
                                    break;
                                }
                            } else {
                                i22 = i11;
                            }
                            i31 += 2;
                            i23 = 0;
                            a10 = i13;
                            arrayList6 = arrayList;
                            arrayList7 = arrayList2;
                            i11 = i22;
                        } else {
                            arrayList = arrayList6;
                            i12 = i23;
                            arrayList2 = arrayList7;
                            i13 = a10;
                            vVar2 = null;
                            break;
                        }
                    }
                    if (vVar2 != null) {
                        vVar = vVar2;
                        uVar = uVar4;
                        break;
                    }
                    if ((uVar4.b() - uVar4.a()) % 2 == 0) {
                        i14 = 1;
                    } else {
                        i14 = i12;
                    }
                    int b11 = uVar4.b() - uVar4.a();
                    int i34 = i30;
                    while (true) {
                        if (i34 <= i29) {
                            if (i34 != i30 && (i34 == i29 || iArr2[i34 + 1 + i27] >= iArr2[(i34 - 1) + i27])) {
                                i15 = iArr2[(i34 - 1) + i27];
                                i16 = i15 - 1;
                            } else {
                                i15 = iArr2[i34 + 1 + i27];
                                i16 = i15;
                            }
                            int i35 = uVar4.f22583d - ((uVar4.f22581b - i16) - i34);
                            if (i29 != 0 && i16 == i15) {
                                i17 = i35 + 1;
                            } else {
                                i17 = i35;
                            }
                            while (i16 > uVar4.f22580a && i35 > uVar4.f22582c) {
                                uVar = uVar4;
                                if (!wVar.c(i16 - 1, i35 - 1)) {
                                    break;
                                }
                                i16--;
                                i35--;
                                uVar4 = uVar;
                            }
                            uVar = uVar4;
                            iArr2[i34 + i27] = i16;
                            if (i14 != 0 && (i18 = b11 - i34) >= i30 && i18 <= i29 && iArr[i18 + i27] >= i16) {
                                ?? obj3 = new Object();
                                obj3.f22600a = i16;
                                obj3.f22601b = i35;
                                obj3.f22602c = i15;
                                obj3.f22603d = i17;
                                obj3.f22604e = true;
                                vVar3 = obj3;
                                break;
                            }
                            i34 += 2;
                            uVar4 = uVar;
                        } else {
                            uVar = uVar4;
                            vVar3 = null;
                            break;
                        }
                    }
                    if (vVar3 != null) {
                        vVar = vVar3;
                        break;
                    }
                    i29++;
                    a10 = i13;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    uVar4 = uVar;
                    i25 = 1;
                    i23 = 0;
                }
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            uVar = uVar4;
            vVar = null;
            if (vVar != null) {
                if (vVar.a() > 0) {
                    int i36 = vVar.f22603d;
                    int i37 = vVar.f22601b;
                    int i38 = i36 - i37;
                    int i39 = vVar.f22602c;
                    int i40 = vVar.f22600a;
                    int i41 = i39 - i40;
                    if (i38 != i41) {
                        if (vVar.f22604e) {
                            rVar = new r(i40, i37, vVar.a());
                        } else if (i38 > i41) {
                            rVar = new r(i40, i37 + 1, vVar.a());
                        } else {
                            rVar = new r(i40 + 1, i37, vVar.a());
                        }
                    } else {
                        rVar = new r(i40, i37, i41);
                    }
                    arrayList5.add(rVar);
                }
                if (arrayList2.isEmpty()) {
                    arrayList4 = arrayList2;
                    uVar2 = uVar;
                    i10 = 1;
                    uVar3 = new Object();
                } else {
                    i10 = 1;
                    arrayList4 = arrayList2;
                    uVar2 = uVar;
                    uVar3 = (u) arrayList4.remove(arrayList2.size() - 1);
                }
                uVar3.f22580a = uVar2.f22580a;
                uVar3.f22582c = uVar2.f22582c;
                uVar3.f22581b = vVar.f22600a;
                uVar3.f22583d = vVar.f22601b;
                arrayList3 = arrayList;
                arrayList3.add(uVar3);
                uVar2.f22581b = uVar2.f22581b;
                uVar2.f22583d = uVar2.f22583d;
                uVar2.f22580a = vVar.f22602c;
                uVar2.f22582c = vVar.f22603d;
                arrayList3.add(uVar2);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i10 = 1;
                arrayList4.add(uVar);
            }
            i25 = i10;
            arrayList6 = arrayList3;
            arrayList7 = arrayList4;
            i23 = 0;
        }
        Collections.sort(arrayList5, f22609a);
        return new s(wVar, arrayList5, iArr, iArr2);
    }

    public abstract boolean a(int i10, int i11);

    public abstract boolean b(Object obj, Object obj2);

    public abstract boolean c(int i10, int i11);

    public abstract boolean d(Object obj, Object obj2);

    public Object f(int i10, int i11) {
        return null;
    }

    public abstract int g();

    public abstract int h();
}
