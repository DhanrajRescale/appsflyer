package com.google.protobuf;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class q0 implements z0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f11961k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f11962l = r1.m();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11963a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11964b;

    /* renamed from: c, reason: collision with root package name */
    public final b f11965c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11966d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f11967e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11968f;

    /* renamed from: g, reason: collision with root package name */
    public final s0 f11969g;

    /* renamed from: h, reason: collision with root package name */
    public final f0 f11970h;

    /* renamed from: i, reason: collision with root package name */
    public final h1 f11971i;

    /* renamed from: j, reason: collision with root package name */
    public final l0 f11972j;

    public q0(int[] iArr, Object[] objArr, b bVar, boolean z10, int[] iArr2, int i10, s0 s0Var, f0 f0Var, h1 h1Var, m mVar, l0 l0Var) {
        this.f11963a = iArr;
        this.f11964b = objArr;
        boolean z11 = bVar instanceof t;
        this.f11966d = z10;
        this.f11967e = iArr2;
        this.f11968f = i10;
        this.f11969g = s0Var;
        this.f11970h = f0Var;
        this.f11971i = h1Var;
        this.f11965c = bVar;
        this.f11972j = l0Var;
    }

    public static void C(int i10, Object obj, ek.h0 h0Var) {
        if (obj instanceof String) {
            j jVar = (j) h0Var.f15593b;
            jVar.G(i10, 2);
            jVar.F((String) obj);
            return;
        }
        h0Var.s(i10, (h) obj);
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t) {
            return ((t) obj).q();
        }
        return true;
    }

    public static List p(long j10, Object obj) {
        return (List) r1.f11981c.i(j10, obj);
    }

    public static q0 s(n0 n0Var, s0 s0Var, f0 f0Var, h1 h1Var, m mVar, l0 l0Var) {
        if (n0Var instanceof y0) {
            return t((y0) n0Var, s0Var, f0Var, h1Var, mVar, l0Var);
        }
        a3.a.u(n0Var);
        throw null;
    }

    public static q0 t(y0 y0Var, s0 s0Var, f0 f0Var, h1 h1Var, m mVar, l0 l0Var) {
        boolean z10;
        int i10;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        char charAt4;
        int i14;
        char charAt5;
        int i15;
        char charAt6;
        int i16;
        char charAt7;
        int i17;
        int i18;
        int i19;
        char charAt8;
        int i20;
        char charAt9;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z11;
        int i25;
        int i26;
        int i27;
        int i28;
        Field w10;
        char charAt10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field w11;
        Field w12;
        int i34;
        char charAt11;
        int i35;
        char charAt12;
        int i36;
        char charAt13;
        int i37;
        char charAt14;
        if (y0Var.d() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String c10 = y0Var.c();
        int length = c10.length();
        char c11 = 55296;
        if (c10.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (c10.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int charAt15 = c10.charAt(i10);
        if (charAt15 >= 55296) {
            int i40 = charAt15 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                charAt14 = c10.charAt(i39);
                if (charAt14 < 55296) {
                    break;
                }
                i40 |= (charAt14 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            charAt15 = i40 | (charAt14 << i41);
            i39 = i37;
        }
        if (charAt15 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i11 = 0;
            iArr = f11961k;
            i12 = 0;
        } else {
            int i42 = i39 + 1;
            int charAt16 = c10.charAt(i39);
            if (charAt16 >= 55296) {
                int i43 = charAt16 & 8191;
                int i44 = 13;
                while (true) {
                    i20 = i42 + 1;
                    charAt9 = c10.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i20;
                }
                charAt16 = i43 | (charAt9 << i44);
                i42 = i20;
            }
            int i45 = i42 + 1;
            int charAt17 = c10.charAt(i42);
            if (charAt17 >= 55296) {
                int i46 = charAt17 & 8191;
                int i47 = 13;
                while (true) {
                    i19 = i45 + 1;
                    charAt8 = c10.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i19;
                }
                charAt17 = i46 | (charAt8 << i47);
                i45 = i19;
            }
            int i48 = i45 + 1;
            if (c10.charAt(i45) >= 55296) {
                while (true) {
                    i18 = i48 + 1;
                    if (c10.charAt(i48) < 55296) {
                        break;
                    }
                    i48 = i18;
                }
                i48 = i18;
            }
            int i49 = i48 + 1;
            if (c10.charAt(i48) >= 55296) {
                while (true) {
                    i17 = i49 + 1;
                    if (c10.charAt(i49) < 55296) {
                        break;
                    }
                    i49 = i17;
                }
                i49 = i17;
            }
            int i50 = i49 + 1;
            charAt = c10.charAt(i49);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i16 = i50 + 1;
                    charAt7 = c10.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i16;
                }
                charAt = i51 | (charAt7 << i52);
                i50 = i16;
            }
            int i53 = i50 + 1;
            charAt2 = c10.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i15 = i53 + 1;
                    charAt6 = c10.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i15;
                }
                charAt2 = i54 | (charAt6 << i55);
                i53 = i15;
            }
            int i56 = i53 + 1;
            int charAt18 = c10.charAt(i53);
            if (charAt18 >= 55296) {
                int i57 = charAt18 & 8191;
                int i58 = 13;
                while (true) {
                    i14 = i56 + 1;
                    charAt5 = c10.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i14;
                }
                charAt18 = i57 | (charAt5 << i58);
                i56 = i14;
            }
            int i59 = i56 + 1;
            charAt3 = c10.charAt(i56);
            if (charAt3 >= 55296) {
                int i60 = charAt3 & 8191;
                int i61 = 13;
                while (true) {
                    i13 = i59 + 1;
                    charAt4 = c10.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i13;
                }
                charAt3 = i60 | (charAt4 << i61);
                i59 = i13;
            }
            iArr = new int[charAt3 + charAt2 + charAt18];
            i11 = (charAt16 * 2) + charAt17;
            i12 = charAt16;
            i39 = i59;
        }
        Object[] b10 = y0Var.b();
        Class<?> cls = y0Var.a().getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i62 = charAt2 + charAt3;
        int i63 = charAt3;
        int i64 = 0;
        int i65 = 0;
        while (i39 < length) {
            int i66 = i39 + 1;
            int charAt19 = c10.charAt(i39);
            if (charAt19 >= c11) {
                int i67 = charAt19 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i36 = i68 + 1;
                    charAt13 = c10.charAt(i68);
                    if (charAt13 < c11) {
                        break;
                    }
                    i67 |= (charAt13 & 8191) << i69;
                    i69 += 13;
                    i68 = i36;
                }
                charAt19 = i67 | (charAt13 << i69);
                i21 = i36;
            } else {
                i21 = i66;
            }
            int i70 = i21 + 1;
            int charAt20 = c10.charAt(i21);
            if (charAt20 >= c11) {
                int i71 = charAt20 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i35 = i72 + 1;
                    charAt12 = c10.charAt(i72);
                    if (charAt12 < c11) {
                        break;
                    }
                    i71 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i35;
                }
                charAt20 = i71 | (charAt12 << i73);
                i22 = i35;
            } else {
                i22 = i70;
            }
            int i74 = charAt20 & 255;
            int i75 = length;
            if ((charAt20 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            Unsafe unsafe = f11962l;
            int i76 = charAt3;
            if (i74 >= 51) {
                int i77 = i22 + 1;
                int charAt21 = c10.charAt(i22);
                if (charAt21 >= 55296) {
                    int i78 = charAt21 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i34 = i79 + 1;
                        charAt11 = c10.charAt(i79);
                        i23 = charAt19;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i78 |= (charAt11 & 8191) << i80;
                        i80 += 13;
                        i79 = i34;
                        charAt19 = i23;
                    }
                    charAt21 = i78 | (charAt11 << i80);
                    i32 = i34;
                } else {
                    i23 = charAt19;
                    i32 = i77;
                }
                int i81 = i74 - 51;
                int i82 = i32;
                if (i81 != 9 && i81 != 17) {
                    if (i81 == 12 && !z10) {
                        objArr[((i65 / 3) * 2) + 1] = b10[i11];
                        i11++;
                    }
                    i33 = 2;
                } else {
                    i33 = 2;
                    objArr[((i65 / 3) * 2) + 1] = b10[i11];
                    i11++;
                }
                int i83 = charAt21 * i33;
                Object obj = b10[i83];
                if (obj instanceof Field) {
                    w11 = (Field) obj;
                } else {
                    w11 = w(cls, (String) obj);
                    b10[i83] = w11;
                }
                i24 = i12;
                z11 = z10;
                i28 = (int) unsafe.objectFieldOffset(w11);
                int i84 = i83 + 1;
                Object obj2 = b10[i84];
                if (obj2 instanceof Field) {
                    w12 = (Field) obj2;
                } else {
                    w12 = w(cls, (String) obj2);
                    b10[i84] = w12;
                }
                i25 = (int) unsafe.objectFieldOffset(w12);
                i26 = i82;
                i27 = 0;
            } else {
                i23 = charAt19;
                i24 = i12;
                z11 = z10;
                int i85 = i11 + 1;
                Field w13 = w(cls, (String) b10[i11]);
                if (i74 != 9 && i74 != 17) {
                    if (i74 != 27 && i74 != 49) {
                        if (i74 != 12 && i74 != 30 && i74 != 44) {
                            if (i74 == 50) {
                                int i86 = i63 + 1;
                                iArr[i63] = i65;
                                int i87 = (i65 / 3) * 2;
                                int i88 = i11 + 2;
                                objArr[i87] = b10[i85];
                                if ((charAt20 & 2048) != 0) {
                                    i85 = i11 + 3;
                                    objArr[i87 + 1] = b10[i88];
                                    i63 = i86;
                                } else {
                                    i63 = i86;
                                    i85 = i88;
                                }
                            }
                        } else if (!z11) {
                            i29 = i11 + 2;
                            objArr[((i65 / 3) * 2) + 1] = b10[i85];
                        }
                    } else {
                        i29 = i11 + 2;
                        objArr[((i65 / 3) * 2) + 1] = b10[i85];
                    }
                    i85 = i29;
                } else {
                    objArr[((i65 / 3) * 2) + 1] = w13.getType();
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(w13);
                if ((charAt20 & 4096) == 4096 && i74 <= 17) {
                    int i89 = i22 + 1;
                    int charAt22 = c10.charAt(i22);
                    if (charAt22 >= 55296) {
                        int i90 = charAt22 & 8191;
                        int i91 = 13;
                        while (true) {
                            i26 = i89 + 1;
                            charAt10 = c10.charAt(i89);
                            if (charAt10 < 55296) {
                                break;
                            }
                            i90 |= (charAt10 & 8191) << i91;
                            i91 += 13;
                            i89 = i26;
                        }
                        charAt22 = i90 | (charAt10 << i91);
                    } else {
                        i26 = i89;
                    }
                    int i92 = (charAt22 / 32) + (i24 * 2);
                    Object obj3 = b10[i92];
                    if (obj3 instanceof Field) {
                        w10 = (Field) obj3;
                    } else {
                        w10 = w(cls, (String) obj3);
                        b10[i92] = w10;
                    }
                    i11 = i85;
                    i25 = (int) unsafe.objectFieldOffset(w10);
                    i27 = charAt22 % 32;
                } else {
                    i11 = i85;
                    i25 = 1048575;
                    i26 = i22;
                    i27 = 0;
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i62] = objectFieldOffset;
                    i62++;
                }
                i28 = objectFieldOffset;
            }
            int i93 = i65 + 1;
            iArr2[i65] = i23;
            int i94 = i65 + 2;
            String str = c10;
            if ((charAt20 & 512) != 0) {
                i30 = 536870912;
            } else {
                i30 = 0;
            }
            if ((charAt20 & 256) != 0) {
                i31 = 268435456;
            } else {
                i31 = 0;
            }
            iArr2[i93] = i30 | i31 | (i74 << 20) | i28;
            i65 += 3;
            iArr2[i94] = (i27 << 20) | i25;
            z10 = z11;
            c10 = str;
            length = i75;
            i39 = i26;
            charAt3 = i76;
            i12 = i24;
            c11 = 55296;
        }
        return new q0(iArr2, objArr, y0Var.a(), z10, iArr, charAt3, s0Var, f0Var, h1Var, mVar, l0Var);
    }

    public static int u(long j10, Object obj) {
        return ((Integer) r1.f11981c.i(j10, obj)).intValue();
    }

    public static long v(long j10, Object obj) {
        return ((Long) r1.f11981c.i(j10, obj)).longValue();
    }

    public static Field w(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder s7 = da.e.s("Field ", str, " for ");
            s7.append(cls.getName());
            s7.append(" not found. Known fields are ");
            s7.append(Arrays.toString(declaredFields));
            throw new RuntimeException(s7.toString());
        }
    }

    public static int y(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003a. Please report as an issue. */
    public final void A(Object obj, ek.h0 h0Var) {
        int i10;
        boolean z10;
        int[] iArr = this.f11963a;
        int length = iArr.length;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int z11 = z(i13);
            int i15 = iArr[i13];
            int y10 = y(z11);
            Unsafe unsafe = f11962l;
            if (y10 <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = i10;
            long j10 = z11 & i11;
            switch (y10) {
                case 0:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.t(i15, r1.f11981c.e(j10, obj));
                        break;
                    }
                case 1:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.y(i15, r1.f11981c.f(j10, obj));
                        break;
                    }
                case 2:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.B(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 3:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.I(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 4:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.A(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 5:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.x(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 6:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.w(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 7:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.r(i15, r1.f11981c.c(j10, obj));
                        break;
                    }
                case 8:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        C(i15, unsafe.getObject(obj, j10), h0Var);
                        break;
                    }
                case 9:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.C(i15, j(i13), unsafe.getObject(obj, j10));
                        break;
                    }
                case 10:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.s(i15, (h) unsafe.getObject(obj, j10));
                        break;
                    }
                case 11:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.H(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 12:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.u(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 13:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.D(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 14:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.E(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 15:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.F(i15, unsafe.getInt(obj, j10));
                        break;
                    }
                case 16:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.G(i15, unsafe.getLong(obj, j10));
                        break;
                    }
                case 17:
                    if ((i14 & i18) == 0) {
                        break;
                    } else {
                        h0Var.z(i15, j(i13), unsafe.getObject(obj, j10));
                        break;
                    }
                case 18:
                    a1.E(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 19:
                    a1.I(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 20:
                    a1.L(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 21:
                    a1.T(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 22:
                    a1.K(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 23:
                    a1.H(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 24:
                    a1.G(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 25:
                    a1.C(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 26:
                    a1.R(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var);
                    break;
                case 27:
                    a1.M(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, j(i13));
                    break;
                case 28:
                    a1.D(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var);
                    break;
                case 29:
                    z10 = false;
                    a1.S(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 30:
                    z10 = false;
                    a1.F(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 31:
                    z10 = false;
                    a1.N(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 32:
                    z10 = false;
                    a1.O(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 33:
                    z10 = false;
                    a1.P(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 34:
                    z10 = false;
                    a1.Q(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, false);
                    break;
                case 35:
                    a1.E(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 36:
                    a1.I(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 37:
                    a1.L(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 38:
                    a1.T(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 39:
                    a1.K(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 40:
                    a1.H(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 41:
                    a1.G(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 42:
                    a1.C(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 43:
                    a1.S(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 44:
                    a1.F(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 45:
                    a1.N(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 46:
                    a1.O(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 47:
                    a1.P(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 48:
                    a1.Q(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, true);
                    break;
                case 49:
                    a1.J(iArr[i13], (List) unsafe.getObject(obj, j10), h0Var, j(i13));
                    break;
                case 50:
                    B(h0Var, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (o(i15, i13, obj)) {
                        h0Var.t(i15, ((Double) r1.f11981c.i(j10, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (o(i15, i13, obj)) {
                        h0Var.y(i15, ((Float) r1.f11981c.i(j10, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (o(i15, i13, obj)) {
                        h0Var.B(i15, v(j10, obj));
                    }
                    break;
                case 54:
                    if (o(i15, i13, obj)) {
                        h0Var.I(i15, v(j10, obj));
                    }
                    break;
                case 55:
                    if (o(i15, i13, obj)) {
                        h0Var.A(i15, u(j10, obj));
                    }
                    break;
                case 56:
                    if (o(i15, i13, obj)) {
                        h0Var.x(i15, v(j10, obj));
                    }
                    break;
                case 57:
                    if (o(i15, i13, obj)) {
                        h0Var.w(i15, u(j10, obj));
                    }
                    break;
                case 58:
                    if (o(i15, i13, obj)) {
                        h0Var.r(i15, ((Boolean) r1.f11981c.i(j10, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (o(i15, i13, obj)) {
                        C(i15, unsafe.getObject(obj, j10), h0Var);
                    }
                    break;
                case 60:
                    if (o(i15, i13, obj)) {
                        h0Var.C(i15, j(i13), unsafe.getObject(obj, j10));
                    }
                    break;
                case 61:
                    if (o(i15, i13, obj)) {
                        h0Var.s(i15, (h) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (o(i15, i13, obj)) {
                        h0Var.H(i15, u(j10, obj));
                    }
                    break;
                case 63:
                    if (o(i15, i13, obj)) {
                        h0Var.u(i15, u(j10, obj));
                    }
                    break;
                case 64:
                    if (o(i15, i13, obj)) {
                        h0Var.D(i15, u(j10, obj));
                    }
                    break;
                case 65:
                    if (o(i15, i13, obj)) {
                        h0Var.E(i15, v(j10, obj));
                    }
                    break;
                case 66:
                    if (o(i15, i13, obj)) {
                        h0Var.F(i15, u(j10, obj));
                    }
                    break;
                case 67:
                    if (o(i15, i13, obj)) {
                        h0Var.G(i15, v(j10, obj));
                    }
                    break;
                case 68:
                    if (o(i15, i13, obj)) {
                        h0Var.z(i15, j(i13), unsafe.getObject(obj, j10));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        ((j1) this.f11971i).getClass();
        ((t) obj).unknownFields.b(h0Var);
    }

    public final void B(ek.h0 h0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            Object obj2 = this.f11964b[(i11 / 3) * 2];
            this.f11972j.getClass();
            com.google.firebase.messaging.t tVar = ((j0) obj2).f11935a;
            ((j) h0Var.f15593b).getClass();
            for (Map.Entry entry : ((k0) obj).entrySet()) {
                ((j) h0Var.f15593b).G(i10, 2);
                ((j) h0Var.f15593b).H(j0.a(tVar, entry.getKey(), entry.getValue()));
                j jVar = (j) h0Var.f15593b;
                Object key = entry.getKey();
                Object value = entry.getValue();
                o.b(jVar, (z1) tVar.f11782b, 1, key);
                o.b(jVar, (z1) tVar.f11784d, 2, value);
            }
        }
    }

    @Override // com.google.protobuf.z0
    public final void a(Object obj, Object obj2) {
        if (n(obj)) {
            obj2.getClass();
            int i10 = 0;
            while (true) {
                int[] iArr = this.f11963a;
                if (i10 < iArr.length) {
                    int z10 = z(i10);
                    long j10 = z10 & 1048575;
                    int i11 = iArr[i10];
                    switch (y(z10)) {
                        case 0:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                q1 q1Var = r1.f11981c;
                                q1Var.m(obj, j10, q1Var.e(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 1:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                q1 q1Var2 = r1.f11981c;
                                q1Var2.n(obj, j10, q1Var2.f(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 2:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                q1 q1Var3 = r1.f11981c;
                                q1Var3.p(obj, j10, q1Var3.h(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 3:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                q1 q1Var4 = r1.f11981c;
                                q1Var4.p(obj, j10, q1Var4.h(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 4:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                r1.q(obj, r1.f11981c.g(j10, obj2), j10);
                                x(i10, obj);
                                break;
                            }
                        case 5:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                q1 q1Var5 = r1.f11981c;
                                q1Var5.p(obj, j10, q1Var5.h(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 6:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                r1.q(obj, r1.f11981c.g(j10, obj2), j10);
                                x(i10, obj);
                                break;
                            }
                        case 7:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                q1 q1Var6 = r1.f11981c;
                                q1Var6.k(obj, j10, q1Var6.c(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 8:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                r1.r(obj, j10, r1.f11981c.i(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 9:
                            q(i10, obj, obj2);
                            break;
                        case 10:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                r1.r(obj, j10, r1.f11981c.i(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 11:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                r1.q(obj, r1.f11981c.g(j10, obj2), j10);
                                x(i10, obj);
                                break;
                            }
                        case 12:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                r1.q(obj, r1.f11981c.g(j10, obj2), j10);
                                x(i10, obj);
                                break;
                            }
                        case 13:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                r1.q(obj, r1.f11981c.g(j10, obj2), j10);
                                x(i10, obj);
                                break;
                            }
                        case 14:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                q1 q1Var7 = r1.f11981c;
                                q1Var7.p(obj, j10, q1Var7.h(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 15:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                r1.q(obj, r1.f11981c.g(j10, obj2), j10);
                                x(i10, obj);
                                break;
                            }
                        case 16:
                            if (!m(i10, obj2)) {
                                break;
                            } else {
                                q1 q1Var8 = r1.f11981c;
                                q1Var8.p(obj, j10, q1Var8.h(j10, obj2));
                                x(i10, obj);
                                break;
                            }
                        case 17:
                            q(i10, obj, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f11970h.b(obj, j10, obj2);
                            break;
                        case 50:
                            Class cls = a1.f11874a;
                            q1 q1Var9 = r1.f11981c;
                            Object i12 = q1Var9.i(j10, obj);
                            Object i13 = q1Var9.i(j10, obj2);
                            this.f11972j.getClass();
                            k0 k0Var = (k0) i12;
                            k0 k0Var2 = (k0) i13;
                            if (!k0Var2.isEmpty()) {
                                if (!k0Var.f11940a) {
                                    k0Var = k0Var.c();
                                }
                                k0Var.b();
                                if (!k0Var2.isEmpty()) {
                                    k0Var.putAll(k0Var2);
                                }
                            }
                            r1.r(obj, j10, k0Var);
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (!o(i11, i10, obj2)) {
                                break;
                            } else {
                                r1.r(obj, j10, r1.f11981c.i(j10, obj2));
                                r1.q(obj, i11, iArr[i10 + 2] & 1048575);
                                break;
                            }
                        case 60:
                            r(i10, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!o(i11, i10, obj2)) {
                                break;
                            } else {
                                r1.r(obj, j10, r1.f11981c.i(j10, obj2));
                                r1.q(obj, i11, iArr[i10 + 2] & 1048575);
                                break;
                            }
                        case 68:
                            r(i10, obj, obj2);
                            break;
                    }
                    i10 += 3;
                } else {
                    a1.A(this.f11971i, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(jr.h.q("Mutating immutable message: ", obj));
        }
    }

    @Override // com.google.protobuf.z0
    public final void b(Object obj) {
        if (!n(obj)) {
            return;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            tVar.k();
            tVar.j();
            tVar.r();
        }
        int length = this.f11963a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int z10 = z(i10);
            long j10 = 1048575 & z10;
            int y10 = y(z10);
            Unsafe unsafe = f11962l;
            if (y10 != 9) {
                switch (y10) {
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f11970h.a(j10, obj);
                        break;
                    case 50:
                        Object object = unsafe.getObject(obj, j10);
                        if (object != null) {
                            this.f11972j.getClass();
                            l0.b(object);
                            unsafe.putObject(obj, j10, object);
                            break;
                        } else {
                            break;
                        }
                }
            }
            if (m(i10, obj)) {
                j(i10).b(unsafe.getObject(obj, j10));
            }
        }
        this.f11971i.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e A[SYNTHETIC] */
    @Override // com.google.protobuf.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q0.c(java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.z0
    public final void d(Object obj, ek.h0 h0Var) {
        h0Var.getClass();
        if (this.f11966d) {
            int[] iArr = this.f11963a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int z10 = z(i10);
                int i11 = iArr[i10];
                switch (y(z10)) {
                    case 0:
                        if (m(i10, obj)) {
                            h0Var.t(i11, r1.f11981c.e(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m(i10, obj)) {
                            h0Var.y(i11, r1.f11981c.f(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m(i10, obj)) {
                            h0Var.B(i11, r1.f11981c.h(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m(i10, obj)) {
                            h0Var.I(i11, r1.f11981c.h(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m(i10, obj)) {
                            h0Var.A(i11, r1.f11981c.g(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m(i10, obj)) {
                            h0Var.x(i11, r1.f11981c.h(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m(i10, obj)) {
                            h0Var.w(i11, r1.f11981c.g(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m(i10, obj)) {
                            h0Var.r(i11, r1.f11981c.c(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m(i10, obj)) {
                            C(i11, r1.f11981c.i(z10 & 1048575, obj), h0Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m(i10, obj)) {
                            h0Var.C(i11, j(i10), r1.f11981c.i(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m(i10, obj)) {
                            h0Var.s(i11, (h) r1.f11981c.i(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m(i10, obj)) {
                            h0Var.H(i11, r1.f11981c.g(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m(i10, obj)) {
                            h0Var.u(i11, r1.f11981c.g(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m(i10, obj)) {
                            h0Var.D(i11, r1.f11981c.g(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m(i10, obj)) {
                            h0Var.E(i11, r1.f11981c.h(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m(i10, obj)) {
                            h0Var.F(i11, r1.f11981c.g(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m(i10, obj)) {
                            h0Var.G(i11, r1.f11981c.h(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m(i10, obj)) {
                            h0Var.z(i11, j(i10), r1.f11981c.i(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        a1.E(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 19:
                        a1.I(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 20:
                        a1.L(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 21:
                        a1.T(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 22:
                        a1.K(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 23:
                        a1.H(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 24:
                        a1.G(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 25:
                        a1.C(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 26:
                        a1.R(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var);
                        break;
                    case 27:
                        a1.M(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, j(i10));
                        break;
                    case 28:
                        a1.D(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var);
                        break;
                    case 29:
                        a1.S(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 30:
                        a1.F(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 31:
                        a1.N(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 32:
                        a1.O(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 33:
                        a1.P(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 34:
                        a1.Q(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, false);
                        break;
                    case 35:
                        a1.E(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 36:
                        a1.I(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 37:
                        a1.L(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 38:
                        a1.T(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 39:
                        a1.K(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 40:
                        a1.H(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 41:
                        a1.G(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 42:
                        a1.C(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 43:
                        a1.S(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 44:
                        a1.F(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 45:
                        a1.N(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 46:
                        a1.O(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 47:
                        a1.P(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 48:
                        a1.Q(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, true);
                        break;
                    case 49:
                        a1.J(iArr[i10], (List) r1.f11981c.i(z10 & 1048575, obj), h0Var, j(i10));
                        break;
                    case 50:
                        B(h0Var, i11, r1.f11981c.i(z10 & 1048575, obj), i10);
                        break;
                    case 51:
                        if (o(i11, i10, obj)) {
                            h0Var.t(i11, ((Double) r1.f11981c.i(z10 & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (o(i11, i10, obj)) {
                            h0Var.y(i11, ((Float) r1.f11981c.i(z10 & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (o(i11, i10, obj)) {
                            h0Var.B(i11, v(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (o(i11, i10, obj)) {
                            h0Var.I(i11, v(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (o(i11, i10, obj)) {
                            h0Var.A(i11, u(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (o(i11, i10, obj)) {
                            h0Var.x(i11, v(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (o(i11, i10, obj)) {
                            h0Var.w(i11, u(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (o(i11, i10, obj)) {
                            h0Var.r(i11, ((Boolean) r1.f11981c.i(z10 & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (o(i11, i10, obj)) {
                            C(i11, r1.f11981c.i(z10 & 1048575, obj), h0Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (o(i11, i10, obj)) {
                            h0Var.C(i11, j(i10), r1.f11981c.i(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (o(i11, i10, obj)) {
                            h0Var.s(i11, (h) r1.f11981c.i(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (o(i11, i10, obj)) {
                            h0Var.H(i11, u(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (o(i11, i10, obj)) {
                            h0Var.u(i11, u(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (o(i11, i10, obj)) {
                            h0Var.D(i11, u(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (o(i11, i10, obj)) {
                            h0Var.E(i11, v(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (o(i11, i10, obj)) {
                            h0Var.F(i11, u(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (o(i11, i10, obj)) {
                            h0Var.G(i11, v(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (o(i11, i10, obj)) {
                            h0Var.z(i11, j(i10), r1.f11981c.i(z10 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                }
            }
            ((j1) this.f11971i).getClass();
            ((t) obj).unknownFields.b(h0Var);
            return;
        }
        A(obj, h0Var);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01eb A[SYNTHETIC] */
    @Override // com.google.protobuf.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q0.e(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.z0
    public final int f(Object obj) {
        if (this.f11966d) {
            return l(obj);
        }
        return k(obj);
    }

    @Override // com.google.protobuf.z0
    public final t g() {
        this.f11969g.getClass();
        return (t) ((t) this.f11965c).m(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.protobuf.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q0.h(java.lang.Object):int");
    }

    public final boolean i(int i10, Object obj, Object obj2) {
        if (m(i10, obj) == m(i10, obj2)) {
            return true;
        }
        return false;
    }

    public final z0 j(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f11964b;
        z0 z0Var = (z0) objArr[i11];
        if (z0Var != null) {
            return z0Var;
        }
        z0 a10 = w0.f11993c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a10;
        return a10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0034. Please report as an issue. */
    public final int k(Object obj) {
        int i10;
        int d10;
        int q10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = this.f11963a;
            if (i11 < iArr.length) {
                int z10 = z(i11);
                int i15 = iArr[i11];
                int y10 = y(z10);
                Unsafe unsafe = f11962l;
                if (y10 <= 17) {
                    int i16 = iArr[i11 + 2];
                    int i17 = i16 & 1048575;
                    i10 = 1 << (i16 >>> 20);
                    if (i17 != i14) {
                        i13 = unsafe.getInt(obj, i17);
                        i14 = i17;
                    }
                } else {
                    i10 = 0;
                }
                long j10 = z10 & 1048575;
                switch (y10) {
                    case 0:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.d(i15);
                            i12 += d10;
                            break;
                        }
                    case 1:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.h(i15);
                            i12 += d10;
                            break;
                        }
                    case 2:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.l(i15, unsafe.getLong(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 3:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.v(i15, unsafe.getLong(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 4:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.j(i15, unsafe.getInt(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 5:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.g(i15);
                            i12 += d10;
                            break;
                        }
                    case 6:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.f(i15);
                            i12 += d10;
                            break;
                        }
                    case 7:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.b(i15);
                            i12 += d10;
                            break;
                        }
                    case 8:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j10);
                            if (object instanceof h) {
                                q10 = j.c(i15, (h) object);
                            } else {
                                q10 = j.q(i15, (String) object);
                            }
                            i12 = q10 + i12;
                            break;
                        }
                    case 9:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = a1.o(i15, j(i11), unsafe.getObject(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 10:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.c(i15, (h) unsafe.getObject(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 11:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.t(i15, unsafe.getInt(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 12:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.e(i15, unsafe.getInt(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 13:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.m(i15);
                            i12 += d10;
                            break;
                        }
                    case 14:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.n(i15);
                            i12 += d10;
                            break;
                        }
                    case 15:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.o(i15, unsafe.getInt(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 16:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.p(i15, unsafe.getLong(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 17:
                        if ((i10 & i13) == 0) {
                            break;
                        } else {
                            d10 = j.i(i15, (b) unsafe.getObject(obj, j10), j(i11));
                            i12 += d10;
                            break;
                        }
                    case 18:
                        d10 = a1.h(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 19:
                        d10 = a1.f(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 20:
                        d10 = a1.m(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 21:
                        d10 = a1.x(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 22:
                        d10 = a1.k(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 23:
                        d10 = a1.h(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 24:
                        d10 = a1.f(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 25:
                        d10 = a1.a(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 26:
                        d10 = a1.u(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 27:
                        d10 = a1.p(i15, (List) unsafe.getObject(obj, j10), j(i11));
                        i12 += d10;
                        break;
                    case 28:
                        d10 = a1.c(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 29:
                        d10 = a1.v(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 30:
                        d10 = a1.d(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 31:
                        d10 = a1.f(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 32:
                        d10 = a1.h(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 33:
                        d10 = a1.q(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 34:
                        d10 = a1.s(i15, (List) unsafe.getObject(obj, j10));
                        i12 += d10;
                        break;
                    case 35:
                        int i18 = a1.i((List) unsafe.getObject(obj, j10));
                        if (i18 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(i18, j.s(i15), i18, i12);
                            break;
                        }
                    case 36:
                        int g10 = a1.g((List) unsafe.getObject(obj, j10));
                        if (g10 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(g10, j.s(i15), g10, i12);
                            break;
                        }
                    case 37:
                        int n10 = a1.n((List) unsafe.getObject(obj, j10));
                        if (n10 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(n10, j.s(i15), n10, i12);
                            break;
                        }
                    case 38:
                        int y11 = a1.y((List) unsafe.getObject(obj, j10));
                        if (y11 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(y11, j.s(i15), y11, i12);
                            break;
                        }
                    case 39:
                        int l10 = a1.l((List) unsafe.getObject(obj, j10));
                        if (l10 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(l10, j.s(i15), l10, i12);
                            break;
                        }
                    case 40:
                        int i19 = a1.i((List) unsafe.getObject(obj, j10));
                        if (i19 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(i19, j.s(i15), i19, i12);
                            break;
                        }
                    case 41:
                        int g11 = a1.g((List) unsafe.getObject(obj, j10));
                        if (g11 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(g11, j.s(i15), g11, i12);
                            break;
                        }
                    case 42:
                        int b10 = a1.b((List) unsafe.getObject(obj, j10));
                        if (b10 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(b10, j.s(i15), b10, i12);
                            break;
                        }
                    case 43:
                        int w10 = a1.w((List) unsafe.getObject(obj, j10));
                        if (w10 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(w10, j.s(i15), w10, i12);
                            break;
                        }
                    case 44:
                        int e10 = a1.e((List) unsafe.getObject(obj, j10));
                        if (e10 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(e10, j.s(i15), e10, i12);
                            break;
                        }
                    case 45:
                        int g12 = a1.g((List) unsafe.getObject(obj, j10));
                        if (g12 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(g12, j.s(i15), g12, i12);
                            break;
                        }
                    case 46:
                        int i20 = a1.i((List) unsafe.getObject(obj, j10));
                        if (i20 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(i20, j.s(i15), i20, i12);
                            break;
                        }
                    case 47:
                        int r10 = a1.r((List) unsafe.getObject(obj, j10));
                        if (r10 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(r10, j.s(i15), r10, i12);
                            break;
                        }
                    case 48:
                        int t10 = a1.t((List) unsafe.getObject(obj, j10));
                        if (t10 <= 0) {
                            break;
                        } else {
                            i12 = com.google.android.gms.internal.p002firebaseauthapi.a.B(t10, j.s(i15), t10, i12);
                            break;
                        }
                    case 49:
                        d10 = a1.j(i15, (List) unsafe.getObject(obj, j10), j(i11));
                        i12 += d10;
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(obj, j10);
                        Object obj2 = this.f11964b[(i11 / 3) * 2];
                        this.f11972j.getClass();
                        d10 = l0.a(i15, object2, obj2);
                        i12 += d10;
                        break;
                    case 51:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.d(i15);
                            i12 += d10;
                            break;
                        }
                    case 52:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.h(i15);
                            i12 += d10;
                            break;
                        }
                    case 53:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.l(i15, v(j10, obj));
                            i12 += d10;
                            break;
                        }
                    case 54:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.v(i15, v(j10, obj));
                            i12 += d10;
                            break;
                        }
                    case 55:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.j(i15, u(j10, obj));
                            i12 += d10;
                            break;
                        }
                    case 56:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.g(i15);
                            i12 += d10;
                            break;
                        }
                    case 57:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.f(i15);
                            i12 += d10;
                            break;
                        }
                    case 58:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.b(i15);
                            i12 += d10;
                            break;
                        }
                    case 59:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j10);
                            if (object3 instanceof h) {
                                q10 = j.c(i15, (h) object3);
                            } else {
                                q10 = j.q(i15, (String) object3);
                            }
                            i12 = q10 + i12;
                            break;
                        }
                    case 60:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = a1.o(i15, j(i11), unsafe.getObject(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 61:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.c(i15, (h) unsafe.getObject(obj, j10));
                            i12 += d10;
                            break;
                        }
                    case 62:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.t(i15, u(j10, obj));
                            i12 += d10;
                            break;
                        }
                    case 63:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.e(i15, u(j10, obj));
                            i12 += d10;
                            break;
                        }
                    case 64:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.m(i15);
                            i12 += d10;
                            break;
                        }
                    case 65:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.n(i15);
                            i12 += d10;
                            break;
                        }
                    case 66:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.o(i15, u(j10, obj));
                            i12 += d10;
                            break;
                        }
                    case 67:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.p(i15, v(j10, obj));
                            i12 += d10;
                            break;
                        }
                    case 68:
                        if (!o(i15, i11, obj)) {
                            break;
                        } else {
                            d10 = j.i(i15, (b) unsafe.getObject(obj, j10), j(i11));
                            i12 += d10;
                            break;
                        }
                }
                i11 += 3;
            } else {
                ((j1) this.f11971i).getClass();
                return ((t) obj).unknownFields.a() + i12;
            }
        }
    }

    public final int l(Object obj) {
        int d10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f11963a;
            if (i10 < iArr.length) {
                int z10 = z(i10);
                int y10 = y(z10);
                int i12 = iArr[i10];
                long j10 = z10 & 1048575;
                if (y10 >= p.f11954b.a() && y10 <= p.f11955c.a()) {
                    int i13 = iArr[i10 + 2];
                }
                Unsafe unsafe = f11962l;
                switch (y10) {
                    case 0:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.d(i12);
                            break;
                        }
                    case 1:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.h(i12);
                            break;
                        }
                    case 2:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.l(i12, r1.k(j10, obj));
                            break;
                        }
                    case 3:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.v(i12, r1.k(j10, obj));
                            break;
                        }
                    case 4:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.j(i12, r1.j(j10, obj));
                            break;
                        }
                    case 5:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.g(i12);
                            break;
                        }
                    case 6:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.f(i12);
                            break;
                        }
                    case 7:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.b(i12);
                            break;
                        }
                    case 8:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            Object l10 = r1.l(j10, obj);
                            if (l10 instanceof h) {
                                d10 = j.c(i12, (h) l10);
                                break;
                            } else {
                                d10 = j.q(i12, (String) l10);
                                break;
                            }
                        }
                    case 9:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = a1.o(i12, j(i10), r1.l(j10, obj));
                            break;
                        }
                    case 10:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.c(i12, (h) r1.l(j10, obj));
                            break;
                        }
                    case 11:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.t(i12, r1.j(j10, obj));
                            break;
                        }
                    case 12:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.e(i12, r1.j(j10, obj));
                            break;
                        }
                    case 13:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.m(i12);
                            break;
                        }
                    case 14:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.n(i12);
                            break;
                        }
                    case 15:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.o(i12, r1.j(j10, obj));
                            break;
                        }
                    case 16:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.p(i12, r1.k(j10, obj));
                            break;
                        }
                    case 17:
                        if (!m(i10, obj)) {
                            break;
                        } else {
                            d10 = j.i(i12, (b) r1.l(j10, obj), j(i10));
                            break;
                        }
                    case 18:
                        d10 = a1.h(i12, p(j10, obj));
                        break;
                    case 19:
                        d10 = a1.f(i12, p(j10, obj));
                        break;
                    case 20:
                        d10 = a1.m(i12, p(j10, obj));
                        break;
                    case 21:
                        d10 = a1.x(i12, p(j10, obj));
                        break;
                    case 22:
                        d10 = a1.k(i12, p(j10, obj));
                        break;
                    case 23:
                        d10 = a1.h(i12, p(j10, obj));
                        break;
                    case 24:
                        d10 = a1.f(i12, p(j10, obj));
                        break;
                    case 25:
                        d10 = a1.a(i12, p(j10, obj));
                        break;
                    case 26:
                        d10 = a1.u(i12, p(j10, obj));
                        break;
                    case 27:
                        d10 = a1.p(i12, p(j10, obj), j(i10));
                        break;
                    case 28:
                        d10 = a1.c(i12, p(j10, obj));
                        break;
                    case 29:
                        d10 = a1.v(i12, p(j10, obj));
                        break;
                    case 30:
                        d10 = a1.d(i12, p(j10, obj));
                        break;
                    case 31:
                        d10 = a1.f(i12, p(j10, obj));
                        break;
                    case 32:
                        d10 = a1.h(i12, p(j10, obj));
                        break;
                    case 33:
                        d10 = a1.q(i12, p(j10, obj));
                        break;
                    case 34:
                        d10 = a1.s(i12, p(j10, obj));
                        break;
                    case 35:
                        int i14 = a1.i((List) unsafe.getObject(obj, j10));
                        if (i14 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(i14, j.s(i12), i14, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        int g10 = a1.g((List) unsafe.getObject(obj, j10));
                        if (g10 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(g10, j.s(i12), g10, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        int n10 = a1.n((List) unsafe.getObject(obj, j10));
                        if (n10 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(n10, j.s(i12), n10, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        int y11 = a1.y((List) unsafe.getObject(obj, j10));
                        if (y11 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(y11, j.s(i12), y11, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        int l11 = a1.l((List) unsafe.getObject(obj, j10));
                        if (l11 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(l11, j.s(i12), l11, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        int i15 = a1.i((List) unsafe.getObject(obj, j10));
                        if (i15 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(i15, j.s(i12), i15, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        int g11 = a1.g((List) unsafe.getObject(obj, j10));
                        if (g11 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(g11, j.s(i12), g11, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        int b10 = a1.b((List) unsafe.getObject(obj, j10));
                        if (b10 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(b10, j.s(i12), b10, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        int w10 = a1.w((List) unsafe.getObject(obj, j10));
                        if (w10 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(w10, j.s(i12), w10, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        int e10 = a1.e((List) unsafe.getObject(obj, j10));
                        if (e10 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(e10, j.s(i12), e10, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        int g12 = a1.g((List) unsafe.getObject(obj, j10));
                        if (g12 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(g12, j.s(i12), g12, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        int i16 = a1.i((List) unsafe.getObject(obj, j10));
                        if (i16 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(i16, j.s(i12), i16, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        int r10 = a1.r((List) unsafe.getObject(obj, j10));
                        if (r10 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(r10, j.s(i12), r10, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        int t10 = a1.t((List) unsafe.getObject(obj, j10));
                        if (t10 > 0) {
                            i11 = com.google.android.gms.internal.p002firebaseauthapi.a.B(t10, j.s(i12), t10, i11);
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        d10 = a1.j(i12, p(j10, obj), j(i10));
                        break;
                    case 50:
                        Object l12 = r1.l(j10, obj);
                        Object obj2 = this.f11964b[(i10 / 3) * 2];
                        this.f11972j.getClass();
                        d10 = l0.a(i12, l12, obj2);
                        break;
                    case 51:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.d(i12);
                            break;
                        }
                    case 52:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.h(i12);
                            break;
                        }
                    case 53:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.l(i12, v(j10, obj));
                            break;
                        }
                    case 54:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.v(i12, v(j10, obj));
                            break;
                        }
                    case 55:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.j(i12, u(j10, obj));
                            break;
                        }
                    case 56:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.g(i12);
                            break;
                        }
                    case 57:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.f(i12);
                            break;
                        }
                    case 58:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.b(i12);
                            break;
                        }
                    case 59:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            Object l13 = r1.l(j10, obj);
                            if (l13 instanceof h) {
                                d10 = j.c(i12, (h) l13);
                                break;
                            } else {
                                d10 = j.q(i12, (String) l13);
                                break;
                            }
                        }
                    case 60:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = a1.o(i12, j(i10), r1.l(j10, obj));
                            break;
                        }
                    case 61:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.c(i12, (h) r1.l(j10, obj));
                            break;
                        }
                    case 62:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.t(i12, u(j10, obj));
                            break;
                        }
                    case 63:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.e(i12, u(j10, obj));
                            break;
                        }
                    case 64:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.m(i12);
                            break;
                        }
                    case 65:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.n(i12);
                            break;
                        }
                    case 66:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.o(i12, u(j10, obj));
                            break;
                        }
                    case 67:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.p(i12, v(j10, obj));
                            break;
                        }
                    case 68:
                        if (!o(i12, i10, obj)) {
                            break;
                        } else {
                            d10 = j.i(i12, (b) r1.l(j10, obj), j(i10));
                            break;
                        }
                }
                i11 = d10 + i11;
                i10 += 3;
            } else {
                ((j1) this.f11971i).getClass();
                return ((t) obj).unknownFields.a() + i11;
            }
        }
    }

    public final boolean m(int i10, Object obj) {
        int i11 = this.f11963a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int z10 = z(i10);
            long j11 = z10 & 1048575;
            switch (y(z10)) {
                case 0:
                    if (Double.doubleToRawLongBits(r1.f11981c.e(j11, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(r1.f11981c.f(j11, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (r1.f11981c.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (r1.f11981c.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (r1.f11981c.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (r1.f11981c.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (r1.f11981c.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return r1.f11981c.c(j11, obj);
                case 8:
                    Object i12 = r1.f11981c.i(j11, obj);
                    if (i12 instanceof String) {
                        return !((String) i12).isEmpty();
                    }
                    if (i12 instanceof h) {
                        return !h.f11917b.equals(i12);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (r1.f11981c.i(j11, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !h.f11917b.equals(r1.f11981c.i(j11, obj));
                case 11:
                    if (r1.f11981c.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (r1.f11981c.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (r1.f11981c.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (r1.f11981c.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (r1.f11981c.g(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (r1.f11981c.h(j11, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (r1.f11981c.i(j11, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if (((1 << (i11 >>> 20)) & r1.f11981c.g(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(int i10, int i11, Object obj) {
        if (r1.f11981c.g(this.f11963a[i11 + 2] & 1048575, obj) == i10) {
            return true;
        }
        return false;
    }

    public final void q(int i10, Object obj, Object obj2) {
        if (!m(i10, obj2)) {
            return;
        }
        long z10 = z(i10) & 1048575;
        Unsafe unsafe = f11962l;
        Object object = unsafe.getObject(obj2, z10);
        if (object != null) {
            z0 j10 = j(i10);
            if (!m(i10, obj)) {
                if (!n(object)) {
                    unsafe.putObject(obj, z10, object);
                } else {
                    t g10 = j10.g();
                    j10.a(g10, object);
                    unsafe.putObject(obj, z10, g10);
                }
                x(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, z10);
            if (!n(object2)) {
                t g11 = j10.g();
                j10.a(g11, object2);
                unsafe.putObject(obj, z10, g11);
                object2 = g11;
            }
            j10.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f11963a[i10] + " is present but null: " + obj2);
    }

    public final void r(int i10, Object obj, Object obj2) {
        int[] iArr = this.f11963a;
        int i11 = iArr[i10];
        if (!o(i11, i10, obj2)) {
            return;
        }
        long z10 = z(i10) & 1048575;
        Unsafe unsafe = f11962l;
        Object object = unsafe.getObject(obj2, z10);
        if (object != null) {
            z0 j10 = j(i10);
            if (!o(i11, i10, obj)) {
                if (!n(object)) {
                    unsafe.putObject(obj, z10, object);
                } else {
                    t g10 = j10.g();
                    j10.a(g10, object);
                    unsafe.putObject(obj, z10, g10);
                }
                r1.q(obj, i11, iArr[i10 + 2] & 1048575);
                return;
            }
            Object object2 = unsafe.getObject(obj, z10);
            if (!n(object2)) {
                t g11 = j10.g();
                j10.a(g11, object2);
                unsafe.putObject(obj, z10, g11);
                object2 = g11;
            }
            j10.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
    }

    public final void x(int i10, Object obj) {
        int i11 = this.f11963a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        r1.q(obj, (1 << (i11 >>> 20)) | r1.f11981c.g(j10, obj), j10);
    }

    public final int z(int i10) {
        return this.f11963a[i10 + 1];
    }
}
