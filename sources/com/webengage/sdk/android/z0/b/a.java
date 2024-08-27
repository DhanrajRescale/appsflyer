package com.webengage.sdk.android.z0.b;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.exception.GCMRegistrationException;
import com.webengage.sdk.android.l;
import com.webengage.sdk.android.utils.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class a extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f13024c;

    public a(Context context) {
        super(context);
        this.f13024c = null;
        this.f13024c = context.getApplicationContext();
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (!i.h()) {
            Logger.e("WebEngage", "GoogleCloudMessaging class not found");
            return null;
        }
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f13024c);
        if (isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2) {
            if (isGooglePlayServicesAvailable == 2) {
                Logger.w("WebEngage", "Please update your google play service");
                b(new GCMRegistrationException("Google play service update required"));
            }
            try {
                String register = GoogleCloudMessaging.getInstance(this.f13024c).register(new String[]{(String) obj});
                if (register == null || register.isEmpty() || h().equals(register)) {
                    return null;
                }
                f(register);
                return register;
            } catch (Exception e10) {
                return e10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Google play services ");
        if (isGooglePlayServicesAvailable == 1) {
            str = "is missing ";
        } else if (isGooglePlayServicesAvailable == 3) {
            str = "is disabled ";
        } else {
            if (isGooglePlayServicesAvailable != 9) {
                if (isGooglePlayServicesAvailable == 18) {
                    str = "is currently updating ";
                }
                sb2.append("on this device");
                Logger.e("WebEngage", sb2.toString());
                b(new GCMRegistrationException(sb2.toString()));
                return null;
            }
            str = "version is invalid ";
        }
        sb2.append(str);
        sb2.append("on this device");
        Logger.e("WebEngage", sb2.toString());
        b(new GCMRegistrationException(sb2.toString()));
        return null;
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                String str = (String) obj;
                HashMap hashMap = new HashMap();
                hashMap.put("gcm_regId", str);
                hashMap.put("gcm_project_number", WebEngage.get().getWebEngageConfig().getGcmProjectNumber());
                a(l.b("gcm_registered", null, hashMap, null, this.f13024c));
                a(this.f13024c).onGCMRegistered(this.f13024c, str);
            } else if (obj instanceof Exception) {
                StringBuilder sb2 = new StringBuilder("GCM Register Error : ");
                Exception exc = (Exception) obj;
                sb2.append(exc.getMessage());
                Logger.e("WebEngage", sb2.toString());
                b(new GCMRegistrationException(exc.getMessage()));
            }
        }
        b.f13025a.set(false);
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        String gcmProjectNumber = WebEngage.get().getWebEngageConfig().getGcmProjectNumber();
        if (gcmProjectNumber != null) {
            return gcmProjectNumber;
        }
        Logger.e("WebEngage", "AndroidManifest : GCM Project Number is not set,unable to register");
        return null;
    }
}
