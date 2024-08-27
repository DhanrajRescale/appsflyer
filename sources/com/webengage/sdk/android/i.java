package com.webengage.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.webengage.sdk.android.actions.render.InAppNotificationData;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.callbacks.InAppNotificationCallbacks;
import com.webengage.sdk.android.callbacks.LifeCycleCallbacks;
import com.webengage.sdk.android.callbacks.PushNotificationCallbacks;
import com.webengage.sdk.android.callbacks.StateChangeCallbacks;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class i extends StateChangeCallbacks implements PushNotificationCallbacks, LifeCycleCallbacks, InAppNotificationCallbacks, CustomPushRender, CustomPushRerender, InLinePersonalizationListener {

    /* renamed from: a */
    static volatile i f12557a;

    /* renamed from: b */
    static List<LifeCycleCallbacks> f12558b;

    /* renamed from: c */
    static List<PushNotificationCallbacks> f12559c;

    /* renamed from: d */
    static CustomPushRender f12560d;

    /* renamed from: e */
    static CustomPushRerender f12561e;

    /* renamed from: f */
    static List<InAppNotificationCallbacks> f12562f;

    /* renamed from: g */
    static List<StateChangeCallbacks> f12563g;

    /* renamed from: h */
    static InLinePersonalizationListener f12564h;

    /* renamed from: i */
    Context f12565i;

    /* renamed from: j */
    Handler f12566j;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifeCycleCallbacks f12567a;

        /* renamed from: b */
        final /* synthetic */ String f12568b;

        public a(LifeCycleCallbacks lifeCycleCallbacks, String str) {
            this.f12567a = lifeCycleCallbacks;
            this.f12568b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifeCycleCallbacks lifeCycleCallbacks = this.f12567a;
            if (lifeCycleCallbacks != null) {
                lifeCycleCallbacks.onGCMRegistered(i.this.f12565i, this.f12568b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifeCycleCallbacks f12570a;

        /* renamed from: b */
        final /* synthetic */ Intent f12571b;

        public b(LifeCycleCallbacks lifeCycleCallbacks, Intent intent) {
            this.f12570a = lifeCycleCallbacks;
            this.f12571b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifeCycleCallbacks lifeCycleCallbacks = this.f12570a;
            if (lifeCycleCallbacks != null) {
                lifeCycleCallbacks.onGCMMessageReceived(i.this.f12565i, this.f12571b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifeCycleCallbacks f12573a;

        /* renamed from: b */
        final /* synthetic */ Intent f12574b;

        public c(LifeCycleCallbacks lifeCycleCallbacks, Intent intent) {
            this.f12573a = lifeCycleCallbacks;
            this.f12574b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifeCycleCallbacks lifeCycleCallbacks = this.f12573a;
            if (lifeCycleCallbacks != null) {
                lifeCycleCallbacks.onAppInstalled(i.this.f12565i, this.f12574b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LifeCycleCallbacks f12576a;

        /* renamed from: b */
        final /* synthetic */ int f12577b;

        /* renamed from: c */
        final /* synthetic */ int f12578c;

        public d(LifeCycleCallbacks lifeCycleCallbacks, int i10, int i11) {
            this.f12576a = lifeCycleCallbacks;
            this.f12577b = i10;
            this.f12578c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifeCycleCallbacks lifeCycleCallbacks = this.f12576a;
            if (lifeCycleCallbacks != null) {
                lifeCycleCallbacks.onAppUpgraded(i.this.f12565i, this.f12577b, this.f12578c);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PushNotificationCallbacks f12580a;

        /* renamed from: b */
        final /* synthetic */ PushNotificationData f12581b;

        public e(PushNotificationCallbacks pushNotificationCallbacks, PushNotificationData pushNotificationData) {
            this.f12580a = pushNotificationCallbacks;
            this.f12581b = pushNotificationData;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushNotificationCallbacks pushNotificationCallbacks = this.f12580a;
            if (pushNotificationCallbacks != null) {
                pushNotificationCallbacks.onPushNotificationShown(i.this.f12565i, this.f12581b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PushNotificationCallbacks f12583a;

        /* renamed from: b */
        final /* synthetic */ PushNotificationData f12584b;

        public f(PushNotificationCallbacks pushNotificationCallbacks, PushNotificationData pushNotificationData) {
            this.f12583a = pushNotificationCallbacks;
            this.f12584b = pushNotificationData;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushNotificationCallbacks pushNotificationCallbacks = this.f12583a;
            if (pushNotificationCallbacks != null) {
                pushNotificationCallbacks.onPushNotificationDismissed(i.this.f12565i, this.f12584b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InAppNotificationCallbacks f12586a;

        /* renamed from: b */
        final /* synthetic */ InAppNotificationData f12587b;

        public g(InAppNotificationCallbacks inAppNotificationCallbacks, InAppNotificationData inAppNotificationData) {
            this.f12586a = inAppNotificationCallbacks;
            this.f12587b = inAppNotificationData;
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppNotificationCallbacks inAppNotificationCallbacks = this.f12586a;
            if (inAppNotificationCallbacks != null) {
                inAppNotificationCallbacks.onInAppNotificationShown(i.this.f12565i, this.f12587b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InAppNotificationCallbacks f12589a;

        /* renamed from: b */
        final /* synthetic */ InAppNotificationData f12590b;

        public h(InAppNotificationCallbacks inAppNotificationCallbacks, InAppNotificationData inAppNotificationData) {
            this.f12589a = inAppNotificationCallbacks;
            this.f12590b = inAppNotificationData;
        }

        @Override // java.lang.Runnable
        public void run() {
            InAppNotificationCallbacks inAppNotificationCallbacks = this.f12589a;
            if (inAppNotificationCallbacks != null) {
                inAppNotificationCallbacks.onInAppNotificationDismissed(i.this.f12565i, this.f12590b);
            }
        }
    }

    /* renamed from: com.webengage.sdk.android.i$i */
    /* loaded from: classes2.dex */
    public class RunnableC0006i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StateChangeCallbacks f12592a;

        /* renamed from: b */
        final /* synthetic */ Context f12593b;

        /* renamed from: c */
        final /* synthetic */ String f12594c;

        public RunnableC0006i(StateChangeCallbacks stateChangeCallbacks, Context context, String str) {
            this.f12592a = stateChangeCallbacks;
            this.f12593b = context;
            this.f12594c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12592a.onAnonymousIdChanged(this.f12593b, this.f12594c);
        }
    }

    private i(Context context) {
        this.f12565i = null;
        this.f12566j = null;
        this.f12565i = context.getApplicationContext();
        this.f12566j = new Handler(Looper.getMainLooper());
    }

    public static i a(Context context) {
        if (f12557a == null) {
            synchronized (i.class) {
                try {
                    if (f12557a == null) {
                        f12557a = new i(context);
                    }
                } finally {
                }
            }
        }
        return f12557a;
    }

    public static void b(InAppNotificationCallbacks inAppNotificationCallbacks) {
        List<InAppNotificationCallbacks> list = f12562f;
        if (list != null) {
            list.remove(inAppNotificationCallbacks);
        }
    }

    public static void c(LifeCycleCallbacks lifeCycleCallbacks) {
        List<LifeCycleCallbacks> list = f12558b;
        if (list != null) {
            list.remove(lifeCycleCallbacks);
        }
    }

    public static /* synthetic */ void d(LifeCycleCallbacks lifeCycleCallbacks) {
        a(lifeCycleCallbacks);
    }

    @Override // com.webengage.sdk.android.callbacks.StateChangeCallbacks
    public void onAnonymousIdChanged(Context context, String str) {
        List<StateChangeCallbacks> list = f12563g;
        if (list != null) {
            for (StateChangeCallbacks stateChangeCallbacks : list) {
                if (stateChangeCallbacks != null) {
                    this.f12566j.post(new RunnableC0006i(stateChangeCallbacks, context, str));
                }
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onAppInstalled(Context context, Intent intent) {
        if (f12558b != null) {
            for (int i10 = 0; i10 < f12558b.size(); i10++) {
                this.f12566j.post(new c(f12558b.get(i10), intent));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onAppUpgraded(Context context, int i10, int i11) {
        if (f12558b != null) {
            for (int i12 = 0; i12 < f12558b.size(); i12++) {
                this.f12566j.post(new d(f12558b.get(i12), i10, i11));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onGCMMessageReceived(Context context, Intent intent) {
        if (f12558b != null) {
            for (int i10 = 0; i10 < f12558b.size(); i10++) {
                this.f12566j.post(new b(f12558b.get(i10), intent));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onGCMRegistered(Context context, String str) {
        if (f12558b != null) {
            for (int i10 = 0; i10 < f12558b.size(); i10++) {
                this.f12566j.post(new a(f12558b.get(i10), str));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public boolean onInAppNotificationClicked(Context context, InAppNotificationData inAppNotificationData, String str) {
        if (f12562f == null) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < f12562f.size(); i10++) {
            InAppNotificationCallbacks inAppNotificationCallbacks = f12562f.get(i10);
            if (inAppNotificationCallbacks != null) {
                z10 |= inAppNotificationCallbacks.onInAppNotificationClicked(this.f12565i, inAppNotificationData, str);
            }
        }
        return z10;
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public void onInAppNotificationDismissed(Context context, InAppNotificationData inAppNotificationData) {
        if (f12562f != null) {
            for (int i10 = 0; i10 < f12562f.size(); i10++) {
                this.f12566j.post(new h(f12562f.get(i10), inAppNotificationData));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public InAppNotificationData onInAppNotificationPrepared(Context context, InAppNotificationData inAppNotificationData) {
        if (f12562f != null) {
            for (int i10 = 0; i10 < f12562f.size(); i10++) {
                InAppNotificationCallbacks inAppNotificationCallbacks = f12562f.get(i10);
                if (inAppNotificationCallbacks != null) {
                    inAppNotificationData = inAppNotificationCallbacks.onInAppNotificationPrepared(this.f12565i, inAppNotificationData);
                }
            }
        }
        return inAppNotificationData;
    }

    @Override // com.webengage.sdk.android.callbacks.InAppNotificationCallbacks
    public void onInAppNotificationShown(Context context, InAppNotificationData inAppNotificationData) {
        if (f12562f != null) {
            for (int i10 = 0; i10 < f12562f.size(); i10++) {
                this.f12566j.post(new g(f12562f.get(i10), inAppNotificationData));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.LifeCycleCallbacks
    public void onNewSessionStarted() {
        if (f12558b != null) {
            for (int i10 = 0; i10 < f12558b.size(); i10++) {
                this.f12566j.post(new bl.d(f12558b.get(i10), 18));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public boolean onPushNotificationActionClicked(Context context, PushNotificationData pushNotificationData, String str) {
        if (f12559c == null) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < f12559c.size(); i10++) {
            PushNotificationCallbacks pushNotificationCallbacks = f12559c.get(i10);
            if (pushNotificationCallbacks != null) {
                z10 |= pushNotificationCallbacks.onPushNotificationActionClicked(this.f12565i, pushNotificationData, str);
            }
        }
        return z10;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public boolean onPushNotificationClicked(Context context, PushNotificationData pushNotificationData) {
        if (f12559c == null) {
            return false;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < f12559c.size(); i10++) {
            PushNotificationCallbacks pushNotificationCallbacks = f12559c.get(i10);
            if (pushNotificationCallbacks != null) {
                z10 |= pushNotificationCallbacks.onPushNotificationClicked(this.f12565i, pushNotificationData);
            }
        }
        return z10;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public void onPushNotificationDismissed(Context context, PushNotificationData pushNotificationData) {
        if (f12559c != null) {
            for (int i10 = 0; i10 < f12559c.size(); i10++) {
                this.f12566j.post(new f(f12559c.get(i10), pushNotificationData));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public PushNotificationData onPushNotificationReceived(Context context, PushNotificationData pushNotificationData) {
        if (f12559c != null) {
            for (int i10 = 0; i10 < f12559c.size(); i10++) {
                PushNotificationCallbacks pushNotificationCallbacks = f12559c.get(i10);
                if (pushNotificationCallbacks != null) {
                    pushNotificationData = pushNotificationCallbacks.onPushNotificationReceived(this.f12565i, pushNotificationData);
                }
            }
        }
        return pushNotificationData;
    }

    @Override // com.webengage.sdk.android.callbacks.PushNotificationCallbacks
    public void onPushNotificationShown(Context context, PushNotificationData pushNotificationData) {
        if (f12559c != null) {
            for (int i10 = 0; i10 < f12559c.size(); i10++) {
                this.f12566j.post(new e(f12559c.get(i10), pushNotificationData));
            }
        }
    }

    @Override // com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        CustomPushRender customPushRender = f12560d;
        if (customPushRender != null) {
            return customPushRender.onRender(context, pushNotificationData);
        }
        return false;
    }

    @Override // com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        CustomPushRerender customPushRerender = f12561e;
        if (customPushRerender != null) {
            return customPushRerender.onRerender(context, pushNotificationData, bundle);
        }
        return false;
    }

    @Override // com.webengage.sdk.android.InLinePersonalizationListener
    public void propertiesReceived(WeakReference<Activity> weakReference, HashMap<String, Object> hashMap) {
        InLinePersonalizationListener inLinePersonalizationListener = f12564h;
        if (inLinePersonalizationListener != null) {
            inLinePersonalizationListener.propertiesReceived(weakReference, hashMap);
        } else {
            Logger.d("WebEngage", "In callback propertiesReceived: No callback set");
        }
    }

    public static void a(InLinePersonalizationListener inLinePersonalizationListener) {
        f12564h = inLinePersonalizationListener;
    }

    public static void b(LifeCycleCallbacks lifeCycleCallbacks) {
        if (lifeCycleCallbacks != null) {
            if (f12558b == null) {
                f12558b = new ArrayList();
            }
            if (f12558b.contains(lifeCycleCallbacks)) {
                return;
            }
            f12558b.add(lifeCycleCallbacks);
        }
    }

    public static void a(CustomPushRender customPushRender) {
        if (customPushRender != null) {
            f12560d = customPushRender;
        }
    }

    public static void b(PushNotificationCallbacks pushNotificationCallbacks) {
        List<PushNotificationCallbacks> list = f12559c;
        if (list != null) {
            list.remove(pushNotificationCallbacks);
        }
    }

    public static void a(CustomPushRerender customPushRerender) {
        if (customPushRerender != null) {
            f12561e = customPushRerender;
        }
    }

    public static void a(InAppNotificationCallbacks inAppNotificationCallbacks) {
        if (inAppNotificationCallbacks != null) {
            if (f12562f == null) {
                f12562f = new ArrayList();
            }
            if (f12562f.contains(inAppNotificationCallbacks)) {
                return;
            }
            f12562f.add(inAppNotificationCallbacks);
        }
    }

    public static /* synthetic */ void a(LifeCycleCallbacks lifeCycleCallbacks) {
        if (lifeCycleCallbacks != null) {
            lifeCycleCallbacks.onNewSessionStarted();
        }
    }

    public static void a(PushNotificationCallbacks pushNotificationCallbacks) {
        if (pushNotificationCallbacks != null) {
            if (f12559c == null) {
                f12559c = new ArrayList();
            }
            if (f12559c.contains(pushNotificationCallbacks)) {
                return;
            }
            f12559c.add(pushNotificationCallbacks);
        }
    }

    public static void a(StateChangeCallbacks stateChangeCallbacks) {
        List<StateChangeCallbacks> list = f12563g;
        if (list != null) {
            list.remove(stateChangeCallbacks);
        }
    }

    public static void a(StateChangeCallbacks stateChangeCallbacks, Analytics analytics, Context context) {
        if (stateChangeCallbacks != null) {
            if (f12563g == null) {
                f12563g = new ArrayList();
            }
            if (f12563g.contains(stateChangeCallbacks)) {
                return;
            }
            f12563g.add(stateChangeCallbacks);
            if (analytics == null || !(analytics instanceof com.webengage.sdk.android.d) || context == null) {
                return;
            }
            String g10 = analytics.a().g();
            if (g10.isEmpty()) {
                g10 = null;
            }
            stateChangeCallbacks.onAnonymousIdChanged(context, g10);
        }
    }

    public boolean a() {
        return f12560d != null;
    }
}
