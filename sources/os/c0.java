package os;

import android.view.View;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class c0 extends k0 {

    /* renamed from: c, reason: collision with root package name */
    public final h0 f30297c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30298d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30299e;

    public c0(List list, String str, d dVar, boolean z10) {
        super(list);
        this.f30297c = dVar;
        this.f30298d = str;
        this.f30299e = z10;
    }

    public final void d(View view) {
        h0 h0Var = this.f30297c;
        String str = this.f30298d;
        boolean z10 = this.f30299e;
        d dVar = (d) h0Var;
        dVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$text", d.a(view));
            jSONObject.put("$from_binding", true);
            jSONObject.put("time", currentTimeMillis / 1000);
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.DynamicEventTracker", "Can't format properties from view due to JSON issue", e10);
        }
        if (z10) {
            b bVar = new b(view, str);
            c cVar = new c(str, jSONObject, currentTimeMillis);
            synchronized (dVar.f30303d) {
                try {
                    boolean isEmpty = dVar.f30303d.isEmpty();
                    dVar.f30303d.put(bVar, cVar);
                    if (isEmpty) {
                        dVar.f30301b.postDelayed(dVar.f30302c, 1000L);
                    }
                } finally {
                }
            }
            return;
        }
        dVar.f30300a.m(str, jSONObject);
    }
}
