package kj;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.g0;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.data.remote.request.AppCloneDataRequest;
import com.assetgro.stockgro.prod.R;
import com.google.gson.Gson;
import d2.s1;
import d2.y;
import gd.m;
import hv.t;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import t0.n;
import t0.r;
import vt.x;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23221a = 0;

    static {
        ut.h.a(d.f23214b);
    }

    public static void a(RecyclerView recyclerView, rd.j action) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        recyclerView.postDelayed(new y(action, 5), 200L);
    }

    public static final void b(g0 g0Var, int i10, lc.b action) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        List a10 = x.a("android.permission.CAMERA");
        if (m(g0Var)) {
            action.mo2invoke();
        } else if (g0Var.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            dp.b.M1(g0Var.requireContext(), g0Var.getString(R.string.text_camera_permission_rationale));
        } else {
            g0Var.requestPermissions((String[]) a10.toArray(new String[0]), i10);
        }
    }

    public static final String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() > 0) {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return upperCase + substring;
        }
        return str;
    }

    public static String d(double d10) {
        int i10 = (int) d10;
        if (d10 - i10 > 0.0d) {
            return a3.a.m(new Object[]{Double.valueOf(d10)}, 1, jr.h.o("%.", 2, "f"), "format(...)");
        }
        return String.valueOf(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(View view, long j10, Function0 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new b(j10, (iu.k) action, 0));
    }

    public static final float f(float f10, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(694704846);
        float c02 = ((w2.b) rVar.m(s1.f13620e)).c0(f10);
        rVar.s(false);
        return c02;
    }

    public static final AppCloneDataRequest g(Activity activity) {
        String str;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        String packageName = activity.getPackageName();
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager != null && (packageInfo = packageManager.getPackageInfo(activity.getPackageName(), 0)) != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            str = applicationInfo.sourceDir;
        } else {
            str = null;
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Intrinsics.c(packageName);
        return new AppCloneDataRequest(packageName, str, null, null, null, null, null, 124, null);
    }

    public static final String h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (String str2 : w.P(w.X(str).toString(), new String[]{" "}, 0, 6)) {
            if (w.X(str2).toString().length() > 0) {
                return str2;
            }
        }
        return "User";
    }

    public static final int i(int i10) {
        return (int) (i10 / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int j(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final void k(m mVar, String deeplink) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(deeplink));
        mVar.startActivity(intent);
    }

    public static final boolean l(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (r3.k.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }

    public static final boolean m(g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        if (r3.k.checkSelfPermission(g0Var.requireContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }

    public static final void n(EditText editText, Function1 onTextChange) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(onTextChange, "onTextChange");
        editText.addTextChangedListener(new i9.a(1, onTextChange));
    }

    public static final void o(TextView textView, String value) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        String format = String.format("#%s", Arrays.copyOf(new Object[]{value}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
    }

    public static final double p(double d10) {
        if (d10 % 1 != 0.0d) {
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return Double.parseDouble(format);
        }
        return d10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [m3.d] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.widget.RelativeLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, java.lang.Object] */
    public static final void q(View view, int i10, int i11, int i12, int i13, int i14, int i15) {
        ?? r02;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            r02 = (RelativeLayout.LayoutParams) layoutParams;
            if (i14 != -1) {
                r02.addRule(19, i14);
            }
            if (i15 != -1) {
                r02.addRule(3, i15);
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Intrinsics.d(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            r02 = (m3.d) layoutParams2;
        }
        r02.setMargins(i10, i11, i12, i13);
        view.setLayoutParams(r02);
    }

    public static final void r(boolean z10, View... view) {
        Intrinsics.checkNotNullParameter(view, "view");
        for (View view2 : view) {
            if (z10) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
        }
    }

    public static final String s(long j10) {
        hv.e l10 = hv.e.l(0, j10);
        t a10 = a3.a.a(l10, l10);
        Locale locale = Locale.US;
        jv.a aVar = jv.a.f21670h;
        jv.r rVar = new jv.r();
        rVar.g("dd MMM yyyy | HH:mm");
        jv.a p10 = rVar.p(locale);
        hv.g gVar = a10.f18769a;
        gVar.getClass();
        String a11 = p10.a(gVar);
        Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
        return a11;
    }

    public static final JSONObject t(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new JSONObject(((Gson) ut.h.a(d.f23215c).getValue()).toJson(map));
    }

    public static final void u(TextView textView, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (i10 > 0) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        textView.setVisibility(i11);
        textView.setText(String.valueOf(i10));
    }

    public static final void v(TextView textView, String textString) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(textString, "textString");
        zq.f.m0(textView);
        textView.setText(textString);
    }
}
