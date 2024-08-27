package hq;

import fq.f;
import fq.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d implements gq.b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f18671f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f18672g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18674a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18675b;

    /* renamed from: c, reason: collision with root package name */
    public final a f18676c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18677d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f18670e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f18673h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [hq.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [hq.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, hq.c] */
    static {
        final int i10 = 0;
        f18671f = new f() { // from class: hq.b
            @Override // fq.b
            public final void encode(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).e((String) obj);
                        return;
                    default:
                        ((g) obj2).f(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i11 = 1;
        f18672g = new f() { // from class: hq.b
            @Override // fq.b
            public final void encode(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).e((String) obj);
                        return;
                    default:
                        ((g) obj2).f(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f18674a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f18675b = hashMap2;
        this.f18676c = f18670e;
        this.f18677d = false;
        hashMap2.put(String.class, f18671f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f18672g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f18673h);
        hashMap.remove(Date.class);
    }

    @Override // gq.b
    public final gq.b a(Class cls, fq.d dVar) {
        this.f18674a.put(cls, dVar);
        this.f18675b.remove(cls);
        return this;
    }
}
