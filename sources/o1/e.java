package o1;

import i5.w;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f29378a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f29379b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f29380c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f29381d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f29382e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f29383f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f29384g;

    /* renamed from: h, reason: collision with root package name */
    public static final r f29385h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f29386i;

    /* renamed from: j, reason: collision with root package name */
    public static final r f29387j;

    /* renamed from: k, reason: collision with root package name */
    public static final r f29388k;

    /* renamed from: l, reason: collision with root package name */
    public static final r f29389l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f29390m;

    /* renamed from: n, reason: collision with root package name */
    public static final r f29391n;

    /* renamed from: o, reason: collision with root package name */
    public static final r f29392o;

    /* renamed from: p, reason: collision with root package name */
    public static final r f29393p;

    /* renamed from: q, reason: collision with root package name */
    public static final u f29394q;

    /* renamed from: r, reason: collision with root package name */
    public static final l f29395r;

    /* renamed from: s, reason: collision with root package name */
    public static final r f29396s;

    /* renamed from: t, reason: collision with root package name */
    public static final m f29397t;

    /* renamed from: u, reason: collision with root package name */
    public static final d[] f29398u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [o1.u, o1.d] */
    /* JADX WARN: Type inference failed for: r1v14, types: [o1.m, o1.d] */
    /* JADX WARN: Type inference failed for: r6v7, types: [o1.l, o1.d] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f29378a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f29379b = fArr2;
        s sVar = new s(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        s sVar2 = new s(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        t tVar = k.f29410d;
        r rVar = new r("sRGB IEC61966-2.1", fArr, tVar, sVar, 0);
        f29380c = rVar;
        r rVar2 = new r("sRGB IEC61966-2.1 (Linear)", fArr, tVar, 1.0d, s0.g.f34069a, 1.0f, 1);
        f29381d = rVar2;
        r rVar3 = new r("scRGB-nl IEC 61966-2-2:2003", fArr, tVar, null, new w(5), new w(6), -0.799f, 2.399f, sVar, 2);
        f29382e = rVar3;
        r rVar4 = new r("scRGB IEC 61966-2-2:2003", fArr, tVar, 1.0d, -0.5f, 7.499f, 3);
        f29383f = rVar4;
        double d10 = 2.2222222222222223d;
        double d11 = 0.2222222222222222d;
        r rVar5 = new r("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, tVar, new s(d10, 0.9099181073703367d, 0.09008189262966333d, d11, 0.081d), 4);
        f29384g = rVar5;
        r rVar6 = new r("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, tVar, new s(d10, 0.9096697898662786d, 0.09033021013372146d, d11, 0.08145d), 5);
        f29385h = rVar6;
        r rVar7 = new r("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new t(0.314f, 0.351f), 2.6d, s0.g.f34069a, 1.0f, 6);
        f29386i = rVar7;
        r rVar8 = new r("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, tVar, sVar, 7);
        f29387j = rVar8;
        double d12 = 2.2222222222222223d;
        double d13 = 0.9099181073703367d;
        double d14 = 0.09008189262966333d;
        double d15 = 0.2222222222222222d;
        double d16 = 0.081d;
        r rVar9 = new r("NTSC (1953)", fArr2, k.f29407a, new s(d12, d13, d14, d15, d16), 8);
        f29388k = rVar9;
        r rVar10 = new r("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, tVar, new s(d12, d13, d14, d15, d16), 9);
        f29389l = rVar10;
        r rVar11 = new r("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, tVar, 2.2d, s0.g.f34069a, 1.0f, 10);
        f29390m = rVar11;
        r rVar12 = new r("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, k.f29408b, new s(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f29391n = rVar12;
        float[] fArr3 = {0.7347f, 0.2653f, s0.g.f34069a, 1.0f, 1.0E-4f, -0.077f};
        t tVar2 = k.f29409c;
        r rVar13 = new r("SMPTE ST 2065-1:2012 ACES", fArr3, tVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f29392o = rVar13;
        r rVar14 = new r("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, tVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f29393p = rVar14;
        ?? dVar = new d("Generic XYZ", c.f29371b, 14);
        f29394q = dVar;
        long j10 = c.f29372c;
        ?? dVar2 = new d("Generic L*a*b*", j10, 15);
        f29395r = dVar2;
        r rVar15 = new r("None", fArr, tVar, sVar2, 16);
        f29396s = rVar15;
        ?? dVar3 = new d("Oklab", j10, 17);
        f29397t = dVar3;
        f29398u = new d[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, dVar, dVar2, rVar15, dVar3};
    }
}
