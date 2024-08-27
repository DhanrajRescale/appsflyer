package r0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f32558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f32559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f32560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f32562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f32563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hu.c f32564h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Function2 function2, Function2 function22, Function2 function23, int i10, b0.x1 x1Var, Function2 function24, hu.c cVar, int i11) {
        super(2);
        this.f32557a = i11;
        this.f32558b = function2;
        this.f32559c = function22;
        this.f32560d = function23;
        this.f32561e = i10;
        this.f32562f = x1Var;
        this.f32563g = function24;
        this.f32564h = cVar;
    }

    public final a2.n0 a(a2.k1 k1Var, long j10) {
        a2.n0 n0;
        Object obj;
        int i10;
        Object obj2;
        int i11;
        Object obj3;
        ArrayList arrayList;
        int i12;
        ArrayList arrayList2;
        d4.c0 c0Var;
        Object obj4;
        Integer num;
        Integer num2;
        int i13;
        a2.n0 n02;
        int b10;
        int m02;
        int b11;
        Object obj5;
        Object obj6;
        int m03;
        int m04;
        switch (this.f32557a) {
            case 0:
                int h10 = w2.a.h(j10);
                int g10 = w2.a.g(j10);
                n0 = k1Var.n0(h10, g10, vt.p0.d(), new k2(k1Var, this.f32558b, this.f32559c, this.f32560d, this.f32561e, h10, this.f32562f, w2.a.a(j10, 0, 0, 0, 0, 10), this.f32563g, this.f32564h, g10));
                return n0;
            default:
                int h11 = w2.a.h(j10);
                int g11 = w2.a.g(j10);
                long a10 = w2.a.a(j10, 0, 0, 0, 0, 10);
                List k10 = k1Var.k(q2.f32681a, this.f32558b);
                ArrayList arrayList3 = new ArrayList(k10.size());
                int size = k10.size();
                for (int i14 = 0; i14 < size; i14 = nn.d.d((a2.l0) k10.get(i14), a10, arrayList3, i14, 1)) {
                }
                if (arrayList3.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList3.get(0);
                    int i15 = ((a2.a1) obj).f30b;
                    int f10 = vt.y.f(arrayList3);
                    if (1 <= f10) {
                        int i16 = 1;
                        while (true) {
                            Object obj7 = arrayList3.get(i16);
                            int i17 = ((a2.a1) obj7).f30b;
                            if (i15 < i17) {
                                obj = obj7;
                                i15 = i17;
                            }
                            if (i16 != f10) {
                                i16++;
                            }
                        }
                    }
                }
                a2.a1 a1Var = (a2.a1) obj;
                if (a1Var != null) {
                    i10 = a1Var.f30b;
                } else {
                    i10 = 0;
                }
                List k11 = k1Var.k(q2.f32683c, this.f32559c);
                ArrayList arrayList4 = new ArrayList(k11.size());
                int size2 = k11.size();
                int i18 = 0;
                while (true) {
                    b0.x1 x1Var = this.f32562f;
                    if (i18 < size2) {
                        i18 = nn.d.d((a2.l0) k11.get(i18), hl.f.F0((-x1Var.a(k1Var, k1Var.getLayoutDirection())) - x1Var.c(k1Var, k1Var.getLayoutDirection()), -x1Var.b(k1Var), a10), arrayList4, i18, 1);
                    } else {
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList4.get(0);
                            int i19 = ((a2.a1) obj2).f30b;
                            int f11 = vt.y.f(arrayList4);
                            if (1 <= f11) {
                                int i20 = i19;
                                Object obj8 = obj2;
                                int i21 = 1;
                                while (true) {
                                    Object obj9 = arrayList4.get(i21);
                                    int i22 = ((a2.a1) obj9).f30b;
                                    if (i20 < i22) {
                                        obj8 = obj9;
                                        i20 = i22;
                                    }
                                    if (i21 != f11) {
                                        i21++;
                                    } else {
                                        obj2 = obj8;
                                    }
                                }
                            }
                        }
                        a2.a1 a1Var2 = (a2.a1) obj2;
                        if (a1Var2 != null) {
                            i11 = a1Var2.f30b;
                        } else {
                            i11 = 0;
                        }
                        if (arrayList4.isEmpty()) {
                            arrayList = arrayList4;
                            obj3 = null;
                        } else {
                            obj3 = arrayList4.get(0);
                            int i23 = ((a2.a1) obj3).f29a;
                            int f12 = vt.y.f(arrayList4);
                            if (1 <= f12) {
                                Object obj10 = obj3;
                                int i24 = i23;
                                int i25 = 1;
                                while (true) {
                                    Object obj11 = arrayList4.get(i25);
                                    arrayList = arrayList4;
                                    int i26 = ((a2.a1) obj11).f29a;
                                    if (i24 < i26) {
                                        i24 = i26;
                                        obj10 = obj11;
                                    }
                                    if (i25 != f12) {
                                        i25++;
                                        arrayList4 = arrayList;
                                    } else {
                                        obj3 = obj10;
                                    }
                                }
                            } else {
                                arrayList = arrayList4;
                            }
                        }
                        a2.a1 a1Var3 = (a2.a1) obj3;
                        if (a1Var3 != null) {
                            i12 = a1Var3.f29a;
                        } else {
                            i12 = 0;
                        }
                        List k12 = k1Var.k(q2.f32684d, this.f32560d);
                        ArrayList arrayList5 = new ArrayList(k12.size());
                        int size3 = k12.size();
                        int i27 = 0;
                        while (i27 < size3) {
                            List list = k12;
                            int i28 = size3;
                            a2.a1 E = ((a2.l0) k12.get(i27)).E(hl.f.F0((-x1Var.a(k1Var, k1Var.getLayoutDirection())) - x1Var.c(k1Var, k1Var.getLayoutDirection()), -x1Var.b(k1Var), a10));
                            if (E.f30b == 0 || E.f29a == 0) {
                                E = null;
                            }
                            if (E != null) {
                                arrayList5.add(E);
                            }
                            i27++;
                            k12 = list;
                            size3 = i28;
                        }
                        boolean z10 = !arrayList5.isEmpty();
                        int i29 = this.f32561e;
                        if (z10) {
                            if (arrayList5.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList5.get(0);
                                int i30 = ((a2.a1) obj5).f29a;
                                int f13 = vt.y.f(arrayList5);
                                if (1 <= f13) {
                                    int i31 = i30;
                                    int i32 = 1;
                                    while (true) {
                                        Object obj12 = arrayList5.get(i32);
                                        Object obj13 = obj5;
                                        int i33 = ((a2.a1) obj12).f29a;
                                        if (i31 < i33) {
                                            i31 = i33;
                                            obj5 = obj12;
                                        } else {
                                            obj5 = obj13;
                                        }
                                        if (i32 != f13) {
                                            i32++;
                                        }
                                    }
                                }
                            }
                            Intrinsics.c(obj5);
                            int i34 = ((a2.a1) obj5).f29a;
                            if (arrayList5.isEmpty()) {
                                arrayList2 = arrayList5;
                                obj6 = null;
                            } else {
                                obj6 = arrayList5.get(0);
                                int i35 = ((a2.a1) obj6).f30b;
                                int f14 = vt.y.f(arrayList5);
                                if (1 <= f14) {
                                    int i36 = 1;
                                    Object obj14 = obj6;
                                    int i37 = i35;
                                    while (true) {
                                        Object obj15 = arrayList5.get(i36);
                                        arrayList2 = arrayList5;
                                        int i38 = ((a2.a1) obj15).f30b;
                                        if (i37 < i38) {
                                            i37 = i38;
                                            obj14 = obj15;
                                        }
                                        if (i36 != f14) {
                                            i36++;
                                            arrayList5 = arrayList2;
                                        } else {
                                            obj6 = obj14;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList5;
                                }
                            }
                            Intrinsics.c(obj6);
                            int i39 = ((a2.a1) obj6).f30b;
                            boolean o10 = vl.b.o(i29, 0);
                            w2.k kVar = w2.k.f38799a;
                            if (o10) {
                                if (k1Var.getLayoutDirection() == kVar) {
                                    m03 = k1Var.m0(p2.f32671c);
                                    c0Var = new d4.c0(m03, i39);
                                } else {
                                    m04 = k1Var.m0(p2.f32671c);
                                    m03 = (h11 - m04) - i34;
                                    c0Var = new d4.c0(m03, i39);
                                }
                            } else {
                                if (vl.b.o(i29, 2) || vl.b.o(i29, 3)) {
                                    if (k1Var.getLayoutDirection() == kVar) {
                                        m04 = k1Var.m0(p2.f32671c);
                                        m03 = (h11 - m04) - i34;
                                    } else {
                                        m03 = k1Var.m0(p2.f32671c);
                                    }
                                } else {
                                    m03 = (h11 - i34) / 2;
                                }
                                c0Var = new d4.c0(m03, i39);
                            }
                        } else {
                            arrayList2 = arrayList5;
                            c0Var = null;
                        }
                        q2 q2Var = q2.f32685e;
                        j2 j2Var = new j2(c0Var, this.f32563g, 1);
                        Object obj16 = b1.d.f3079a;
                        List k13 = k1Var.k(q2Var, new b1.c(j2Var, true, 1843374446));
                        ArrayList arrayList6 = new ArrayList(k13.size());
                        int size4 = k13.size();
                        for (int i40 = 0; i40 < size4; i40 = nn.d.d((a2.l0) k13.get(i40), a10, arrayList6, i40, 1)) {
                        }
                        if (arrayList6.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList6.get(0);
                            int i41 = ((a2.a1) obj4).f30b;
                            int f15 = vt.y.f(arrayList6);
                            int i42 = 1;
                            if (1 <= f15) {
                                while (true) {
                                    Object obj17 = arrayList6.get(i42);
                                    Object obj18 = obj4;
                                    int i43 = ((a2.a1) obj17).f30b;
                                    if (i41 < i43) {
                                        i41 = i43;
                                        obj4 = obj17;
                                    } else {
                                        obj4 = obj18;
                                    }
                                    if (i42 != f15) {
                                        i42++;
                                    }
                                }
                            }
                        }
                        a2.a1 a1Var4 = (a2.a1) obj4;
                        if (a1Var4 != null) {
                            num = Integer.valueOf(a1Var4.f30b);
                        } else {
                            num = null;
                        }
                        if (c0Var != null) {
                            int i44 = c0Var.f13728b;
                            if (num != null && !vl.b.o(i29, 3)) {
                                m02 = num.intValue() + i44;
                                b11 = k1Var.m0(p2.f32671c);
                            } else {
                                m02 = k1Var.m0(p2.f32671c) + i44;
                                b11 = x1Var.b(k1Var);
                            }
                            num2 = Integer.valueOf(b11 + m02);
                        } else {
                            num2 = null;
                        }
                        if (i11 != 0) {
                            if (num2 != null) {
                                b10 = num2.intValue();
                            } else if (num != null) {
                                b10 = num.intValue();
                            } else {
                                b10 = x1Var.b(k1Var);
                            }
                            i13 = i11 + b10;
                        } else {
                            i13 = 0;
                        }
                        d4.c0 c0Var2 = c0Var;
                        List k14 = k1Var.k(q2.f32682b, new b1.c(new i2(this.f32562f, k1Var, arrayList3, i10, arrayList6, num, this.f32564h, 1), true, 1655277373));
                        ArrayList arrayList7 = new ArrayList(k14.size());
                        int size5 = k14.size();
                        for (int i45 = 0; i45 < size5; i45 = nn.d.d((a2.l0) k14.get(i45), a10, arrayList7, i45, 1)) {
                        }
                        n02 = k1Var.n0(h11, g11, vt.p0.d(), new o2(arrayList7, arrayList3, arrayList, arrayList6, c0Var2, h11, i12, this.f32562f, k1Var, g11, i13, num, arrayList2, num2));
                        return n02;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32557a) {
            case 0:
                return a((a2.k1) obj, ((w2.a) obj2).f38776a);
            default:
                return a((a2.k1) obj, ((w2.a) obj2).f38776a);
        }
    }
}
