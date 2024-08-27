package xk;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.Labels;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40331c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40333e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f40329a = i10;
        this.f40330b = obj;
        this.f40331c = obj2;
        this.f40332d = obj3;
        this.f40333e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.facebook.FacebookException, java.lang.RuntimeException] */
    @Override // xk.v
    public final void onCompleted(d0 response) {
        JSONArray optJSONArray;
        EnumSet enumSet;
        int i10 = 1;
        switch (this.f40329a) {
            case 0:
                AtomicBoolean permissionsCallSucceeded = (AtomicBoolean) this.f40330b;
                Set permissions = (Set) this.f40331c;
                Set declinedPermissions = (Set) this.f40332d;
                Set expiredPermissions = (Set) this.f40333e;
                Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
                Intrinsics.checkNotNullParameter(permissions, "$permissions");
                Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
                Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
                Intrinsics.checkNotNullParameter(response, "response");
                JSONObject jSONObject = response.f40345d;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    permissionsCallSucceeded.set(true);
                    int length = optJSONArray.length();
                    if (length > 0) {
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                            if (optJSONObject != null) {
                                String optString = optJSONObject.optString(Labels.System.PERMISSION);
                                String status = optJSONObject.optString("status");
                                if (!nl.n0.A(optString) && !nl.n0.A(status)) {
                                    Intrinsics.checkNotNullExpressionValue(status, "status");
                                    Locale US = Locale.US;
                                    Intrinsics.checkNotNullExpressionValue(US, "US");
                                    String status2 = status.toLowerCase(US);
                                    Intrinsics.checkNotNullExpressionValue(status2, "(this as java.lang.String).toLowerCase(locale)");
                                    Intrinsics.checkNotNullExpressionValue(status2, "status");
                                    int hashCode = status2.hashCode();
                                    if (hashCode != -1309235419) {
                                        if (hashCode != 280295099) {
                                            if (hashCode == 568196142 && status2.equals("declined")) {
                                                declinedPermissions.add(optString);
                                            }
                                            Log.w("AccessTokenManager", Intrinsics.i(status2, "Unexpected status: "));
                                        } else {
                                            if (status2.equals("granted")) {
                                                permissions.add(optString);
                                            }
                                            Log.w("AccessTokenManager", Intrinsics.i(status2, "Unexpected status: "));
                                        }
                                    } else {
                                        if (status2.equals("expired")) {
                                            expiredPermissions.add(optString);
                                        }
                                        Log.w("AccessTokenManager", Intrinsics.i(status2, "Unexpected status: "));
                                    }
                                }
                            }
                            if (i12 < length) {
                                i11 = i12;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 1:
                yk.b accessTokenAppId = (yk.b) this.f40330b;
                z postRequest = (z) this.f40331c;
                yk.u appEvents = (yk.u) this.f40332d;
                eb.f flushState = (eb.f) this.f40333e;
                ek.u uVar = yk.i.f41694a;
                if (!sl.a.b(yk.i.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
                        Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
                        Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
                        Intrinsics.checkNotNullParameter(flushState, "$flushState");
                        Intrinsics.checkNotNullParameter(response, "response");
                        yk.i.e(flushState, postRequest, response, accessTokenAppId, appEvents);
                        return;
                    } catch (Throwable th2) {
                        sl.a.a(yk.i.class, th2);
                        return;
                    }
                }
                return;
            default:
                final wl.i this$0 = (wl.i) this.f40330b;
                final String accessToken = (String) this.f40331c;
                final Date date = (Date) this.f40332d;
                final Date date2 = (Date) this.f40333e;
                int i13 = wl.i.f39198l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!this$0.f39203e.get()) {
                    q qVar = response.f40344c;
                    if (qVar != null) {
                        FacebookException facebookException = qVar.f40466i;
                        if (facebookException == null) {
                            facebookException = new FacebookException();
                        }
                        this$0.u(facebookException);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = response.f40343b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        final String string = jSONObject2.getString("id");
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
                        final m9.m f10 = ll.f.f(jSONObject2);
                        String string2 = jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
                        wl.g gVar = this$0.f39206h;
                        if (gVar != null) {
                            ml.b bVar = ml.b.f27823a;
                            ml.b.a(gVar.f39185b);
                        }
                        nl.a0 a0Var = nl.a0.f28827a;
                        nl.y b10 = nl.a0.b(FacebookSdk.getApplicationId());
                        Boolean bool = null;
                        if (b10 != null && (enumSet = b10.f28968c) != null) {
                            bool = Boolean.valueOf(enumSet.contains(nl.j0.RequireConfirm));
                        }
                        if (Intrinsics.a(bool, Boolean.TRUE) && !this$0.f39208j) {
                            this$0.f39208j = true;
                            String string3 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                            String string4 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                            Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                            String string5 = this$0.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                            Intrinsics.checkNotNullExpressionValue(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                            String m10 = a3.a.m(new Object[]{string2}, 1, string4, "java.lang.String.format(format, *args)");
                            AlertDialog.Builder builder = new AlertDialog.Builder(this$0.getContext());
                            builder.setMessage(string3).setCancelable(true).setNegativeButton(m10, new DialogInterface.OnClickListener() { // from class: wl.f
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i14) {
                                    i this$02 = i.this;
                                    String userId = string;
                                    m9.m permissions2 = f10;
                                    String accessToken2 = accessToken;
                                    Date date3 = date;
                                    Date date4 = date2;
                                    int i15 = i.f39198l;
                                    Intrinsics.checkNotNullParameter(this$02, "this$0");
                                    Intrinsics.checkNotNullParameter(userId, "$userId");
                                    Intrinsics.checkNotNullParameter(permissions2, "$permissions");
                                    Intrinsics.checkNotNullParameter(accessToken2, "$accessToken");
                                    this$02.q(userId, permissions2, accessToken2, date3, date4);
                                }
                            }).setPositiveButton(string5, new rd.p(this$0, i10));
                            builder.create().show();
                            return;
                        }
                        this$0.q(string, f10, accessToken, date, date2);
                        return;
                    } catch (JSONException e10) {
                        this$0.u(new RuntimeException(e10));
                        return;
                    }
                }
                return;
        }
    }
}
