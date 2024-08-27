package m0;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0.n1 f27216a = t0.t.n0(Boolean.TRUE, t0.o3.f35116a);

    /* renamed from: b, reason: collision with root package name */
    public static final t0.m3 f27217b = new t0.a0(w0.f26999j);

    /* renamed from: c, reason: collision with root package name */
    public static final float f27218c = 16;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    public static final void a(boolean z10, int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, b0.x1 x1Var, Function2 function24, t0.n nVar, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ?? r32;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(141059468);
        if ((i11 & 6) == 0) {
            if (rVar.i(z10)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.f(i10)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i11 & 384) == 0) {
            if (rVar.j(function2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.j(cVar)) {
                i18 = 2048;
            } else {
                i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i18;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.j(function22)) {
                i17 = 16384;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i17;
        }
        if ((196608 & i11) == 0) {
            if (rVar.j(function23)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.h(x1Var)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        if ((i11 & 12582912) == 0) {
            if (rVar.j(function24)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((i12 & 4793491) == 4793490 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(1788646295);
            if ((i12 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((57344 & i12) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z19 = z11 | z12;
            if ((3670016 & i12) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z20 = z19 | z13;
            if ((458752 & i12) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z21 = z20 | z14;
            if ((i12 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z22 = z21 | z15;
            if ((i12 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z23 = z22 | z16;
            if ((29360128 & i12) == 8388608) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z24 = z23 | z17;
            if ((i12 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z25 = z18 | z24;
            Object Q = rVar.Q();
            if (!z25 && Q != t0.m.f35080a) {
                r32 = 0;
                i13 = 1;
            } else {
                r32 = 0;
                i13 = 1;
                Q = new s5(function2, function22, function23, i10, z10, x1Var, function24, cVar, 0);
                rVar.k0(Q);
            }
            rVar.s(r32);
            a2.g1.b(null, (Function2) Q, rVar, r32, i13);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t5(z10, i10, function2, cVar, function22, function23, x1Var, function24, i11, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ab, code lost:
    
        if (r0.g(r73) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c5, code lost:
    
        if (r0.g(r75) == false) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(g1.o r59, m0.b6 r60, kotlin.jvm.functions.Function2 r61, kotlin.jvm.functions.Function2 r62, hu.c r63, kotlin.jvm.functions.Function2 r64, int r65, boolean r66, hu.c r67, boolean r68, n1.x0 r69, float r70, long r71, long r73, long r75, long r77, long r79, hu.c r81, t0.n r82, int r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 1155
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.z5.b(g1.o, m0.b6, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, hu.c, kotlin.jvm.functions.Function2, int, boolean, hu.c, boolean, n1.x0, float, long, long, long, long, long, hu.c, t0.n, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bf, code lost:
    
        if (r0.g(r56) == false) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(b0.x1 r41, g1.o r42, m0.b6 r43, kotlin.jvm.functions.Function2 r44, kotlin.jvm.functions.Function2 r45, hu.c r46, kotlin.jvm.functions.Function2 r47, int r48, boolean r49, hu.c r50, boolean r51, n1.x0 r52, float r53, long r54, long r56, long r58, long r60, long r62, hu.c r64, t0.n r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.z5.c(b0.x1, g1.o, m0.b6, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, hu.c, kotlin.jvm.functions.Function2, int, boolean, hu.c, boolean, n1.x0, float, long, long, long, long, long, hu.c, t0.n, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    public static final void d(boolean z10, int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, b0.x1 x1Var, Function2 function24, t0.n nVar, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ?? r32;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1285900760);
        if ((i11 & 6) == 0) {
            if (rVar.i(z10)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.f(i10)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i11 & 384) == 0) {
            if (rVar.j(function2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.j(cVar)) {
                i18 = 2048;
            } else {
                i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i18;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.j(function22)) {
                i17 = 16384;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i17;
        }
        if ((196608 & i11) == 0) {
            if (rVar.j(function23)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.h(x1Var)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        if ((i11 & 12582912) == 0) {
            if (rVar.j(function24)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((i12 & 4793491) == 4793490 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(1989672107);
            if ((i12 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((57344 & i12) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z19 = z11 | z12;
            if ((3670016 & i12) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z20 = z19 | z13;
            if ((458752 & i12) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z21 = z20 | z14;
            if ((i12 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z22 = z21 | z15;
            if ((i12 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z23 = z22 | z16;
            if ((29360128 & i12) == 8388608) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z24 = z23 | z17;
            if ((i12 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z25 = z18 | z24;
            Object Q = rVar.Q();
            if (!z25 && Q != t0.m.f35080a) {
                r32 = 0;
                i13 = 1;
            } else {
                r32 = 0;
                i13 = 1;
                Q = new s5(function2, function22, function23, i10, z10, x1Var, function24, cVar, 1);
                rVar.k0(Q);
            }
            rVar.s(r32);
            a2.g1.b(null, (Function2) Q, rVar, r32, i13);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t5(z10, i10, function2, cVar, function22, function23, x1Var, function24, i11, 2);
        }
    }

    public static final void e(boolean z10, int i10, Function2 function2, hu.c cVar, Function2 function22, Function2 function23, b0.x1 x1Var, Function2 function24, t0.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-468424875);
        if ((i11 & 6) == 0) {
            if (rVar.i(z10)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.f(i10)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 384) == 0) {
            if (rVar.j(function2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.j(cVar)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        if ((i11 & 24576) == 0) {
            if (rVar.j(function22)) {
                i16 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        if ((196608 & i11) == 0) {
            if (rVar.j(function23)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        if ((1572864 & i11) == 0) {
            if (rVar.h(x1Var)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        if ((12582912 & i11) == 0) {
            if (rVar.j(function24)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i12 |= i13;
        }
        if ((4793491 & i12) == 4793490 && rVar.G()) {
            rVar.V();
        } else if (((Boolean) f27216a.getValue()).booleanValue()) {
            rVar.b0(-2103098080);
            d(z10, i10, function2, cVar, function22, function23, x1Var, function24, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (458752 & i12) | (3670016 & i12) | (i12 & 29360128));
            rVar.s(false);
        } else {
            rVar.b0(-2103097736);
            a(z10, i10, function2, cVar, function22, function23, x1Var, function24, rVar, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (458752 & i12) | (3670016 & i12) | (i12 & 29360128));
            rVar.s(false);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t5(z10, i10, function2, cVar, function22, function23, x1Var, function24, i11, 1);
        }
    }

    public static final b6 f(t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1569641925);
        p2 c10 = m2.c(rVar);
        to.e eVar = t0.m.f35080a;
        rVar.b0(-1962071086);
        Object Q = rVar.Q();
        if (Q == eVar) {
            Q = new l6();
            rVar.k0(Q);
        }
        l6 l6Var = (l6) Q;
        Object h10 = v.e.h(rVar, false, -1962071034);
        if (h10 == eVar) {
            h10 = new b6(c10, l6Var);
            rVar.k0(h10);
        }
        b6 b6Var = (b6) h10;
        rVar.s(false);
        rVar.s(false);
        return b6Var;
    }
}
