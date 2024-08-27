package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1pSDK;
import com.facebook.FacebookSdk;
import com.facebook.applinks.AppLinkData;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1zSDK implements AFc1iSDK {
    Map<String, Object> AFInAppEventParameterName;

    @NotNull
    private final AFd1lSDK AFKeystoreWrapper;
    private boolean values;

    public AFd1zSDK(@NotNull AFd1lSDK aFd1lSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        this.AFKeystoreWrapper = aFd1lSDK;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final Map<String, Object> AFInAppEventType() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void AFKeystoreWrapper() {
        Context context;
        if (!values() || (context = this.AFKeystoreWrapper.AFKeystoreWrapper) == null) {
            return;
        }
        this.AFInAppEventParameterName = new LinkedHashMap();
        final AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
        try {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FacebookSdk.class.getMethod("sdkInitialize", Context.class).invoke(null, context);
            final Class<AppLinkData> cls = AppLinkData.class;
            Method method = AppLinkData.class.getMethod("fetchDeferredAppLinkData", Context.class, String.class, AppLinkData.CompletionHandler.class);
            Object newProxyInstance = Proxy.newProxyInstance(AppLinkData.CompletionHandler.class.getClassLoader(), new Class[]{AppLinkData.CompletionHandler.class}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1pSDK.3
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                    String str;
                    String str2;
                    String str3;
                    Bundle bundle;
                    if (method2.getName().equals("onDeferredAppLinkDataFetched")) {
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                            if (bundle2 != null) {
                                str2 = bundle2.getString(AppLinkData.ARGUMENTS_NATIVE_URL);
                                str3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY);
                                if (bundle3 != null && (bundle = bundle3.getBundle("deeplink_context")) != null) {
                                    str = bundle.getString("promo_code");
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            AFa1ySDK aFa1ySDK = aFa1zSDK;
                            if (aFa1ySDK != null) {
                                aFa1ySDK.AFInAppEventParameterName(str2, str3, str);
                            }
                        } else {
                            AFa1ySDK aFa1ySDK2 = aFa1zSDK;
                            if (aFa1ySDK2 != null) {
                                aFa1ySDK2.AFInAppEventParameterName(null, null, null);
                            }
                        }
                        return null;
                    }
                    AFa1ySDK aFa1ySDK3 = aFa1zSDK;
                    if (aFa1ySDK3 != null) {
                        aFa1ySDK3.AFInAppEventParameterName("onDeferredAppLinkDataFetched invocation failed");
                    }
                    return null;
                }
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (TextUtils.isEmpty(string)) {
                aFa1zSDK.AFInAppEventParameterName("Facebook app id not defined in resources");
            } else {
                method.invoke(null, context, string, newProxyInstance);
            }
        } catch (ClassNotFoundException e10) {
            AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e10);
            aFa1zSDK.AFInAppEventParameterName(e10.toString());
        } catch (IllegalAccessException e11) {
            AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e11);
            aFa1zSDK.AFInAppEventParameterName(e11.toString());
        } catch (NoSuchMethodException e12) {
            AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e12);
            aFa1zSDK.AFInAppEventParameterName(e12.toString());
        } catch (InvocationTargetException e13) {
            AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e13);
            aFa1zSDK.AFInAppEventParameterName(e13.toString());
        }
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final boolean valueOf() {
        if (values()) {
            Map<String, Object> map = this.AFInAppEventParameterName;
            if (map == null || map.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFc1iSDK
    public final void values(boolean z10) {
        this.values = z10;
    }

    private boolean values() {
        return this.values;
    }

    /* loaded from: classes.dex */
    public static final class AFa1zSDK implements AFa1pSDK.AFa1ySDK {
        private /* synthetic */ long AFInAppEventParameterName;

        public AFa1zSDK(long j10) {
            this.AFInAppEventParameterName = j10;
        }

        @Override // com.appsflyer.internal.AFa1pSDK.AFa1ySDK
        public final void AFInAppEventParameterName(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFd1zSDK.this.AFInAppEventParameterName;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFd1zSDK.this.AFInAppEventParameterName) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFd1zSDK aFd1zSDK = AFd1zSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFd1zSDK.AFInAppEventParameterName;
                    if (map3 != null) {
                        map3.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFd1zSDK.this.AFInAppEventParameterName;
                if (map4 != null) {
                    map4.put("link", HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.AFInAppEventParameterName);
            Map<String, Object> map5 = AFd1zSDK.this.AFInAppEventParameterName;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1pSDK.AFa1ySDK
        public final void AFInAppEventParameterName(String str) {
            Map<String, Object> map = AFd1zSDK.this.AFInAppEventParameterName;
            if (map != null) {
                map.put("error", str);
            }
        }
    }
}
