package t6;

import e5.m;
import e5.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: h, reason: collision with root package name */
    public final int f35376h;

    /* renamed from: i, reason: collision with root package name */
    public final int f35377i;

    /* renamed from: j, reason: collision with root package name */
    public final int f35378j;

    /* renamed from: n, reason: collision with root package name */
    public List f35382n;

    /* renamed from: o, reason: collision with root package name */
    public List f35383o;

    /* renamed from: p, reason: collision with root package name */
    public int f35384p;

    /* renamed from: q, reason: collision with root package name */
    public int f35385q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35386r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35387s;

    /* renamed from: t, reason: collision with root package name */
    public byte f35388t;

    /* renamed from: u, reason: collision with root package name */
    public byte f35389u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35391w;

    /* renamed from: x, reason: collision with root package name */
    public long f35392x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f35373y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f35374z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    public final p f35375g = new p();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f35380l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public b f35381m = new b(0, 4);

    /* renamed from: v, reason: collision with root package name */
    public int f35390v = 0;

    /* renamed from: k, reason: collision with root package name */
    public final long f35379k = 16000000;

    public c(String str, int i10) {
        int i11;
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f35376h = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        m.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f35378j = 0;
                        this.f35377i = 0;
                    } else {
                        this.f35378j = 1;
                        this.f35377i = 1;
                    }
                } else {
                    this.f35378j = 0;
                    this.f35377i = 1;
                }
            } else {
                this.f35378j = 1;
                this.f35377i = 0;
            }
        } else {
            this.f35378j = 0;
            this.f35377i = 0;
        }
        k(0);
        j();
        this.f35391w = true;
        this.f35392x = -9223372036854775807L;
    }

    @Override // t6.i
    public final j e() {
        List list = this.f35382n;
        this.f35383o = list;
        list.getClass();
        return new j(0, list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // t6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(t6.g r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.c.f(t6.g):void");
    }

    @Override // t6.i, h5.e
    public final void flush() {
        super.flush();
        this.f35382n = null;
        this.f35383o = null;
        k(0);
        this.f35385q = 4;
        this.f35381m.f35372h = 4;
        j();
        this.f35386r = false;
        this.f35387s = false;
        this.f35388t = (byte) 0;
        this.f35389u = (byte) 0;
        this.f35390v = 0;
        this.f35391w = true;
        this.f35392x = -9223372036854775807L;
    }

    @Override // t6.i, h5.e
    /* renamed from: g */
    public final s6.e c() {
        s6.e eVar;
        s6.e c10 = super.c();
        if (c10 != null) {
            return c10;
        }
        long j10 = this.f35379k;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f35392x;
            if (j11 != -9223372036854775807L && this.f35438e - j11 >= j10 && (eVar = (s6.e) this.f35435b.pollFirst()) != null) {
                this.f35382n = Collections.emptyList();
                this.f35392x = -9223372036854775807L;
                eVar.j(this.f35438e, e(), Long.MAX_VALUE);
                return eVar;
            }
            return null;
        }
        return null;
    }

    @Override // t6.i
    public final boolean h() {
        return this.f35382n != this.f35383o;
    }

    public final ArrayList i() {
        ArrayList arrayList = this.f35380l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            d5.b c10 = ((b) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(c10);
            if (c10 != null) {
                i10 = Math.min(i10, c10.f13911i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            d5.b bVar = (d5.b) arrayList2.get(i12);
            if (bVar != null) {
                if (bVar.f13911i != i10) {
                    bVar = ((b) arrayList.get(i12)).c(i10);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void j() {
        b bVar = this.f35381m;
        bVar.f35371g = this.f35384p;
        bVar.f35365a.clear();
        bVar.f35366b.clear();
        bVar.f35367c.setLength(0);
        bVar.f35368d = 15;
        bVar.f35369e = 0;
        bVar.f35370f = 0;
        ArrayList arrayList = this.f35380l;
        arrayList.clear();
        arrayList.add(this.f35381m);
    }

    public final void k(int i10) {
        int i11 = this.f35384p;
        if (i11 == i10) {
            return;
        }
        this.f35384p = i10;
        if (i10 == 3) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f35380l;
                if (i12 < arrayList.size()) {
                    ((b) arrayList.get(i12)).f35371g = i10;
                    i12++;
                } else {
                    return;
                }
            }
        } else {
            j();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f35382n = Collections.emptyList();
            }
        }
    }

    @Override // t6.i, h5.e
    public final void release() {
    }
}
