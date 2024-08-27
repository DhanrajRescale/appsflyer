package ls;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f25133b;

    public c(String str, JSONObject jSONObject) {
        super(str);
        if (jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject.get(next).toString();
                } catch (AssertionError e10) {
                    jSONObject.remove(next);
                    el.l.N("MixpanelAPI.Messages", "Removing people profile property from update (see https://github.com/mixpanel/mixpanel-android/issues/567)", e10);
                } catch (JSONException unused) {
                }
            }
        }
        this.f25133b = jSONObject;
    }
}
