package ls;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: l, reason: collision with root package name */
    public static final HashSet f25243l = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final String f25245b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f25246c;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f25249f;

    /* renamed from: g, reason: collision with root package name */
    public final os.n f25250g;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f25252i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f25253j;

    /* renamed from: a, reason: collision with root package name */
    public String f25244a = null;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f25247d = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f25248e = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public JSONArray f25251h = null;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f25254k = new HashSet();

    public n(Context context, String str, k0 k0Var, os.n nVar, HashSet hashSet) {
        this.f25253j = context;
        this.f25245b = str;
        this.f25249f = k0Var;
        this.f25250g = nVar;
        this.f25246c = new HashSet(hashSet);
    }

    public final synchronized a0 a(a aVar, boolean z10) {
        if (this.f25248e.isEmpty()) {
            el.l.T0("MixpanelAPI.DecideUpdts", "No unseen triggered notifications exist, none will be returned.");
            return null;
        }
        for (int i10 = 0; i10 < this.f25248e.size(); i10++) {
            a0 a0Var = (a0) this.f25248e.get(i10);
            if (a0Var.c(aVar)) {
                if (!z10) {
                    this.f25248e.remove(i10);
                    el.l.T0("MixpanelAPI.DecideUpdts", "recording triggered notification " + a0Var.f25112c + " as seen " + aVar.f25106c);
                }
                return a0Var;
            }
            el.l.T0("MixpanelAPI.DecideUpdts", "triggered notification " + a0Var.f25112c + " does not match event " + aVar.f25106c);
        }
        return null;
    }

    public final synchronized void b(List list, List list2, JSONArray jSONArray, JSONArray jSONArray2, boolean z10, JSONArray jSONArray3) {
        boolean z11;
        boolean z12;
        m0 m0Var;
        try {
            int length = jSONArray2.length();
            this.f25250g.a(jSONArray);
            Iterator it = list.iterator();
            boolean z13 = false;
            while (true) {
                z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                a0 a0Var = (a0) it.next();
                int i10 = a0Var.f25112c;
                if (!this.f25246c.contains(Integer.valueOf(i10))) {
                    this.f25246c.add(Integer.valueOf(i10));
                    this.f25247d.add(a0Var);
                    z13 = true;
                }
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                a0 a0Var2 = (a0) it2.next();
                int i11 = a0Var2.f25112c;
                if (!this.f25246c.contains(Integer.valueOf(i11))) {
                    this.f25246c.add(Integer.valueOf(i11));
                    this.f25248e.add(a0Var2);
                    z13 = true;
                }
            }
            this.f25251h = jSONArray2;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    try {
                    } catch (JSONException e10) {
                        el.l.N("MixpanelAPI.DecideUpdts", "Could not convert variants[" + i12 + "] into a JSONObject while comparing the new variants", e10);
                    }
                    if (!f25243l.contains(Integer.valueOf(jSONArray2.getJSONObject(i12).getInt("id")))) {
                        z12 = true;
                        z13 = true;
                        break;
                    }
                    i12++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z12 && this.f25251h != null) {
                f25243l.clear();
                for (int i13 = 0; i13 < length; i13++) {
                    try {
                        f25243l.add(Integer.valueOf(this.f25251h.getJSONObject(i13).getInt("id")));
                    } catch (JSONException e11) {
                        el.l.N("MixpanelAPI.DecideUpdts", "Could not convert variants[" + i13 + "] into a JSONObject while updating the map", e11);
                    }
                }
            }
            if (length == 0) {
                this.f25251h = new JSONArray();
                HashSet hashSet = f25243l;
                if (hashSet.size() > 0) {
                    hashSet.clear();
                    z13 = true;
                }
            }
            this.f25250g.b(this.f25251h);
            if (this.f25252i == null && !z10) {
                g0 g10 = g0.g(this.f25253j);
                String str = this.f25245b;
                synchronized (g10) {
                    g10.d(1, str);
                    g10.d(2, str);
                    g10.d(4, str);
                }
            }
            this.f25252i = Boolean.valueOf(z10);
            if (jSONArray3 != null) {
                try {
                    HashSet hashSet2 = new HashSet();
                    for (int i14 = 0; i14 < jSONArray3.length(); i14++) {
                        hashSet2.add(jSONArray3.getString(i14));
                    }
                    if (!this.f25254k.equals(hashSet2)) {
                        this.f25254k = hashSet2;
                    } else {
                        z11 = z13;
                    }
                    z13 = z11;
                } catch (JSONException e12) {
                    el.l.N("MixpanelAPI.DecideUpdts", "Got an integration id from " + jSONArray3.toString() + " that wasn't an int", e12);
                }
            }
            el.l.T0("MixpanelAPI.DecideUpdts", "New Decide content has become available. " + list.size() + " notifications and " + jSONArray2.length() + " experiments have been added.");
            if (z13 && (m0Var = this.f25249f) != null) {
                m0Var.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(String str) {
        try {
            String str2 = this.f25244a;
            if (str2 != null) {
                if (!str2.equals(str)) {
                }
                this.f25244a = str;
            }
            this.f25247d.clear();
            this.f25244a = str;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
