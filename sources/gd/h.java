package gd;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.f0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import m4.m;
import okhttp3.HttpUrl;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgd/h;", "Lcom/assetgro/stockgro/ui/base/BaseBottomSheetViewModel;", "VM", "Lm4/m;", "VDB", "Lao/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class h<VM extends BaseBottomSheetViewModel, VDB extends m4.m> extends ao.g {

    /* renamed from: b, reason: collision with root package name */
    public BaseBottomSheetViewModel f17270b;

    /* renamed from: c, reason: collision with root package name */
    public View f17271c;

    /* renamed from: d, reason: collision with root package name */
    public m4.m f17272d;

    /* renamed from: e, reason: collision with root package name */
    public FirebaseAnalytics f17273e;

    /* renamed from: f, reason: collision with root package name */
    public Analytics f17274f;

    /* renamed from: g, reason: collision with root package name */
    public n0 f17275g;

    /* renamed from: h, reason: collision with root package name */
    public com.kaopiz.kprogresshud.f f17276h;

    public final Unit A(String text) {
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

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        da.d dVar = new da.d((Object) null);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.d(applicationContext, "null cannot be cast to non-null type com.assetgro.stockgro.StockGroApplication");
        dVar.f14277c = ((StockGroApplication) applicationContext).a();
        dVar.f14276b = new f0(this);
        yk.g.g(da.b.class, (da.b) dVar.f14277c);
        da.a aVar = new da.a((f0) dVar.f14276b, (da.b) dVar.f14277c);
        Intrinsics.checkNotNullExpressionValue(aVar, "buildBottomSheetDialogFragmentComponent(...)");
        u(aVar);
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
        com.kaopiz.kprogresshud.f a10 = com.kaopiz.kprogresshud.f.a(requireActivity());
        a10.c();
        com.kaopiz.kprogresshud.e eVar = a10.f12063a;
        eVar.setCancelable(false);
        eVar.setOnCancelListener(null);
        a10.f12068f = 2;
        a10.f12064b = 0.5f;
        this.f17276h = a10;
        y();
        t().e();
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m4.m b10 = m4.d.b(inflater, x(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(b10, "inflate(...)");
        Intrinsics.checkNotNullParameter(b10, "<set-?>");
        this.f17272d = b10;
        View view = r().f27491e;
        Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f17271c = view;
        return s();
    }

    @Override // androidx.fragment.app.g0
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        z(view);
    }

    public final m4.m r() {
        m4.m mVar = this.f17272d;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.k("binding");
        throw null;
    }

    public final View s() {
        View view = this.f17271c;
        if (view != null) {
            return view;
        }
        Intrinsics.k("dialogView");
        throw null;
    }

    public final BaseBottomSheetViewModel t() {
        BaseBottomSheetViewModel baseBottomSheetViewModel = this.f17270b;
        if (baseBottomSheetViewModel != null) {
            return baseBottomSheetViewModel;
        }
        Intrinsics.k("viewModel");
        throw null;
    }

    public abstract void u(da.a aVar);

    public final void v(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        Analytics analytics = this.f17274f;
        if (analytics != null) {
            analytics.track(analyticEvent.getEventName(), analyticEvent.getParam());
            FirebaseAnalytics firebaseAnalytics = this.f17273e;
            if (firebaseAnalytics != null) {
                firebaseAnalytics.a(analyticEvent.getEventName(), el.l.Z(analyticEvent.getParam()));
                return;
            } else {
                Intrinsics.k("_firebaseAnalytics");
                throw null;
            }
        }
        Intrinsics.k("webEngageAnalytics");
        throw null;
    }

    public final void w(AnalyticEvent analyticEvent) {
        Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : analyticEvent.getParam().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        n0 n0Var = this.f17275g;
        if (n0Var != null) {
            n0Var.m(analyticEvent.getEventName(), jSONObject);
        } else {
            Intrinsics.k("mixpanelAPI");
            throw null;
        }
    }

    public abstract int x();

    public void y() {
        t().f9069e.observe(this, new eb.c(25, new g(this, 0)));
        t().f9068d.observe(this, new eb.c(25, new g(this, 1)));
    }

    public abstract void z(View view);
}
