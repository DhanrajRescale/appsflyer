package g3;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final j3.d f16514a;

    /* renamed from: b, reason: collision with root package name */
    public int f16515b;

    /* renamed from: c, reason: collision with root package name */
    public int f16516c;

    /* renamed from: d, reason: collision with root package name */
    public float f16517d;

    /* renamed from: e, reason: collision with root package name */
    public float f16518e;

    /* renamed from: f, reason: collision with root package name */
    public float f16519f;

    /* renamed from: g, reason: collision with root package name */
    public float f16520g;

    /* renamed from: h, reason: collision with root package name */
    public float f16521h;

    /* renamed from: i, reason: collision with root package name */
    public float f16522i;

    /* renamed from: j, reason: collision with root package name */
    public float f16523j;

    /* renamed from: k, reason: collision with root package name */
    public float f16524k;

    /* renamed from: l, reason: collision with root package name */
    public float f16525l;

    /* renamed from: m, reason: collision with root package name */
    public float f16526m;

    /* renamed from: n, reason: collision with root package name */
    public float f16527n;

    /* renamed from: o, reason: collision with root package name */
    public int f16528o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f16529p;

    public l(j3.d dVar) {
        this.f16514a = null;
        this.f16515b = 0;
        this.f16516c = 0;
        this.f16517d = Float.NaN;
        this.f16518e = Float.NaN;
        this.f16519f = Float.NaN;
        this.f16520g = Float.NaN;
        this.f16521h = Float.NaN;
        this.f16522i = Float.NaN;
        this.f16523j = Float.NaN;
        this.f16524k = Float.NaN;
        this.f16525l = Float.NaN;
        this.f16526m = Float.NaN;
        this.f16527n = Float.NaN;
        this.f16528o = 0;
        this.f16529p = new HashMap();
        this.f16514a = dVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, d3.a] */
    public final void a(l lVar) {
        if (lVar == null) {
            return;
        }
        this.f16517d = lVar.f16517d;
        this.f16518e = lVar.f16518e;
        this.f16519f = lVar.f16519f;
        this.f16520g = lVar.f16520g;
        this.f16521h = lVar.f16521h;
        this.f16522i = lVar.f16522i;
        this.f16523j = lVar.f16523j;
        this.f16524k = lVar.f16524k;
        this.f16525l = lVar.f16525l;
        this.f16526m = lVar.f16526m;
        this.f16527n = lVar.f16527n;
        this.f16528o = lVar.f16528o;
        HashMap hashMap = this.f16529p;
        hashMap.clear();
        for (d3.a aVar : lVar.f16529p.values()) {
            String str = aVar.f13710a;
            ?? obj = new Object();
            obj.f13712c = Integer.MIN_VALUE;
            obj.f13713d = Float.NaN;
            obj.f13714e = null;
            obj.f13710a = str;
            obj.f13711b = aVar.f13711b;
            obj.f13712c = aVar.f13712c;
            obj.f13713d = aVar.f13713d;
            obj.f13714e = aVar.f13714e;
            obj.f13715f = aVar.f13715f;
            hashMap.put(str, obj);
        }
    }

    public l(l lVar) {
        this.f16514a = null;
        this.f16515b = 0;
        this.f16516c = 0;
        this.f16517d = Float.NaN;
        this.f16518e = Float.NaN;
        this.f16519f = Float.NaN;
        this.f16520g = Float.NaN;
        this.f16521h = Float.NaN;
        this.f16522i = Float.NaN;
        this.f16523j = Float.NaN;
        this.f16524k = Float.NaN;
        this.f16525l = Float.NaN;
        this.f16526m = Float.NaN;
        this.f16527n = Float.NaN;
        this.f16528o = 0;
        this.f16529p = new HashMap();
        this.f16514a = lVar.f16514a;
        this.f16515b = lVar.f16515b;
        this.f16516c = lVar.f16516c;
        a(lVar);
    }
}
