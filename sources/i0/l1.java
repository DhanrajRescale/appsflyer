package i0;

import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f19040a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x1.a f19041b = new x1.a(1008);

    /* renamed from: c, reason: collision with root package name */
    public static final d4.c0 f19042c = new d4.c0(0, 0);

    public static final g1.o A(q1 q1Var, l0.v0 v0Var, p2.c0 c0Var, h0 h0Var, boolean z10, boolean z11, p2.v vVar, b3 b3Var, int i10) {
        return t0.t.H(g1.l.f16404b, d2.s.f13613k, new h2(q1Var, v0Var, c0Var, z10, z11, vVar, b3Var, h0Var, i10));
    }

    public static final g1.o B(g1.o oVar, q2 q2Var, a0.l lVar, boolean z10) {
        return t0.t.H(oVar, d2.s.f13613k, new o2(q2Var, z10, lVar));
    }

    public static final g1.o C(g1.o oVar, j2.e eVar, j2.g0 g0Var, Function1 function1, int i10, boolean z10, int i11, int i12, o2.r rVar, List list, Function1 function12, n1.x xVar, Function1 function13) {
        return oVar.g(g1.l.f16404b).g(new TextAnnotatedStringElement(eVar, g0Var, rVar, function1, i10, z10, i11, i12, list, function12, xVar, function13));
    }

    public static final void D(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            if (i10 <= i11) {
                return;
            } else {
                throw new IllegalArgumentException(da.e.m("minLines ", i10, " must be less than or equal to maxLines ", i11).toString());
            }
        }
        throw new IllegalArgumentException(("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero").toString());
    }

    public static final void E(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 <= i11) {
        } else {
            throw new IllegalStateException(a3.a.i(da.e.q("OffsetMapping.originalToTransformed returned invalid mapping: ", i12, " -> ", i10, " is not in range of transformed text [0, "), i11, ']').toString());
        }
    }

    public static final void F(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 <= i11) {
        } else {
            throw new IllegalStateException(a3.a.i(da.e.q("OffsetMapping.transformedToOriginal returned invalid mapping: ", i12, " -> ", i10, " is not in range of original text [0, "), i11, ']').toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x032d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0214 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(j2.e r42, g1.o r43, j2.g0 r44, kotlin.jvm.functions.Function1 r45, int r46, boolean r47, int r48, int r49, java.util.Map r50, n1.x r51, t0.n r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l1.a(j2.e, g1.o, j2.g0, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, n1.x, t0.n, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(j2.e r30, g1.o r31, j2.g0 r32, kotlin.jvm.functions.Function1 r33, int r34, boolean r35, int r36, int r37, java.util.Map r38, n1.x r39, t0.n r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l1.b(j2.e, g1.o, j2.g0, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, n1.x, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.String r31, g1.o r32, j2.g0 r33, kotlin.jvm.functions.Function1 r34, int r35, boolean r36, int r37, int r38, n1.x r39, t0.n r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l1.c(java.lang.String, g1.o, j2.g0, kotlin.jvm.functions.Function1, int, boolean, int, int, n1.x, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x034d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0376 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(java.lang.String r40, kotlin.jvm.functions.Function1 r41, g1.o r42, boolean r43, boolean r44, j2.g0 r45, i0.p1 r46, i0.o1 r47, boolean r48, int r49, int r50, p2.l0 r51, kotlin.jvm.functions.Function1 r52, a0.l r53, n1.p r54, hu.c r55, t0.n r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l1.d(java.lang.String, kotlin.jvm.functions.Function1, g1.o, boolean, boolean, j2.g0, i0.p1, i0.o1, boolean, int, int, p2.l0, kotlin.jvm.functions.Function1, a0.l, n1.p, hu.c, t0.n, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(j2.e r25, g1.o r26, j2.g0 r27, boolean r28, int r29, int r30, kotlin.jvm.functions.Function1 r31, kotlin.jvm.functions.Function1 r32, t0.n r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l1.e(j2.e, g1.o, j2.g0, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x059e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0622 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0656 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x068d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x074b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0823 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x086e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v116, types: [g1.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(p2.c0 r51, kotlin.jvm.functions.Function1 r52, g1.o r53, j2.g0 r54, p2.l0 r55, kotlin.jvm.functions.Function1 r56, a0.l r57, n1.p r58, boolean r59, int r60, int r61, p2.o r62, i0.o1 r63, boolean r64, boolean r65, hu.c r66, t0.n r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 2492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l1.f(p2.c0, kotlin.jvm.functions.Function1, g1.o, j2.g0, p2.l0, kotlin.jvm.functions.Function1, a0.l, n1.p, boolean, int, int, p2.o, i0.o1, boolean, boolean, hu.c, t0.n, int, int, int):void");
    }

    public static final void g(g1.o oVar, l0.v0 v0Var, Function2 function2, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-20551815);
        if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(v0Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.j(function2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            int i15 = (i11 & 14) | 384;
            rVar.b0(733328855);
            int i16 = i15 >> 3;
            b0.v c10 = b0.s.c(g1.a.f16379a, true, rVar, (i16 & 112) | (i16 & 14));
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(oVar);
            int i18 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, c10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q((i18 >> 3) & 112, j10, new t0.m2(rVar), rVar, 2058660585);
                int i19 = i11 >> 3;
                rVar.b0(-1985516685);
                com.google.android.gms.internal.p002firebaseauthapi.a.p((((i19 & 112) | (i19 & 14)) >> 3) & 14, function2, rVar, false, false);
                v.e.x(rVar, true, false, false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.n0(oVar, v0Var, function2, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [t0.r, t0.n] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, i0.w2] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(g1.o r37, j2.e r38, kotlin.jvm.functions.Function1 r39, boolean r40, java.util.Map r41, j2.g0 r42, int r43, boolean r44, int r45, int r46, o2.r r47, n1.x r48, kotlin.jvm.functions.Function1 r49, t0.n r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l1.h(g1.o, j2.e, kotlin.jvm.functions.Function1, boolean, java.util.Map, j2.g0, int, boolean, int, int, o2.r, n1.x, kotlin.jvm.functions.Function1, t0.n, int, int, int):void");
    }

    public static final void i(l0.v0 v0Var, t0.n nVar, int i10) {
        int i11;
        j2.e eVar;
        s2 s2Var;
        z1 z1Var;
        int i12;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1436003720);
        if ((i10 & 6) == 0) {
            if (rVar.j(v0Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            q1 q1Var = v0Var.f23839d;
            if (q1Var != null) {
                int i13 = 1;
                if (((Boolean) q1Var.f19148o.getValue()).booleanValue()) {
                    q1 q1Var2 = v0Var.f23839d;
                    if (q1Var2 != null && (z1Var = q1Var2.f19134a) != null) {
                        eVar = z1Var.f19292a;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null && eVar.f20699a.length() > 0) {
                        rVar.b0(-1260635948);
                        boolean h10 = rVar.h(v0Var);
                        Object Q = rVar.Q();
                        to.e eVar2 = t0.m.f35080a;
                        int i14 = 0;
                        if (h10 || Q == eVar2) {
                            Q = new l0.s0(v0Var, i14);
                            rVar.k0(Q);
                        }
                        a2 a2Var = (a2) Q;
                        rVar.s(false);
                        w2.b bVar = (w2.b) rVar.m(d2.s1.f13620e);
                        p2.v vVar = v0Var.f23837b;
                        long j10 = v0Var.k().f30523b;
                        int i15 = j2.f0.f20711c;
                        int b10 = vVar.b((int) (j10 >> 32));
                        q1 q1Var3 = v0Var.f23839d;
                        if (q1Var3 != null) {
                            s2Var = q1Var3.d();
                        } else {
                            s2Var = null;
                        }
                        Intrinsics.c(s2Var);
                        j2.e0 e0Var = s2Var.f19194a;
                        m1.d c10 = e0Var.c(kotlin.ranges.d.f(b10, 0, e0Var.f20703a.f20689a.f20699a.length()));
                        long g10 = t0.t.g((bVar.c0(d2.f18833b) / 2) + c10.f27239a, c10.f27242d);
                        g1.l lVar = g1.l.f16404b;
                        rVar.b0(-1260635693);
                        boolean j11 = rVar.j(a2Var) | rVar.j(v0Var);
                        Object Q2 = rVar.Q();
                        if (j11 || Q2 == eVar2) {
                            Q2 = new v0(a2Var, v0Var, null);
                            rVar.k0(Q2);
                        }
                        rVar.s(false);
                        g1.o a10 = x1.h0.a(lVar, a2Var, (Function2) Q2);
                        rVar.b0(-1260635064);
                        boolean g11 = rVar.g(g10);
                        Object Q3 = rVar.Q();
                        if (g11 || Q3 == eVar2) {
                            Q3 = new d(i13, g10);
                            rVar.k0(Q3);
                        }
                        rVar.s(false);
                        f.a(g10, h2.l.a(a10, false, (Function1) Q3), 0L, rVar, 0, 4);
                    }
                }
            }
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, 5, v0Var);
        }
    }

    public static final void j(l0.v0 v0Var, boolean z10, t0.n nVar, int i10) {
        int i11;
        s2 d10;
        j2.e0 e0Var;
        boolean z11;
        int i12;
        int i13;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(626339208);
        if ((i10 & 6) == 0) {
            if (rVar.j(v0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.i(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-498387341);
            if (z10) {
                q1 q1Var = v0Var.f23839d;
                j2.e0 e0Var2 = null;
                if (q1Var != null && (d10 = q1Var.d()) != null && (e0Var = d10.f19194a) != null) {
                    q1 q1Var2 = v0Var.f23839d;
                    if (q1Var2 != null) {
                        z11 = q1Var2.f19149p;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        e0Var2 = e0Var;
                    }
                }
                if (e0Var2 != null) {
                    rVar.b0(-671733567);
                    if (!j2.f0.b(v0Var.k().f30523b)) {
                        int b10 = v0Var.f23837b.b((int) (v0Var.k().f30523b >> 32));
                        int b11 = v0Var.f23837b.b((int) (v0Var.k().f30523b & 4294967295L));
                        u2.h a10 = e0Var2.a(b10);
                        u2.h a11 = e0Var2.a(Math.max(b11 - 1, 0));
                        rVar.b0(-1230802440);
                        q1 q1Var3 = v0Var.f23839d;
                        if (q1Var3 != null && ((Boolean) q1Var3.f19146m.getValue()).booleanValue()) {
                            al.d.E(true, a10, v0Var, rVar, ((i11 << 6) & 896) | 6);
                        }
                        rVar.s(false);
                        q1 q1Var4 = v0Var.f23839d;
                        if (q1Var4 != null && ((Boolean) q1Var4.f19147n.getValue()).booleanValue()) {
                            al.d.E(false, a11, v0Var, rVar, ((i11 << 6) & 896) | 6);
                        }
                    }
                    rVar.s(false);
                    q1 q1Var5 = v0Var.f23839d;
                    if (q1Var5 != null) {
                        boolean z12 = !Intrinsics.a(v0Var.f23852q.f30522a.f20699a, v0Var.k().f30522a.f20699a);
                        t0.n1 n1Var = q1Var5.f19145l;
                        if (z12) {
                            n1Var.setValue(Boolean.FALSE);
                        }
                        if (q1Var5.b()) {
                            if (((Boolean) n1Var.getValue()).booleanValue()) {
                                v0Var.q();
                            } else {
                                v0Var.l();
                            }
                        }
                        Unit unit = Unit.f23355a;
                    }
                }
            } else {
                v0Var.l();
                Unit unit2 = Unit.f23355a;
            }
            rVar.s(false);
        }
        t0.x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new r0(v0Var, z10, i10);
        }
    }

    public static final void k(q1 q1Var) {
        p2.i0 i0Var = q1Var.f19138e;
        if (i0Var != null) {
            q1Var.f19153t.invoke(p2.c0.a(q1Var.f19137d.f30578a, null, 0L, 3));
            p2.d0 d0Var = i0Var.f30576a;
            AtomicReference atomicReference = d0Var.f30533b;
            while (true) {
                if (atomicReference.compareAndSet(i0Var, null)) {
                    d0Var.f30532a.e();
                    break;
                } else if (atomicReference.get() != i0Var) {
                    break;
                }
            }
        }
        q1Var.f19138e = null;
    }

    public static final m1.d l(a2.o0 o0Var, int i10, p2.j0 j0Var, j2.e0 e0Var, boolean z10, int i11) {
        m1.d dVar;
        float f10;
        float f11;
        if (e0Var != null) {
            dVar = e0Var.c(j0Var.f30581b.b(i10));
        } else {
            dVar = m1.d.f27238e;
        }
        int m02 = o0Var.m0(d2.f18833b);
        float f12 = dVar.f27239a;
        if (z10) {
            f10 = (i11 - f12) - m02;
        } else {
            f10 = f12;
        }
        if (z10) {
            f11 = i11 - f12;
        } else {
            f11 = m02 + f12;
        }
        return new m1.d(f10, dVar.f27240b, f11, dVar.f27242d);
    }

    public static final boolean m(int i10, KeyEvent keyEvent) {
        if (((int) (androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()) >> 32)) == i10) {
            return true;
        }
        return false;
    }

    public static final ArrayList n(List list, Function0 function0) {
        z2 z2Var;
        if (!((Boolean) function0.mo2invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a2.l0 l0Var = (a2.l0) list.get(i10);
            Object a10 = l0Var.a();
            Intrinsics.d(a10, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            t2 t2Var = ((a3) a10).f18786b;
            j2.e0 e0Var = (j2.e0) ((w2) t2Var.f19208c).f19245b.getValue();
            if (e0Var == null) {
                z2Var = new z2(0, 0, v2.f19237b);
            } else {
                m1.d d10 = e0Var.n(t2Var.f19206a, t2Var.f19207b).d();
                int round = Math.round(d10.f27239a);
                int round2 = Math.round(d10.f27240b);
                int round3 = Math.round(d10.f27241c);
                int round4 = Math.round(d10.f27242d);
                z2Var = new z2(round3 - round, round4 - round2, new x.a(new w2.i(round, round2, round3, round4), 11));
            }
            int i11 = z2Var.f19303a;
            int i12 = z2Var.f19304b;
            if (i11 >= 0 && i12 >= 0) {
                arrayList.add(new Pair(l0Var.E(hl.f.Q(i11, i11, i12, i12)), z2Var.f19305c));
            } else {
                yk.j.A1("width(" + i11 + ") and height(" + i12 + ") must be >= 0");
                throw null;
            }
        }
        return arrayList;
    }

    public static final void o(p2.d0 d0Var, q1 q1Var, p2.c0 c0Var, p2.o oVar, p2.v vVar) {
        p2.j jVar = q1Var.f19137d;
        iu.z zVar = new iu.z();
        c.g gVar = new c.g(12, jVar, q1Var.f19153t, zVar);
        p2.x xVar = d0Var.f30532a;
        xVar.b(c0Var, oVar, gVar, q1Var.f19154u);
        p2.i0 i0Var = new p2.i0(d0Var, xVar);
        d0Var.f30533b.set(i0Var);
        zVar.f20560a = i0Var;
        q1Var.f19138e = i0Var;
        v(q1Var, c0Var, vVar);
    }

    public static p2.j0 p(long j10, p2.j0 j0Var) {
        int i10 = j2.f0.f20711c;
        p2.v vVar = j0Var.f30581b;
        int b10 = vVar.b((int) (j10 >> 32));
        int b11 = vVar.b((int) (j10 & 4294967295L));
        int min = Math.min(b10, b11);
        int max = Math.max(b10, b11);
        j2.c cVar = new j2.c(j0Var.f30580a);
        cVar.a(new j2.b0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, u2.j.f36685c, null, 61439), min, max);
        return new p2.j0(cVar.i(), vVar);
    }

    public static final int q(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static final p2.j0 r(p2.l0 l0Var, j2.e eVar) {
        ((i5.w) l0Var).getClass();
        int length = eVar.f20699a.length();
        int length2 = eVar.f20699a.length();
        int min = Math.min(length, 100);
        for (int i10 = 0; i10 < min; i10++) {
            E(i10, length2, i10);
        }
        E(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < min2; i11++) {
            F(i11, length, i11);
        }
        F(length2, length, length2);
        return new p2.j0(eVar, new d4.c0(eVar.f20699a.length(), eVar.f20699a.length()));
    }

    public static final int s(int i10, String str) {
        int length = str.length();
        while (i10 < length) {
            if (str.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final int t(int i10, String str) {
        while (i10 > 0) {
            if (str.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static final g1.o u(g1.o oVar, q1 q1Var, l1.f fVar) {
        return androidx.compose.ui.input.key.a.d(oVar, new x.z(14, fVar, q1Var));
    }

    public static final void v(q1 q1Var, p2.c0 c0Var, p2.v vVar) {
        Function1 function1;
        e1.i h10 = yq.b.h();
        if (h10 != null) {
            function1 = h10.f();
        } else {
            function1 = null;
        }
        e1.i i10 = yq.b.i(h10);
        try {
            s2 d10 = q1Var.d();
            if (d10 == null) {
                return;
            }
            p2.i0 i0Var = q1Var.f19138e;
            if (i0Var == null) {
                return;
            }
            a2.u c10 = q1Var.c();
            if (c10 == null) {
                return;
            }
            w(c0Var, q1Var.f19134a, d10.f19194a, c10, i0Var, q1Var.b(), vVar);
            Unit unit = Unit.f23355a;
        } finally {
            yq.b.l(h10, i10, function1);
        }
    }

    public static void w(p2.c0 c0Var, z1 z1Var, j2.e0 e0Var, a2.u uVar, p2.i0 i0Var, boolean z10, p2.v vVar) {
        m1.d dVar;
        if (!z10) {
            return;
        }
        int b10 = vVar.b(j2.f0.d(c0Var.f30523b));
        if (b10 < e0Var.f20703a.f20689a.f20699a.length()) {
            dVar = e0Var.b(b10);
        } else if (b10 != 0) {
            dVar = e0Var.b(b10 - 1);
        } else {
            dVar = new m1.d(s0.g.f34069a, s0.g.f34069a, 1.0f, (int) (e2.b(z1Var.f19293b, z1Var.f19298g, z1Var.f19299h) & 4294967295L));
        }
        long M = uVar.M(t0.t.g(dVar.f27239a, dVar.f27240b));
        m1.d h10 = t0.t.h(t0.t.g(m1.c.d(M), m1.c.e(M)), t0.t.j(dVar.c(), dVar.b()));
        if (Intrinsics.a((p2.i0) i0Var.f30576a.f30533b.get(), i0Var)) {
            i0Var.f30577b.f(h10);
        }
    }

    public static final g1.o x(g1.o oVar, q1 q1Var, l0.v0 v0Var) {
        return androidx.compose.ui.input.key.a.d(oVar, new x.z(12, q1Var, v0Var));
    }

    public static final g1.o y(g1.o oVar, a0.l lVar, boolean z10, Function1 function1) {
        if (z10) {
            return t0.t.H(oVar, d2.s.f13613k, new v.o(3, function1, lVar));
        }
        return oVar;
    }

    public static final g1.o z(boolean z10, l1.o oVar, a0.l lVar, Function1 function1) {
        return androidx.compose.foundation.d.a(androidx.compose.ui.focus.a.u(androidx.compose.ui.focus.a.j(g1.l.f16404b, oVar), function1), z10, lVar);
    }
}
