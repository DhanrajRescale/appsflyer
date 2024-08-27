package q6;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import b5.u;
import b5.v;
import e5.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import z5.b0;

/* loaded from: classes.dex */
public final class k implements z5.p {
    public static final byte[] G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final v H;
    public int A;
    public boolean B;
    public z5.r C;
    public b0[] D;
    public b0[] E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public final int f31699a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31700b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f31701c;

    /* renamed from: d, reason: collision with root package name */
    public final e5.p f31702d;

    /* renamed from: e, reason: collision with root package name */
    public final e5.p f31703e;

    /* renamed from: f, reason: collision with root package name */
    public final e5.p f31704f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f31705g;

    /* renamed from: h, reason: collision with root package name */
    public final e5.p f31706h;

    /* renamed from: i, reason: collision with root package name */
    public final tr.e f31707i;

    /* renamed from: j, reason: collision with root package name */
    public final e5.p f31708j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f31709k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f31710l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f31711m;

    /* renamed from: n, reason: collision with root package name */
    public int f31712n;

    /* renamed from: o, reason: collision with root package name */
    public int f31713o;

    /* renamed from: p, reason: collision with root package name */
    public long f31714p;

    /* renamed from: q, reason: collision with root package name */
    public int f31715q;

    /* renamed from: r, reason: collision with root package name */
    public e5.p f31716r;

    /* renamed from: s, reason: collision with root package name */
    public long f31717s;

    /* renamed from: t, reason: collision with root package name */
    public int f31718t;

    /* renamed from: u, reason: collision with root package name */
    public long f31719u;

    /* renamed from: v, reason: collision with root package name */
    public long f31720v;

    /* renamed from: w, reason: collision with root package name */
    public long f31721w;

    /* renamed from: x, reason: collision with root package name */
    public j f31722x;

    /* renamed from: y, reason: collision with root package name */
    public int f31723y;

    /* renamed from: z, reason: collision with root package name */
    public int f31724z;

    static {
        u uVar = new u();
        uVar.f3600k = "application/x-emsg";
        H = uVar.a();
    }

    public k() {
        this(0, Collections.emptyList(), null);
    }

    public static b5.r a(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f17988b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f31664c.f15036a;
                l0.j p10 = e5.a.p(bArr);
                if (p10 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) p10.f23774b;
                }
                if (uuid == null) {
                    e5.m.f("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new b5.q(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new b5.r(null, false, (b5.q[]) arrayList2.toArray(new b5.q[0]));
    }

    public static void b(e5.p pVar, int i10, s sVar) {
        boolean z10;
        pVar.F(i10 + 8);
        int g10 = pVar.g();
        if ((g10 & 1) == 0) {
            if ((g10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int x10 = pVar.x();
            if (x10 == 0) {
                Arrays.fill(sVar.f31791l, 0, sVar.f31784e, false);
                return;
            }
            if (x10 == sVar.f31784e) {
                Arrays.fill(sVar.f31791l, 0, x10, z10);
                int a10 = pVar.a();
                e5.p pVar2 = sVar.f31793n;
                pVar2.C(a10);
                sVar.f31790k = true;
                sVar.f31794o = true;
                pVar.e(pVar2.f15036a, 0, pVar2.f15038c);
                pVar2.F(0);
                sVar.f31794o = false;
                return;
            }
            StringBuilder n10 = a3.a.n("Senc sample count ", x10, " is different from fragment sample count");
            n10.append(sVar.f31784e);
            throw ParserException.a(n10.toString(), null);
        }
        throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:393:0x0776, code lost:
    
        r5 = r0;
        r5.f31712n = 0;
        r5.f31715q = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x077c, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0670  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r48) {
        /*
            Method dump skipped, instructions count: 1917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.k.c(long):void");
    }

    @Override // z5.p
    public final void d(z5.r rVar) {
        int i10;
        this.C = rVar;
        int i11 = 0;
        this.f31712n = 0;
        this.f31715q = 0;
        b0[] b0VarArr = new b0[2];
        this.D = b0VarArr;
        b0 b0Var = this.f31711m;
        if (b0Var != null) {
            b0VarArr[0] = b0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f31699a & 4) != 0) {
            b0VarArr[i10] = rVar.f(100, 5);
            i12 = 101;
            i10++;
        }
        b0[] b0VarArr2 = (b0[]) x.H(i10, this.D);
        this.D = b0VarArr2;
        for (b0 b0Var2 : b0VarArr2) {
            b0Var2.e(H);
        }
        List list = this.f31700b;
        this.E = new b0[list.size()];
        while (i11 < this.E.length) {
            b0 f10 = this.C.f(i12, 3);
            f10.e((v) list.get(i11));
            this.E[i11] = f10;
            i11++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x00b0, code lost:
    
        r3 = r34.f31712n;
        r6 = r2.f31688b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00b6, code lost:
    
        if (r3 != 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00ba, code lost:
    
        if (r2.f31698l != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00bc, code lost:
    
        r3 = r2.f31690d.f31800d[r2.f31692f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00cb, code lost:
    
        r34.f31723y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00d1, code lost:
    
        if (r2.f31692f >= r2.f31695i) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00d3, code lost:
    
        r35.j(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00da, code lost:
    
        if (r1 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00dd, code lost:
    
        r3 = r6.f31793n;
        r1 = r1.f31778d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00e1, code lost:
    
        if (r1 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00e3, code lost:
    
        r3.G(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00e6, code lost:
    
        r1 = r2.f31692f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00ea, code lost:
    
        if (r6.f31790k == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00f0, code lost:
    
        if (r6.f31791l[r1] == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x00f2, code lost:
    
        r3.G(r3.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00fe, code lost:
    
        if (r2.b() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0100, code lost:
    
        r34.f31722x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0102, code lost:
    
        r34.f31712n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x010f, code lost:
    
        if (r2.f31690d.f31797a.f31770g != 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0111, code lost:
    
        r34.f31723y = r3 - 8;
        r35.j(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0127, code lost:
    
        if ("audio/ac4".equals(r2.f31690d.f31797a.f31769f.f3652l) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0129, code lost:
    
        r34.f31724z = r2.c(r34.f31723y, 7);
        r3 = r34.f31723y;
        r8 = r34.f31706h;
        z5.a.b(r3, r8);
        r2.f31687a.c(7, r8);
        r34.f31724z += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x014c, code lost:
    
        r34.f31723y += r34.f31724z;
        r34.f31712n = 4;
        r34.A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0144, code lost:
    
        r34.f31724z = r2.c(r34.f31723y, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x00c5, code lost:
    
        r3 = r6.f31787h[r2.f31692f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0158, code lost:
    
        r3 = r2.f31690d;
        r7 = r3.f31797a;
        r8 = r2.f31687a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0160, code lost:
    
        if (r2.f31698l != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0162, code lost:
    
        r13 = r3.f31802f[r2.f31692f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x016f, code lost:
    
        r3 = r7.f31773j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0171, code lost:
    
        if (r3 == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0173, code lost:
    
        r9 = r34.f31703e;
        r11 = r9.f15036a;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r15 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0189, code lost:
    
        if (r34.f31724z >= r34.f31723y) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x018b, code lost:
    
        r4 = r34.A;
        r5 = r7.f31769f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0191, code lost:
    
        if (r4 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0193, code lost:
    
        r35.readFully(r11, r3, r15);
        r9.F(0);
        r4 = r9.g();
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x01a1, code lost:
    
        if (r4 < 1) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x01a3, code lost:
    
        r34.A = r4 - 1;
        r4 = r34.f31702d;
        r4.F(0);
        r8.c(4, r4);
        r8.c(1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x01b8, code lost:
    
        if (r34.E.length <= 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x01ba, code lost:
    
        r4 = r5.f3652l;
        r5 = r11[4];
        r7 = f5.g.f15954a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x01c6, code lost:
    
        if ("video/avc".equals(r4) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x01c8, code lost:
    
        r20 = r9;
        r9 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x01cd, code lost:
    
        if ((r5 & 31) == 6) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x01e1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x01e7, code lost:
    
        r34.B = r4;
        r34.f31724z += 5;
        r34.f31723y += r3;
        r7 = r18;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x01d7, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x01df, code lost:
    
        if (((r5 & 126) >> 1) != 39) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x01e6, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x01d0, code lost:
    
        r20 = r9;
        r9 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01e3, code lost:
    
        r20 = r9;
        r9 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0202, code lost:
    
        throw androidx.media3.common.ParserException.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0203, code lost:
    
        r18 = r7;
        r20 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x020a, code lost:
    
        if (r34.B == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x020c, code lost:
    
        r7 = r34.f31704f;
        r7.C(r4);
        r21 = r3;
        r35.readFully(r7.f15036a, 0, r34.A);
        r8.c(r34.A, r7);
        r3 = r34.A;
        r4 = f5.g.e(r7.f15038c, r7.f15036a);
        r7.F("video/hevc".equals(r5.f3652l) ? 1 : 0);
        r7.E(r4);
        vl.b.j(r13, r7, r34.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0244, code lost:
    
        r34.f31724z += r3;
        r34.A -= r3;
        r7 = r18;
        r9 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x023c, code lost:
    
        r21 = r3;
        r3 = r8.a(r35, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x026a, code lost:
    
        if (r2.f31698l != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x026c, code lost:
    
        r6 = r2.f31690d.f31803g[r2.f31692f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0284, code lost:
    
        if (r2.a() == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0286, code lost:
    
        r23 = 1073741824 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x028e, code lost:
    
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0292, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0294, code lost:
    
        r26 = r1.f31777c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x029b, code lost:
    
        r8.b(r13, r23, r34.f31723y, 0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x02ac, code lost:
    
        if (r12.isEmpty() != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x02ae, code lost:
    
        r1 = (q6.i) r12.removeFirst();
        r34.f31718t -= r1.f31686c;
        r3 = r1.f31685b;
        r4 = r1.f31684a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x02bf, code lost:
    
        if (r3 == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x02c1, code lost:
    
        r4 = r4 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x02c2, code lost:
    
        r3 = r34.D;
        r6 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x02c6, code lost:
    
        if (r7 >= r6) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x02c8, code lost:
    
        r3[r7].b(r4, 1, r1.f31686c, r34.f31718t, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x02e2, code lost:
    
        if (r2.b() != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x02e4, code lost:
    
        r34.f31722x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x02e7, code lost:
    
        r34.f31712n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x02eb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0299, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x028c, code lost:
    
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x027b, code lost:
    
        if (r6.f31789j[r2.f31692f] == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x027d, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x027f, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0256, code lost:
    
        r3 = r34.f31724z;
        r4 = r34.f31723y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x025a, code lost:
    
        if (r3 >= r4) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x025c, code lost:
    
        r34.f31724z += r8.a(r35, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0169, code lost:
    
        r13 = r6.f31788i[r2.f31692f];
     */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r35, mj.b r36) {
        /*
            Method dump skipped, instructions count: 1874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.k.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        SparseArray sparseArray = this.f31701c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((j) sparseArray.valueAt(i10)).d();
        }
        this.f31710l.clear();
        this.f31718t = 0;
        this.f31719u = j11;
        this.f31709k.clear();
        this.f31712n = 0;
        this.f31715q = 0;
    }

    @Override // z5.p
    public final boolean g(z5.q qVar) {
        return l.w(qVar, true, false);
    }

    @Override // z5.p
    public final void release() {
    }

    public k(int i10, List list, b0 b0Var) {
        this.f31699a = i10;
        this.f31700b = Collections.unmodifiableList(list);
        this.f31711m = b0Var;
        this.f31707i = new tr.e(17);
        this.f31708j = new e5.p(16);
        this.f31702d = new e5.p(f5.g.f15954a);
        this.f31703e = new e5.p(5);
        this.f31704f = new e5.p();
        byte[] bArr = new byte[16];
        this.f31705g = bArr;
        this.f31706h = new e5.p(bArr);
        this.f31709k = new ArrayDeque();
        this.f31710l = new ArrayDeque();
        this.f31701c = new SparseArray();
        this.f31720v = -9223372036854775807L;
        this.f31719u = -9223372036854775807L;
        this.f31721w = -9223372036854775807L;
        this.C = z5.r.f42115d0;
        this.D = new b0[0];
        this.E = new b0[0];
    }
}
