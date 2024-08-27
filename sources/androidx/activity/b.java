package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import d2.a0;
import d2.a3;
import d2.b3;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p2.e0;
import vt.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f844b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f843a = i10;
        this.f844b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r5 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f844b
            android.content.Context r0 = (android.content.Context) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            r3 = 1
            if (r1 < r2) goto L86
            h.n0 r1 = h.q.f17721a
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r1.<init>(r0, r2)
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            int r2 = r2.getComponentEnabledSetting(r1)
            if (r2 == r3) goto L86
            boolean r2 = y3.b.c()
            java.lang.String r4 = "locale"
            if (r2 == 0) goto L61
            t.g r2 = h.q.f17727g
            r2.getClass()
            t.b r5 = new t.b
            r5.<init>(r2)
        L30:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            h.q r2 = (h.q) r2
            if (r2 == 0) goto L30
            h.e0 r2 = (h.e0) r2
            android.content.Context r2 = r2.f17632k
            if (r2 == 0) goto L30
            java.lang.Object r2 = r2.getSystemService(r4)
            goto L50
        L4f:
            r2 = 0
        L50:
            if (r2 == 0) goto L66
            android.os.LocaleList r2 = h.p.a(r2)
            y3.l r5 = new y3.l
            y3.n r6 = new y3.n
            r6.<init>(r2)
            r5.<init>(r6)
            goto L68
        L61:
            y3.l r5 = h.q.f17723c
            if (r5 == 0) goto L66
            goto L68
        L66:
            y3.l r5 = y3.l.f41145b
        L68:
            boolean r2 = r5.b()
            if (r2 == 0) goto L7f
            java.lang.String r2 = qu.i0.F(r0)
            java.lang.Object r4 = r0.getSystemService(r4)
            if (r4 == 0) goto L7f
            android.os.LocaleList r2 = h.o.a(r2)
            h.p.b(r4, r2)
        L7f:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r1, r3, r3)
        L86:
            h.q.f17726f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.b.a():void");
    }

    private final void b() {
        t.t tVar;
        int[] iArr;
        t.t tVar2;
        int[] iArr2;
        int i10;
        h2.o oVar;
        int[] iArr3;
        j2.e eVar;
        j2.e eVar2;
        j2.e eVar3;
        i1.c cVar = (i1.c) this.f844b;
        if (cVar.i()) {
            a0 a0Var = cVar.f19312a;
            a0Var.u(true);
            cVar.m(a0Var.getSemanticsOwner().a(), cVar.f19326o);
            cVar.k(a0Var.getSemanticsOwner().a(), cVar.f19326o);
            t.t h10 = cVar.h();
            int[] iArr4 = h10.f34900b;
            long[] jArr = h10.f34899a;
            int length = jArr.length - 2;
            t.t tVar3 = cVar.f19325n;
            int i11 = 8;
            long j10 = -9187201950435737472L;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j11 = jArr[i12];
                    if ((((~j11) << 7) & j11 & j10) != j10) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j11 & 255) < 128) {
                                int i15 = iArr4[(i12 << 3) + i14];
                                a3 a3Var = (a3) tVar3.g(i15);
                                b3 b3Var = (b3) h10.g(i15);
                                if (b3Var != null) {
                                    oVar = b3Var.f13370a;
                                } else {
                                    oVar = null;
                                }
                                if (oVar != null) {
                                    int i16 = oVar.f17865g;
                                    h2.j jVar = oVar.f17862d;
                                    if (a3Var == null) {
                                        Iterator it = jVar.iterator();
                                        while (it.hasNext()) {
                                            Object key = ((Map.Entry) it.next()).getKey();
                                            t.t tVar4 = h10;
                                            h2.u uVar = h2.r.f17903w;
                                            if (Intrinsics.a(key, uVar)) {
                                                Object obj = jVar.f17850a.get(uVar);
                                                if (obj == null) {
                                                    obj = null;
                                                }
                                                List list = (List) obj;
                                                if (list != null) {
                                                    eVar3 = (j2.e) g0.w(list);
                                                } else {
                                                    eVar3 = null;
                                                }
                                                cVar.l(i16, String.valueOf(eVar3));
                                            }
                                            h10 = tVar4;
                                        }
                                        tVar2 = h10;
                                    } else {
                                        tVar2 = h10;
                                        Iterator it2 = jVar.iterator();
                                        while (it2.hasNext()) {
                                            h2.u uVar2 = (h2.u) ((Map.Entry) it2.next()).getKey();
                                            Iterator it3 = it2;
                                            h2.u uVar3 = h2.r.f17903w;
                                            if (Intrinsics.a(uVar2, uVar3)) {
                                                List list2 = (List) hl.f.m0(a3Var.f13352a, uVar3);
                                                if (list2 != null) {
                                                    eVar = (j2.e) g0.w(list2);
                                                    iArr3 = iArr4;
                                                } else {
                                                    iArr3 = iArr4;
                                                    eVar = null;
                                                }
                                                Object obj2 = jVar.f17850a.get(uVar3);
                                                if (obj2 == null) {
                                                    obj2 = null;
                                                }
                                                List list3 = (List) obj2;
                                                if (list3 != null) {
                                                    eVar2 = (j2.e) g0.w(list3);
                                                } else {
                                                    eVar2 = null;
                                                }
                                                if (!Intrinsics.a(eVar, eVar2)) {
                                                    cVar.l(i16, String.valueOf(eVar2));
                                                }
                                                it2 = it3;
                                                iArr4 = iArr3;
                                            } else {
                                                it2 = it3;
                                            }
                                        }
                                    }
                                    iArr2 = iArr4;
                                    i10 = 8;
                                } else {
                                    t0.t.D0("no value for specified key");
                                    throw null;
                                }
                            } else {
                                tVar2 = h10;
                                iArr2 = iArr4;
                                i10 = i11;
                            }
                            j11 >>= i10;
                            i14++;
                            i11 = i10;
                            h10 = tVar2;
                            iArr4 = iArr2;
                        }
                        tVar = h10;
                        iArr = iArr4;
                        if (i13 != i11) {
                            break;
                        }
                    } else {
                        tVar = h10;
                        iArr = iArr4;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    h10 = tVar;
                    iArr4 = iArr;
                    i11 = 8;
                    j10 = -9187201950435737472L;
                }
            }
            tVar3.a();
            t.t h11 = cVar.h();
            int[] iArr5 = h11.f34900b;
            Object[] objArr = h11.f34901c;
            long[] jArr2 = h11.f34899a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j12 = jArr2[i17];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j12 & 255) < 128) {
                                int i20 = (i17 << 3) + i19;
                                tVar3.k(iArr5[i20], new a3(((b3) objArr[i20]).f13370a, cVar.h()));
                            }
                            j12 >>= 8;
                        }
                        if (i18 != 8) {
                            break;
                        }
                    }
                    if (i17 == length2) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            cVar.f19326o = new a3(a0Var.getSemanticsOwner().a(), cVar.h());
            cVar.f19327p = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0529, code lost:
    
        r2 = r34.getValue();
        kotlin.jvm.internal.Intrinsics.d(r2, "null cannot be cast to non-null type kotlin.Boolean");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0538, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x053a, code lost:
    
        r1.F(r1.n(r1.D(r15), 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0545, code lost:
    
        d2.r0.H(r1, r1.D(r15), 2048, 0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04c0, code lost:
    
        r1.z(r14);
        r2 = d2.c3.f13389a;
        r2 = r49.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x04ca, code lost:
    
        if (r3 >= r2) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04cc, code lost:
    
        r6 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04d6, code lost:
    
        if (((d2.z2) r6.get(r3)).f13701a != r8) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04e0, code lost:
    
        r3 = r3 + 1;
        r49 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04d8, code lost:
    
        r3 = (d2.z2) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04e8, code lost:
    
        kotlin.jvm.internal.Intrinsics.c(r3);
        r2 = r12.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04ef, code lost:
    
        if (r2 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04f1, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04f2, code lost:
    
        r3.f13705e = (h2.h) r2;
        r2 = r12.get(h2.r.f17898r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04fc, code lost:
    
        if (r2 != null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04fe, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04ff, code lost:
    
        r3.f13706f = (h2.h) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0509, code lost:
    
        if (r3.f13702b.contains(r3) != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x050d, code lost:
    
        r48.getSnapshotObserver().a(r3, r1.M, new x.y0(17, r3, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04e5, code lost:
    
        r6 = r49;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0467, code lost:
    
        r2 = r12.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x046b, code lost:
    
        if (r2 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x046d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x046e, code lost:
    
        r2 = (j2.e) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0470, code lost:
    
        if (r2 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0472, code lost:
    
        r2 = r2.f20699a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0474, code lost:
    
        if (r2 != null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0477, code lost:
    
        r40 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0479, code lost:
    
        r2 = (j2.f0) r11.e(r3);
        r3 = r1.D(r8);
        r4 = r2.f20712a;
        r1.F(r1.o(r3, java.lang.Integer.valueOf((int) (r4 >> 32)), java.lang.Integer.valueOf((int) (r4 & 4294967295L)), java.lang.Integer.valueOf(r40.length()), d2.r0.O(r40)));
        r1.J(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0403, code lost:
    
        r6 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0306, code lost:
    
        if (r12.containsKey(h2.i.f17832h) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0308, code lost:
    
        r14 = r2.f17850a.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x030e, code lost:
    
        if (r14 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0310, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0311, code lost:
    
        r14 = (j2.e) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0313, code lost:
    
        if (r14 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0316, code lost:
    
        r14 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0318, code lost:
    
        r4 = r12.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x031c, code lost:
    
        if (r4 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x031e, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x031f, code lost:
    
        r4 = (j2.e) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0321, code lost:
    
        if (r4 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0324, code lost:
    
        r4 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0326, code lost:
    
        r6 = d2.r0.O(r4);
        r5 = r14.length();
        r7 = r4.length();
        r46 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0334, code lost:
    
        if (r5 <= r7) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0336, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0339, code lost:
    
        r47 = r8;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x033c, code lost:
    
        r48 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x033e, code lost:
    
        if (r8 >= r15) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0340, code lost:
    
        r49 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x034a, code lost:
    
        if (r14.charAt(r8) == r4.charAt(r8)) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x034d, code lost:
    
        r8 = r8 + 1;
        r10 = r48;
        r13 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0356, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0359, code lost:
    
        if (r10 >= (r15 - r8)) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x035b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x036c, code lost:
    
        if (r14.charAt((r5 - 1) - r10) == r4.charAt((r7 - 1) - r10)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x036f, code lost:
    
        r10 = r10 + 1;
        r15 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0374, code lost:
    
        r5 = (r5 - r10) - r8;
        r4 = (r7 - r10) - r8;
        r10 = h2.r.E;
        r2 = r2.f17850a;
        r13 = r2.containsKey(r10);
        r10 = r12.containsKey(r10);
        r2 = r2.containsKey(h2.i.f17832h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x038b, code lost:
    
        if (r2 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x038d, code lost:
    
        if (r13 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x038f, code lost:
    
        if (r10 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0391, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0394, code lost:
    
        if (r2 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0396, code lost:
    
        if (r13 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0398, code lost:
    
        if (r10 != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x039a, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x039d, code lost:
    
        if (r12 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x039f, code lost:
    
        if (r10 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a4, code lost:
    
        r2 = r1.n(r1.D(r3), 16);
        r2.setFromIndex(r8);
        r2.setRemovedCount(r5);
        r2.setAddedCount(r4);
        r2.setBeforeText(r14);
        r2.getText().add(r6);
        r8 = r3;
        r14 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
        r51 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03f5, code lost:
    
        r2.setClassName("android.widget.EditText");
        r1.F(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03fd, code lost:
    
        if (r12 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ff, code lost:
    
        if (r10 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0402, code lost:
    
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0407, code lost:
    
        r3 = ((j2.f0) r11.e(h2.r.A)).f20712a;
        r2.setFromIndex((int) (r3 >> 32));
        r2.setToIndex((int) (r3 & 4294967295L));
        r1.F(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d0, code lost:
    
        r14 = r35;
        r25 = r37;
        r8 = r3;
        r26 = r38;
        r50 = r39;
        r51 = r41;
        r2 = r1.o(r1.D(r3), 0, 0, java.lang.Integer.valueOf(r7), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x039c, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0393, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0354, code lost:
    
        r49 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0338, code lost:
    
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0423, code lost:
    
        r47 = r8;
        r48 = r10;
        r49 = r13;
        r46 = r15;
        r14 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
        r51 = r41;
        r8 = r3;
        d2.r0.H(r1, r1.D(r8), 2048, 2, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02d7, code lost:
    
        r2 = r1.D(r3);
        r5 = r34.getValue();
        kotlin.jvm.internal.Intrinsics.d(r5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        r1.G(r2, 2048, 4, (java.util.List) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x028a, code lost:
    
        r47 = r8;
        r48 = r10;
        r6 = r13;
        r46 = r15;
        r10 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
        r51 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0140, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x020e, code lost:
    
        r2 = r12.get(h2.r.f17901u);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0214, code lost:
    
        if (r2 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0216, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0217, code lost:
    
        r2 = (h2.g) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0219, code lost:
    
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x021b, code lost:
    
        r6 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02bb, code lost:
    
        d2.r0.H(r1, r1.D(r3), 2048, 64, 8);
        d2.r0.H(r1, r1.D(r3), 2048, 0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02a9, code lost:
    
        r47 = r8;
        r48 = r10;
        r46 = r15;
        r10 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
        r51 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01bd, code lost:
    
        r8 = r3;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0229, code lost:
    
        if (h2.g.a(r2.f17821a, 4) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x022b, code lost:
    
        r2 = r12.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x022f, code lost:
    
        if (r2 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0231, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0238, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r2, java.lang.Boolean.TRUE) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x023a, code lost:
    
        r2 = r1.n(r1.D(r3), 4);
        r4 = new h2.o(r0.f17859a, true, r14, r11);
        r5 = (java.util.List) hl.f.m0(r4.h(), h2.r.f17882b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x025b, code lost:
    
        if (r5 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x025d, code lost:
    
        r5 = yk.j.T0(r5, ",", null, 62);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0263, code lost:
    
        r4 = (java.util.List) hl.f.m0(r4.h(), h2.r.f17903w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x026f, code lost:
    
        if (r4 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0271, code lost:
    
        r4 = yk.j.T0(r4, ",", null, 62);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0277, code lost:
    
        if (r5 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0279, code lost:
    
        r2.setContentDescription(r5);
        r5 = kotlin.Unit.f23355a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x027e, code lost:
    
        if (r4 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0280, code lost:
    
        r2.getText().add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0287, code lost:
    
        r1.F(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0276, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0262, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x029d, code lost:
    
        r6 = '\b';
        d2.r0.H(r1, r1.D(r3), 2048, 0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01d1, code lost:
    
        d2.r0.H(r1, r1.D(r3), 2048, 64, 8);
        d2.r0.H(r1, r1.D(r3), 2048, 0, 8);
        r47 = r8;
        r48 = r10;
        r42 = r12;
        r6 = r13;
        r43 = r14;
        r46 = r15;
        r10 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
        r51 = r41;
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0193, code lost:
    
        r6 = '\b';
        d2.r0.H(r1, r1.D(r3), 2048, 64, 8);
        d2.r0.H(r1, r1.D(r3), 2048, 0, 8);
        r51 = r7;
        r47 = r8;
        r48 = r10;
        r42 = r12;
        r43 = r14;
        r46 = r15;
        r10 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0151, code lost:
    
        r4 = r34.getValue();
        kotlin.jvm.internal.Intrinsics.d(r4, "null cannot be cast to non-null type kotlin.String");
        r4 = (java.lang.String) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0162, code lost:
    
        if (r2.f17850a.containsKey(r6) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0129, code lost:
    
        r51 = r7;
        r47 = r8;
        r48 = r10;
        r42 = r12;
        r6 = r13;
        r43 = r14;
        r46 = r15;
        r10 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0164, code lost:
    
        r1.I(r3, 8, r4);
        r51 = r7;
        r47 = r8;
        r48 = r10;
        r42 = r12;
        r6 = r13;
        r43 = r14;
        r46 = r15;
        r10 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0113, code lost:
    
        if (r6 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0655, code lost:
    
        if (r33 != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0735, code lost:
    
        if (r12.f17862d.f17850a.containsKey(h2.r.f17885e) == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r34.getKey(), h2.r.f17898r) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0127, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r34.getValue(), hl.f.m0(r2, (h2.u) r34.getKey())) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0143, code lost:
    
        r4 = (h2.u) r34.getKey();
        r6 = h2.r.f17885e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, r6) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0814, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x081e, code lost:
    
        if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0820, code lost:
    
        r29 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, h2.r.f17883c) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0191, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, h2.r.D) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c5, code lost:
    
        r41 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01cf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, h2.r.f17884d) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01fe, code lost:
    
        r6 = h2.r.C;
        r7 = kotlin.jvm.internal.Intrinsics.a(r4, r6);
        r42 = r12;
        r12 = r11.f17850a;
        r43 = r14;
        r14 = r0.f17861c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x020c, code lost:
    
        if (r7 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02d5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, h2.r.f17882b) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f1, code lost:
    
        r6 = h2.r.f17906z;
        r25 = kotlin.jvm.internal.Intrinsics.a(r4, r6);
        r40 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02fe, code lost:
    
        if (r25 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0447, code lost:
    
        r47 = r8;
        r48 = r10;
        r49 = r13;
        r46 = r15;
        r10 = r35;
        r25 = r37;
        r26 = r38;
        r50 = r39;
        r51 = r41;
        r8 = r3;
        r3 = h2.r.A;
        r7 = kotlin.jvm.internal.Intrinsics.a(r4, r3);
        r15 = r0.f17865g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0465, code lost:
    
        if (r7 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04b5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, r5) == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04be, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, h2.r.f17898r) == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x051f, code lost:
    
        r6 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0527, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, h2.r.f17892l) == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x054f, code lost:
    
        r3 = h2.i.f17845u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0555, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r4, r3) == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0557, code lost:
    
        r4 = (java.util.List) r11.e(r3);
        r2 = (java.util.List) hl.f.m0(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0563, code lost:
    
        if (r2 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x05be, code lost:
    
        if ((!r4.isEmpty()) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x05c0, code lost:
    
        r13 = r6;
        r3 = r8;
        r2 = r10;
        r4 = r25;
        r5 = r26;
        r12 = r42;
        r14 = r43;
        r15 = r46;
        r8 = r47;
        r10 = r48;
        r6 = r50;
        r7 = r51;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x058d, code lost:
    
        r13 = r6;
        r3 = r8;
        r2 = r10;
        r4 = r25;
        r5 = r26;
        r12 = r42;
        r14 = r43;
        r15 = r46;
        r8 = r47;
        r10 = r48;
        r6 = r50;
        r7 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0565, code lost:
    
        r3 = new java.util.LinkedHashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x056e, code lost:
    
        if (r4.size() > 0) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0570, code lost:
    
        r4 = new java.util.LinkedHashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0579, code lost:
    
        if (r2.size() > 0) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x057f, code lost:
    
        if (r3.containsAll(r4) == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0585, code lost:
    
        if (r4.containsAll(r3) != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0588, code lost:
    
        r33 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x058b, code lost:
    
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x05a4, code lost:
    
        a3.a.u(r2.get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x05ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05ae, code lost:
    
        a3.a.u(r4.get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x05b7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x05df, code lost:
    
        if ((r34.getValue() instanceof h2.a) == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x05e1, code lost:
    
        r3 = r34.getValue();
        kotlin.jvm.internal.Intrinsics.d(r3, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        r3 = (h2.a) r3;
        r2 = hl.f.m0(r2, (h2.u) r34.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x05f6, code lost:
    
        if (r3 != r2) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x05fb, code lost:
    
        if ((r2 instanceof h2.a) != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x05fe, code lost:
    
        r2 = (h2.a) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0608, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r3.f17809a, r2.f17809a) != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x060b, code lost:
    
        r2 = r2.f17810b;
        r3 = r3.f17810b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x060f, code lost:
    
        if (r3 != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0611, code lost:
    
        if (r2 == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0614, code lost:
    
        if (r3 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0616, code lost:
    
        if (r2 != null) goto L212;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            Method dump skipped, instructions count: 2327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.b.c():void");
    }

    private final void d() {
        p2.g0 g0Var = (p2.g0) this.f844b;
        g0Var.f30572n = null;
        iu.z zVar = new iu.z();
        iu.z zVar2 = new iu.z();
        v0.h hVar = g0Var.f30571m;
        int i10 = hVar.f37655c;
        if (i10 > 0) {
            Object[] objArr = hVar.f37653a;
            int i11 = 0;
            do {
                e0 e0Var = (e0) objArr[i11];
                int ordinal = e0Var.ordinal();
                if (ordinal != 0) {
                    boolean z10 = true;
                    if (ordinal != 1) {
                        if ((ordinal == 2 || ordinal == 3) && !Intrinsics.a(zVar.f20560a, Boolean.FALSE)) {
                            if (e0Var != e0.f30553c) {
                                z10 = false;
                            }
                            zVar2.f20560a = Boolean.valueOf(z10);
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        zVar.f20560a = bool;
                        zVar2.f20560a = bool;
                    }
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    zVar.f20560a = bool2;
                    zVar2.f20560a = bool2;
                }
                i11++;
            } while (i11 < i10);
        }
        hVar.g();
        boolean a10 = Intrinsics.a(zVar.f20560a, Boolean.TRUE);
        p2.p pVar = g0Var.f30560b;
        if (a10) {
            p2.q qVar = (p2.q) pVar;
            ((InputMethodManager) qVar.f30602b.getValue()).restartInput(qVar.f30601a);
        }
        Boolean bool3 = (Boolean) zVar2.f20560a;
        if (bool3 != null) {
            if (bool3.booleanValue()) {
                ((x2.c) ((p2.q) pVar).f30603c.f18690b).s();
            } else {
                ((x2.c) ((p2.q) pVar).f30603c.f18690b).q();
            }
        }
        if (Intrinsics.a(zVar.f20560a, Boolean.FALSE)) {
            p2.q qVar2 = (p2.q) pVar;
            ((InputMethodManager) qVar2.f30602b.getValue()).restartInput(qVar2.f30601a);
        }
    }

    private final void e() {
        boolean z10;
        Object obj;
        Activity activity = (Activity) this.f844b;
        int i10 = q3.h.f31615a;
        if (!activity.isFinishing()) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                Class cls = q3.j.f31622a;
                activity.recreate();
                return;
            }
            Class cls2 = q3.j.f31622a;
            if (i11 != 26 && i11 != 27) {
                z10 = false;
            } else {
                z10 = true;
            }
            Method method = q3.j.f31627f;
            if ((!z10 || method != null) && (q3.j.f31626e != null || q3.j.f31625d != null)) {
                try {
                    Object obj2 = q3.j.f31624c.get(activity);
                    if (obj2 != null && (obj = q3.j.f31623b.get(activity)) != null) {
                        Application application = activity.getApplication();
                        q3.i iVar = new q3.i(activity);
                        application.registerActivityLifecycleCallbacks(iVar);
                        Handler handler = q3.j.f31628g;
                        handler.post(new m.j(iVar, obj2, 2));
                        int i12 = 3;
                        try {
                            if (i11 != 26 && i11 != 27) {
                                activity.recreate();
                            } else {
                                Boolean bool = Boolean.FALSE;
                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                            }
                            handler.post(new m.j(application, iVar, i12));
                            return;
                        } finally {
                            handler.post(new m.j(application, iVar, i12));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            activity.recreate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05eb A[Catch: IOException -> 0x058e, UnknownHostException -> 0x0591, TRY_LEAVE, TryCatch #16 {UnknownHostException -> 0x0591, IOException -> 0x058e, blocks: (B:57:0x0552, B:59:0x0563, B:62:0x0594, B:64:0x059e, B:68:0x05ae, B:70:0x05eb, B:78:0x0609, B:87:0x0610, B:88:0x0613, B:90:0x0614, B:93:0x056b, B:96:0x0572, B:97:0x0578, B:99:0x057e, B:101:0x0642, B:102:0x0649), top: B:56:0x0552 }] */
    /* JADX WARN: Type inference failed for: r0v205, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v207, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.util.Collection] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.b.run():void");
    }
}
