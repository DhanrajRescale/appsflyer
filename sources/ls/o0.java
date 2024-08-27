package ls;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25277b;

    public /* synthetic */ o0(Object obj, int i10) {
        this.f25276a = i10;
        this.f25277b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25276a;
        Object obj = this.f25277b;
        switch (i10) {
            case 0:
                p0 p0Var = (p0) obj;
                if (p0Var.f25283c && p0Var.f25284d) {
                    p0Var.f25283c = false;
                    try {
                        double currentTimeMillis = System.currentTimeMillis() - p0.f25280h.doubleValue();
                        if (currentTimeMillis >= ((p0) obj).f25286f.f25172x && currentTimeMillis < ((p0) obj).f25286f.f25173y) {
                            double round = Math.round((currentTimeMillis / 1000.0d) * 10.0d) / 10.0d;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$ae_session_length", round);
                            ((p0) obj).f25285e.f25263e.e("$ae_total_app_sessions", 1.0d);
                            ((p0) obj).f25285e.f25263e.e("$ae_total_app_session_length", round);
                            ((p0) obj).f25285e.n(jSONObject, "$ae_session", true);
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                    n0 n0Var = p0Var.f25285e;
                    if (n0Var.f25261c.f25151c) {
                        n0Var.e();
                    }
                    n0Var.f25264f.g();
                    return;
                }
                return;
            default:
                ((k) obj).a();
                return;
        }
    }
}
