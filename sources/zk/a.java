package zk;

import com.facebook.FacebookSdk;
import ek.h;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f42539a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f42540b;

    public final void a() {
        String rulesFromServer;
        if (sl.a.b(this)) {
            return;
        }
        try {
            a0 a0Var = a0.f28827a;
            y h10 = a0.h(FacebookSdk.getApplicationId(), false);
            if (h10 == null || (rulesFromServer = h10.f28975j) == null) {
                return;
            }
            CopyOnWriteArraySet copyOnWriteArraySet = c.f42542d;
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                c.a().clear();
                h.g(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
