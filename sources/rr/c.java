package rr;

import d4.c0;
import eb.f;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c[] f33989d = a();

    /* renamed from: a, reason: collision with root package name */
    public final int f33990a;

    /* renamed from: b, reason: collision with root package name */
    public final f[] f33991b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33992c;

    public c(int i10, f... fVarArr) {
        this.f33990a = i10;
        this.f33991b = fVarArr;
        f fVar = fVarArr[0];
        int i11 = fVar.f15308a;
        int i12 = 0;
        for (c0 c0Var : (c0[]) fVar.f15309b) {
            i12 += (c0Var.f13728b + i11) * c0Var.f13727a;
        }
        this.f33992c = i12;
    }

    public static c[] a() {
        int i10 = 1;
        int i11 = 16;
        int i12 = 10;
        int i13 = 13;
        int i14 = 9;
        int i15 = 17;
        c cVar = new c(1, new f(7, new c0[]{new c0(i10, 19)}), new f(i12, new c0[]{new c0(i10, i11)}), new f(i13, new c0[]{new c0(i10, i13)}), new f(i15, new c0[]{new c0(i10, i14)}));
        int i16 = 28;
        int i17 = 22;
        int i18 = 2;
        c cVar2 = new c(2, new f(i12, new c0[]{new c0(i10, 34)}), new f(i11, new c0[]{new c0(i10, i16)}), new f(i17, new c0[]{new c0(i10, i17)}), new f(i16, new c0[]{new c0(i10, i11)}));
        int i19 = 26;
        int i20 = 18;
        c cVar3 = new c(3, new f(15, new c0[]{new c0(i10, 55)}), new f(i19, new c0[]{new c0(i10, 44)}), new f(i20, new c0[]{new c0(i18, i15)}), new f(i17, new c0[]{new c0(i18, i13)}));
        int i21 = 24;
        int i22 = 4;
        c cVar4 = new c(4, new f(20, new c0[]{new c0(i10, 80)}), new f(i20, new c0[]{new c0(i18, 32)}), new f(i19, new c0[]{new c0(i18, i21)}), new f(16, new c0[]{new c0(i22, i14)}));
        c cVar5 = new c(5, new f(i19, new c0[]{new c0(i10, 108)}), new f(i21, new c0[]{new c0(i18, 43)}), new f(18, new c0[]{new c0(i18, 15), new c0(i18, 16)}), new f(22, new c0[]{new c0(i18, 11), new c0(i18, 12)}));
        c cVar6 = new c(6, new f(18, new c0[]{new c0(i18, 68)}), new f(16, new c0[]{new c0(i22, 27)}), new f(i21, new c0[]{new c0(i22, 19)}), new f(28, new c0[]{new c0(i22, 15)}));
        int i23 = 18;
        c cVar7 = new c(7, new f(20, new c0[]{new c0(i18, 78)}), new f(i23, new c0[]{new c0(i22, 31)}), new f(i23, new c0[]{new c0(i18, 14), new c0(i22, 15)}), new f(26, new c0[]{new c0(i22, 13), new c0(1, 14)}));
        int i24 = 2;
        f fVar = new f(24, new c0[]{new c0(i24, 97)});
        f fVar2 = new f(22, new c0[]{new c0(i24, 38), new c0(i24, 39)});
        f fVar3 = new f(22, new c0[]{new c0(4, 18), new c0(i24, 19)});
        int i25 = 2;
        c cVar8 = new c(8, fVar, fVar2, fVar3, new f(26, new c0[]{new c0(4, 14), new c0(i25, 15)}));
        int i26 = 4;
        c cVar9 = new c(9, new f(30, new c0[]{new c0(i25, 116)}), new f(22, new c0[]{new c0(3, 36), new c0(i25, 37)}), new f(20, new c0[]{new c0(i26, 16), new c0(i26, 17)}), new f(24, new c0[]{new c0(i26, 12), new c0(i26, 13)}));
        int i27 = 2;
        c cVar10 = new c(10, new f(18, new c0[]{new c0(i27, 68), new c0(i27, 69)}), new f(26, new c0[]{new c0(4, 43), new c0(1, 44)}), new f(24, new c0[]{new c0(6, 19), new c0(2, 20)}), new f(28, new c0[]{new c0(6, 15), new c0(2, 16)}));
        int i28 = 4;
        c cVar11 = new c(11, new f(20, new c0[]{new c0(i28, 81)}), new f(30, new c0[]{new c0(1, 50), new c0(i28, 51)}), new f(28, new c0[]{new c0(i28, 22), new c0(i28, 23)}), new f(24, new c0[]{new c0(3, 12), new c0(8, 13)}));
        int i29 = 2;
        int i30 = 4;
        c cVar12 = new c(12, new f(24, new c0[]{new c0(i29, 92), new c0(i29, 93)}), new f(22, new c0[]{new c0(6, 36), new c0(i29, 37)}), new f(26, new c0[]{new c0(4, 20), new c0(6, 21)}), new f(28, new c0[]{new c0(7, 14), new c0(i30, 15)}));
        f fVar4 = new f(26, new c0[]{new c0(i30, 107)});
        int i31 = 8;
        f fVar5 = new f(22, new c0[]{new c0(i31, 37), new c0(1, 38)});
        f fVar6 = new f(24, new c0[]{new c0(i31, 20), new c0(4, 21)});
        int i32 = 12;
        int i33 = 4;
        c cVar13 = new c(13, fVar4, fVar5, fVar6, new f(22, new c0[]{new c0(i32, 11), new c0(i33, i32)}));
        f fVar7 = new f(30, new c0[]{new c0(3, 115), new c0(1, 116)});
        c0 c0Var = new c0(i33, 40);
        int i34 = 5;
        int i35 = 5;
        c cVar14 = new c(14, fVar7, new f(24, new c0[]{c0Var, new c0(i34, 41)}), new f(20, new c0[]{new c0(11, 16), new c0(i34, 17)}), new f(24, new c0[]{new c0(11, 12), new c0(i35, 13)}));
        int i36 = 24;
        c cVar15 = new c(15, new f(22, new c0[]{new c0(i35, 87), new c0(1, 88)}), new f(i36, new c0[]{new c0(i35, 41), new c0(i35, 42)}), new f(30, new c0[]{new c0(i35, i36), new c0(7, 25)}), new f(24, new c0[]{new c0(11, 12), new c0(7, 13)}));
        c cVar16 = new c(16, new f(24, new c0[]{new c0(5, 98), new c0(1, 99)}), new f(28, new c0[]{new c0(7, 45), new c0(3, 46)}), new f(24, new c0[]{new c0(15, 19), new c0(2, 20)}), new f(30, new c0[]{new c0(3, 15), new c0(13, 16)}));
        int i37 = 1;
        int i38 = 28;
        int i39 = 15;
        c cVar17 = new c(17, new f(i38, new c0[]{new c0(i37, 107), new c0(5, 108)}), new f(i38, new c0[]{new c0(10, 46), new c0(i37, 47)}), new f(i38, new c0[]{new c0(i37, 22), new c0(i39, 23)}), new f(28, new c0[]{new c0(2, 14), new c0(17, i39)}));
        c cVar18 = new c(18, new f(30, new c0[]{new c0(5, 120), new c0(1, 121)}), new f(26, new c0[]{new c0(9, 43), new c0(4, 44)}), new f(28, new c0[]{new c0(17, 22), new c0(1, 23)}), new f(28, new c0[]{new c0(2, 14), new c0(19, 15)}));
        int i40 = 3;
        f fVar8 = new f(28, new c0[]{new c0(i40, 113), new c0(4, 114)});
        c0[] c0VarArr = {new c0(i40, 44), new c0(11, 45)};
        int i41 = 26;
        c cVar19 = new c(19, fVar8, new f(i41, c0VarArr), new f(i41, new c0[]{new c0(17, 21), new c0(4, 22)}), new f(26, new c0[]{new c0(9, 13), new c0(16, 14)}));
        int i42 = 3;
        int i43 = 15;
        c cVar20 = new c(20, new f(28, new c0[]{new c0(i42, 107), new c0(5, 108)}), new f(26, new c0[]{new c0(i42, 41), new c0(13, 42)}), new f(30, new c0[]{new c0(i43, 24), new c0(5, 25)}), new f(28, new c0[]{new c0(i43, i43), new c0(10, 16)}));
        int i44 = 4;
        int i45 = 17;
        c cVar21 = new c(21, new f(28, new c0[]{new c0(i44, 116), new c0(i44, 117)}), new f(26, new c0[]{new c0(i45, 42)}), new f(28, new c0[]{new c0(i45, 22), new c0(6, 23)}), new f(30, new c0[]{new c0(19, 16), new c0(6, i45)}));
        int i46 = 7;
        int i47 = 28;
        int i48 = 24;
        c cVar22 = new c(22, new f(i47, new c0[]{new c0(2, 111), new c0(i46, 112)}), new f(i47, new c0[]{new c0(17, 46)}), new f(30, new c0[]{new c0(i46, i48), new c0(16, 25)}), new f(i48, new c0[]{new c0(34, 13)}));
        int i49 = 4;
        int i50 = 14;
        int i51 = 16;
        c cVar23 = new c(23, new f(30, new c0[]{new c0(i49, 121), new c0(5, 122)}), new f(28, new c0[]{new c0(i49, 47), new c0(i50, 48)}), new f(30, new c0[]{new c0(11, 24), new c0(i50, 25)}), new f(30, new c0[]{new c0(i51, 15), new c0(i50, i51)}));
        int i52 = 6;
        f fVar9 = new f(30, new c0[]{new c0(i52, 117), new c0(4, 118)});
        f fVar10 = new f(28, new c0[]{new c0(i52, 45), new c0(14, 46)});
        c0 c0Var2 = new c0(11, 24);
        int i53 = 16;
        int i54 = 30;
        c cVar24 = new c(24, fVar9, fVar10, new f(i54, new c0[]{c0Var2, new c0(i53, 25)}), new f(30, new c0[]{new c0(i54, i53), new c0(2, 17)}));
        int i55 = 8;
        int i56 = 22;
        c cVar25 = new c(25, new f(26, new c0[]{new c0(i55, 106), new c0(4, 107)}), new f(28, new c0[]{new c0(i55, 47), new c0(13, 48)}), new f(30, new c0[]{new c0(7, 24), new c0(i56, 25)}), new f(30, new c0[]{new c0(i56, 15), new c0(13, 16)}));
        int i57 = 28;
        c cVar26 = new c(26, new f(i57, new c0[]{new c0(10, 114), new c0(2, 115)}), new f(i57, new c0[]{new c0(19, 46), new c0(4, 47)}), new f(i57, new c0[]{new c0(i57, 22), new c0(6, 23)}), new f(30, new c0[]{new c0(33, 16), new c0(4, 17)}));
        c cVar27 = new c(27, new f(30, new c0[]{new c0(8, 122), new c0(4, 123)}), new f(28, new c0[]{new c0(22, 45), new c0(3, 46)}), new f(30, new c0[]{new c0(8, 23), new c0(26, 24)}), new f(30, new c0[]{new c0(12, 15), new c0(28, 16)}));
        int i58 = 3;
        f fVar11 = new f(30, new c0[]{new c0(i58, 117), new c0(10, 118)});
        f fVar12 = new f(28, new c0[]{new c0(i58, 45), new c0(23, 46)});
        c0 c0Var3 = new c0(4, 24);
        int i59 = 31;
        int i60 = 30;
        c cVar28 = new c(28, fVar11, fVar12, new f(30, new c0[]{c0Var3, new c0(i59, 25)}), new f(i60, new c0[]{new c0(11, 15), new c0(i59, 16)}));
        int i61 = 7;
        c cVar29 = new c(29, new f(i60, new c0[]{new c0(i61, 116), new c0(i61, 117)}), new f(28, new c0[]{new c0(21, 45), new c0(i61, 46)}), new f(30, new c0[]{new c0(1, 23), new c0(37, 24)}), new f(30, new c0[]{new c0(19, 15), new c0(26, 16)}));
        int i62 = 10;
        int i63 = 15;
        int i64 = 25;
        int i65 = 30;
        c cVar30 = new c(30, new f(30, new c0[]{new c0(5, 115), new c0(i62, 116)}), new f(28, new c0[]{new c0(19, 47), new c0(i62, 48)}), new f(30, new c0[]{new c0(i63, 24), new c0(i64, i64)}), new f(i65, new c0[]{new c0(23, i63), new c0(i64, 16)}));
        int i66 = 30;
        c cVar31 = new c(31, new f(i65, new c0[]{new c0(13, 115), new c0(3, 116)}), new f(28, new c0[]{new c0(2, 46), new c0(29, 47)}), new f(30, new c0[]{new c0(42, 24), new c0(1, 25)}), new f(i66, new c0[]{new c0(23, 15), new c0(28, 16)}));
        int i67 = 10;
        int i68 = 30;
        c cVar32 = new c(32, new f(i66, new c0[]{new c0(17, 115)}), new f(28, new c0[]{new c0(i67, 46), new c0(23, 47)}), new f(30, new c0[]{new c0(i67, 24), new c0(35, 25)}), new f(i68, new c0[]{new c0(19, 15), new c0(35, 16)}));
        c cVar33 = new c(33, new f(i68, new c0[]{new c0(17, 115), new c0(1, 116)}), new f(28, new c0[]{new c0(14, 46), new c0(21, 47)}), new f(30, new c0[]{new c0(29, 24), new c0(19, 25)}), new f(30, new c0[]{new c0(11, 15), new c0(46, 16)}));
        c cVar34 = new c(34, new f(30, new c0[]{new c0(13, 115), new c0(6, 116)}), new f(28, new c0[]{new c0(14, 46), new c0(23, 47)}), new f(30, new c0[]{new c0(44, 24), new c0(7, 25)}), new f(30, new c0[]{new c0(59, 16), new c0(1, 17)}));
        int i69 = 12;
        c cVar35 = new c(35, new f(30, new c0[]{new c0(i69, 121), new c0(7, 122)}), new f(28, new c0[]{new c0(i69, 47), new c0(26, 48)}), new f(30, new c0[]{new c0(39, 24), new c0(14, 25)}), new f(30, new c0[]{new c0(22, 15), new c0(41, 16)}));
        int i70 = 6;
        int i71 = 24;
        int i72 = 34;
        return new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, new c(36, new f(30, new c0[]{new c0(i70, 121), new c0(14, 122)}), new f(28, new c0[]{new c0(i70, 47), new c0(34, 48)}), new f(30, new c0[]{new c0(46, 24), new c0(10, 25)}), new f(30, new c0[]{new c0(2, 15), new c0(64, 16)})), new c(37, new f(30, new c0[]{new c0(17, 122), new c0(4, 123)}), new f(28, new c0[]{new c0(29, 46), new c0(14, 47)}), new f(30, new c0[]{new c0(49, i71), new c0(10, 25)}), new f(30, new c0[]{new c0(i71, 15), new c0(46, 16)})), new c(38, new f(30, new c0[]{new c0(4, 122), new c0(18, 123)}), new f(28, new c0[]{new c0(13, 46), new c0(32, 47)}), new f(30, new c0[]{new c0(48, 24), new c0(14, 25)}), new f(30, new c0[]{new c0(42, 15), new c0(32, 16)})), new c(39, new f(30, new c0[]{new c0(20, 117), new c0(4, 118)}), new f(28, new c0[]{new c0(40, 47), new c0(7, 48)}), new f(30, new c0[]{new c0(43, 24), new c0(22, 25)}), new f(30, new c0[]{new c0(10, 15), new c0(67, 16)})), new c(40, new f(30, new c0[]{new c0(19, 118), new c0(6, 119)}), new f(28, new c0[]{new c0(18, 47), new c0(31, 48)}), new f(30, new c0[]{new c0(i72, 24), new c0(i72, 25)}), new f(30, new c0[]{new c0(20, 15), new c0(61, 16)}))};
    }

    public static c b(int i10) {
        if (i10 > 0 && i10 <= 40) {
            return f33989d[i10 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f33990a);
    }
}
