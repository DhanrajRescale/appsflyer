package wl;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.FacebookException;
import nl.m0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f39229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f39230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f39231c;

    public l(Bundle bundle, m mVar, q qVar) {
        this.f39229a = bundle;
        this.f39230b = mVar;
        this.f39231c = qVar;
    }

    @Override // nl.m0
    public final void f(JSONObject jSONObject) {
        String string;
        Bundle bundle = this.f39229a;
        m mVar = this.f39230b;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e10) {
                t d10 = mVar.d();
                Parcelable.Creator<s> creator = s.CREATOR;
                d10.c(ll.e.f(mVar.d().f39282g, "Caught exception", e10.getMessage(), null));
                return;
            }
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        mVar.m(bundle, this.f39231c);
    }

    @Override // nl.m0
    public final void k(FacebookException facebookException) {
        String message;
        m mVar = this.f39230b;
        t d10 = mVar.d();
        Parcelable.Creator<s> creator = s.CREATOR;
        q qVar = mVar.d().f39282g;
        if (facebookException == null) {
            message = null;
        } else {
            message = facebookException.getMessage();
        }
        d10.c(ll.e.f(qVar, "Caught exception", message, null));
    }
}
