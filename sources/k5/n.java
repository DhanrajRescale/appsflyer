package k5;

import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public long f22159a;

    /* renamed from: b, reason: collision with root package name */
    public long f22160b;

    /* renamed from: c, reason: collision with root package name */
    public long f22161c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22162d;

    /* renamed from: e, reason: collision with root package name */
    public Object f22163e;

    public final JSONObject a(boolean z10) {
        long j10;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(((Random) this.f22163e).nextLong()));
            jSONObject.put("$mp_session_id", (String) this.f22162d);
            if (z10) {
                j10 = this.f22159a;
            } else {
                j10 = this.f22160b;
            }
            jSONObject.put("$mp_session_seq_id", j10);
            jSONObject.put("$mp_session_start_sec", this.f22161c);
            if (z10) {
                this.f22159a++;
            } else {
                this.f22160b++;
            }
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.ConfigurationChecker", "Cannot create session metadata JSON object", e10);
        }
        return jSONObject;
    }

    public final void b() {
        this.f22159a = 0L;
        this.f22160b = 0L;
        this.f22162d = Long.toHexString(new Random().nextLong());
        this.f22161c = System.currentTimeMillis() / 1000;
    }
}
