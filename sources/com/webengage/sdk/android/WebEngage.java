package com.webengage.sdk.android;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.webengage.sdk.android.PushChannelConfiguration;
import com.webengage.sdk.android.WebEngageConfig;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.actions.render.CallToAction;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.actions.rules.RuleExecutor;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.callbacks.InAppNotificationCallbacks;
import com.webengage.sdk.android.callbacks.LifeCycleCallbacks;
import com.webengage.sdk.android.callbacks.PushNotificationCallbacks;
import com.webengage.sdk.android.callbacks.StateChangeCallbacks;
import com.webengage.sdk.android.u;
import com.webengage.sdk.android.utils.Provider;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WebEngage extends AbstractWebEngage {

    /* renamed from: a, reason: collision with root package name */
    private static Context f12171a = null;

    /* renamed from: b, reason: collision with root package name */
    private static k f12172b = null;

    /* renamed from: c, reason: collision with root package name */
    private static WebEngageConfig f12173c = null;

    /* renamed from: d, reason: collision with root package name */
    private static volatile AbstractWebEngage f12174d = null;

    /* renamed from: e, reason: collision with root package name */
    private static c0 f12175e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f12176f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static boolean f12177g = false;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12178a;

        static {
            int[] iArr = new int[LocationTrackingStrategy.values().length];
            f12178a = iArr;
            try {
                iArr[LocationTrackingStrategy.ACCURACY_BEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12178a[LocationTrackingStrategy.ACCURACY_CITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12178a[LocationTrackingStrategy.ACCURACY_COUNTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12178a[LocationTrackingStrategy.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:5)|6|(1:8)|9|(1:11)|12|(1:14)|15|(2:17|(10:19|20|(1:22)|23|(2:25|26)|30|31|(1:33)(1:43)|34|(1:41)(2:38|39)))(2:49|(11:51|48|20|(0)|23|(0)|30|31|(0)(0)|34|(2:36|41)(1:42)))|47|48|20|(0)|23|(0)|30|31|(0)(0)|34|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0191, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0199, code lost:
    
        com.webengage.sdk.android.Logger.e("WebEngage", "Error during channel registration: " + r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0180 A[Catch: Exception -> 0x0191, TryCatch #1 {Exception -> 0x0191, blocks: (B:31:0x0178, B:33:0x0180, B:43:0x0193), top: B:30:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0193 A[Catch: Exception -> 0x0191, TRY_LEAVE, TryCatch #1 {Exception -> 0x0191, blocks: (B:31:0x0178, B:33:0x0180, B:43:0x0193), top: B:30:0x0178 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private WebEngage(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.WebEngage.<init>(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.webengage.sdk.android.WebEngageConfig a(com.webengage.sdk.android.WebEngageConfig r3, com.webengage.sdk.android.WebEngageConfig r4, com.webengage.sdk.android.k r5) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.WebEngage.a(com.webengage.sdk.android.WebEngageConfig, com.webengage.sdk.android.WebEngageConfig, com.webengage.sdk.android.k):com.webengage.sdk.android.WebEngageConfig");
    }

    public static WebEngageConfig b(Context context) {
        Object obj;
        WebEngageConfig.Builder builder = new WebEngageConfig.Builder();
        Bundle c10 = WebEngageUtils.c(context);
        if (c10 != null) {
            if (c10.containsKey("com.webengage.sdk.android.environment")) {
                builder.a(c10.getString("com.webengage.sdk.android.environment"));
            }
            if (c10.containsKey("com.webengage.sdk.android.alternate_interface_id")) {
                builder.a(c10.getBoolean("com.webengage.sdk.android.alternate_interface_id"));
            }
            if (c10.containsKey("com.webengage.sdk.android.small_icon")) {
                builder.setPushSmallIcon(c10.getInt("com.webengage.sdk.android.small_icon"));
            }
            if (c10.containsKey("com.webengage.sdk.android.large_icon")) {
                builder.setPushLargeIcon(c10.getInt("com.webengage.sdk.android.large_icon"));
            }
            if (c10.containsKey("com.webengage.sdk.android.accent_color")) {
                builder.setPushAccentColor(c10.getInt("com.webengage.sdk.android.accent_color"));
            }
            String string = c10.containsKey("com.webengage.sdk.android.push.channel.name") ? c10.getString("com.webengage.sdk.android.push.channel.name") : "Marketing";
            int i10 = c10.containsKey("com.webengage.sdk.android.push.channel.importance") ? c10.getInt("com.webengage.sdk.android.push.channel.importance") : 3;
            PushChannelConfiguration.Builder builder2 = new PushChannelConfiguration.Builder();
            builder2.setNotificationChannelName(string);
            builder2.setNotificationChannelImportance(i10);
            if (c10.containsKey("com.webengage.sdk.android.push.channel.description")) {
                builder2.setNotificationChannelDescription(c10.getString("com.webengage.sdk.android.push.channel.description"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.group")) {
                builder2.setNotificationChannelGroup(c10.getString("com.webengage.sdk.android.push.channel.group"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.light_color")) {
                builder2.setNotificationChannelLightColor(c10.getInt("com.webengage.sdk.android.push.channel.light_color"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.lock_screen_visibility")) {
                builder2.setNotificationChannelLockScreenVisibility(c10.getInt("com.webengage.sdk.android.push.channel.lock_screen_visibility"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.show_badge")) {
                builder2.setNotificationChannelShowBadge(c10.getBoolean("com.webengage.sdk.android.push.channel.show_badge"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.sound")) {
                builder2.setNotificationChannelSound(c10.getString("com.webengage.sdk.android.push.channel.sound"));
            }
            if (c10.containsKey("com.webengage.sdk.android.push.channel.vibration")) {
                builder2.setNotificationChannelVibration(c10.getBoolean("com.webengage.sdk.android.push.channel.vibration"));
            }
            PushChannelConfiguration build = builder2.build();
            if (build != null) {
                builder.setDefaultPushChannelConfiguration(build);
            }
            if (c10.containsKey("com.webengage.sdk.android.location_tracking")) {
                builder.setLocationTracking(c10.getBoolean("com.webengage.sdk.android.location_tracking"));
            }
            if (c10.containsKey("com.webengage.sdk.android.auto_gcm_registration")) {
                builder.setAutoGCMRegistrationFlag(c10.getBoolean("com.webengage.sdk.android.auto_gcm_registration"));
            }
            if (c10.containsKey("com.webengage.sdk.android.project_number")) {
                Object obj2 = c10.get("com.webengage.sdk.android.project_number");
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() > 0) {
                        builder.setGCMProjectNumber(str.substring(1));
                    }
                }
            }
            if (c10.containsKey("com.webengage.sdk.android.key") && (obj = c10.get("com.webengage.sdk.android.key")) != null) {
                builder.setWebEngageKey(obj.toString());
            }
            if (c10.containsKey("com.webengage.sdk.android.debug")) {
                builder.setDebugMode(c10.getBoolean("com.webengage.sdk.android.debug"));
            }
            if (c10.containsKey("com.webengage.sdk.android.crash_tracking")) {
                builder.b(c10.getBoolean("com.webengage.sdk.android.crash_tracking"));
            }
        }
        return builder.build();
    }

    public static void engage(Context context) {
        engage(context, null);
    }

    public static AbstractWebEngage get() {
        synchronized (f12176f) {
            try {
                if (f12174d != null) {
                    return f12174d;
                }
                if (!f12177g) {
                    Logger.d("WebEngage", "Returning queued implementation of WebEngage");
                    if (f12175e == null) {
                        f12175e = new c0(new WebEngageConfig.Builder().build());
                    }
                    return f12175e;
                }
                Logger.d("WebEngage", "Returning no-op implementation of WebEngage");
                if (f12173c == null) {
                    f12173c = new WebEngageConfig.Builder().build();
                }
                f12174d = new s0(f12173c);
                return f12174d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Context getApplicationContext() {
        return f12171a;
    }

    public static boolean isEngaged() {
        boolean z10;
        synchronized (f12176f) {
            try {
                z10 = f12177g && f12174d != null && (f12174d instanceof WebEngage);
            } finally {
            }
        }
        return z10;
    }

    public static void registerCustomPushRenderCallback(CustomPushRender customPushRender) {
        i.a(customPushRender);
    }

    public static void registerCustomPushRerenderCallback(CustomPushRerender customPushRerender) {
        i.a(customPushRerender);
    }

    public static void registerInAppNotificationCallback(InAppNotificationCallbacks inAppNotificationCallbacks) {
        i.a(inAppNotificationCallbacks);
    }

    public static void registerLifeCycleCallback(LifeCycleCallbacks lifeCycleCallbacks) {
        i.b(lifeCycleCallbacks);
    }

    public static void registerPushNotificationCallback(PushNotificationCallbacks pushNotificationCallbacks) {
        i.a(pushNotificationCallbacks);
    }

    public static void registerStateChangeCallback(StateChangeCallbacks stateChangeCallbacks) {
        if (isEngaged()) {
            i.a(stateChangeCallbacks, c.a(f12171a), f12171a);
        } else {
            i.a(stateChangeCallbacks, null, null);
        }
    }

    public static void setInlinePersonalizationListener(InLinePersonalizationListener inLinePersonalizationListener) {
        Logger.d("WebEngage", " setInlinePersonalizationListener ");
        i.a(inLinePersonalizationListener);
    }

    public static void startService(Intent intent, Context context) {
        startService(intent, context, null);
    }

    public static void unregisterInAppNotificationCallback(InAppNotificationCallbacks inAppNotificationCallbacks) {
        i.b(inAppNotificationCallbacks);
    }

    public static void unregisterLifeCycleCallback(LifeCycleCallbacks lifeCycleCallbacks) {
        i.c(lifeCycleCallbacks);
    }

    public static void unregisterPushNotificationCallback(PushNotificationCallbacks pushNotificationCallbacks) {
        i.b(pushNotificationCallbacks);
    }

    public static void unregisterStateChangeCallback(StateChangeCallbacks stateChangeCallbacks) {
        i.a(stateChangeCallbacks);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public Analytics analytics() {
        return c.a(f12171a);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void c(BroadcastReceiver broadcastReceiver) {
        startService(q.a(j0.f12610n, null, f12171a), f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void d(BroadcastReceiver broadcastReceiver) {
        startService(q.a(j0.f12609m, null, f12171a), f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void e(BroadcastReceiver broadcastReceiver) {
        Intent intent = new Intent(f12171a, (Class<?>) ExecutorService.class);
        intent.putExtra("action_name", 1);
        startService(intent, f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void f(BroadcastReceiver broadcastReceiver) {
        startService(q.a(j0.f12608l, null, f12171a), f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void filterCustomEvents(boolean z10) {
        f12173c = f12173c.getCurrentState().c(z10).build();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public WebEngageConfig getWebEngageConfig() {
        return f12173c;
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Intent intent) {
        if (intent == null) {
            Logger.e("WebEngage", "Push intent is null");
        } else {
            a(intent);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public RuleExecutor ruleExecutor() {
        return com.webengage.sdk.android.actions.rules.h.b();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setEventReportingStrategy(ReportingStrategy reportingStrategy) {
        if (reportingStrategy == null) {
            Logger.e("WebEngage", "Reporting Strategy is null");
        } else {
            f12173c = f12173c.getCurrentState().setEventReportingStrategy(reportingStrategy).build();
            f12172b.a(reportingStrategy);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setEveryActivityIsScreen(boolean z10) {
        f12173c = f12173c.getCurrentState().setEveryActivityIsScreen(z10).build();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setHuaweiRegistrationID(String str) {
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "Invalid Huawei Token");
            return;
        }
        if (str.equals(analytics().a().e())) {
            return;
        }
        analytics().a().e(str);
        HashMap hashMap = new HashMap();
        hashMap.put("gcm_regId", str);
        hashMap.put("provider", Provider.HW.name());
        a(hashMap);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLocationTracking(boolean z10) {
        WebEngageConfig webEngageConfig = f12173c;
        if (webEngageConfig == null) {
            return;
        }
        try {
            f12173c = webEngageConfig.getCurrentState().setLocationTracking(z10).build();
            if (z10) {
                t.a(f12171a).a(10800000L, 3600000L, 20000.0f, 104);
            } else {
                t.a(f12171a).b();
            }
            f12172b.a(z10);
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred during changing location tracking flag : " + e10.toString());
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLocationTrackingStrategy(LocationTrackingStrategy locationTrackingStrategy) {
        WebEngageConfig webEngageConfig = f12173c;
        if (webEngageConfig == null || locationTrackingStrategy == null) {
            return;
        }
        try {
            f12173c = webEngageConfig.getCurrentState().setLocationTrackingStrategy(locationTrackingStrategy).build();
            int i10 = a.f12178a[locationTrackingStrategy.ordinal()];
            if (i10 == 1) {
                t.a(f12171a).a(900000L, 300000L, 1000.0f, 100);
            } else if (i10 == 2) {
                t.a(f12171a).a(10800000L, 3600000L, 20000.0f, 104);
            } else if (i10 == 3) {
                t.a(f12171a).a(43200000L, 43200000L, 100000.0f, 104);
            } else if (i10 == 4) {
                t.a(f12171a).b();
            }
            f12172b.a(locationTrackingStrategy);
        } catch (Exception e10) {
            Logger.e("WebEngage", "Some error occurred while setting location tracking strategy: " + e10.toString());
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLogLevel(int i10) {
        Logger.setLogLevel(i10);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setRegistrationID(String str) {
        setRegistrationID(str, null);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setXiaomiRegistrationID(String str) {
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "Invalid Xiaomi Token");
            return;
        }
        if (str.equals(analytics().a().p())) {
            return;
        }
        analytics().a().h(str);
        HashMap hashMap = new HashMap();
        hashMap.put("gcm_regId", str);
        hashMap.put("provider", Provider.MI.name());
        a(hashMap);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public User user() {
        return n0.a(f12171a, analytics());
    }

    public static void engage(Context context, WebEngageConfig webEngageConfig) {
        Queue<i0> a10;
        if (context == null) {
            throw new IllegalArgumentException("Context found null while initializing WebEngage SDK");
        }
        if (f12174d == null) {
            synchronized (f12176f) {
                try {
                    if (f12174d == null) {
                        f12177g = true;
                        f12171a = context.getApplicationContext();
                        f12172b = new k(f12171a);
                        Logger.setLogLevel(-1);
                        WebEngageConfig a11 = a(b(f12171a), webEngageConfig, f12172b);
                        f12173c = a11;
                        if (a11.getDebugMode()) {
                            Logger.setLogLevel(1);
                        } else {
                            Logger.setLogLevel(-1);
                        }
                        Logger.d("WebEngage", "Initializing WebEngage SDK");
                        if (f12173c.isValid(f12171a)) {
                            f12174d = new WebEngage(f12171a);
                        } else {
                            f12174d = new s0(f12173c);
                            Logger.e("WebEngage", "Invalid WebEngage config");
                            Logger.e("WebEngage", "WebEngage Initialization failed");
                        }
                        try {
                            c0 c0Var = f12175e;
                            if (c0Var != null && (a10 = c0Var.a()) != null && a10.size() > 0) {
                                Logger.d("WebEngage", "Executing tasks that have been submitted before webengage initialization, count: " + a10.size());
                                while (!a10.isEmpty()) {
                                    i0 poll = a10.poll();
                                    if (poll != null) {
                                        if (poll instanceof t0) {
                                            ((t0) poll).a(f12174d);
                                        } else if (poll instanceof g) {
                                            ((g) poll).a(c.a(f12171a));
                                        } else if (poll instanceof r0) {
                                            Context context2 = f12171a;
                                            ((r0) poll).a(n0.a(context2, c.a(context2)));
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            Logger.e("WebEngage", "Some error occurred while executing all queued tasks: " + e10.toString());
                        }
                    }
                } catch (Exception e11) {
                    Logger.e("WebEngage", "Some Error occurred during initialization : " + e11.toString());
                    Logger.e("WebEngage", "WebEngage Initialization Failed");
                } finally {
                }
            }
        }
    }

    public static void startService(Intent intent, Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null || intent == null) {
            Logger.e("WebEngage", "Invalid Parameters to start a service");
        } else {
            y0.b(context, intent, broadcastReceiver);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(BroadcastReceiver broadcastReceiver) {
        startService(q.a(j0.f12611o, null, f12171a), f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void b(BroadcastReceiver broadcastReceiver) {
        startService(q.a(j0.f12600d, null, f12171a), f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void c(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> map2;
        HashMap hashMap;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("id");
            String string2 = extras.getString("experiment_id");
            hashMap = new HashMap();
            hashMap.put("id", string);
            hashMap.put("experiment_id", string2);
            map2 = WebEngageUtils.a(extras.getBundle("event_data"));
            map = WebEngageUtils.a(extras.getBundle("extra_data"));
        } else {
            map = null;
            map2 = null;
            hashMap = null;
        }
        startService(q.a(j0.f12604h, l.b("we_wk_push_notification_rerender", hashMap, map2, map, f12171a), f12171a), f12171a, null);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Bundle bundle) {
        if (bundle == null) {
            Logger.e("WebEngage", "Push bundle is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtras(bundle);
        receive(intent);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setRegistrationID(String str, String str2) {
        if (str == null || str.isEmpty()) {
            Logger.e("WebEngage", "Invalid GCM Parameters");
            return;
        }
        if (str.equals(analytics().a().h())) {
            return;
        }
        analytics().a().f(str);
        f12173c = f12173c.getCurrentState().setGCMProjectNumber(str2).build();
        HashMap hashMap = new HashMap();
        hashMap.put("gcm_regId", str);
        if (str2 != null) {
            hashMap.put("gcm_project_number", str2);
        }
        hashMap.put("provider", Provider.FCM.name());
        a(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "WebEngage"
            java.lang.String r1 = "webengage_prefs.txt"
            boolean r1 = r6.deleteSharedPreferences(r1)     // Catch: java.lang.Exception -> L3c
            java.lang.String r2 = "webengage_volatile_prefs.txt"
            boolean r2 = r6.deleteSharedPreferences(r2)     // Catch: java.lang.Exception -> L3c
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L17
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = r4
            goto L18
        L17:
            r1 = r3
        L18:
            boolean r2 = com.webengage.sdk.android.actions.database.i.a(r6)     // Catch: java.lang.Exception -> L3c
            if (r2 != 0) goto L23
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = r4
            goto L24
        L23:
            r1 = r3
        L24:
            boolean r2 = com.webengage.sdk.android.actions.database.y.a(r6)     // Catch: java.lang.Exception -> L3c
            if (r2 != 0) goto L2e
            if (r1 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r4
        L2e:
            boolean r6 = com.webengage.sdk.android.utils.l.b.a(r6)     // Catch: java.lang.Exception -> L3c
            if (r6 != 0) goto L36
            if (r3 == 0) goto L42
        L36:
            java.lang.String r6 = "Deleted all saved data"
            com.webengage.sdk.android.Logger.w(r0, r6)     // Catch: java.lang.Exception -> L3c
            goto L42
        L3c:
            r6 = move-exception
            java.lang.String r1 = "Some error occurred while clearing data"
            com.webengage.sdk.android.Logger.e(r0, r1, r6)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.WebEngage.a(android.content.Context):void");
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void b(Intent intent) {
        HashMap hashMap = new HashMap();
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Boolean.TRUE);
        startService(q.a(j0.f12604h, l.b("we_wk_leave_intent", null, hashMap, null, f12171a), f12171a), f12171a);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void c(Intent intent, BroadcastReceiver broadcastReceiver) {
        long longExtra = intent.getLongExtra("delay_value", 0L);
        HashMap hashMap = new HashMap();
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(longExtra + 1));
        startService(q.a(j0.f12604h, l.b("we_wk_session_delay", null, hashMap, null, f12171a), f12171a), f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Map<String, String> map) {
        if (map == null) {
            Logger.e("WebEngage", "Push data is null");
            return;
        }
        Bundle a10 = WebEngageUtils.a(map);
        if (a10 != null) {
            receive(a10);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(Intent intent) {
        startService(q.a(j0.f12599c, intent.getExtras(), f12171a), f12171a);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void b(Intent intent, BroadcastReceiver broadcastReceiver) {
        long longExtra = intent.getLongExtra("delay_value", 0L);
        HashMap hashMap = new HashMap();
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(longExtra + 1));
        startService(q.a(j0.f12604h, l.b("we_wk_page_delay", null, hashMap, null, f12171a), f12171a), f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(Intent intent, BroadcastReceiver broadcastReceiver) {
        PushNotificationData pushNotificationData;
        Intent a10;
        boolean z10;
        CallToAction callToActionById;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (extras.containsKey("hashed_notification_id")) {
                        try {
                            pushNotificationData = new PushNotificationData(new JSONObject(analytics().a().c(extras.getString("id"))), f12171a);
                        } catch (JSONException e10) {
                            Logger.e("WebEngage", "Exception while getting push notification data from sharedprefs", e10);
                            analytics().b(e10);
                            pushNotificationData = null;
                        }
                        if (!extras.containsKey("notification_main_intent")) {
                            if (pushNotificationData != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("id", pushNotificationData.getVariationId());
                                hashMap.put("experiment_id", pushNotificationData.getExperimentId());
                                if (extras.containsKey("call_to_action")) {
                                    hashMap.put("call_to_action", extras.getString("call_to_action"));
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("amplified", Boolean.valueOf(pushNotificationData.isAmplified()));
                                analytics().a(l.b("push_notification_close", hashMap, hashMap2, null, f12171a));
                                i.a(f12171a).onPushNotificationDismissed(f12171a, pushNotificationData);
                                return;
                            }
                            return;
                        }
                        boolean z11 = extras.getBoolean("dismiss_flag", true);
                        if (z11) {
                            ((NotificationManager) f12171a.getSystemService("notification")).cancel(extras.getInt("hashed_notification_id", -1));
                        }
                        if (Build.VERSION.SDK_INT < 31) {
                            f12171a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                        }
                        String string = extras.containsKey("event") ? extras.getString("event") : "push_notification_click";
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("id", extras.getString("id"));
                        hashMap3.put("call_to_action", extras.getString("call_to_action"));
                        hashMap3.put("experiment_id", extras.getString("experiment_id"));
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("dismiss_flag", Boolean.valueOf(z11));
                        Map a11 = WebEngageUtils.a(extras.getBundle("event_data"));
                        if (pushNotificationData != null) {
                            if (a11 == null) {
                                a11 = new HashMap();
                            }
                            a11.put("amplified", Boolean.valueOf(pushNotificationData.isAmplified()));
                        }
                        analytics().a(l.b(string, hashMap3, a11, hashMap4, f12171a));
                        if (pushNotificationData != null) {
                            if (extras.getBoolean("notification_main_intent")) {
                                z10 = i.a(f12171a).onPushNotificationClicked(f12171a, pushNotificationData);
                            } else if (extras.getBoolean("notification_main_intent")) {
                                z10 = false;
                            } else {
                                if ("push_notification_rating_submitted".equals(string)) {
                                    pushNotificationData.getRatingV1().setRateValue(((Integer) a11.get("we_wk_rating")).intValue());
                                }
                                z10 = i.a(f12171a).onPushNotificationActionClicked(f12171a, pushNotificationData, extras.getString("call_to_action"));
                            }
                            if (!z10 && com.webengage.sdk.android.utils.i.b()) {
                                String string2 = extras.getString("call_to_action");
                                Bundle customData = pushNotificationData.getCustomData();
                                customData.putString("we_pushPayload", pushNotificationData.getPushPayloadJSON().toString());
                                com.webengage.sdk.android.utils.i.a("com.webengage.cordova.WebEngagePlugin", "handlePushClick", new Class[]{String.class, Bundle.class}, new Object[]{(string2 == null || (callToActionById = pushNotificationData.getCallToActionById(string2)) == null) ? null : callToActionById.getAction(), customData});
                            }
                            if (z10) {
                                return;
                            }
                        }
                        a10 = q.a(j0.f12602f, intent, f12171a);
                    } else {
                        a10 = q.a(j0.f12602f, intent, f12171a);
                    }
                    startService(a10, f12171a, broadcastReceiver);
                }
            } catch (Exception e11) {
                Logger.e("WebEngage", "Exception while handling notification click/close", e11);
            }
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(Location location, BroadcastReceiver broadcastReceiver) {
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.valueOf(location.getLatitude()));
        hashMap.put("longitude", Double.valueOf(location.getLongitude()));
        startService(q.a(j0.f12598b, l.b("user_update_geo_info", hashMap, null, null, f12171a), f12171a), f12171a, broadcastReceiver);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(u.a aVar, BroadcastReceiver broadcastReceiver) {
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("geofence_id", aVar.a());
            hashMap.put("transition_type", Integer.valueOf(aVar.c()));
            if (aVar.b() != null) {
                hashMap.put("latitude", Double.valueOf(aVar.b().getLatitude()));
                hashMap.put("longitude", Double.valueOf(aVar.b().getLongitude()));
            }
            startService(q.a(j0.f12598b, l.b("geofence_transition", hashMap, null, null, f12171a), f12171a), f12171a, broadcastReceiver);
        }
    }

    private void a(Map<String, Object> map) {
        startService(q.a(j0.f12598b, l.b("gcm_registered", null, map, null, f12171a), f12171a), f12171a);
    }
}
