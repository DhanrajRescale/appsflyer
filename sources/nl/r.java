package nl;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r extends w0 {

    /* renamed from: o, reason: collision with root package name */
    public static final String f28905o = r.class.getName();

    /* renamed from: n, reason: collision with root package name */
    public boolean f28906n;

    public static void g(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    @Override // nl.w0
    public final Bundle c(String str) {
        Bundle M = n0.M(Uri.parse(str).getQuery());
        String string = M.getString("bridge_args");
        M.remove("bridge_args");
        boolean A = n0.A(string);
        String str2 = f28905o;
        if (!A) {
            try {
                M.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", g.a(new JSONObject(string)));
            } catch (JSONException e10) {
                n0.G(str2, "Unable to parse bridge_args JSON", e10);
            }
        }
        String string2 = M.getString("method_results");
        M.remove("method_results");
        if (!n0.A(string2)) {
            try {
                M.putBundle("com.facebook.platform.protocol.RESULT_ARGS", g.a(new JSONObject(string2)));
            } catch (JSONException e11) {
                n0.G(str2, "Unable to parse bridge_args JSON", e11);
            }
        }
        M.remove("version");
        h0 h0Var = h0.f28857a;
        int i10 = 0;
        if (!sl.a.b(h0.class)) {
            try {
                i10 = h0.f28860d[0].intValue();
            } catch (Throwable th2) {
                sl.a.a(h0.class, th2);
            }
        }
        M.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", i10);
        return M;
    }

    @Override // nl.w0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        v0 v0Var = this.f28955d;
        if (this.f28962k && !this.f28960i && v0Var != null && v0Var.isShown()) {
            if (this.f28906n) {
                return;
            }
            this.f28906n = true;
            v0Var.loadUrl(Intrinsics.i("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
            new Handler(Looper.getMainLooper()).postDelayed(new bl.d(this, 3), 1500L);
            return;
        }
        super.cancel();
    }
}
