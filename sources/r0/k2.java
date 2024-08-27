package r0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.k1 f32513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f32514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f32515c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f32516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f32519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f32520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f32521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hu.c f32522j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f32523k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(a2.k1 k1Var, Function2 function2, Function2 function22, Function2 function23, int i10, int i11, b0.x1 x1Var, long j10, Function2 function24, hu.c cVar, int i12) {
        super(1);
        this.f32513a = k1Var;
        this.f32514b = function2;
        this.f32515c = function22;
        this.f32516d = function23;
        this.f32517e = i10;
        this.f32518f = i11;
        this.f32519g = x1Var;
        this.f32520h = j10;
        this.f32521i = function24;
        this.f32522j = cVar;
        this.f32523k = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j10;
        Object obj2;
        int i10;
        b0.x1 x1Var;
        Object obj3;
        int i11;
        Object obj4;
        int i12;
        ArrayList arrayList;
        d4.c0 c0Var;
        Object obj5;
        Integer num;
        Integer num2;
        int i13;
        int i14;
        int i15;
        int b10;
        int intValue;
        int m02;
        Object obj6;
        Object obj7;
        int i16;
        int m03;
        a2.z0 z0Var = (a2.z0) obj;
        q2 q2Var = q2.f32681a;
        Function2 function2 = this.f32514b;
        a2.k1 k1Var = this.f32513a;
        List k10 = k1Var.k(q2Var, function2);
        ArrayList arrayList2 = new ArrayList(k10.size());
        int size = k10.size();
        int i17 = 0;
        while (true) {
            j10 = this.f32520h;
            if (i17 >= size) {
                break;
            }
            i17 = nn.d.d((a2.l0) k10.get(i17), j10, arrayList2, i17, 1);
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int i18 = ((a2.a1) obj2).f30b;
            int f10 = vt.y.f(arrayList2);
            if (1 <= f10) {
                int i19 = 1;
                while (true) {
                    Object obj8 = arrayList2.get(i19);
                    int i20 = ((a2.a1) obj8).f30b;
                    if (i18 < i20) {
                        obj2 = obj8;
                        i18 = i20;
                    }
                    if (i19 == f10) {
                        break;
                    }
                    i19++;
                }
            }
        }
        a2.a1 a1Var = (a2.a1) obj2;
        if (a1Var != null) {
            i10 = a1Var.f30b;
        } else {
            i10 = 0;
        }
        List k11 = k1Var.k(q2.f32683c, this.f32515c);
        ArrayList arrayList3 = new ArrayList(k11.size());
        int size2 = k11.size();
        int i21 = 0;
        while (true) {
            x1Var = this.f32519g;
            if (i21 >= size2) {
                break;
            }
            i21 = nn.d.d((a2.l0) k11.get(i21), hl.f.F0((-x1Var.a(k1Var, k1Var.getLayoutDirection())) - x1Var.c(k1Var, k1Var.getLayoutDirection()), -x1Var.b(k1Var), j10), arrayList3, i21, 1);
        }
        if (arrayList3.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList3.get(0);
            int i22 = ((a2.a1) obj3).f30b;
            int f11 = vt.y.f(arrayList3);
            if (1 <= f11) {
                int i23 = 1;
                while (true) {
                    Object obj9 = arrayList3.get(i23);
                    int i24 = ((a2.a1) obj9).f30b;
                    if (i22 < i24) {
                        obj3 = obj9;
                        i22 = i24;
                    }
                    if (i23 == f11) {
                        break;
                    }
                    i23++;
                }
            }
        }
        a2.a1 a1Var2 = (a2.a1) obj3;
        if (a1Var2 != null) {
            i11 = a1Var2.f30b;
        } else {
            i11 = 0;
        }
        if (arrayList3.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList3.get(0);
            int i25 = ((a2.a1) obj4).f29a;
            int f12 = vt.y.f(arrayList3);
            if (1 <= f12) {
                int i26 = 1;
                while (true) {
                    Object obj10 = arrayList3.get(i26);
                    int i27 = ((a2.a1) obj10).f29a;
                    if (i25 < i27) {
                        i25 = i27;
                        obj4 = obj10;
                    }
                    if (i26 == f12) {
                        break;
                    }
                    i26++;
                }
            }
        }
        a2.a1 a1Var3 = (a2.a1) obj4;
        if (a1Var3 != null) {
            i12 = a1Var3.f29a;
        } else {
            i12 = 0;
        }
        List k12 = k1Var.k(q2.f32684d, this.f32516d);
        ArrayList arrayList4 = new ArrayList(k12.size());
        int size3 = k12.size();
        int i28 = 0;
        while (i28 < size3) {
            List list = k12;
            int i29 = size3;
            ArrayList arrayList5 = arrayList3;
            a2.a1 E = ((a2.l0) k12.get(i28)).E(hl.f.F0((-x1Var.a(k1Var, k1Var.getLayoutDirection())) - x1Var.c(k1Var, k1Var.getLayoutDirection()), -x1Var.b(k1Var), j10));
            if (E.f30b == 0 || E.f29a == 0) {
                E = null;
            }
            if (E != null) {
                arrayList4.add(E);
            }
            i28++;
            k12 = list;
            size3 = i29;
            arrayList3 = arrayList5;
        }
        ArrayList arrayList6 = arrayList3;
        boolean z10 = !arrayList4.isEmpty();
        int i30 = this.f32518f;
        if (z10) {
            if (arrayList4.isEmpty()) {
                obj6 = null;
            } else {
                obj6 = arrayList4.get(0);
                int i31 = ((a2.a1) obj6).f29a;
                int f13 = vt.y.f(arrayList4);
                if (1 <= f13) {
                    int i32 = 1;
                    while (true) {
                        Object obj11 = arrayList4.get(i32);
                        Object obj12 = obj6;
                        int i33 = ((a2.a1) obj11).f29a;
                        if (i31 < i33) {
                            i31 = i33;
                            obj6 = obj11;
                        } else {
                            obj6 = obj12;
                        }
                        if (i32 == f13) {
                            break;
                        }
                        i32++;
                    }
                }
            }
            Intrinsics.c(obj6);
            int i34 = ((a2.a1) obj6).f29a;
            if (arrayList4.isEmpty()) {
                arrayList = arrayList4;
                obj7 = null;
            } else {
                obj7 = arrayList4.get(0);
                int i35 = ((a2.a1) obj7).f30b;
                int f14 = vt.y.f(arrayList4);
                if (1 <= f14) {
                    int i36 = i35;
                    Object obj13 = obj7;
                    int i37 = 1;
                    while (true) {
                        Object obj14 = arrayList4.get(i37);
                        arrayList = arrayList4;
                        int i38 = ((a2.a1) obj14).f30b;
                        if (i36 < i38) {
                            i36 = i38;
                            obj13 = obj14;
                        }
                        if (i37 == f14) {
                            break;
                        }
                        i37++;
                        arrayList4 = arrayList;
                    }
                    obj7 = obj13;
                } else {
                    arrayList = arrayList4;
                }
            }
            Intrinsics.c(obj7);
            int i39 = ((a2.a1) obj7).f30b;
            int i40 = this.f32517e;
            boolean o10 = vl.b.o(i40, 0);
            w2.k kVar = w2.k.f38799a;
            if (o10) {
                if (k1Var.getLayoutDirection() == kVar) {
                    i16 = k1Var.m0(p2.f32671c);
                    c0Var = new d4.c0(i16, i39);
                } else {
                    m03 = k1Var.m0(p2.f32671c);
                    i16 = (i30 - m03) - i34;
                    c0Var = new d4.c0(i16, i39);
                }
            } else if (vl.b.o(i40, 2)) {
                if (k1Var.getLayoutDirection() == kVar) {
                    m03 = k1Var.m0(p2.f32671c);
                    i16 = (i30 - m03) - i34;
                    c0Var = new d4.c0(i16, i39);
                } else {
                    i16 = k1Var.m0(p2.f32671c);
                    c0Var = new d4.c0(i16, i39);
                }
            } else {
                i16 = (i30 - i34) / 2;
                c0Var = new d4.c0(i16, i39);
            }
        } else {
            arrayList = arrayList4;
            c0Var = null;
        }
        q2 q2Var2 = q2.f32685e;
        j2 j2Var = new j2(c0Var, this.f32521i, 0);
        Object obj15 = b1.d.f3079a;
        List k13 = k1Var.k(q2Var2, new b1.c(j2Var, true, -791102355));
        ArrayList arrayList7 = new ArrayList(k13.size());
        int size4 = k13.size();
        for (int i41 = 0; i41 < size4; i41 = nn.d.d((a2.l0) k13.get(i41), j10, arrayList7, i41, 1)) {
        }
        if (arrayList7.isEmpty()) {
            obj5 = null;
        } else {
            obj5 = arrayList7.get(0);
            int i42 = ((a2.a1) obj5).f30b;
            int f15 = vt.y.f(arrayList7);
            int i43 = 1;
            if (1 <= f15) {
                while (true) {
                    Object obj16 = arrayList7.get(i43);
                    Object obj17 = obj5;
                    int i44 = ((a2.a1) obj16).f30b;
                    if (i42 < i44) {
                        i42 = i44;
                        obj5 = obj16;
                    } else {
                        obj5 = obj17;
                    }
                    if (i43 == f15) {
                        break;
                    }
                    i43++;
                }
            }
        }
        a2.a1 a1Var4 = (a2.a1) obj5;
        if (a1Var4 != null) {
            num = Integer.valueOf(a1Var4.f30b);
        } else {
            num = null;
        }
        if (c0Var != null) {
            int i45 = c0Var.f13728b;
            if (num == null) {
                intValue = k1Var.m0(p2.f32671c) + i45;
                m02 = x1Var.b(k1Var);
            } else {
                intValue = num.intValue() + i45;
                m02 = k1Var.m0(p2.f32671c);
            }
            num2 = Integer.valueOf(m02 + intValue);
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
        a2.k1 k1Var2 = this.f32513a;
        ArrayList arrayList8 = arrayList7;
        d4.c0 c0Var2 = c0Var;
        List k14 = k1Var2.k(q2.f32682b, new b1.c(new i2(this.f32519g, k1Var2, arrayList2, i10, arrayList7, num, this.f32522j, 0), true, 495329982));
        ArrayList arrayList9 = new ArrayList(k14.size());
        int size5 = k14.size();
        for (int i46 = 0; i46 < size5; i46 = nn.d.d((a2.l0) k14.get(i46), j10, arrayList9, i46, 1)) {
        }
        int size6 = arrayList9.size();
        for (int i47 = 0; i47 < size6; i47++) {
            a2.z0.d(z0Var, (a2.a1) arrayList9.get(i47), 0, 0);
        }
        int i48 = 0;
        int size7 = arrayList2.size();
        int i49 = 0;
        while (i49 < size7) {
            a2.z0.d(z0Var, (a2.a1) arrayList2.get(i49), i48, i48);
            i49++;
            i48 = 0;
        }
        int size8 = arrayList6.size();
        int i50 = 0;
        while (true) {
            i14 = this.f32523k;
            if (i50 >= size8) {
                break;
            }
            a2.z0.d(z0Var, (a2.a1) arrayList6.get(i50), x1Var.a(k1Var, k1Var.getLayoutDirection()) + ((i30 - i12) / 2), i14 - i13);
            i50++;
        }
        int size9 = arrayList8.size();
        int i51 = 0;
        while (i51 < size9) {
            ArrayList arrayList10 = arrayList8;
            a2.a1 a1Var5 = (a2.a1) arrayList10.get(i51);
            if (num != null) {
                i15 = num.intValue();
            } else {
                i15 = 0;
            }
            a2.z0.d(z0Var, a1Var5, 0, i14 - i15);
            i51++;
            arrayList8 = arrayList10;
        }
        if (c0Var2 != null) {
            int size10 = arrayList.size();
            int i52 = 0;
            while (i52 < size10) {
                ArrayList arrayList11 = arrayList;
                a2.a1 a1Var6 = (a2.a1) arrayList11.get(i52);
                Intrinsics.c(num2);
                a2.z0.d(z0Var, a1Var6, c0Var2.f13727a, i14 - num2.intValue());
                i52++;
                arrayList = arrayList11;
            }
            Unit unit = Unit.f23355a;
        }
        return Unit.f23355a;
    }
}
