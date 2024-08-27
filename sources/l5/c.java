package l5;

import android.util.Pair;
import android.util.SparseArray;
import b5.j1;
import b5.v;
import e5.x;
import j5.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.e1;
import r5.t;
import r5.u;
import r5.u0;
import r5.w0;
import r5.x0;

/* loaded from: classes.dex */
public final class c implements u, w0, s5.i {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f23985x = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f23986y = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a, reason: collision with root package name */
    public final int f23987a;

    /* renamed from: b, reason: collision with root package name */
    public final k f23988b;

    /* renamed from: c, reason: collision with root package name */
    public final g5.u f23989c;

    /* renamed from: d, reason: collision with root package name */
    public final n5.p f23990d;

    /* renamed from: e, reason: collision with root package name */
    public final kq.e f23991e;

    /* renamed from: f, reason: collision with root package name */
    public final h8.h f23992f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23993g;

    /* renamed from: h, reason: collision with root package name */
    public final v5.p f23994h;

    /* renamed from: i, reason: collision with root package name */
    public final v5.e f23995i;

    /* renamed from: j, reason: collision with root package name */
    public final e1 f23996j;

    /* renamed from: k, reason: collision with root package name */
    public final b[] f23997k;

    /* renamed from: l, reason: collision with root package name */
    public final mt.p f23998l;

    /* renamed from: m, reason: collision with root package name */
    public final r f23999m;

    /* renamed from: o, reason: collision with root package name */
    public final l0.j f24001o;

    /* renamed from: p, reason: collision with root package name */
    public final n5.l f24002p;

    /* renamed from: q, reason: collision with root package name */
    public t f24003q;

    /* renamed from: t, reason: collision with root package name */
    public e.l f24006t;

    /* renamed from: u, reason: collision with root package name */
    public m5.c f24007u;

    /* renamed from: v, reason: collision with root package name */
    public int f24008v;

    /* renamed from: w, reason: collision with root package name */
    public List f24009w;

    /* renamed from: r, reason: collision with root package name */
    public s5.j[] f24004r = new s5.j[0];

    /* renamed from: s, reason: collision with root package name */
    public o[] f24005s = new o[0];

    /* renamed from: n, reason: collision with root package name */
    public final IdentityHashMap f24000n = new IdentityHashMap();

    public c(int i10, m5.c cVar, h8.h hVar, int i11, k kVar, g5.u uVar, n5.p pVar, n5.l lVar, kq.e eVar, l0.j jVar, long j10, v5.p pVar2, v5.e eVar2, mt.p pVar3, t9.c cVar2, d0 d0Var) {
        String n10;
        List list;
        int i12;
        int i13;
        v[] vVarArr;
        m5.f c10;
        Integer num;
        n5.p pVar4 = pVar;
        this.f23987a = i10;
        this.f24007u = cVar;
        this.f23992f = hVar;
        this.f24008v = i11;
        this.f23988b = kVar;
        this.f23989c = uVar;
        this.f23990d = pVar4;
        this.f24002p = lVar;
        this.f23991e = eVar;
        this.f24001o = jVar;
        this.f23993g = j10;
        this.f23994h = pVar2;
        this.f23995i = eVar2;
        this.f23998l = pVar3;
        this.f23999m = new r(cVar, cVar2, eVar2);
        int i14 = 0;
        s5.j[] jVarArr = this.f24004r;
        pVar3.getClass();
        this.f24006t = new e.l(jVarArr, 18);
        m5.h a10 = cVar.a(i11);
        List list2 = a10.f27550d;
        this.f24009w = list2;
        List list3 = a10.f27549c;
        int size = list3.size();
        HashMap hashMap = new HashMap(kp.j.z(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            hashMap.put(Long.valueOf(((m5.a) list3.get(i15)).f27503a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        for (int i16 = 0; i16 < size; i16++) {
            m5.a aVar = (m5.a) list3.get(i16);
            m5.f c11 = c("http://dashif.org/guidelines/trickmode", aVar.f27507e);
            List list4 = aVar.f27508f;
            c11 = c11 == null ? c("http://dashif.org/guidelines/trickmode", list4) : c11;
            int intValue = (c11 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(c11.f27541b)))) == null) ? i16 : num.intValue();
            if (intValue == i16 && (c10 = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i17 = x.f15050a;
                for (String str : c10.f27541b.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i16) {
                List list5 = (List) sparseArray.get(i16);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i16, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] c02 = kp.j.c0((Collection) arrayList.get(i18));
            iArr[i18] = c02;
            Arrays.sort(c02);
        }
        boolean[] zArr = new boolean[size2];
        v[][] vVarArr2 = new v[size2];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr2 = iArr[i19];
            int length = iArr2.length;
            int i21 = i14;
            while (true) {
                if (i21 >= length) {
                    break;
                }
                List list7 = ((m5.a) list3.get(iArr2[i21])).f27505c;
                for (int i22 = i14; i22 < list7.size(); i22++) {
                    if (!((m5.m) list7.get(i22)).f27567d.isEmpty()) {
                        zArr[i19] = true;
                        i20++;
                        break;
                    }
                }
                i21++;
                i14 = 0;
            }
            int[] iArr3 = iArr[i19];
            int length2 = iArr3.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length2) {
                    vVarArr = new v[0];
                    break;
                }
                int i24 = iArr3[i23];
                m5.a aVar2 = (m5.a) list3.get(i24);
                List list8 = ((m5.a) list3.get(i24)).f27506d;
                int[] iArr4 = iArr3;
                int i25 = 0;
                while (i25 < list8.size()) {
                    m5.f fVar = (m5.f) list8.get(i25);
                    int i26 = length2;
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f27540a)) {
                        b5.u uVar2 = new b5.u();
                        uVar2.f3600k = "application/cea-608";
                        uVar2.f3590a = a3.a.j(new StringBuilder(), aVar2.f27503a, ":cea608");
                        vVarArr = e(fVar, f23985x, new v(uVar2));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f27540a)) {
                        b5.u uVar3 = new b5.u();
                        uVar3.f3600k = "application/cea-708";
                        uVar3.f3590a = a3.a.j(new StringBuilder(), aVar2.f27503a, ":cea708");
                        vVarArr = e(fVar, f23986y, new v(uVar3));
                        break;
                    }
                    i25++;
                    length2 = i26;
                    list8 = list9;
                }
                i23++;
                iArr3 = iArr4;
            }
            vVarArr2[i19] = vVarArr;
            if (vVarArr.length != 0) {
                i20++;
            }
            i19++;
            i14 = 0;
        }
        int size3 = list2.size() + i20 + size2;
        j1[] j1VarArr = new j1[size3];
        b[] bVarArr = new b[size3];
        int i27 = 0;
        int i28 = 0;
        while (i27 < size2) {
            int[] iArr5 = iArr[i27];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i29 = size2;
            int i30 = 0;
            while (i30 < length3) {
                arrayList3.addAll(((m5.a) list3.get(iArr5[i30])).f27505c);
                i30++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            v[] vVarArr3 = new v[size4];
            int i31 = 0;
            while (i31 < size4) {
                int i32 = size4;
                v vVar = ((m5.m) arrayList3.get(i31)).f27564a;
                ArrayList arrayList4 = arrayList3;
                int d10 = pVar4.d(vVar);
                b5.u a11 = vVar.a();
                a11.F = d10;
                vVarArr3[i31] = a11.a();
                i31++;
                size4 = i32;
                arrayList3 = arrayList4;
            }
            m5.a aVar3 = (m5.a) list3.get(iArr5[0]);
            long j11 = aVar3.f27503a;
            if (j11 != -1) {
                n10 = Long.toString(j11);
            } else {
                n10 = jr.h.n("unset:", i27);
            }
            int i33 = i28 + 1;
            if (zArr[i27]) {
                i12 = i33;
                i33 = i28 + 2;
                list = list3;
            } else {
                list = list3;
                i12 = -1;
            }
            if (vVarArr2[i27].length != 0) {
                int i34 = i33;
                i33++;
                i13 = i34;
            } else {
                i13 = -1;
            }
            j1VarArr[i28] = new j1(n10, vVarArr3);
            bVarArr[i28] = new b(aVar3.f27504b, 0, iArr5, i28, i12, i13, -1);
            int i35 = i12;
            int i36 = -1;
            if (i35 != -1) {
                String r10 = jr.h.r(n10, ":emsg");
                b5.u uVar4 = new b5.u();
                uVar4.f3590a = r10;
                uVar4.f3600k = "application/x-emsg";
                j1VarArr[i35] = new j1(r10, new v(uVar4));
                bVarArr[i35] = new b(5, 1, iArr5, i28, -1, -1, -1);
                i36 = -1;
            }
            if (i13 != i36) {
                j1VarArr[i13] = new j1(jr.h.r(n10, ":cc"), vVarArr2[i27]);
                bVarArr[i13] = new b(3, 1, iArr5, i28, -1, -1, -1);
            }
            i27++;
            size2 = i29;
            iArr = iArr6;
            pVar4 = pVar;
            i28 = i33;
            list3 = list;
        }
        int i37 = 0;
        while (i37 < list2.size()) {
            m5.g gVar = (m5.g) list2.get(i37);
            b5.u uVar5 = new b5.u();
            uVar5.f3590a = gVar.a();
            uVar5.f3600k = "application/x-emsg";
            j1VarArr[i28] = new j1(gVar.a() + ":" + i37, new v(uVar5));
            bVarArr[i28] = new b(5, 2, new int[0], -1, -1, -1, i37);
            i37++;
            i28++;
        }
        Pair create = Pair.create(new e1(j1VarArr), bVarArr);
        this.f23996j = (e1) create.first;
        this.f23997k = (b[]) create.second;
    }

    public static m5.f c(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m5.f fVar = (m5.f) list.get(i10);
            if (str.equals(fVar.f27540a)) {
                return fVar;
            }
        }
        return null;
    }

    public static v[] e(m5.f fVar, Pattern pattern, v vVar) {
        String str = fVar.f27541b;
        if (str == null) {
            return new v[]{vVar};
        }
        int i10 = x.f15050a;
        String[] split = str.split(";", -1);
        v[] vVarArr = new v[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new v[]{vVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            b5.u a10 = vVar.a();
            a10.f3590a = vVar.f3641a + ":" + parseInt;
            a10.C = parseInt;
            a10.f3592c = matcher.group(2);
            vVarArr[i11] = new v(a10);
        }
        return vVarArr;
    }

    @Override // r5.u
    public final void A(t tVar, long j10) {
        this.f24003q = tVar;
        tVar.a(this);
    }

    @Override // r5.u
    public final e1 D() {
        return this.f23996j;
    }

    @Override // r5.x0
    public final long G() {
        return this.f24006t.G();
    }

    @Override // r5.x0
    public final void J(long j10) {
        this.f24006t.J(j10);
    }

    @Override // r5.w0
    public final void b(x0 x0Var) {
        this.f24003q.b(this);
    }

    public final int d(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        b[] bVarArr = this.f23997k;
        int i12 = bVarArr[i11].f23982e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && bVarArr[i14].f23980c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // r5.u
    public final long g(long j10, i5.j1 j1Var) {
        long j11;
        for (s5.j jVar : this.f24004r) {
            if (jVar.f34263a == 2) {
                for (l lVar : ((n) jVar.f34267e).f24065h) {
                    i iVar = lVar.f24051d;
                    if (iVar != null) {
                        long j12 = lVar.f24052e;
                        long H = iVar.H(j12);
                        if (H != 0) {
                            i iVar2 = lVar.f24051d;
                            long t10 = iVar2.t(j10, j12);
                            long j13 = lVar.f24053f;
                            long j14 = t10 + j13;
                            long d10 = lVar.d(j14);
                            if (d10 < j10 && (H == -1 || j14 < ((iVar2.F() + j13) + H) - 1)) {
                                j11 = lVar.d(j14 + 1);
                            } else {
                                j11 = d10;
                            }
                            return j1Var.a(j10, d10, j11);
                        }
                    }
                }
                return j10;
            }
        }
        return j10;
    }

    @Override // r5.x0
    public final long i() {
        return this.f24006t.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    @Override // r5.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(u5.s[] r37, boolean[] r38, r5.v0[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.c.o(u5.s[], boolean[], r5.v0[], boolean[], long):long");
    }

    @Override // r5.u
    public final void p() {
        this.f23994h.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x008e, code lost:
    
        if (r5.v(r18, r6) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x004c, code lost:
    
        r12 = null;
     */
    @Override // r5.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q(long r18) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.c.q(long):long");
    }

    @Override // r5.u
    public final void r(long j10) {
        long j11;
        for (s5.j jVar : this.f24004r) {
            if (!jVar.n()) {
                u0 u0Var = jVar.f34275m;
                int i10 = u0Var.f33317q;
                u0Var.h(true, j10);
                u0 u0Var2 = jVar.f34275m;
                int i11 = u0Var2.f33317q;
                if (i11 > i10) {
                    synchronized (u0Var2) {
                        if (u0Var2.f33316p == 0) {
                            j11 = Long.MIN_VALUE;
                        } else {
                            j11 = u0Var2.f33314n[u0Var2.f33318r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        u0[] u0VarArr = jVar.f34276n;
                        if (i12 >= u0VarArr.length) {
                            break;
                        }
                        u0VarArr[i12].h(jVar.f34266d[i12], j11);
                        i12++;
                    }
                }
                int min = Math.min(jVar.v(i11, 0), jVar.f34283u);
                if (min > 0) {
                    ArrayList arrayList = jVar.f34273k;
                    int i13 = x.f15050a;
                    if (min <= arrayList.size() && min >= 0) {
                        if (min != 0) {
                            arrayList.subList(0, min).clear();
                        }
                        jVar.f34283u -= min;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // r5.x0
    public final boolean s(long j10) {
        return this.f24006t.s(j10);
    }

    @Override // r5.x0
    public final boolean u() {
        return this.f24006t.u();
    }

    @Override // r5.u
    public final long w() {
        return -9223372036854775807L;
    }
}
