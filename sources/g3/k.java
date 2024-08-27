package g3;

import b3.t;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: k, reason: collision with root package name */
    public static final Integer f16503k = 0;

    /* renamed from: a, reason: collision with root package name */
    public t f16504a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16505b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16506c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f16507d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f16508e;

    /* renamed from: f, reason: collision with root package name */
    public final b f16509f;

    /* renamed from: g, reason: collision with root package name */
    public int f16510g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f16511h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f16512i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16513j;

    public k() {
        HashMap hashMap = new HashMap();
        this.f16506c = hashMap;
        this.f16507d = new HashMap();
        this.f16508e = new HashMap();
        b bVar = new b(this);
        this.f16509f = bVar;
        this.f16510g = 0;
        this.f16511h = new ArrayList();
        this.f16512i = new ArrayList();
        this.f16513j = true;
        Integer num = f16503k;
        bVar.f16436a = num;
        hashMap.put(num, bVar);
    }

    public final void a(Object obj) {
        this.f16511h.add(obj);
        this.f16513j = true;
    }

    public final b b(Object obj) {
        HashMap hashMap = this.f16506c;
        h hVar = (h) hashMap.get(obj);
        h hVar2 = hVar;
        if (hVar == null) {
            b bVar = new b(this);
            hashMap.put(obj, bVar);
            bVar.f16436a = obj;
            hVar2 = bVar;
        }
        if (hVar2 instanceof b) {
            return (b) hVar2;
        }
        return null;
    }

    public abstract int c(Float f10);

    public final h3.g d(int i10, Object obj) {
        b b10 = b(obj);
        h3.d dVar = b10.f16440c;
        if (dVar == null || !(dVar instanceof h3.g)) {
            h3.g gVar = new h3.g(this);
            gVar.f17944b = i10;
            gVar.f17949g = obj;
            b10.f16440c = gVar;
            b10.b(gVar.c());
        }
        return (h3.g) b10.f16440c;
    }

    public final g e(int i10) {
        g cVar;
        StringBuilder sb2 = new StringBuilder("__HELPER_KEY_");
        int i11 = this.f16510g;
        this.f16510g = i11 + 1;
        String m10 = nn.d.m(sb2, i11, "__");
        HashMap hashMap = this.f16507d;
        g gVar = (g) hashMap.get(m10);
        if (gVar == null) {
            if (i10 != 0) {
                switch (i10 - 1) {
                    case 0:
                        cVar = new h3.c(this, 1);
                        gVar = cVar;
                        break;
                    case 1:
                        cVar = new h3.c(this, 2);
                        gVar = cVar;
                        break;
                    case 2:
                        cVar = new h3.a(this, 0);
                        gVar = cVar;
                        break;
                    case 3:
                        cVar = new h3.a(this, 1);
                        gVar = cVar;
                        break;
                    case 4:
                        cVar = new g(this, 5);
                        gVar = cVar;
                        break;
                    case 5:
                    default:
                        gVar = new g(this, i10);
                        break;
                    case 6:
                    case 7:
                        gVar = new h3.e(this, i10);
                        break;
                    case 8:
                    case 9:
                    case 10:
                        gVar = new h3.f(this, i10);
                        break;
                }
                gVar.f16436a = m10;
                hashMap.put(m10, gVar);
            } else {
                throw null;
            }
        }
        return gVar;
    }
}
