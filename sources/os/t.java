package os;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mixpanel.android.viewcrawler.EditProtocol$BadInstructionsException;
import com.mixpanel.android.viewcrawler.EditProtocol$CantGetEditAssetsException;
import com.mixpanel.android.viewcrawler.EditProtocol$InapplicableInstructionsException;
import com.mixpanel.android.viewcrawler.EditorConnection$EditorConnectionException;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;
import ls.d1;
import ls.l0;
import ls.n0;
import ls.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public i f30375a;

    /* renamed from: b, reason: collision with root package name */
    public m.w f30376b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30377c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f30378d;

    /* renamed from: e, reason: collision with root package name */
    public final e f30379e;

    /* renamed from: f, reason: collision with root package name */
    public final ns.c f30380f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f30381g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f30382h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f30383i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f30384j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f30385k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f30386l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f30387m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f30388n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f30389o;

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f30390p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u f30391q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context, String str, Looper looper, u uVar2) {
        super(looper);
        this.f30391q = uVar;
        this.f30377c = str;
        this.f30376b = null;
        String str2 = uVar.f30392a.f25167s;
        z0 z0Var = new z0(context, 1, str2 == null ? context.getPackageName() : str2);
        ns.c cVar = new ns.c(context, "ViewCrawler");
        this.f30380f = cVar;
        this.f30379e = new e(context, z0Var, cVar, uVar2);
        this.f30389o = new HashSet();
        this.f30381g = new HashMap();
        this.f30382h = new HashMap();
        this.f30383i = new ArrayList();
        this.f30384j = new HashMap();
        this.f30385k = new HashSet();
        this.f30386l = new HashSet();
        this.f30387m = new HashSet();
        this.f30388n = new HashSet();
        this.f30390p = new HashSet();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f30378d = reentrantLock;
        reentrantLock.lock();
    }

    public final void a() {
        List arrayList;
        HashMap hashMap;
        HashMap hashMap2;
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = this.f30385k.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            try {
                arrayList2.add(new Pair(rVar.f30369b, (k0) this.f30379e.c(rVar.f30370c).f39327b));
                if (!this.f30390p.contains(rVar.f30371d)) {
                    hashSet.add(rVar.f30371d);
                }
            } catch (EditProtocol$InapplicableInstructionsException e10) {
                el.l.l0("MixpanelAPI.ViewCrawler", e10.getMessage());
            } catch (EditProtocol$BadInstructionsException e11) {
                el.l.N("MixpanelAPI.ViewCrawler", "Bad persistent change request cannot be applied.", e11);
            } catch (EditProtocol$CantGetEditAssetsException e12) {
                el.l.U0("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", e12);
            }
        }
        Iterator it2 = this.f30386l.iterator();
        while (it2.hasNext()) {
            s sVar = (s) it2.next();
            try {
                e eVar = this.f30379e;
                JSONObject jSONObject = sVar.f30373b;
                eVar.getClass();
                ns.d h10 = e.h(jSONObject);
                if (!this.f30390p.contains(sVar.f30374c)) {
                    hashSet.add(sVar.f30374c);
                    hashSet2.add(((Pair) h10).first);
                } else {
                    if (this.f30391q.f30397f.j(((Pair) h10).second, (String) ((Pair) h10).first)) {
                        hashSet2.add(((Pair) h10).first);
                    }
                }
                h8.h hVar = this.f30391q.f30397f;
                synchronized (hVar) {
                    hashMap2 = new HashMap((ConcurrentMap) hVar.f18056b);
                }
                if (!hashMap2.containsKey(((Pair) h10).first)) {
                    d1 a10 = d1.a(sVar.f30373b);
                    h8.h hVar2 = this.f30391q.f30397f;
                    String str = (String) ((Pair) h10).first;
                    hVar2.getClass();
                    if (str != null && a10 != null) {
                        ((ConcurrentMap) hVar2.f18058d).put(str, a10);
                    }
                } else {
                    this.f30391q.f30397f.m(((Pair) h10).second, (String) ((Pair) h10).first);
                }
            } catch (EditProtocol$BadInstructionsException e13) {
                el.l.N("MixpanelAPI.ViewCrawler", "Bad editor tweak cannot be applied.", e13);
            }
        }
        if (this.f30386l.size() == 0) {
            h8.h hVar3 = this.f30391q.f30397f;
            synchronized (hVar3) {
                hashMap = new HashMap((ConcurrentMap) hVar3.f18057c);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                d1 d1Var = (d1) entry.getValue();
                String str2 = (String) entry.getKey();
                if (this.f30391q.f30397f.j(d1Var.f25176b, str2)) {
                    this.f30391q.f30397f.m(d1Var.f25176b, str2);
                    hashSet2.add(str2);
                }
            }
        }
        for (ns.d dVar : this.f30381g.values()) {
            try {
                wn.e c10 = this.f30379e.c((JSONObject) ((Pair) dVar).second);
                arrayList2.add(new Pair(((Pair) dVar).first, (k0) c10.f39327b));
                this.f30383i.addAll((List) c10.f39328c);
            } catch (EditProtocol$InapplicableInstructionsException e14) {
                el.l.l0("MixpanelAPI.ViewCrawler", e14.getMessage());
            } catch (EditProtocol$BadInstructionsException e15) {
                el.l.N("MixpanelAPI.ViewCrawler", "Bad editor change request cannot be applied.", e15);
            } catch (EditProtocol$CantGetEditAssetsException e16) {
                el.l.U0("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", e16);
            }
        }
        for (ns.d dVar2 : this.f30382h.values()) {
            if (this.f30391q.f30397f.j(((Pair) dVar2).second, (String) ((Pair) dVar2).first)) {
                hashSet2.add(((Pair) dVar2).first);
            }
            this.f30391q.f30397f.m(((Pair) dVar2).second, (String) ((Pair) dVar2).first);
        }
        if (this.f30384j.size() == 0 && this.f30389o.size() == 0) {
            Iterator it3 = this.f30388n.iterator();
            while (it3.hasNext()) {
                ns.d dVar3 = (ns.d) it3.next();
                try {
                    arrayList2.add(new Pair(((Pair) dVar3).first, this.f30379e.d((JSONObject) ((Pair) dVar3).second, this.f30391q.f30395d)));
                } catch (EditProtocol$InapplicableInstructionsException e17) {
                    el.l.l0("MixpanelAPI.ViewCrawler", e17.getMessage());
                } catch (EditProtocol$BadInstructionsException e18) {
                    el.l.N("MixpanelAPI.ViewCrawler", "Bad persistent event binding cannot be applied.", e18);
                }
            }
        }
        for (ns.d dVar4 : this.f30384j.values()) {
            try {
                arrayList2.add(new Pair(((Pair) dVar4).first, this.f30379e.d((JSONObject) ((Pair) dVar4).second, this.f30391q.f30395d)));
            } catch (EditProtocol$InapplicableInstructionsException e19) {
                el.l.l0("MixpanelAPI.ViewCrawler", e19.getMessage());
            } catch (EditProtocol$BadInstructionsException e20) {
                el.l.N("MixpanelAPI.ViewCrawler", "Bad editor event binding cannot be applied.", e20);
            }
        }
        HashMap hashMap3 = new HashMap();
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ns.d dVar5 = (ns.d) arrayList2.get(i10);
            if (hashMap3.containsKey(((Pair) dVar5).first)) {
                arrayList = (List) hashMap3.get(((Pair) dVar5).first);
            } else {
                arrayList = new ArrayList();
                hashMap3.put(((Pair) dVar5).first, arrayList);
            }
            arrayList.add(((Pair) dVar5).second);
        }
        com.google.firebase.messaging.t tVar = this.f30391q.f30396e;
        synchronized (((Set) tVar.f11785e)) {
            try {
                for (f fVar : (Set) tVar.f11785e) {
                    fVar.f30314a = true;
                    fVar.f30318e.post(fVar);
                }
                ((Set) tVar.f11785e).clear();
            } finally {
            }
        }
        synchronized (((Map) tVar.f11784d)) {
            ((Map) tVar.f11784d).clear();
            ((Map) tVar.f11784d).putAll(hashMap3);
        }
        tVar.c();
        Iterator it4 = this.f30387m.iterator();
        while (it4.hasNext()) {
            ns.d dVar6 = (ns.d) it4.next();
            if (!this.f30390p.contains(dVar6)) {
                hashSet.add(dVar6);
            }
        }
        this.f30390p.addAll(hashSet);
        u uVar = this.f30391q;
        if (hashSet.size() > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    ns.d dVar7 = (ns.d) it5.next();
                    int intValue = ((Integer) ((Pair) dVar7).first).intValue();
                    int intValue2 = ((Integer) ((Pair) dVar7).second).intValue();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("$experiment_id", intValue);
                    jSONObject3.put("$variant_id", intValue2);
                    jSONObject2.put(Integer.toString(intValue), intValue2);
                    l0 l0Var = uVar.f30394c.f25263e;
                    n0 n0Var = l0Var.f25236a;
                    if (!n0Var.i()) {
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONObject4.put("$experiments", jSONObject2);
                            n0.a(n0Var, l0Var.h(jSONObject4, "$merge"));
                        } catch (JSONException e21) {
                            el.l.N("MixpanelAPI.API", "Exception merging a property", e21);
                        }
                    }
                    uVar.f30394c.q(new wn.e(17, this, jSONObject2));
                    uVar.f30394c.m("$experiment_started", jSONObject3);
                }
            } catch (JSONException e22) {
                if (el.l.M0(6)) {
                    Log.wtf("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", e22);
                }
            }
        }
        this.f30387m.clear();
        if (hashSet2.size() > 0) {
            Iterator it6 = this.f30391q.f30401j.iterator();
            if (it6.hasNext()) {
                a3.a.u(it6.next());
                throw null;
            }
        }
    }

    public final void b() {
        SSLSocketFactory sSLSocketFactory;
        el.l.T0("MixpanelAPI.ViewCrawler", "connecting to editor");
        i iVar = this.f30375a;
        if (iVar != null && iVar.b()) {
            el.l.T0("MixpanelAPI.ViewCrawler", "There is already a valid connection to an events editor.");
            return;
        }
        u uVar = this.f30391q;
        ls.d0 d0Var = uVar.f30392a;
        synchronized (d0Var) {
            sSLSocketFactory = d0Var.D;
        }
        if (sSLSocketFactory == null) {
            el.l.T0("MixpanelAPI.ViewCrawler", "SSL is not available on this device, no connection will be attempted to the events editor.");
            return;
        }
        String str = ls.d0.a(uVar.f30393b).f25166r + this.f30377c;
        try {
            this.f30375a = new i(new URI(str), new o(uVar), sSLSocketFactory.createSocket());
        } catch (EditorConnection$EditorConnectionException e10) {
            el.l.N("MixpanelAPI.ViewCrawler", "Error connecting to URI " + str, e10);
        } catch (IOException e11) {
            el.l.m0("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", e11);
        } catch (URISyntaxException e12) {
            el.l.N("MixpanelAPI.ViewCrawler", "Error parsing URI " + str + " for editor websocket", e12);
        }
    }

    public final SharedPreferences c() {
        return this.f30391q.f30393b.getSharedPreferences("mixpanel.viewcrawler.changes" + this.f30377c, 0);
    }

    public final void d(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject(PaymentConstants.PAYLOAD).getJSONArray("events");
            int length = jSONArray.length();
            HashMap hashMap = this.f30384j;
            hashMap.clear();
            HashSet hashSet = this.f30388n;
            if (!hashSet.isEmpty()) {
                HashSet hashSet2 = this.f30389o;
                if (hashSet2.isEmpty()) {
                    hashSet2.addAll(hashSet);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ns.d dVar = (ns.d) it.next();
                        try {
                            hashMap.put(((JSONObject) ((Pair) dVar).second).get("path").toString(), dVar);
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    }
                    hashSet.clear();
                }
            }
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    hashMap.put(jSONObject2.get("path").toString(), new Pair(yk.g.N("target_activity", jSONObject2), jSONObject2));
                } catch (JSONException e11) {
                    el.l.N("MixpanelAPI.ViewCrawler", "Bad event binding received from editor in " + jSONArray.toString(), e11);
                }
            }
            a();
        } catch (JSONException e12) {
            el.l.N("MixpanelAPI.ViewCrawler", "Bad event bindings received", e12);
        }
    }

    public final void e(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject(PaymentConstants.PAYLOAD).getJSONArray("actions");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                String N = yk.g.N("target_activity", jSONObject2);
                this.f30381g.put(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), new Pair(N, jSONObject2));
            }
            a();
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.ViewCrawler", "Bad change request received", e10);
        }
    }

    public final void f() {
        this.f30381g.clear();
        this.f30384j.clear();
        this.f30382h.clear();
        this.f30388n.addAll(this.f30389o);
        this.f30389o.clear();
        this.f30376b = null;
        el.l.T0("MixpanelAPI.ViewCrawler", "Editor closed- freeing snapshot");
        a();
        Iterator it = this.f30383i.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            File b10 = this.f30380f.b(str);
            if (b10 != null) {
                b10.delete();
                synchronized (ns.c.f29117e) {
                    ns.c.f29117e.remove(str);
                }
            }
        }
    }

    public final void g(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject(PaymentConstants.PAYLOAD).getJSONArray("tweaks");
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                this.f30379e.getClass();
                ns.d h10 = e.h(jSONObject2);
                this.f30382h.put(((Pair) h10).first, h10);
            }
        } catch (EditProtocol$BadInstructionsException e10) {
            el.l.N("MixpanelAPI.ViewCrawler", "Bad tweaks received", e10);
        } catch (JSONException e11) {
            el.l.N("MixpanelAPI.ViewCrawler", "Bad tweaks received", e11);
        }
        a();
    }

    public final void h(String str) {
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                HashSet hashSet = this.f30388n;
                hashSet.clear();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    hashSet.add(new Pair(yk.g.N("target_activity", jSONObject), jSONObject));
                }
            } catch (JSONException e10) {
                el.l.m0("MixpanelAPI.ViewCrawler", "JSON error when loading event bindings, clearing persistent memory", e10);
                SharedPreferences.Editor edit = c().edit();
                edit.remove("mixpanel.viewcrawler.bindings");
                edit.apply();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ReentrantLock reentrantLock = this.f30378d;
        reentrantLock.lock();
        try {
            switch (message.what) {
                case 0:
                    i();
                    reentrantLock.unlock();
                    return;
                case 1:
                    b();
                    reentrantLock.unlock();
                    return;
                case 2:
                    o((JSONObject) message.obj);
                    reentrantLock.unlock();
                    return;
                case 3:
                    e((JSONObject) message.obj);
                    reentrantLock.unlock();
                    return;
                case 4:
                    k();
                    reentrantLock.unlock();
                    return;
                case 5:
                    JSONArray jSONArray = (JSONArray) message.obj;
                    SharedPreferences.Editor edit = c().edit();
                    edit.putString("mixpanel.viewcrawler.bindings", jSONArray.toString());
                    edit.apply();
                    h(jSONArray.toString());
                    a();
                    reentrantLock.unlock();
                    return;
                case 6:
                    d((JSONObject) message.obj);
                    reentrantLock.unlock();
                    return;
                case 7:
                    n((String) message.obj);
                    reentrantLock.unlock();
                    return;
                case 8:
                    f();
                    reentrantLock.unlock();
                    return;
                case 9:
                    JSONArray jSONArray2 = (JSONArray) message.obj;
                    SharedPreferences.Editor edit2 = c().edit();
                    edit2.putString("mixpanel.viewcrawler.changes", jSONArray2.toString());
                    edit2.apply();
                    j(jSONArray2.toString(), true);
                    a();
                    reentrantLock.unlock();
                    return;
                case 10:
                    try {
                        JSONArray jSONArray3 = ((JSONObject) message.obj).getJSONObject(PaymentConstants.PAYLOAD).getJSONArray("actions");
                        for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                            this.f30381g.remove(jSONArray3.getString(i10));
                        }
                    } catch (JSONException e10) {
                        el.l.N("MixpanelAPI.ViewCrawler", "Bad clear request received", e10);
                    }
                    a();
                    reentrantLock.unlock();
                    return;
                case 11:
                    g((JSONObject) message.obj);
                    reentrantLock.unlock();
                    return;
                case 12:
                    m((d0) message.obj);
                    reentrantLock.unlock();
                    return;
                case 13:
                    JSONArray jSONArray4 = (JSONArray) message.obj;
                    SharedPreferences.Editor edit3 = c().edit();
                    edit3.putString("mixpanel.viewcrawler.changes", jSONArray4.toString());
                    edit3.apply();
                    reentrantLock.unlock();
                    return;
                default:
                    reentrantLock.unlock();
                    return;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
        reentrantLock.unlock();
        throw th2;
    }

    public final void i() {
        SharedPreferences c10 = c();
        String string = c10.getString("mixpanel.viewcrawler.changes", null);
        String string2 = c10.getString("mixpanel.viewcrawler.bindings", null);
        this.f30385k.clear();
        this.f30386l.clear();
        this.f30390p.clear();
        j(string, false);
        this.f30388n.clear();
        h(string2);
        a();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.util.Pair, ns.d, java.lang.Object] */
    public final void j(String str, boolean z10) {
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    ?? pair = new Pair(Integer.valueOf(jSONObject.getInt("experiment_id")), Integer.valueOf(jSONObject.getInt("id")));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("actions");
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                        this.f30385k.add(new r(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), yk.g.N("target_activity", jSONObject2), jSONObject2, pair));
                    }
                    JSONArray jSONArray3 = jSONObject.getJSONArray("tweaks");
                    int length3 = jSONArray3.length();
                    for (int i12 = 0; i12 < length3; i12++) {
                        JSONObject jSONObject3 = jSONArray3.getJSONObject(i12);
                        this.f30386l.add(new s(jSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), jSONObject3, pair));
                    }
                    if (!z10) {
                        this.f30390p.add(pair);
                    }
                    if (length3 == 0 && length2 == 0) {
                        this.f30387m.add(pair);
                    }
                }
            } catch (JSONException e10) {
                el.l.m0("MixpanelAPI.ViewCrawler", "JSON error when loading ab tests / tweaks, clearing persistent memory", e10);
                SharedPreferences.Editor edit = c().edit();
                edit.remove("mixpanel.viewcrawler.changes");
                edit.apply();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Number] */
    public final void k() {
        HashMap hashMap;
        String str;
        u uVar = this.f30391q;
        i iVar = this.f30375a;
        if (iVar != null && iVar.b()) {
            i iVar2 = this.f30375a;
            if (iVar2.f30332b.f17555h.f16230c == 3) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(iVar2.a()));
                try {
                    try {
                        try {
                            jsonWriter.beginObject();
                            jsonWriter.name("type").value("device_info_response");
                            jsonWriter.name(PaymentConstants.PAYLOAD).beginObject();
                            jsonWriter.name("device_type").value("Android");
                            jsonWriter.name("device_name").value(Build.BRAND + "/" + Build.MODEL);
                            jsonWriter.name("scaled_density").value((double) uVar.f30400i);
                            for (Map.Entry entry : uVar.f30398g.entrySet()) {
                                jsonWriter.name((String) entry.getKey()).value((String) entry.getValue());
                            }
                            h8.h hVar = uVar.f30397f;
                            synchronized (hVar) {
                                hashMap = new HashMap((ConcurrentMap) hVar.f18056b);
                            }
                            jsonWriter.name("tweaks").beginArray();
                            for (Map.Entry entry2 : hashMap.entrySet()) {
                                d1 d1Var = (d1) entry2.getValue();
                                String str2 = (String) entry2.getKey();
                                jsonWriter.beginObject();
                                jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str2);
                                jsonWriter.name("minimum").value(d1Var.f25178d);
                                jsonWriter.name("maximum").value(d1Var.f25179e);
                                Object obj = d1Var.f25176b;
                                int i10 = d1Var.f25175a;
                                Object obj2 = d1Var.f25177c;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 != 4) {
                                                String str3 = "Unrecognized Tweak Type " + i10 + " encountered.";
                                                if (el.l.M0(6)) {
                                                    Log.wtf("MixpanelAPI.ViewCrawler", str3);
                                                }
                                            } else {
                                                jsonWriter.name("type").value("string");
                                                try {
                                                    str = (String) obj2;
                                                } catch (ClassCastException unused) {
                                                    str = null;
                                                }
                                                try {
                                                    str = (String) obj;
                                                } catch (ClassCastException unused2) {
                                                }
                                                jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(str);
                                                jsonWriter.name(LogConstants.DEFAULT_CHANNEL).value((String) obj2);
                                            }
                                        } else {
                                            jsonWriter.name("type").value("number");
                                            jsonWriter.name("encoding").value("l");
                                            JsonWriter name = jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                            Integer num = 0;
                                            Object obj3 = d1Var.f25177c;
                                            if (obj3 != null) {
                                                try {
                                                    num = (Number) obj3;
                                                } catch (ClassCastException unused3) {
                                                }
                                            }
                                            Object obj4 = d1Var.f25176b;
                                            if (obj4 != null) {
                                                try {
                                                    num = (Number) obj4;
                                                } catch (ClassCastException unused4) {
                                                }
                                            }
                                            name.value(num.longValue());
                                            jsonWriter.name(LogConstants.DEFAULT_CHANNEL).value(((Number) obj2).longValue());
                                        }
                                    } else {
                                        jsonWriter.name("type").value("number");
                                        jsonWriter.name("encoding").value("d");
                                        JsonWriter name2 = jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                        Integer num2 = 0;
                                        Object obj5 = d1Var.f25177c;
                                        if (obj5 != null) {
                                            try {
                                                num2 = (Number) obj5;
                                            } catch (ClassCastException unused5) {
                                            }
                                        }
                                        Object obj6 = d1Var.f25176b;
                                        if (obj6 != null) {
                                            try {
                                                num2 = (Number) obj6;
                                            } catch (ClassCastException unused6) {
                                            }
                                        }
                                        name2.value(num2.doubleValue());
                                        jsonWriter.name(LogConstants.DEFAULT_CHANNEL).value(((Number) obj2).doubleValue());
                                    }
                                } else {
                                    jsonWriter.name("type").value("boolean");
                                    JsonWriter name3 = jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                    Boolean bool = Boolean.FALSE;
                                    if (obj2 != null) {
                                        try {
                                            bool = (Boolean) obj2;
                                        } catch (ClassCastException unused7) {
                                        }
                                    }
                                    if (obj != null) {
                                        try {
                                            bool = (Boolean) obj;
                                        } catch (ClassCastException unused8) {
                                        }
                                    }
                                    name3.value(bool.booleanValue());
                                    jsonWriter.name(LogConstants.DEFAULT_CHANNEL).value(((Boolean) obj2).booleanValue());
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                            jsonWriter.endObject();
                            jsonWriter.endObject();
                            jsonWriter.close();
                        } catch (IOException e10) {
                            el.l.N("MixpanelAPI.ViewCrawler", "Can't write device_info to server", e10);
                            jsonWriter.close();
                        }
                    } catch (IOException e11) {
                        el.l.N("MixpanelAPI.ViewCrawler", "Can't close websocket writer", e11);
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0050 -> B:15:0x005f). Please report as a decompilation issue!!! */
    public final void l(String str) {
        i iVar = this.f30375a;
        if (iVar != null && iVar.b() && this.f30375a.f30332b.f17555h.f16230c == 3) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", str);
            } catch (JSONException e10) {
                el.l.N("MixpanelAPI.ViewCrawler", "Apparently impossible JSONException", e10);
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f30375a.a());
            try {
            } catch (IOException e11) {
                el.l.N("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", e11);
                outputStreamWriter = e11;
            }
            try {
                try {
                    outputStreamWriter.write("{\"type\": \"error\", ");
                    outputStreamWriter.write("\"payload\": ");
                    outputStreamWriter.write(jSONObject.toString());
                    outputStreamWriter.write(UrlTreeKt.componentParamSuffix);
                    outputStreamWriter.close();
                    outputStreamWriter = outputStreamWriter;
                } catch (IOException e12) {
                    el.l.N("MixpanelAPI.ViewCrawler", "Can't write error message to editor", e12);
                    outputStreamWriter.close();
                    outputStreamWriter = outputStreamWriter;
                }
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                } catch (IOException e13) {
                    el.l.N("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", e13);
                }
                throw th2;
            }
        }
    }

    public final void m(d0 d0Var) {
        i iVar = this.f30375a;
        if (iVar != null && iVar.b()) {
            i iVar2 = this.f30375a;
            if (iVar2.f30332b.f17555h.f16230c == 3) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(iVar2.a()));
                try {
                    try {
                        try {
                            jsonWriter.beginObject();
                            jsonWriter.name("type").value("layout_error");
                            JsonWriter name = jsonWriter.name("exception_type");
                            d0Var.getClass();
                            name.value("circular_dependency");
                            jsonWriter.name("cid").value(d0Var.f30304a);
                            jsonWriter.endObject();
                            jsonWriter.close();
                        } catch (IOException e10) {
                            el.l.N("MixpanelAPI.ViewCrawler", "Can't write track_message to server", e10);
                            jsonWriter.close();
                        }
                    } catch (IOException e11) {
                        el.l.N("MixpanelAPI.ViewCrawler", "Can't close writer.", e11);
                    }
                } catch (Throwable th2) {
                    try {
                        jsonWriter.close();
                    } catch (IOException e12) {
                        el.l.N("MixpanelAPI.ViewCrawler", "Can't close writer.", e12);
                    }
                    throw th2;
                }
            }
        }
    }

    public final void n(String str) {
        i iVar = this.f30375a;
        if (iVar != null && iVar.b()) {
            i iVar2 = this.f30375a;
            if (iVar2.f30332b.f17555h.f16230c == 3) {
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(iVar2.a()));
                try {
                    try {
                        try {
                            jsonWriter.beginObject();
                            jsonWriter.name("type").value("track_message");
                            jsonWriter.name(PaymentConstants.PAYLOAD);
                            jsonWriter.beginObject();
                            jsonWriter.name("event_name").value(str);
                            jsonWriter.endObject();
                            jsonWriter.endObject();
                            jsonWriter.flush();
                            jsonWriter.close();
                        } catch (Throwable th2) {
                            try {
                                jsonWriter.close();
                            } catch (IOException e10) {
                                el.l.N("MixpanelAPI.ViewCrawler", "Can't close writer.", e10);
                            }
                            throw th2;
                        }
                    } catch (IOException e11) {
                        el.l.N("MixpanelAPI.ViewCrawler", "Can't close writer.", e11);
                    }
                } catch (IOException e12) {
                    el.l.N("MixpanelAPI.ViewCrawler", "Can't write track_message to server", e12);
                    jsonWriter.close();
                }
            }
        }
    }

    public final void o(JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(PaymentConstants.PAYLOAD);
            if (jSONObject2.has(PaymentConstants.Category.CONFIG)) {
                this.f30376b = this.f30379e.g(jSONObject2);
                el.l.T0("MixpanelAPI.ViewCrawler", "Initializing snapshot with configuration");
            }
            if (this.f30376b == null) {
                l("No snapshot configuration (or a malformed snapshot configuration) was sent.");
                el.l.V0("MixpanelAPI.ViewCrawler", "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.");
                return;
            }
            BufferedOutputStream a10 = this.f30375a.a();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(a10);
            try {
                try {
                    try {
                        outputStreamWriter.write(UrlTreeKt.componentParamPrefix);
                        outputStreamWriter.write("\"type\": \"snapshot_response\",");
                        outputStreamWriter.write("\"payload\": {");
                        outputStreamWriter.write("\"activities\":");
                        outputStreamWriter.flush();
                        this.f30376b.m(this.f30391q.f30396e, a10);
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        outputStreamWriter.write(",\"snapshot_time_millis\": ");
                        outputStreamWriter.write(Long.toString(currentTimeMillis2));
                        outputStreamWriter.write(UrlTreeKt.componentParamSuffix);
                        outputStreamWriter.write(UrlTreeKt.componentParamSuffix);
                        outputStreamWriter.close();
                    } catch (Throwable th2) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e10) {
                            el.l.N("MixpanelAPI.ViewCrawler", "Can't close writer.", e10);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    el.l.N("MixpanelAPI.ViewCrawler", "Can't write snapshot request to server", e11);
                    outputStreamWriter.close();
                }
            } catch (IOException e12) {
                el.l.N("MixpanelAPI.ViewCrawler", "Can't close writer.", e12);
            }
        } catch (EditProtocol$BadInstructionsException e13) {
            el.l.N("MixpanelAPI.ViewCrawler", "Editor sent malformed message with snapshot request", e13);
            l(e13.getMessage());
        } catch (JSONException e14) {
            el.l.N("MixpanelAPI.ViewCrawler", "Payload with snapshot config required with snapshot request", e14);
            l("Payload with snapshot config required with snapshot request");
        }
    }
}
