package gf;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.u0;
import ba.ai;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.UserDrawerInfo;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.HomeViewModel;
import ge.q;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okhttp3.HttpUrl;
import qu.q1;
import qu.r0;
import ue.b0;
import vt.p0;
import vu.u;

/* loaded from: classes.dex */
public final class b extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i10) {
        super(1);
        this.f17354a = i10;
        this.f17355b = eVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f17354a;
        e eVar = this.f17355b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    int i11 = e.f17361m;
                    ComposeView composeView = ((ai) eVar.q()).f4203s;
                    Intrinsics.c(composeView);
                    zq.f.m0(composeView);
                    d dVar = new d(eVar, 0);
                    Object obj = b1.d.f3079a;
                    composeView.setContent(new b1.c(dVar, true, 254022219));
                    return;
                }
                if (Intrinsics.a(bool, Boolean.FALSE)) {
                    int i12 = e.f17361m;
                    ComposeView composeFullScreenView = ((ai) eVar.q()).f4203s;
                    Intrinsics.checkNotNullExpressionValue(composeFullScreenView, "composeFullScreenView");
                    zq.f.M(composeFullScreenView);
                    return;
                }
                if (bool == null) {
                    int i13 = e.f17361m;
                    ComposeView composeFullScreenView2 = ((ai) eVar.q()).f4203s;
                    Intrinsics.checkNotNullExpressionValue(composeFullScreenView2, "composeFullScreenView");
                    zq.f.M(composeFullScreenView2);
                    return;
                }
                return;
            case 6:
                Intrinsics.c(bool);
                if (bool.booleanValue() && eVar.f17367l) {
                    Context context = eVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("https://storage.googleapis.com/stockgro-chat-prod/privacy_policy.html", "url");
                    Intrinsics.checkNotNullParameter("privacy_policy.html", "fileName");
                    q1 context2 = hl.f.l();
                    xu.d dVar2 = r0.f32256b;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(context2, "context");
                    yk.g.H(hl.f.d(kotlin.coroutines.g.a(dVar2, context2)), null, null, new b0(context, "privacy_policy.html", "https://storage.googleapis.com/stockgro-chat-prod/privacy_policy.html", null), 3);
                    return;
                }
                return;
            default:
                Intrinsics.c(bool);
                if (bool.booleanValue() && eVar.f17367l) {
                    Context context3 = eVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
                    Intrinsics.checkNotNullParameter(context3, "context");
                    Intrinsics.checkNotNullParameter("https://storage.googleapis.com/stockgro-chat-prod/terms_and_condition.html", "url");
                    Intrinsics.checkNotNullParameter("terms_and_condition.html", "fileName");
                    q1 context4 = hl.f.l();
                    xu.d dVar3 = r0.f32256b;
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(context4, "context");
                    yk.g.H(hl.f.d(kotlin.coroutines.g.a(dVar3, context4)), null, null, new b0(context3, "terms_and_condition.html", "https://storage.googleapis.com/stockgro-chat-prod/terms_and_condition.html", null), 3);
                    return;
                }
                return;
        }
    }

    public final void d(String str) {
        int i10 = this.f17354a;
        e eVar = this.f17355b;
        switch (i10) {
            case 4:
                if (Intrinsics.a(str, "HomeFragment")) {
                    HomeViewModel homeViewModel = (HomeViewModel) eVar.r();
                    yk.g.H(u0.f(homeViewModel), null, null, new i(homeViewModel, null), 3);
                    mt.f g10 = new mt.c(at.e.a(5L, TimeUnit.SECONDS), new q(26, k.f17379a)).g(((kq.e) homeViewModel.f9079b).J());
                    jt.e eVar2 = new jt.e(new q(27, new l(homeViewModel, 0)), gt.e.f17572d);
                    g10.e(eVar2);
                    homeViewModel.C = eVar2;
                    return;
                }
                jt.e eVar3 = ((HomeViewModel) eVar.r()).C;
                if (eVar3 != null) {
                    ft.b.b(eVar3);
                    return;
                }
                return;
            default:
                if (str != null) {
                    xu.e eVar4 = r0.f32255a;
                    yk.g.H(hl.f.d(u.f38408a), null, null, new c(eVar, str, null), 3);
                    return;
                }
                return;
        }
    }

    public final void e(kj.j jVar) {
        String valueOf;
        int i10 = this.f17354a;
        e eVar = this.f17355b;
        switch (i10) {
            case 3:
                int i11 = e.f17361m;
                eVar.getClass();
                return;
            default:
                Pair pair = (Pair) jVar.a();
                if (pair != null) {
                    Pair[] pairArr = new Pair[1];
                    String lowerCase = ((String) pair.f23353a).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (lowerCase.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        char charAt = lowerCase.charAt(0);
                        if (Character.isLowerCase(charAt)) {
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            valueOf = CharsKt.c(charAt, locale);
                        } else {
                            valueOf = String.valueOf(charAt);
                        }
                        sb2.append((Object) valueOf);
                        String substring = lowerCase.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        sb2.append(substring);
                        lowerCase = sb2.toString();
                    }
                    pairArr[0] = new Pair("current_plan", lowerCase);
                    AnalyticEvent analyticEvent = new AnalyticEvent("app_home_sub_renew_popup", p0.f(pairArr));
                    eVar.z(analyticEvent);
                    eVar.A(analyticEvent);
                    eVar.B(analyticEvent);
                    int i12 = ej.p0.f15523c;
                    String str = (String) pair.f23354b;
                    Bundle bundle = new Bundle();
                    ej.p0 p0Var = new ej.p0();
                    bundle.putString("DATA", str);
                    p0Var.setArguments(bundle);
                    p0Var.show(eVar.getChildFragmentManager(), "SubscriptionRenewPlanDialogFragment");
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f17354a;
        TextView textView = null;
        e eVar = this.f17355b;
        switch (i10) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                Context context = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String text = ((z9.i) obj).a(requireContext);
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
            case 2:
                ai aiVar = (ai) eVar.q();
                aiVar.f4205u.setTitle("Hi ".concat(kj.f.h(((UserDrawerInfo) obj).getDisplayName())));
                return Unit.f23355a;
            case 3:
                e((kj.j) obj);
                return Unit.f23355a;
            case 4:
                d((String) obj);
                return Unit.f23355a;
            case 5:
                e((kj.j) obj);
                return Unit.f23355a;
            case 6:
                a((Boolean) obj);
                return Unit.f23355a;
            case 7:
                a((Boolean) obj);
                return Unit.f23355a;
            case 8:
                d((String) obj);
                return Unit.f23355a;
            case 9:
                AnalyticEvent analyticEvent = (AnalyticEvent) obj;
                if (analyticEvent != null) {
                    eVar.y(analyticEvent);
                }
                return Unit.f23355a;
            case 10:
                Integer num = (Integer) obj;
                Intrinsics.c(num);
                int intValue = num.intValue();
                int i11 = e.f17361m;
                View actionView = ((ai) eVar.q()).f4205u.getMenu().findItem(R.id.menu_item_notifications).getActionView();
                if (actionView != null) {
                    textView = (TextView) actionView.findViewById(R.id.cart_badge_notification);
                }
                if (textView != null) {
                    kj.f.u(textView, intValue);
                }
                return Unit.f23355a;
            default:
                th.b it = (th.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((HomeViewModel) eVar.r()).k(new uh.e(it.f36080a));
                return Unit.f23355a;
        }
    }
}
