package ls;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f25339a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25340b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f25341c;

    /* renamed from: d, reason: collision with root package name */
    public final Notification.Builder f25342d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25343e;

    /* renamed from: f, reason: collision with root package name */
    public v0 f25344f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25345g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25346h;

    public w0(Context context) {
        Notification.Builder builder = new Notification.Builder(context);
        long currentTimeMillis = System.currentTimeMillis();
        this.f25346h = false;
        this.f25340b = context;
        this.f25342d = builder;
        String str = d0.a(context).f25167s;
        this.f25341c = new z0(context, 0, str == null ? context.getPackageName() : str);
        this.f25343e = currentTimeMillis;
        int i10 = (int) currentTimeMillis;
        this.f25339a = i10;
        this.f25345g = i10;
    }

    public static Date c(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
            if (str.equals("yyyy-MM-dd'T'HH:mm:ss'Z'")) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            }
            return simpleDateFormat.parse(str2);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final Bundle a(wn.e eVar) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("mp_tap_target", "notification");
        bundle.putCharSequence("mp_tap_action_type", ((u0) eVar.f39327b).f25307a);
        bundle.putCharSequence("mp_tap_action_uri", (String) eVar.f39328c);
        bundle.putCharSequence("mp_message_id", this.f25344f.f25337t);
        bundle.putCharSequence("mp_campaign_id", this.f25344f.f25336s);
        bundle.putInt("mp_notification_id", this.f25345g);
        bundle.putBoolean("mp_is_sticky", this.f25344f.f25330m);
        bundle.putCharSequence("mp_tag", this.f25344f.f25328k);
        String str = this.f25344f.f25328k;
        if (str == null) {
            str = Integer.toString(this.f25345g);
        }
        bundle.putCharSequence("mp_canonical_notification_id", str);
        bundle.putCharSequence("mp", this.f25344f.f25338u);
        return bundle;
    }

    public final wn.e b(String str) {
        wn.e eVar;
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            u0 u0Var = u0.HOMESCREEN;
            if (!string.equals("homescreen")) {
                eVar = new wn.e(u0.a(string), jSONObject.getString("uri"), 15);
            } else {
                eVar = new wn.e(u0.a(string));
            }
            if (((u0) eVar.f39327b).f25307a.equals("error")) {
                this.f25346h = true;
                return new wn.e(u0Var);
            }
            return eVar;
        } catch (JSONException unused) {
            el.l.F("MixpanelAPI.MixpanelPushNotification", "Exception occurred while parsing ontap");
            return null;
        }
    }
}
