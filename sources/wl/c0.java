package wl;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import vt.p0;

/* loaded from: classes.dex */
public abstract class c0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f39161a;

    /* renamed from: b, reason: collision with root package name */
    public t f39162b;

    public c0(t loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        Intrinsics.checkNotNullParameter(loginClient, "<set-?>");
        this.f39162b = loginClient;
    }

    public final void a(String str, String str2) {
        String obj;
        if (this.f39161a == null) {
            this.f39161a = new HashMap();
        }
        HashMap hashMap = this.f39161a;
        if (hashMap != null) {
            if (str == null) {
                obj = null;
            } else {
                obj = str.toString();
            }
        }
    }

    public void b() {
    }

    public final String c(String authId) {
        Intrinsics.checkNotNullParameter(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", e());
            k(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", Intrinsics.i(e10.getMessage(), "Error creating client state json: "));
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final t d() {
        t tVar = this.f39162b;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.k("loginClient");
        throw null;
    }

    public abstract String e();

    public String f() {
        return "fb" + FacebookSdk.getApplicationId() + "://authorize/";
    }

    public final void h(String str) {
        String str2;
        q qVar = d().f39282g;
        if (qVar == null) {
            str2 = null;
        } else {
            str2 = qVar.f39248d;
        }
        if (str2 == null) {
            str2 = FacebookSdk.getApplicationId();
        }
        yk.m loggerImpl = new yk.m(d().e(), str2);
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            loggerImpl.f("fb_dialogs_web_login_dialog_complete", bundle);
        }
    }

    public boolean i(int i10, int i11, Intent intent) {
        return false;
    }

    public final void j(Bundle values, q request) {
        xk.z w10;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(values, "values");
        String authorizationCode = values.getString("code");
        if (!n0.A(authorizationCode)) {
            String str = null;
            if (authorizationCode == null) {
                w10 = null;
            } else {
                String redirectUri = f();
                String codeVerifier = request.f39260p;
                if (codeVerifier == null) {
                    codeVerifier = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
                Bundle bundle = new Bundle();
                bundle.putString("code", authorizationCode);
                bundle.putString(PaymentConstants.CLIENT_ID, FacebookSdk.getApplicationId());
                bundle.putString("redirect_uri", redirectUri);
                bundle.putString("code_verifier", codeVerifier);
                String str2 = xk.z.f40475j;
                w10 = ek.e.w(null, "oauth/access_token", null);
                w10.k(xk.e0.f40353a);
                Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                w10.f40482d = bundle;
            }
            if (w10 != null) {
                xk.d0 c10 = w10.c();
                xk.q qVar = c10.f40344c;
                if (qVar == null) {
                    try {
                        JSONObject jSONObject = c10.f40343b;
                        if (jSONObject != null) {
                            str = jSONObject.getString("access_token");
                        }
                        if (jSONObject != null && !n0.A(str)) {
                            values.putString("access_token", str);
                            if (jSONObject.has("id_token")) {
                                values.putString("id_token", jSONObject.getString("id_token"));
                                return;
                            }
                            return;
                        }
                        throw new FacebookException("No access token found from result");
                    } catch (JSONException e10) {
                        throw new FacebookException(Intrinsics.i(e10.getMessage(), "Fail to process code exchange response: "));
                    }
                }
                throw new FacebookServiceException(qVar, qVar.a());
            }
            throw new FacebookException("Failed to create code exchange request");
        }
        throw new FacebookException("No code param found from the request");
    }

    public void k(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
    }

    public abstract int l(q qVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        HashMap hashMap = this.f39161a;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public c0(Parcel parcel) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(parcel, "source");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            if (readInt > 0) {
                int i10 = 0;
                do {
                    i10++;
                    hashMap.put(parcel.readString(), parcel.readString());
                } while (i10 < readInt);
            }
        }
        this.f39161a = hashMap != null ? p0.m(hashMap) : null;
    }
}
