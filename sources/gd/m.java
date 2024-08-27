package gd;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.g0;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.webengage.sdk.android.Analytics;
import ea.o0;
import ek.u;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ls.l0;
import ls.n0;
import ls.y0;
import m4.m;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import t3.p;
import vt.p0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgd/m;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "VM", "Lm4/m;", "VDB", "Landroidx/fragment/app/g0;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class m<VM extends BaseViewModel, VDB extends m4.m> extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public com.kaopiz.kprogresshud.f f17283a;

    /* renamed from: b, reason: collision with root package name */
    public BaseViewModel f17284b;

    /* renamed from: c, reason: collision with root package name */
    public FirebaseAnalytics f17285c;

    /* renamed from: d, reason: collision with root package name */
    public Analytics f17286d;

    /* renamed from: e, reason: collision with root package name */
    public n0 f17287e;

    /* renamed from: f, reason: collision with root package name */
    public m4.m f17288f;

    public final void A(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        HashMap<String, Object> param = analyticEvent.getParam();
        BaseViewModel r10 = r();
        HashMap hashMap = new HashMap();
        UserRepository userRepository = r10.f9081d;
        String currentUserId = userRepository.getCurrentUserId();
        if (currentUserId != null) {
            hashMap.put("uuid", currentUserId);
        }
        hashMap.put("user_name", userRepository.getUserDisplayName());
        param.putAll(hashMap);
        n0 n0Var = this.f17287e;
        if (n0Var != null) {
            String eventName = analyticEvent.getEventName();
            Intrinsics.checkNotNullParameter(param, "<this>");
            n0Var.m(eventName, new JSONObject(p0.k(param)));
            return;
        }
        Intrinsics.k("mixpanelAPI");
        throw null;
    }

    public final void B(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        s().track(analyticEvent.getEventName(), analyticEvent.getParam());
    }

    public abstract int C();

    public void D() {
        r().f9083f.observe(this, new eb.c(27, new l(this, 0)));
        r().f9082e.observe(this, new eb.c(27, new l(this, 1)));
        r().f9086i.observe(this, new eb.c(27, new l(this, 2)));
        r().f9089l.observe(this, new eb.c(27, new l(this, 3)));
        r().f9090m.observe(this, new eb.c(27, new l(this, 4)));
        r().f9088k.observe(this, new eb.c(27, new l(this, 5)));
    }

    public abstract void E(View view);

    public final void F(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public final Unit G(String text) {
        Intrinsics.checkNotNullParameter(text, "message");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() != 0) {
            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
            Object systemService = context.getSystemService("layout_inflater");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
        }
        return Unit.f23355a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, da.a] */
    @Override // androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        ?? obj = new Object();
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.d(applicationContext, "null cannot be cast to non-null type com.assetgro.stockgro.StockGroApplication");
        obj.f14246a = ((StockGroApplication) applicationContext).a();
        obj.f14247b = new ea.n0(this);
        obj.f14248c = new o0(this);
        yk.g.g(ea.n0.class, (ea.n0) obj.f14247b);
        yk.g.g(o0.class, (o0) obj.f14248c);
        yk.g.g(da.b.class, obj.f14246a);
        da.f fVar = new da.f((ea.n0) obj.f14247b, (o0) obj.f14248c, obj.f14246a);
        Intrinsics.checkNotNullExpressionValue(fVar, "buildFragmentComponent(...)");
        w(fVar);
        super.onCreate(bundle);
        D();
        r().e();
        com.kaopiz.kprogresshud.f a10 = com.kaopiz.kprogresshud.f.a(getActivity());
        a10.c();
        com.kaopiz.kprogresshud.e eVar = a10.f12063a;
        eVar.setCancelable(false);
        eVar.setOnCancelListener(null);
        a10.f12068f = 2;
        a10.f12064b = 0.5f;
        this.f17283a = a10;
    }

    @Override // androidx.fragment.app.g0
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m4.m b10 = m4.d.b(inflater, C(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(b10, "inflate(...)");
        Intrinsics.checkNotNullParameter(b10, "<set-?>");
        this.f17288f = b10;
        return q().f27491e;
    }

    @Override // androidx.fragment.app.g0
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        E(view);
    }

    public final void p(Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        int childCount = toolbar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (Intrinsics.a(textView.getText(), toolbar.getTitle())) {
                    textView.setTypeface(p.a(R.font.inter_500, textView.getContext()));
                    return;
                }
            }
        }
    }

    public final m4.m q() {
        m4.m mVar = this.f17288f;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.k("binding");
        throw null;
    }

    public final BaseViewModel r() {
        BaseViewModel baseViewModel = this.f17284b;
        if (baseViewModel != null) {
            return baseViewModel;
        }
        Intrinsics.k("viewModel");
        throw null;
    }

    public final Analytics s() {
        Analytics analytics = this.f17286d;
        if (analytics != null) {
            return analytics;
        }
        Intrinsics.k("webEngageAnalytics");
        throw null;
    }

    public final void t(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public final void u(View view) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = getContext();
        if (context != null) {
            obj = context.getSystemService("input_method");
        } else {
            obj = null;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) obj).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void v(String str) {
        if (str != null && str.length() != 0) {
            Object[] objArr = new Object[0];
            Intrinsics.checkNotNullParameter("BaseFragment", "tag");
            com.google.android.gms.internal.p002firebaseauthapi.a.g("Received UserId if for Mixpanel Identify", "s", objArr, "params", "BaseFragment").getClass();
            u.k(objArr);
            n0 n0Var = this.f17287e;
            if (n0Var != null) {
                n0Var.j(str, true);
                n0 n0Var2 = this.f17287e;
                if (n0Var2 != null) {
                    l0 l0Var = n0Var2.f25263e;
                    if (!l0Var.f25236a.i()) {
                        synchronized (l0Var.f25236a.f25265g) {
                            y0 y0Var = l0Var.f25236a.f25265g;
                            synchronized (y0Var) {
                                try {
                                    if (!y0Var.f25360i) {
                                        y0Var.i();
                                    }
                                    y0Var.f25363l = str;
                                    y0Var.q();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            l0Var.f25236a.f25268j.c(str);
                        }
                        n0 n0Var3 = l0Var.f25236a;
                        ls.e eVar = new ls.e(str, n0Var3.f25262d);
                        ls.i iVar = n0Var3.f25260b;
                        iVar.getClass();
                        Message obtain = Message.obtain();
                        obtain.what = 4;
                        obtain.obj = eVar;
                        iVar.f25224a.b(obtain);
                        return;
                    }
                    return;
                }
                Intrinsics.k("mixpanelAPI");
                throw null;
            }
            Intrinsics.k("mixpanelAPI");
            throw null;
        }
        FirebaseCrashlytics.getInstance().recordException(new Exception("Null UserId while identifying User for Mixpanel"));
    }

    public abstract void w(da.f fVar);

    public final void x(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        B(analyticEvent);
        z(analyticEvent);
    }

    public final void y(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        x(analyticEvent);
        A(analyticEvent);
    }

    public final void z(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        FirebaseAnalytics firebaseAnalytics = this.f17285c;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.a(analyticEvent.getEventName(), el.l.Z(analyticEvent.getParam()));
        } else {
            Intrinsics.k("_firebaseAnalytics");
            throw null;
        }
    }
}
