package com.facebook.applinks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import in.juspay.hyper.constants.LogCategory;
import java.util.Iterator;
import ll.e;
import nl.c;
import nl.n0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sl.a;
import xk.z;
import yk.l;

/* loaded from: classes.dex */
public class AppLinkData {
    private static final String APPLINK_BRIDGE_ARGS_KEY = "bridge_args";
    private static final String APPLINK_METHOD_ARGS_KEY = "method_args";
    private static final String APPLINK_VERSION_KEY = "version";
    public static final String ARGUMENTS_EXTRAS_KEY = "extras";
    public static final String ARGUMENTS_NATIVE_CLASS_KEY = "com.facebook.platform.APPLINK_NATIVE_CLASS";
    public static final String ARGUMENTS_NATIVE_URL = "com.facebook.platform.APPLINK_NATIVE_URL";
    public static final String ARGUMENTS_REFERER_DATA_KEY = "referer_data";
    public static final String ARGUMENTS_TAPTIME_KEY = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
    private static final String AUTO_APPLINK_FLAG_KEY = "is_auto_applink";
    private static final String BRIDGE_ARGS_METHOD_KEY = "method";
    private static final String BUNDLE_AL_APPLINK_DATA_KEY = "al_applink_data";
    private static final String BUNDLE_APPLINK_ARGS_KEY = "com.facebook.platform.APPLINK_ARGS";
    private static final String DEFERRED_APP_LINK_ARGS_FIELD = "applink_args";
    private static final String DEFERRED_APP_LINK_CLASS_FIELD = "applink_class";
    private static final String DEFERRED_APP_LINK_CLICK_TIME_FIELD = "click_time";
    private static final String DEFERRED_APP_LINK_EVENT = "DEFERRED_APP_LINK";
    private static final String DEFERRED_APP_LINK_PATH = "%s/activities";
    private static final String DEFERRED_APP_LINK_URL_FIELD = "applink_url";
    private static final String EXTRAS_DEEPLINK_CONTEXT_KEY = "deeplink_context";
    private static final String METHOD_ARGS_REF_KEY = "ref";
    private static final String METHOD_ARGS_TARGET_URL_KEY = "target_url";
    private static final String PROMOTION_CODE_KEY = "promo_code";
    private static final String REFERER_DATA_REF_KEY = "fb_ref";
    private static final String TAG = "com.facebook.applinks.AppLinkData";
    private JSONObject appLinkData;
    private Bundle argumentBundle;
    private JSONObject arguments;
    private String promotionCode;
    private String ref;
    private Uri targetUri;

    /* loaded from: classes.dex */
    public interface CompletionHandler {
        void onDeferredAppLinkDataFetched(AppLinkData appLinkData);
    }

    private AppLinkData() {
    }

    public static AppLinkData createFromActivity(Activity activity) {
        if (a.b(AppLinkData.class)) {
            return null;
        }
        try {
            n0.K(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return null;
            }
            AppLinkData createFromAlApplinkData = createFromAlApplinkData(intent);
            if (createFromAlApplinkData == null) {
                createFromAlApplinkData = createFromJson(intent.getStringExtra(BUNDLE_APPLINK_ARGS_KEY));
            }
            if (createFromAlApplinkData == null) {
                return createFromUri(intent.getData());
            }
            return createFromAlApplinkData;
        } catch (Throwable th2) {
            a.a(AppLinkData.class, th2);
            return null;
        }
    }

    public static AppLinkData createFromAlApplinkData(Intent intent) {
        String string;
        String string2;
        if (a.b(AppLinkData.class) || intent == null) {
            return null;
        }
        try {
            Bundle bundleExtra = intent.getBundleExtra(BUNDLE_AL_APPLINK_DATA_KEY);
            if (bundleExtra == null) {
                return null;
            }
            AppLinkData appLinkData = new AppLinkData();
            Uri data = intent.getData();
            appLinkData.targetUri = data;
            appLinkData.appLinkData = getAppLinkData(data);
            if (appLinkData.targetUri == null && (string2 = bundleExtra.getString(METHOD_ARGS_TARGET_URL_KEY)) != null) {
                appLinkData.targetUri = Uri.parse(string2);
            }
            appLinkData.argumentBundle = bundleExtra;
            appLinkData.arguments = null;
            Bundle bundle = bundleExtra.getBundle(ARGUMENTS_REFERER_DATA_KEY);
            if (bundle != null) {
                appLinkData.ref = bundle.getString(REFERER_DATA_REF_KEY);
            }
            Bundle bundle2 = bundleExtra.getBundle(ARGUMENTS_EXTRAS_KEY);
            if (bundle2 != null && (string = bundle2.getString(EXTRAS_DEEPLINK_CONTEXT_KEY)) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    if (jSONObject.has(PROMOTION_CODE_KEY)) {
                        appLinkData.promotionCode = jSONObject.getString(PROMOTION_CODE_KEY);
                    }
                } catch (JSONException e10) {
                    n0.G(TAG, "Unable to parse deeplink_context JSON", e10);
                }
            }
            return appLinkData;
        } catch (Throwable th2) {
            a.a(AppLinkData.class, th2);
            return null;
        }
    }

    private static AppLinkData createFromJson(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(APPLINK_VERSION_KEY);
            if (jSONObject.getJSONObject(APPLINK_BRIDGE_ARGS_KEY).getString(BRIDGE_ARGS_METHOD_KEY).equals("applink") && string.equals("2")) {
                AppLinkData appLinkData = new AppLinkData();
                JSONObject jSONObject2 = jSONObject.getJSONObject(APPLINK_METHOD_ARGS_KEY);
                appLinkData.arguments = jSONObject2;
                if (jSONObject2.has(METHOD_ARGS_REF_KEY)) {
                    appLinkData.ref = appLinkData.arguments.getString(METHOD_ARGS_REF_KEY);
                } else if (appLinkData.arguments.has(ARGUMENTS_REFERER_DATA_KEY)) {
                    JSONObject jSONObject3 = appLinkData.arguments.getJSONObject(ARGUMENTS_REFERER_DATA_KEY);
                    if (jSONObject3.has(REFERER_DATA_REF_KEY)) {
                        appLinkData.ref = jSONObject3.getString(REFERER_DATA_REF_KEY);
                    }
                }
                if (appLinkData.arguments.has(METHOD_ARGS_TARGET_URL_KEY)) {
                    Uri parse = Uri.parse(appLinkData.arguments.getString(METHOD_ARGS_TARGET_URL_KEY));
                    appLinkData.targetUri = parse;
                    appLinkData.appLinkData = getAppLinkData(parse);
                }
                if (appLinkData.arguments.has(ARGUMENTS_EXTRAS_KEY)) {
                    JSONObject jSONObject4 = appLinkData.arguments.getJSONObject(ARGUMENTS_EXTRAS_KEY);
                    if (jSONObject4.has(EXTRAS_DEEPLINK_CONTEXT_KEY)) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject(EXTRAS_DEEPLINK_CONTEXT_KEY);
                        if (jSONObject5.has(PROMOTION_CODE_KEY)) {
                            appLinkData.promotionCode = jSONObject5.getString(PROMOTION_CODE_KEY);
                        }
                    }
                }
                appLinkData.argumentBundle = toBundle(appLinkData.arguments);
                return appLinkData;
            }
        } catch (FacebookException e10) {
            n0.G(TAG, "Unable to parse AppLink JSON", e10);
        } catch (JSONException e11) {
            n0.G(TAG, "Unable to parse AppLink JSON", e11);
        }
        return null;
    }

    private static AppLinkData createFromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        AppLinkData appLinkData = new AppLinkData();
        appLinkData.targetUri = uri;
        appLinkData.appLinkData = getAppLinkData(uri);
        return appLinkData;
    }

    public static void fetchDeferredAppLinkData(Context context, CompletionHandler completionHandler) {
        fetchDeferredAppLinkData(context, null, completionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fetchDeferredAppLinkFromServer(Context context, String str, CompletionHandler completionHandler) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", DEFERRED_APP_LINK_EVENT);
            String str2 = c.f28837f;
            n0.S(jSONObject, e.h(context), l.f41701b.p(context), FacebookSdk.getLimitEventAndDataUsage(context), context);
            n0.T(jSONObject, FacebookSdk.getApplicationContext());
            jSONObject.put("application_package_name", context.getPackageName());
            String format = String.format(DEFERRED_APP_LINK_PATH, str);
            AppLinkData appLinkData = null;
            try {
                String str3 = z.f40475j;
                JSONObject jSONObject2 = ek.e.y(null, format, jSONObject, null).c().f40343b;
                if (jSONObject2 != null) {
                    String optString = jSONObject2.optString(DEFERRED_APP_LINK_ARGS_FIELD);
                    long optLong = jSONObject2.optLong(DEFERRED_APP_LINK_CLICK_TIME_FIELD, -1L);
                    String optString2 = jSONObject2.optString(DEFERRED_APP_LINK_CLASS_FIELD);
                    String optString3 = jSONObject2.optString(DEFERRED_APP_LINK_URL_FIELD);
                    if (!TextUtils.isEmpty(optString) && (appLinkData = createFromJson(optString)) != null) {
                        if (optLong != -1) {
                            try {
                                JSONObject jSONObject3 = appLinkData.arguments;
                                if (jSONObject3 != null) {
                                    jSONObject3.put(ARGUMENTS_TAPTIME_KEY, optLong);
                                }
                                Bundle bundle = appLinkData.argumentBundle;
                                if (bundle != null) {
                                    bundle.putString(ARGUMENTS_TAPTIME_KEY, Long.toString(optLong));
                                }
                            } catch (JSONException unused) {
                                n0.F(TAG, "Unable to put tap time in AppLinkData.arguments");
                            }
                        }
                        if (optString2 != null) {
                            try {
                                JSONObject jSONObject4 = appLinkData.arguments;
                                if (jSONObject4 != null) {
                                    jSONObject4.put(ARGUMENTS_NATIVE_CLASS_KEY, optString2);
                                }
                                Bundle bundle2 = appLinkData.argumentBundle;
                                if (bundle2 != null) {
                                    bundle2.putString(ARGUMENTS_NATIVE_CLASS_KEY, optString2);
                                }
                            } catch (JSONException unused2) {
                                n0.F(TAG, "Unable to put app link class name in AppLinkData.arguments");
                            }
                        }
                        if (optString3 != null) {
                            try {
                                JSONObject jSONObject5 = appLinkData.arguments;
                                if (jSONObject5 != null) {
                                    jSONObject5.put(ARGUMENTS_NATIVE_URL, optString3);
                                }
                                Bundle bundle3 = appLinkData.argumentBundle;
                                if (bundle3 != null) {
                                    bundle3.putString(ARGUMENTS_NATIVE_URL, optString3);
                                }
                            } catch (JSONException unused3) {
                                n0.F(TAG, "Unable to put app link URL in AppLinkData.arguments");
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                n0.F(TAG, "Unable to fetch deferred applink from server");
            }
            completionHandler.onDeferredAppLinkDataFetched(appLinkData);
        } catch (JSONException e10) {
            throw new RuntimeException("An error occurred while preparing deferred app link", e10);
        }
    }

    private static JSONObject getAppLinkData(Uri uri) {
        if (a.b(AppLinkData.class) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter(BUNDLE_AL_APPLINK_DATA_KEY);
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th2) {
            a.a(AppLinkData.class, th2);
            return null;
        }
    }

    private static Bundle toBundle(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, toBundle((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i10 = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i10 < jSONArray.length()) {
                            bundleArr[i10] = toBundle(jSONArray.getJSONObject(i10));
                            i10++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i10 < jSONArray.length()) {
                            strArr[i10] = jSONArray.get(i10).toString();
                            i10++;
                        }
                        bundle.putStringArray(next, strArr);
                    } else {
                        throw new FacebookException("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    public Bundle getArgumentBundle() {
        return this.argumentBundle;
    }

    public String getPromotionCode() {
        return this.promotionCode;
    }

    public String getRef() {
        return this.ref;
    }

    public Bundle getRefererData() {
        Bundle bundle = this.argumentBundle;
        if (bundle != null) {
            return bundle.getBundle(ARGUMENTS_REFERER_DATA_KEY);
        }
        return null;
    }

    public Uri getTargetUri() {
        return this.targetUri;
    }

    public boolean isAutoAppLink() {
        Uri uri = this.targetUri;
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String scheme = this.targetUri.getScheme();
        String format = String.format("fb%s", FacebookSdk.getApplicationId());
        JSONObject jSONObject = this.appLinkData;
        if (jSONObject == null || !jSONObject.optBoolean(AUTO_APPLINK_FLAG_KEY) || !"applinks".equals(host) || !format.equals(scheme)) {
            return false;
        }
        return true;
    }

    public static void fetchDeferredAppLinkData(Context context, final String str, final CompletionHandler completionHandler) {
        n0.K(context, LogCategory.CONTEXT);
        n0.K(completionHandler, "completionHandler");
        if (str == null) {
            n0.K(context, LogCategory.CONTEXT);
            str = FacebookSdk.getApplicationId();
        }
        n0.K(str, "applicationId");
        final Context applicationContext = context.getApplicationContext();
        FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.applinks.AppLinkData.1
            @Override // java.lang.Runnable
            public void run() {
                if (!a.b(this)) {
                    try {
                        AppLinkData.fetchDeferredAppLinkFromServer(applicationContext, str, completionHandler);
                    } catch (Throwable th2) {
                        a.a(this, th2);
                    }
                }
            }
        });
    }

    public JSONObject getAppLinkData() {
        JSONObject jSONObject = this.appLinkData;
        return jSONObject != null ? jSONObject : new JSONObject();
    }
}
