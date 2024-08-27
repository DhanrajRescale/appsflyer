package gd;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBinderMapperImpl;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.v;
import h.a0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import ls.y0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import t3.p;
import vt.p0;

/* loaded from: classes.dex */
public abstract class b extends h.m {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f17253j = 0;

    /* renamed from: b, reason: collision with root package name */
    public BaseViewModel f17254b;

    /* renamed from: c, reason: collision with root package name */
    public com.kaopiz.kprogresshud.f f17255c;

    /* renamed from: d, reason: collision with root package name */
    public FirebaseAnalytics f17256d;

    /* renamed from: e, reason: collision with root package name */
    public Analytics f17257e;

    /* renamed from: f, reason: collision with root package name */
    public n0 f17258f;

    /* renamed from: g, reason: collision with root package name */
    public m4.m f17259g;

    /* renamed from: h, reason: collision with root package name */
    public String f17260h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f17261i = new a0(this, 6);

    public final void A(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        E(analyticEvent);
        C(analyticEvent);
    }

    public final void B(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        A(analyticEvent);
        D(analyticEvent);
    }

    public final void C(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        FirebaseAnalytics firebaseAnalytics = this.f17256d;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(analyticEvent.getEventName(), el.l.Z(analyticEvent.getParam()));
        } else {
            Intrinsics.k("_firebaseAnalytics");
            throw null;
        }
    }

    public final void D(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        HashMap<String, Object> param = analyticEvent.getParam();
        BaseViewModel x10 = x();
        HashMap hashMap = new HashMap();
        UserRepository userRepository = x10.f9081d;
        String currentUserId = userRepository.getCurrentUserId();
        if (currentUserId != null) {
            hashMap.put("uuid", currentUserId);
        }
        hashMap.put("user_name", userRepository.getUserDisplayName());
        param.putAll(hashMap);
        n0 n0Var = this.f17258f;
        if (n0Var != null) {
            String eventName = analyticEvent.getEventName();
            Intrinsics.checkNotNullParameter(param, "<this>");
            n0Var.m(eventName, new JSONObject(p0.k(param)));
            return;
        }
        Intrinsics.k("mixpanelAPI");
        throw null;
    }

    public final void E(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        y().track(analyticEvent.getEventName(), analyticEvent.getParam());
    }

    public abstract int F();

    public final void G() {
        n0 n0Var = this.f17258f;
        if (n0Var != null) {
            y0 y0Var = n0Var.f25265g;
            y0Var.b();
            ls.i g10 = n0Var.g();
            ls.b bVar = new ls.b(n0Var.f25262d);
            g10.getClass();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.obj = bVar;
            g10.f25224a.b(obtain);
            n0Var.j(y0Var.c(), false);
            ls.k kVar = n0Var.f25267i;
            kVar.f25230c = null;
            kVar.f25231d = 0;
            JSONArray jSONArray = new JSONArray();
            os.n nVar = n0Var.f25264f;
            nVar.b(jSONArray);
            nVar.g();
            n0Var.e();
            return;
        }
        Intrinsics.k("mixpanelAPI");
        throw null;
    }

    public void H() {
        x().f9083f.observe(this, new eb.c(24, new a(this, 0)));
        x().f9082e.observe(this, new eb.c(24, new a(this, 1)));
        x().f9086i.observe(this, new eb.c(24, new a(this, 2)));
        x().f9089l.observe(this, new eb.c(24, new a(this, 3)));
        x().f9090m.observe(this, new eb.c(24, new a(this, 4)));
        x().f9088k.observe(this, new eb.c(24, new a(this, 5)));
        x().f9087j.observe(this, new eb.c(24, new a(this, 6)));
        x().f9085h.observe(this, new eb.c(24, new a(this, 7)));
    }

    public abstract void I();

    public final void J(String text) {
        Intrinsics.checkNotNullParameter(text, "message");
        Context context = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() != 0) {
            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
            Object systemService = context.getSystemService("layout_inflater");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
        }
    }

    public final void hide(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public final void hideKeyboardOnScreen(@NotNull View view) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        if (context != null) {
            obj = context.getSystemService("input_method");
        } else {
            obj = null;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) obj).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onBackPressed() {
        ArrayList arrayList = getSupportFragmentManager().f1647d;
        if (arrayList != null && arrayList.size() > 0) {
            getSupportFragmentManager().P();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        tr.e eVar = new tr.e((nn.d) null);
        Application application = getApplication();
        Intrinsics.d(application, "null cannot be cast to non-null type com.assetgro.stockgro.StockGroApplication");
        eVar.f36362c = ((StockGroApplication) application).a();
        eVar.f36361b = new v(this);
        yk.g.g(da.b.class, (da.b) eVar.f36362c);
        da.a aVar = new da.a((v) eVar.f36361b, (da.b) eVar.f36362c);
        Intrinsics.checkNotNullExpressionValue(aVar, "buildActivityComponent(...)");
        z(aVar);
        super.onCreate(bundle);
        int F = F();
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        setContentView(F);
        m4.m a10 = m4.d.a((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content), 0, F);
        Intrinsics.checkNotNullExpressionValue(a10, "setContentView(...)");
        Intrinsics.checkNotNullParameter(a10, "<set-?>");
        this.f17259g = a10;
        x().f9081d.initializeLocale();
        com.kaopiz.kprogresshud.f a11 = com.kaopiz.kprogresshud.f.a(this);
        a11.c();
        com.kaopiz.kprogresshud.e eVar2 = a11.f12063a;
        eVar2.setCancelable(false);
        eVar2.setOnCancelListener(null);
        a11.f12068f = 2;
        a11.f12064b = 0.5f;
        this.f17255c = a11;
        H();
        I();
        x().e();
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onPause() {
        super.onPause();
        a5.b.a(this).d(this.f17261i);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onResume() {
        super.onResume();
        a5.b.a(this).b(this.f17261i, new IntentFilter("multiple-sign-in"));
    }

    @Override // h.m, androidx.fragment.app.j0, android.app.Activity
    public void onStart() {
        super.onStart();
        String str = this.f17260h;
        if (str != null && str.length() > 0) {
            y().screenNavigated(str);
        }
    }

    public final void show(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public final void showKeyboard(@NotNull View view) {
        InputMethodManager inputMethodManager;
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestFocus();
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
            inputMethodManager.toggleSoftInput(2, 1);
        }
    }

    public final void v(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        int childCount = toolbar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (Intrinsics.a(textView.getText(), toolbar.getTitle())) {
                    textView.setTypeface(p.a(R.font.inter_600, textView.getContext()));
                    return;
                }
            }
        }
    }

    public final m4.m w() {
        m4.m mVar = this.f17259g;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.k("binding");
        throw null;
    }

    public final BaseViewModel x() {
        BaseViewModel baseViewModel = this.f17254b;
        if (baseViewModel != null) {
            return baseViewModel;
        }
        Intrinsics.k("viewModel");
        throw null;
    }

    public final Analytics y() {
        Analytics analytics = this.f17257e;
        if (analytics != null) {
            return analytics;
        }
        Intrinsics.k("webEngageAnalytics");
        throw null;
    }

    public abstract void z(da.a aVar);
}
