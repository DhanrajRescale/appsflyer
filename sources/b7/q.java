package b7;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final z5.b0 f3947a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3948b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3949c;

    /* renamed from: f, reason: collision with root package name */
    public final b5.m f3952f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f3953g;

    /* renamed from: h, reason: collision with root package name */
    public int f3954h;

    /* renamed from: i, reason: collision with root package name */
    public int f3955i;

    /* renamed from: j, reason: collision with root package name */
    public long f3956j;

    /* renamed from: l, reason: collision with root package name */
    public long f3958l;

    /* renamed from: p, reason: collision with root package name */
    public long f3962p;

    /* renamed from: q, reason: collision with root package name */
    public long f3963q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3964r;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f3950d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f3951e = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public p f3959m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public p f3960n = new Object();

    /* renamed from: k, reason: collision with root package name */
    public boolean f3957k = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3961o = false;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, b7.p] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, b7.p] */
    public q(z5.b0 b0Var, boolean z10, boolean z11) {
        this.f3947a = b0Var;
        this.f3948b = z10;
        this.f3949c = z11;
        byte[] bArr = new byte[128];
        this.f3953g = bArr;
        this.f3952f = new b5.m(bArr, 0, 0);
        p pVar = this.f3960n;
        pVar.f3932b = false;
        pVar.f3931a = false;
    }
}
