package xk;

import android.net.Uri;
import com.facebook.FacebookSdk;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40340b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f40339a = i10;
        this.f40340b = obj;
    }

    @Override // xk.v
    public final void onCompleted(d0 response) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        int length;
        String optString;
        String optString2;
        String optString3;
        String str;
        String str2;
        int i10 = this.f40339a;
        Boolean bool = null;
        Uri uri = null;
        Boolean valueOf = null;
        Object obj = this.f40340b;
        switch (i10) {
            case 0:
                f refreshResult = (f) obj;
                Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
                Intrinsics.checkNotNullParameter(response, "response");
                JSONObject jSONObject = response.f40345d;
                if (jSONObject != null) {
                    refreshResult.f40356a = jSONObject.optString("access_token");
                    refreshResult.f40358c = jSONObject.optInt("expires_at");
                    refreshResult.f40359d = jSONObject.optInt("expires_in");
                    refreshResult.f40360e = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    refreshResult.f40357b = jSONObject.optString("graph_domain", null);
                    return;
                }
                return;
            case 1:
                v vVar = (v) obj;
                String str3 = z.f40475j;
                Intrinsics.checkNotNullParameter(response, "response");
                JSONObject jSONObject2 = response.f40343b;
                if (jSONObject2 == null) {
                    optJSONObject = null;
                } else {
                    optJSONObject = jSONObject2.optJSONObject("__debug__");
                }
                if (optJSONObject == null) {
                    optJSONArray = null;
                } else {
                    optJSONArray = optJSONObject.optJSONArray("messages");
                }
                if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                        if (optJSONObject2 == null) {
                            optString = null;
                        } else {
                            optString = optJSONObject2.optString("message");
                        }
                        if (optJSONObject2 == null) {
                            optString2 = null;
                        } else {
                            optString2 = optJSONObject2.optString("type");
                        }
                        if (optJSONObject2 == null) {
                            optString3 = null;
                        } else {
                            optString3 = optJSONObject2.optString("link");
                        }
                        if (optString != null && optString2 != null) {
                            g0 g0Var = g0.f40377h;
                            if (Intrinsics.a(optString2, LogLevel.WARNING)) {
                                g0Var = g0.f40376g;
                            }
                            if (!nl.n0.A(optString3)) {
                                optString = ((Object) optString) + " Link: " + ((Object) optString3);
                            }
                            ll.f fVar = nl.e0.f28850c;
                            String TAG = z.f40475j;
                            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                            fVar.r(g0Var, TAG, optString);
                        }
                        if (i12 < length) {
                            i11 = i12;
                        }
                    }
                }
                if (vVar != null) {
                    vVar.onCompleted(response);
                    return;
                }
                return;
            case 2:
                da.d dVar = (da.d) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                if (dVar != null) {
                    JSONObject jSONObject3 = response.f40343b;
                    q qVar = response.f40344c;
                    if (qVar != null) {
                        ((FacebookSignInHandler) dVar.f14277c).h(am.d.a(new FirebaseUiException(4, qVar.f40466i)));
                        return;
                    }
                    if (jSONObject3 == null) {
                        ((FacebookSignInHandler) dVar.f14277c).h(am.d.a(new FirebaseUiException(4, "Facebook graph request failed")));
                        return;
                    }
                    try {
                        str = jSONObject3.getString(Scopes.EMAIL);
                    } catch (JSONException unused) {
                        str = null;
                    }
                    try {
                        str2 = jSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    } catch (JSONException unused2) {
                        str2 = null;
                    }
                    try {
                        uri = Uri.parse(jSONObject3.getJSONObject("picture").getJSONObject("data").getString("url"));
                    } catch (JSONException unused3) {
                    }
                    FacebookSignInHandler facebookSignInHandler = (FacebookSignInHandler) dVar.f14277c;
                    wl.d0 d0Var = (wl.d0) dVar.f14276b;
                    q0.g0 g0Var2 = new q0.g0(new am.e(FacebookSdk.FACEBOOK_COM, str, null, str2, uri));
                    g0Var2.f31494d = d0Var.f39167a.f40316e;
                    facebookSignInHandler.h(am.d.c(g0Var2.a()));
                    return;
                }
                return;
            case 3:
                pl.c instrumentData = (pl.c) obj;
                Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f40344c == null) {
                        JSONObject jSONObject4 = response.f40345d;
                        if (jSONObject4 != null) {
                            bool = Boolean.valueOf(jSONObject4.getBoolean("success"));
                        }
                        if (Intrinsics.a(bool, Boolean.TRUE)) {
                            bl.j.w(instrumentData.f31158a);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused4) {
                    return;
                }
            default:
                ArrayList validReports = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(validReports, "$validReports");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f40344c == null) {
                        JSONObject jSONObject5 = response.f40345d;
                        if (jSONObject5 != null) {
                            valueOf = Boolean.valueOf(jSONObject5.getBoolean("success"));
                        }
                        if (Intrinsics.a(valueOf, Boolean.TRUE)) {
                            Iterator it = validReports.iterator();
                            while (it.hasNext()) {
                                bl.j.w(((tl.a) it.next()).f36156a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused5) {
                    return;
                }
        }
    }
}
