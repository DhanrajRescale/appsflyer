package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f11874a;

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f11875b;

    /* renamed from: c, reason: collision with root package name */
    public static final h1 f11876c;

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f11877d;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.protobuf.j1, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f11874a = cls;
        f11875b = z(false);
        f11876c = z(true);
        f11877d = new Object();
    }

    public static void A(h1 h1Var, Object obj, Object obj2) {
        ((j1) h1Var).getClass();
        t tVar = (t) obj;
        i1 i1Var = tVar.unknownFields;
        i1 i1Var2 = ((t) obj2).unknownFields;
        i1 i1Var3 = i1.f11923f;
        if (!i1Var3.equals(i1Var2)) {
            if (i1Var3.equals(i1Var)) {
                int i10 = i1Var.f11924a + i1Var2.f11924a;
                int[] copyOf = Arrays.copyOf(i1Var.f11925b, i10);
                System.arraycopy(i1Var2.f11925b, 0, copyOf, i1Var.f11924a, i1Var2.f11924a);
                Object[] copyOf2 = Arrays.copyOf(i1Var.f11926c, i10);
                System.arraycopy(i1Var2.f11926c, 0, copyOf2, i1Var.f11924a, i1Var2.f11924a);
                i1Var = new i1(i10, copyOf, copyOf2, true);
            } else {
                i1Var.getClass();
                if (!i1Var2.equals(i1Var3)) {
                    if (i1Var.f11928e) {
                        int i11 = i1Var.f11924a;
                        int i12 = i1Var2.f11924a + i11;
                        int[] iArr = i1Var.f11925b;
                        if (i12 > iArr.length) {
                            int i13 = (i11 / 2) + i11;
                            if (i13 < i12) {
                                i13 = i12;
                            }
                            if (i13 < 8) {
                                i13 = 8;
                            }
                            i1Var.f11925b = Arrays.copyOf(iArr, i13);
                            i1Var.f11926c = Arrays.copyOf(i1Var.f11926c, i13);
                        }
                        System.arraycopy(i1Var2.f11925b, 0, i1Var.f11925b, i1Var.f11924a, i1Var2.f11924a);
                        System.arraycopy(i1Var2.f11926c, 0, i1Var.f11926c, i1Var.f11924a, i1Var2.f11924a);
                        i1Var.f11924a = i12;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        tVar.unknownFields = i1Var;
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void C(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Boolean) list.get(i12)).booleanValue();
                    Logger logger = j.f11929g;
                    i11++;
                }
                ((j) h0Var.f15593b).H(i11);
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((j) h0Var.f15593b).x(((Boolean) list.get(i13)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            h0Var.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                j jVar = (j) h0Var.f15593b;
                boolean booleanValue = ((Boolean) list.get(i14)).booleanValue();
                jVar.G(i10, 0);
                jVar.x(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static void D(int i10, List list, ek.h0 h0Var) {
        if (list != null && !list.isEmpty()) {
            h0Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                j jVar = (j) h0Var.f15593b;
                h hVar = (h) list.get(i11);
                jVar.G(i10, 2);
                jVar.z(hVar);
            }
        }
    }

    public static void E(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    Logger logger = j.f11929g;
                    i12 += 8;
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    j jVar = (j) h0Var.f15593b;
                    double doubleValue = ((Double) list.get(i11)).doubleValue();
                    jVar.getClass();
                    jVar.D(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                j jVar2 = (j) h0Var.f15593b;
                double doubleValue2 = ((Double) list.get(i11)).doubleValue();
                jVar2.getClass();
                jVar2.C(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static void F(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += j.k(((Integer) list.get(i12)).intValue());
                }
                ((j) h0Var.f15593b).H(i11);
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((j) h0Var.f15593b).E(((Integer) list.get(i13)).intValue());
                }
                return;
            }
            h0Var.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                j jVar = (j) h0Var.f15593b;
                int intValue = ((Integer) list.get(i14)).intValue();
                jVar.G(i10, 0);
                jVar.E(intValue);
            }
        }
    }

    public static void G(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = j.f11929g;
                    i12 += 4;
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    ((j) h0Var.f15593b).B(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                ((j) h0Var.f15593b).A(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void H(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = j.f11929g;
                    i12 += 8;
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    ((j) h0Var.f15593b).D(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                ((j) h0Var.f15593b).C(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    Logger logger = j.f11929g;
                    i12 += 4;
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    j jVar = (j) h0Var.f15593b;
                    float floatValue = ((Float) list.get(i11)).floatValue();
                    jVar.getClass();
                    jVar.B(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                j jVar2 = (j) h0Var.f15593b;
                float floatValue2 = ((Float) list.get(i11)).floatValue();
                jVar2.getClass();
                jVar2.A(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static void J(int i10, List list, ek.h0 h0Var, z0 z0Var) {
        if (list != null && !list.isEmpty()) {
            h0Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                h0Var.z(i10, z0Var, list.get(i11));
            }
        }
    }

    public static void K(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += j.k(((Integer) list.get(i12)).intValue());
                }
                ((j) h0Var.f15593b).H(i11);
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((j) h0Var.f15593b).E(((Integer) list.get(i13)).intValue());
                }
                return;
            }
            h0Var.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                j jVar = (j) h0Var.f15593b;
                int intValue = ((Integer) list.get(i14)).intValue();
                jVar.G(i10, 0);
                jVar.E(intValue);
            }
        }
    }

    public static void L(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += j.w(((Long) list.get(i13)).longValue());
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    ((j) h0Var.f15593b).J(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                ((j) h0Var.f15593b).I(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void M(int i10, List list, ek.h0 h0Var, z0 z0Var) {
        if (list != null && !list.isEmpty()) {
            h0Var.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                h0Var.C(i10, z0Var, list.get(i11));
            }
        }
    }

    public static void N(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = j.f11929g;
                    i12 += 4;
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    ((j) h0Var.f15593b).B(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                ((j) h0Var.f15593b).A(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void O(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = j.f11929g;
                    i12 += 8;
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    ((j) h0Var.f15593b).D(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                ((j) h0Var.f15593b).C(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void P(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += j.u((intValue >> 31) ^ (intValue << 1));
                }
                ((j) h0Var.f15593b).H(i11);
                for (int i13 = 0; i13 < list.size(); i13++) {
                    j jVar = (j) h0Var.f15593b;
                    int intValue2 = ((Integer) list.get(i13)).intValue();
                    jVar.H((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            h0Var.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                j jVar2 = (j) h0Var.f15593b;
                int intValue3 = ((Integer) list.get(i14)).intValue();
                jVar2.G(i10, 0);
                jVar2.H((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void Q(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += j.w((longValue >> 63) ^ (longValue << 1));
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    j jVar = (j) h0Var.f15593b;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    jVar.J((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                j jVar2 = (j) h0Var.f15593b;
                long longValue3 = ((Long) list.get(i11)).longValue();
                jVar2.I(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void R(int i10, List list, ek.h0 h0Var) {
        if (list != null && !list.isEmpty()) {
            h0Var.getClass();
            int i11 = 0;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                while (i11 < list.size()) {
                    Object z10 = c0Var.z(i11);
                    if (z10 instanceof String) {
                        j jVar = (j) h0Var.f15593b;
                        jVar.G(i10, 2);
                        jVar.F((String) z10);
                    } else {
                        j jVar2 = (j) h0Var.f15593b;
                        jVar2.G(i10, 2);
                        jVar2.z((h) z10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                j jVar3 = (j) h0Var.f15593b;
                String str = (String) list.get(i11);
                jVar3.G(i10, 2);
                jVar3.F(str);
                i11++;
            }
        }
    }

    public static void S(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += j.u(((Integer) list.get(i12)).intValue());
                }
                ((j) h0Var.f15593b).H(i11);
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((j) h0Var.f15593b).H(((Integer) list.get(i13)).intValue());
                }
                return;
            }
            h0Var.getClass();
            for (int i14 = 0; i14 < list.size(); i14++) {
                j jVar = (j) h0Var.f15593b;
                int intValue = ((Integer) list.get(i14)).intValue();
                jVar.G(i10, 0);
                jVar.H(intValue);
            }
        }
    }

    public static void T(int i10, List list, ek.h0 h0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((j) h0Var.f15593b).G(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += j.w(((Long) list.get(i13)).longValue());
                }
                ((j) h0Var.f15593b).H(i12);
                while (i11 < list.size()) {
                    ((j) h0Var.f15593b).J(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            h0Var.getClass();
            while (i11 < list.size()) {
                ((j) h0Var.f15593b).I(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.b(i10) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s7 = j.s(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = ((h) list.get(i11)).size();
            s7 += j.u(size2) + size2;
        }
        return s7;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.s(i10) * size) + e(list);
    }

    public static int e(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u) {
            u uVar = (u) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.k(uVar.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.f(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j.g(i10) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, z0 z0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += j.i(i10, (b) list.get(i12), z0Var);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.s(i10) * size) + l(list);
    }

    public static int l(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u) {
            u uVar = (u) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.k(uVar.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (j.s(i10) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += j.w(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int o(int i10, z0 z0Var, Object obj) {
        int s7 = j.s(i10);
        int h10 = ((b) obj).h(z0Var);
        return j.u(h10) + h10 + s7;
    }

    public static int p(int i10, List list, z0 z0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s7 = j.s(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int h10 = ((b) list.get(i11)).h(z0Var);
            s7 += j.u(h10) + h10;
        }
        return s7;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.s(i10) * size) + r(list);
    }

    public static int r(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u) {
            u uVar = (u) list;
            i10 = 0;
            while (i11 < size) {
                int h10 = uVar.h(i11);
                i10 += j.u((h10 >> 31) ^ (h10 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += j.u((intValue >> 31) ^ (intValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.s(i10) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += j.w((longValue >> 63) ^ (longValue << 1));
        }
        return i10;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int s7 = j.s(i10) * size;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            while (i11 < size) {
                Object z10 = c0Var.z(i11);
                if (z10 instanceof h) {
                    int size2 = ((h) z10).size();
                    s7 = j.u(size2) + size2 + s7;
                } else {
                    s7 = j.r((String) z10) + s7;
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof h) {
                    int size3 = ((h) obj).size();
                    s7 = j.u(size3) + size3 + s7;
                } else {
                    s7 = j.r((String) obj) + s7;
                }
                i11++;
            }
        }
        return s7;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.s(i10) * size) + w(list);
    }

    public static int w(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u) {
            u uVar = (u) list;
            i10 = 0;
            while (i11 < size) {
                i10 += j.u(uVar.h(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += j.u(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j.s(i10) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += j.w(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static h1 z(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (h1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
