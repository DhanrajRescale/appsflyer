package dv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class s extends u {

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f14589c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14590d;

    /* renamed from: e, reason: collision with root package name */
    public List f14591e;

    /* renamed from: f, reason: collision with root package name */
    public TreeMap f14592f;

    /* renamed from: g, reason: collision with root package name */
    public transient boolean f14593g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14594h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14595i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14596j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14597k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14598l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f14599m;

    public s(String str, boolean z10) {
        super(str);
        this.f14589c = new LinkedHashMap();
        this.f14590d = new ArrayList();
        this.f14596j = false;
        this.f14597k = true;
        this.f14599m = z10;
    }

    @Override // dv.u
    public final void b(String str, String str2) {
        if (str != null) {
            String trim = str.trim();
            if (!this.f14595i && this.f14596j) {
                trim = trim.toLowerCase();
            }
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (this.f14597k) {
                str2 = str2.trim().replaceAll("\\p{Cntrl}", " ");
            }
            if (trim.length() != 0) {
                LinkedHashMap linkedHashMap = this.f14589c;
                if (!linkedHashMap.containsKey(trim)) {
                    linkedHashMap.put(trim, str2);
                }
            }
        }
    }

    @Override // dv.u
    public final String c() {
        boolean z10 = this.f14595i;
        String str = this.f14603b;
        if (z10) {
            return str;
        }
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public final void d(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(it.next());
            }
            return;
        }
        boolean z10 = obj instanceof o;
        ArrayList arrayList = this.f14590d;
        if (z10) {
            o oVar = (o) obj;
            b bVar = oVar.f14562n;
            if (bVar == null) {
                bVar = oVar.f14563o;
            }
            arrayList.add(bVar);
            return;
        }
        if (obj instanceof b) {
            arrayList.add((b) obj);
            if (obj instanceof s) {
                ((s) obj).f14503a = this;
                return;
            }
            return;
        }
        throw new RuntimeException("Attempted to add invalid child object to TagNode; class=" + obj.getClass());
    }

    public final void e(String str, String str2) {
        if (this.f14592f == null) {
            this.f14592f = new TreeMap();
        }
        this.f14592f.put(str, str2);
    }

    public final String f(String str) {
        return (String) h().get(str.toLowerCase());
    }

    public final LinkedHashMap g() {
        return new LinkedHashMap(this.f14589c);
    }

    public final LinkedHashMap h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f14589c;
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!linkedHashMap.containsKey(str.toLowerCase())) {
                linkedHashMap.put(str.toLowerCase(), linkedHashMap2.get(str));
            }
        }
        return linkedHashMap;
    }

    public final boolean i(String str) {
        Iterator it = this.f14589c.keySet().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if (!this.f14598l) {
            Iterator it = this.f14590d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof s) {
                    if (!((s) next).f14598l) {
                        return false;
                    }
                } else if (next instanceof g) {
                    if (!((g) next).f14534c) {
                        return false;
                    }
                } else {
                    boolean z10 = next instanceof f;
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public final void k(String str) {
        if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(str.trim())) {
            this.f14589c.remove(str.toLowerCase());
        }
    }

    public void l() {
        s sVar = this.f14503a;
        if (sVar != null) {
            sVar.f14590d.remove(this);
        }
    }

    public final void m(Map map) {
        boolean z10 = this.f14596j;
        LinkedHashMap linkedHashMap = this.f14589c;
        if (z10) {
            linkedHashMap.clear();
            linkedHashMap.putAll(map);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            String str2 = (String) map.get(str);
            if (!this.f14596j) {
                String str3 = str;
                for (String str4 : linkedHashMap.keySet()) {
                    if (str4.equalsIgnoreCase(str)) {
                        str3 = str4;
                    }
                }
                str = str3;
            }
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, str2);
            }
        }
        linkedHashMap.clear();
        linkedHashMap.putAll(linkedHashMap2);
    }
}
