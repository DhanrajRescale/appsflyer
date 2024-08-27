package com.webengage.sdk.android.actions.render;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.NotificationClickHandlerService;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.actions.exception.WebViewException;
import com.webengage.sdk.android.actions.render.InAppNotificationData;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.utils.WebEngageConstant;
import in.juspay.hyper.constants.LogCategory;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n extends DialogFragment {

    /* renamed from: a */
    private f f12388a = null;

    /* renamed from: b */
    private JSONObject f12389b = null;

    /* renamed from: c */
    private boolean f12390c = false;

    /* renamed from: d */
    private String f12391d = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: e */
    private InAppNotificationData f12392e = null;

    /* renamed from: f */
    private RelativeLayout f12393f = null;

    /* renamed from: g */
    private Animation f12394g = null;

    /* renamed from: h */
    private Animation f12395h = null;

    /* renamed from: i */
    private Handler f12396i = null;

    /* renamed from: j */
    private int f12397j = 0;

    /* renamed from: k */
    private int f12398k = 1;

    /* renamed from: l */
    private int f12399l = 2;

    /* renamed from: m */
    private int f12400m = 3;

    /* renamed from: n */
    private int f12401n = -1;

    /* renamed from: o */
    private String f12402o = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: p */
    private String f12403p = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: q */
    private boolean f12404q = false;

    /* renamed from: r */
    private String f12405r = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: s */
    private Context f12406s = null;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                n.this.f12388a.getWindow().getDecorView().setVisibility(0);
                n.this.f12388a.getWindow().getDecorView().setEnabled(false);
                if (n.this.f12394g == null) {
                    n.this.d();
                } else if (!n.this.f12394g.hasStarted()) {
                    n.this.f12393f.startAnimation(n.this.f12394g);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (n.this.f12388a != null && n.this.f12388a.getWindow() != null && n.this.f12388a.getWindow().getDecorView() != null) {
                    if (n.this.f12388a.getWindow().getDecorView().getVisibility() == 8) {
                        n.this.a();
                    } else if (n.this.f12395h == null) {
                        n.this.dismissAllowingStateLoss();
                        n.this.d();
                    } else if (!n.this.f12395h.hasStarted()) {
                        n.this.f12393f.startAnimation(n.this.f12395h);
                    }
                }
            } catch (Exception e10) {
                Log.e("Render", e10.toString());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f12409a;

        static {
            int[] iArr = new int[InAppNotificationData.InAppType.values().length];
            f12409a = iArr;
            try {
                iArr[InAppNotificationData.InAppType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12409a[InAppNotificationData.InAppType.FOOTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class d implements Animation.AnimationListener {
        private d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                n.this.d();
            } catch (Exception unused) {
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ d(n nVar, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class e implements Animation.AnimationListener {
        private e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            try {
                n.this.dismissAllowingStateLoss();
                n.this.d();
            } catch (Exception unused) {
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ e(n nVar, a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class f extends Dialog {

        /* renamed from: a */
        private h f12412a;

        public f(Context context, int i10) {
            super(context, i10);
            this.f12412a = null;
            try {
                requestWindowFeature(1);
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
                if (n.this.f12390c) {
                    getWindow().setFlags(UserMetadata.MAX_ATTRIBUTE_SIZE, UserMetadata.MAX_ATTRIBUTE_SIZE);
                }
                n.this.f12393f = new RelativeLayout(getContext());
                n.this.f12393f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f12412a = new h(n.this.f12392e, n.this);
                n.this.a(getWindow(), n.this.getActivity().getResources().getConfiguration().orientation);
                if (n.this.f12394g != null) {
                    getWindow().getDecorView().setVisibility(8);
                }
                WebView a10 = new p(n.this.f12391d, "text/html", "UTF-8", this.f12412a, n.this.getActivity(), n.this.f12389b).a();
                a10.setTag("TAG_WE_WEB_VIEW");
                n.this.f12393f.addView(a10);
                a10.setOnTouchListener(new q(0));
                setContentView(n.this.f12393f);
            } catch (Exception e10) {
                Logger.e("ExceptionDialog", e10.toString());
                WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12603g, new WebViewException(e10.getMessage()), n.this.getActivity().getApplicationContext()), n.this.getActivity().getApplicationContext());
            }
        }

        public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
            return true;
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            n.this.b();
        }
    }

    @SuppressLint({"MissingPermission"})
    public void d() {
        VibrationEffect createOneShot;
        int i10 = this.f12401n;
        if (i10 == 0) {
            DataHolder.get().c(false);
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f12392e.getVariationId());
            hashMap.put("call_to_action", this.f12402o);
            hashMap.put("experiment_id", this.f12392e.getExperimentId());
            WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12598b, com.webengage.sdk.android.l.b("notification_click", hashMap, null, null, this.f12406s), this.f12406s), this.f12406s);
            boolean onInAppNotificationClicked = com.webengage.sdk.android.i.a(this.f12406s).onInAppNotificationClicked(this.f12406s, this.f12392e, this.f12402o);
            String str = this.f12403p;
            if (str == null || str.isEmpty() || "null".equals(this.f12403p) || onInAppNotificationClicked) {
                return;
            }
            Intent intent = new Intent(this.f12406s, (Class<?>) NotificationClickHandlerService.class);
            intent.setAction("com.webengage.sdk.android.intent.ACTION");
            Bundle bundle = new Bundle();
            bundle.putString(LogCategory.ACTION, "WebEngageDeeplink");
            bundle.putString("deeplink_uri", this.f12403p);
            intent.putExtras(bundle);
            this.f12406s.startService(intent);
            return;
        }
        if (i10 == 1) {
            DataHolder.get().c(false);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("id", this.f12392e.getVariationId());
            hashMap2.put("experiment_id", this.f12392e.getExperimentId());
            WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12598b, com.webengage.sdk.android.l.b("notification_close", hashMap2, null, null, this.f12406s), this.f12406s), this.f12406s);
            com.webengage.sdk.android.i.a(this.f12406s).onInAppNotificationDismissed(this.f12406s, this.f12392e);
            return;
        }
        if (i10 == 2) {
            DataHolder.get().c(false);
            WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12603g, new WebViewException(this.f12405r), this.f12406s), this.f12406s);
            return;
        }
        if (i10 != 3) {
            return;
        }
        WebView webView = (WebView) this.f12393f.findViewWithTag("TAG_WE_WEB_VIEW");
        if (webView != null) {
            webView.setOnTouchListener(new q(1));
        }
        if (com.webengage.sdk.android.utils.f.a("android.permission.VIBRATE", this.f12406s)) {
            Vibrator vibrator = (Vibrator) this.f12406s.getSystemService("vibrator");
            if (Build.VERSION.SDK_INT >= 26) {
                createOneShot = VibrationEffect.createOneShot(20L, -1);
                vibrator.vibrate(createOneShot);
            } else {
                vibrator.vibrate(20L);
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("experiment_id", this.f12392e.getExperimentId());
        hashMap3.put("id", this.f12392e.getVariationId());
        WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12598b, com.webengage.sdk.android.l.b("notification_view", hashMap3, null, null, this.f12406s), this.f12406s), this.f12406s);
        com.webengage.sdk.android.i.a(this.f12406s).onInAppNotificationShown(this.f12406s, this.f12392e);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Logger.d("RenderDialogFragment", "Attach");
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Logger.d("RenderDialogFragment", "Configuration Changed");
        a(this.f12388a.getWindow(), configuration.orientation);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        Logger.d("RenderDialogFragment", "Create");
        super.onCreate(bundle);
        try {
            this.f12406s = getActivity().getApplicationContext();
            Bundle arguments = getArguments();
            this.f12396i = new Handler(Looper.myLooper());
            arguments.setClassLoader(InAppNotificationData.class.getClassLoader());
            InAppNotificationData inAppNotificationData = (InAppNotificationData) arguments.getParcelable("notificationData");
            this.f12392e = inAppNotificationData;
            this.f12389b = inAppNotificationData.getData().optJSONObject("layoutAttributes");
            this.f12391d = arguments.getString("baseUrl");
            this.f12390c = arguments.getBoolean("fullscreen", false);
            this.f12394g = com.webengage.sdk.android.actions.render.a.a(this.f12389b.optString("entryAnimation", "FADE_IN"), new d(this, null), this.f12389b.optInt("animDuration", CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
            this.f12395h = com.webengage.sdk.android.actions.render.a.a(this.f12389b.optString("exitAnimation", "FADE_OUT"), new e(this, null), this.f12389b.optInt("animDuration", CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
            this.f12388a = new f(getActivity(), R.style.Theme);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Logger.d("RenderDialogFragment", "CreateDialog");
        return this.f12388a;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Logger.d("RenderDialogFragment", "CreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Logger.d("RenderDialogFragment", "Destroy");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        Logger.d("RenderDialogFragment", "DestroyView");
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        Logger.d("RenderDialogFragment", "Detach");
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        DataHolder.get().c(false);
        Logger.d("RenderDialogFragment", "Pause");
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        Logger.d("RenderDialogFragment", "Resume");
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        Logger.d("RenderDialogFragment", "Start");
        DataHolder.get().c(true);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStop() {
        super.onStop();
        Logger.d("RenderDialogFragment", "Stop");
    }

    public void a() {
        try {
            dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
        DataHolder.get().c(false);
    }

    private boolean e() {
        try {
            String experimentId = this.f12392e.getExperimentId();
            com.webengage.sdk.android.actions.rules.c cVar = new com.webengage.sdk.android.actions.rules.c(this.f12406s);
            WebEngageConstant.a aVar = WebEngageConstant.a.NOTIFICATION;
            Map<String, Object> a10 = cVar.a(experimentId, aVar);
            return com.webengage.sdk.android.actions.rules.f.a(a10, cVar.a(this.f12392e.getVariationId(), a10), aVar);
        } catch (Exception e10) {
            Logger.e("WebEngage", "Exception while performing in-app base checks", e10);
            return true;
        }
    }

    private boolean f() {
        return e() && com.webengage.sdk.android.actions.rules.h.b().evaluateRule(this.f12392e.getExperimentId(), WebEngageConstant.c.PAGE_RULE);
    }

    public void b() {
        this.f12401n = this.f12398k;
        h();
    }

    public void c() {
        this.f12401n = this.f12400m;
        if (f()) {
            g();
        } else {
            a();
        }
    }

    public void g() {
        this.f12396i.post(new a());
    }

    public void h() {
        this.f12396i.post(new b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0133, code lost:
    
        if (r8 != 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0157, code lost:
    
        r11 = (int) ((r16.f12389b.optInt("logoHeight", 0) * r2.density) + (r8 * r2.density));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0155, code lost:
    
        if (r8 != 0) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.Window r17, int r18) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.render.n.a(android.view.Window, int):void");
    }

    public void a(String str) {
        this.f12401n = this.f12399l;
        this.f12405r = str;
        h();
    }

    public void a(String str, String str2, boolean z10) {
        this.f12401n = this.f12397j;
        this.f12402o = str;
        this.f12403p = str2;
        this.f12404q = z10;
        h();
    }

    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return false;
    }
}
