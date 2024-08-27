package u9;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import t.k0;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final tr.e f37028a = tr.e.y("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final tr.e f37029b = tr.e.y("id", "layers", "w", "h", "p", yk.u.f41726f);

    /* renamed from: c, reason: collision with root package name */
    public static final tr.e f37030c = tr.e.y("list");

    /* renamed from: d, reason: collision with root package name */
    public static final tr.e f37031d = tr.e.y("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    public static j9.i a(v9.d dVar) {
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList arrayList;
        k0 k0Var;
        HashMap hashMap3;
        ArrayList arrayList2;
        k0 k0Var2;
        j9.i iVar;
        float f10;
        int i10;
        float f11;
        j9.i iVar2;
        int i11;
        float f12;
        int i12;
        float c10 = w9.f.c();
        t.o oVar = new t.o((Object) null);
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        k0 k0Var3 = new k0(0);
        j9.i iVar3 = new j9.i();
        dVar.b();
        int i13 = 0;
        int i14 = 0;
        float f13 = s0.g.f34069a;
        float f14 = s0.g.f34069a;
        float f15 = s0.g.f34069a;
        while (dVar.g()) {
            switch (dVar.H(f37028a)) {
                case 0:
                    hashMap = hashMap6;
                    i13 = dVar.n();
                    hashMap6 = hashMap;
                    break;
                case 1:
                    hashMap = hashMap6;
                    i14 = dVar.n();
                    hashMap6 = hashMap;
                    break;
                case 2:
                    hashMap2 = hashMap6;
                    arrayList = arrayList4;
                    k0Var = k0Var3;
                    f14 = (float) dVar.l();
                    arrayList4 = arrayList;
                    hashMap6 = hashMap2;
                    k0Var3 = k0Var;
                    break;
                case 3:
                    hashMap2 = hashMap6;
                    arrayList = arrayList4;
                    k0Var = k0Var3;
                    f13 = ((float) dVar.l()) - 0.01f;
                    arrayList4 = arrayList;
                    hashMap6 = hashMap2;
                    k0Var3 = k0Var;
                    break;
                case 4:
                    hashMap2 = hashMap6;
                    arrayList = arrayList4;
                    k0Var = k0Var3;
                    f15 = (float) dVar.l();
                    arrayList4 = arrayList;
                    hashMap6 = hashMap2;
                    k0Var3 = k0Var;
                    break;
                case 5:
                    hashMap3 = hashMap6;
                    arrayList2 = arrayList4;
                    k0Var2 = k0Var3;
                    iVar = iVar3;
                    f10 = f13;
                    i10 = i14;
                    f11 = f14;
                    String[] split = dVar.v().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    iVar3 = iVar;
                    f14 = f11;
                    arrayList4 = arrayList2;
                    f13 = f10;
                    hashMap6 = hashMap3;
                    k0Var3 = k0Var2;
                    i14 = i10;
                    break;
                case 6:
                    hashMap3 = hashMap6;
                    arrayList2 = arrayList4;
                    k0Var2 = k0Var3;
                    j9.i iVar4 = iVar3;
                    f10 = f13;
                    i10 = i14;
                    f11 = f14;
                    dVar.a();
                    int i15 = 0;
                    while (dVar.g()) {
                        j9.i iVar5 = iVar4;
                        s9.e a10 = s.a(dVar, iVar5);
                        if (a10.f34381e == 3) {
                            i15++;
                        }
                        arrayList3.add(a10);
                        oVar.g(a10.f34380d, a10);
                        if (i15 > 4) {
                            w9.b.b("You have " + i15 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        iVar4 = iVar5;
                    }
                    iVar = iVar4;
                    dVar.c();
                    iVar3 = iVar;
                    f14 = f11;
                    arrayList4 = arrayList2;
                    f13 = f10;
                    hashMap6 = hashMap3;
                    k0Var3 = k0Var2;
                    i14 = i10;
                    break;
                case 7:
                    arrayList2 = arrayList4;
                    f10 = f13;
                    int i16 = i14;
                    f11 = f14;
                    dVar.a();
                    while (dVar.g()) {
                        ArrayList arrayList5 = new ArrayList();
                        String str = null;
                        t.o oVar2 = new t.o((Object) null);
                        dVar.b();
                        HashMap hashMap7 = hashMap6;
                        String str2 = null;
                        int i17 = 0;
                        int i18 = 0;
                        while (dVar.g()) {
                            k0 k0Var4 = k0Var3;
                            int H = dVar.H(f37029b);
                            if (H != 0) {
                                int i19 = i16;
                                if (H != 1) {
                                    if (H != 2) {
                                        if (H != 3) {
                                            if (H != 4) {
                                                if (H != 5) {
                                                    dVar.I();
                                                    dVar.J();
                                                    iVar2 = iVar3;
                                                } else {
                                                    dVar.v();
                                                }
                                            } else {
                                                str = dVar.v();
                                            }
                                        } else {
                                            i18 = dVar.n();
                                        }
                                    } else {
                                        i17 = dVar.n();
                                    }
                                    k0Var3 = k0Var4;
                                    i16 = i19;
                                } else {
                                    dVar.a();
                                    while (dVar.g()) {
                                        s9.e a11 = s.a(dVar, iVar3);
                                        oVar2.g(a11.f34380d, a11);
                                        arrayList5.add(a11);
                                        iVar3 = iVar3;
                                    }
                                    iVar2 = iVar3;
                                    dVar.c();
                                }
                                iVar3 = iVar2;
                                k0Var3 = k0Var4;
                                i16 = i19;
                            } else {
                                str2 = dVar.v();
                                k0Var3 = k0Var4;
                            }
                        }
                        k0 k0Var5 = k0Var3;
                        int i20 = i16;
                        j9.i iVar6 = iVar3;
                        dVar.d();
                        if (str != null) {
                            hashMap5.put(str2, new j9.z(str2, str, i17, i18));
                        } else {
                            hashMap4.put(str2, arrayList5);
                        }
                        iVar3 = iVar6;
                        hashMap6 = hashMap7;
                        k0Var3 = k0Var5;
                        i16 = i20;
                    }
                    hashMap3 = hashMap6;
                    k0Var2 = k0Var3;
                    i10 = i16;
                    dVar.c();
                    iVar = iVar3;
                    iVar3 = iVar;
                    f14 = f11;
                    arrayList4 = arrayList2;
                    f13 = f10;
                    hashMap6 = hashMap3;
                    k0Var3 = k0Var2;
                    i14 = i10;
                    break;
                case 8:
                    f10 = f13;
                    i11 = i14;
                    f11 = f14;
                    dVar.b();
                    while (dVar.g()) {
                        if (dVar.H(f37030c) != 0) {
                            dVar.I();
                            dVar.J();
                        } else {
                            dVar.a();
                            while (dVar.g()) {
                                tr.e eVar = l.f37013a;
                                dVar.b();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                while (dVar.g()) {
                                    int H2 = dVar.H(l.f37013a);
                                    if (H2 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (H2 != 1) {
                                            if (H2 != 2) {
                                                if (H2 != 3) {
                                                    dVar.I();
                                                    dVar.J();
                                                } else {
                                                    dVar.l();
                                                }
                                            } else {
                                                str5 = dVar.v();
                                            }
                                        } else {
                                            str4 = dVar.v();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        str3 = dVar.v();
                                    }
                                }
                                dVar.d();
                                hashMap6.put(str4, new p9.c(str3, str4, str5));
                                arrayList4 = arrayList4;
                            }
                            dVar.c();
                        }
                    }
                    arrayList2 = arrayList4;
                    dVar.d();
                    hashMap3 = hashMap6;
                    k0Var2 = k0Var3;
                    i10 = i11;
                    iVar = iVar3;
                    iVar3 = iVar;
                    f14 = f11;
                    arrayList4 = arrayList2;
                    f13 = f10;
                    hashMap6 = hashMap3;
                    k0Var3 = k0Var2;
                    i14 = i10;
                    break;
                case 9:
                    f10 = f13;
                    i11 = i14;
                    f11 = f14;
                    dVar.a();
                    while (dVar.g()) {
                        tr.e eVar2 = k.f37011a;
                        ArrayList arrayList7 = new ArrayList();
                        dVar.b();
                        double d10 = 0.0d;
                        char c11 = 0;
                        String str6 = null;
                        String str7 = null;
                        while (dVar.g()) {
                            int H3 = dVar.H(k.f37011a);
                            if (H3 != 0) {
                                if (H3 != 1) {
                                    if (H3 != 2) {
                                        if (H3 != 3) {
                                            if (H3 != 4) {
                                                if (H3 != 5) {
                                                    dVar.I();
                                                    dVar.J();
                                                } else {
                                                    dVar.b();
                                                    while (dVar.g()) {
                                                        if (dVar.H(k.f37012b) != 0) {
                                                            dVar.I();
                                                            dVar.J();
                                                        } else {
                                                            dVar.a();
                                                            while (dVar.g()) {
                                                                arrayList7.add((r9.m) g.a(dVar, iVar3));
                                                            }
                                                            dVar.c();
                                                        }
                                                    }
                                                    dVar.d();
                                                }
                                            } else {
                                                str7 = dVar.v();
                                            }
                                        } else {
                                            str6 = dVar.v();
                                        }
                                    } else {
                                        d10 = dVar.l();
                                    }
                                } else {
                                    dVar.l();
                                }
                            } else {
                                c11 = dVar.v().charAt(0);
                            }
                        }
                        dVar.d();
                        p9.d dVar2 = new p9.d(arrayList7, c11, d10, str6, str7);
                        k0Var3.g(dVar2.hashCode(), dVar2);
                    }
                    dVar.c();
                    hashMap3 = hashMap6;
                    arrayList2 = arrayList4;
                    k0Var2 = k0Var3;
                    i10 = i11;
                    iVar = iVar3;
                    iVar3 = iVar;
                    f14 = f11;
                    arrayList4 = arrayList2;
                    f13 = f10;
                    hashMap6 = hashMap3;
                    k0Var3 = k0Var2;
                    i14 = i10;
                    break;
                case 10:
                    dVar.a();
                    while (dVar.g()) {
                        dVar.b();
                        String str8 = null;
                        float f16 = s0.g.f34069a;
                        float f17 = s0.g.f34069a;
                        while (dVar.g()) {
                            int H4 = dVar.H(f37031d);
                            if (H4 != 0) {
                                f12 = f13;
                                if (H4 != 1) {
                                    if (H4 != 2) {
                                        dVar.I();
                                        dVar.J();
                                    } else {
                                        i12 = i14;
                                        f14 = f14;
                                        f17 = (float) dVar.l();
                                    }
                                } else {
                                    i12 = i14;
                                    f14 = f14;
                                    f16 = (float) dVar.l();
                                }
                                f13 = f12;
                                i14 = i12;
                            } else {
                                f12 = f13;
                                str8 = dVar.v();
                            }
                            f13 = f12;
                        }
                        dVar.d();
                        arrayList4.add(new p9.h(str8, f16, f17));
                        i14 = i14;
                        f14 = f14;
                        f13 = f13;
                    }
                    f10 = f13;
                    i11 = i14;
                    f11 = f14;
                    dVar.c();
                    hashMap3 = hashMap6;
                    arrayList2 = arrayList4;
                    k0Var2 = k0Var3;
                    i10 = i11;
                    iVar = iVar3;
                    iVar3 = iVar;
                    f14 = f11;
                    arrayList4 = arrayList2;
                    f13 = f10;
                    hashMap6 = hashMap3;
                    k0Var3 = k0Var2;
                    i14 = i10;
                    break;
                default:
                    dVar.I();
                    dVar.J();
                    hashMap3 = hashMap6;
                    arrayList2 = arrayList4;
                    k0Var2 = k0Var3;
                    iVar = iVar3;
                    f10 = f13;
                    i10 = i14;
                    f11 = f14;
                    iVar3 = iVar;
                    f14 = f11;
                    arrayList4 = arrayList2;
                    f13 = f10;
                    hashMap6 = hashMap3;
                    k0Var3 = k0Var2;
                    i14 = i10;
                    break;
            }
        }
        HashMap hashMap8 = hashMap6;
        j9.i iVar7 = iVar3;
        iVar7.f21175j = new Rect(0, 0, (int) (i13 * c10), (int) (i14 * c10));
        iVar7.f21176k = f14;
        iVar7.f21177l = f13;
        iVar7.f21178m = f15;
        iVar7.f21174i = arrayList3;
        iVar7.f21173h = oVar;
        iVar7.f21168c = hashMap4;
        iVar7.f21169d = hashMap5;
        iVar7.f21172g = k0Var3;
        iVar7.f21170e = hashMap8;
        iVar7.f21171f = arrayList4;
        return iVar7;
    }
}
