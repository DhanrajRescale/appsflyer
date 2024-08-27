package k3;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g implements e {

    /* renamed from: d, reason: collision with root package name */
    public final q f22002d;

    /* renamed from: f, reason: collision with root package name */
    public int f22004f;

    /* renamed from: g, reason: collision with root package name */
    public int f22005g;

    /* renamed from: a, reason: collision with root package name */
    public q f21999a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22000b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22001c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f22003e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f22006h = 1;

    /* renamed from: i, reason: collision with root package name */
    public h f22007i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22008j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f22009k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f22010l = new ArrayList();

    public g(q qVar) {
        this.f22002d = qVar;
    }

    @Override // k3.e
    public final void a(e eVar) {
        ArrayList arrayList = this.f22010l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).f22008j) {
                return;
            }
        }
        this.f22001c = true;
        q qVar = this.f21999a;
        if (qVar != null) {
            qVar.a(this);
        }
        if (this.f22000b) {
            this.f22002d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        g gVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            g gVar2 = (g) it2.next();
            if (!(gVar2 instanceof h)) {
                i10++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i10 == 1 && gVar.f22008j) {
            h hVar = this.f22007i;
            if (hVar != null) {
                if (hVar.f22008j) {
                    this.f22004f = this.f22006h * hVar.f22005g;
                } else {
                    return;
                }
            }
            d(gVar.f22005g + this.f22004f);
        }
        q qVar2 = this.f21999a;
        if (qVar2 != null) {
            qVar2.a(this);
        }
    }

    public final void b(e eVar) {
        this.f22009k.add(eVar);
        if (this.f22008j) {
            eVar.a(eVar);
        }
    }

    public final void c() {
        this.f22010l.clear();
        this.f22009k.clear();
        this.f22008j = false;
        this.f22005g = 0;
        this.f22001c = false;
        this.f22000b = false;
    }

    public void d(int i10) {
        if (this.f22008j) {
            return;
        }
        this.f22008j = true;
        this.f22005g = i10;
        Iterator it = this.f22009k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.a(eVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22002d.f22030b.f20867j0);
        sb2.append(":");
        sb2.append(jr.h.y(this.f22003e));
        sb2.append("(");
        if (this.f22008j) {
            obj = Integer.valueOf(this.f22005g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f22010l.size());
        sb2.append(":d=");
        sb2.append(this.f22009k.size());
        sb2.append(UrlTreeKt.configurablePathSegmentSuffix);
        return sb2.toString();
    }
}
