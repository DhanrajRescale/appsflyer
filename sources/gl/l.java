package gl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Long f17478a;

    /* renamed from: b, reason: collision with root package name */
    public Long f17479b;

    /* renamed from: c, reason: collision with root package name */
    public UUID f17480c;

    /* renamed from: d, reason: collision with root package name */
    public int f17481d;

    /* renamed from: e, reason: collision with root package name */
    public Long f17482e;

    /* renamed from: f, reason: collision with root package name */
    public n f17483f;

    public l(Long l10, Long l11) {
        UUID sessionId = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(sessionId, "randomUUID()");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f17478a = l10;
        this.f17479b = l11;
        this.f17480c = sessionId;
    }

    public final void a() {
        long longValue;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        long j10 = 0;
        Long l10 = this.f17478a;
        if (l10 == null) {
            longValue = 0;
        } else {
            longValue = l10.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", longValue);
        Long l11 = this.f17479b;
        if (l11 != null) {
            j10 = l11.longValue();
        }
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", j10);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f17481d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f17480c.toString());
        edit.apply();
        n nVar = this.f17483f;
        if (nVar != null && nVar != null) {
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", nVar.f17486a);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", nVar.f17487b);
            edit2.apply();
        }
    }
}
