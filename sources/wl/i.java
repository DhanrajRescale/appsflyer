package wl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lwl/i;", "Landroidx/fragment/app/t;", "<init>", "()V", "ll/f", "m9/m", "wl/g", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class i extends androidx.fragment.app.t {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f39198l = 0;

    /* renamed from: a, reason: collision with root package name */
    public View f39199a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f39200b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f39201c;

    /* renamed from: d, reason: collision with root package name */
    public j f39202d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f39203e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public volatile xk.a0 f39204f;

    /* renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture f39205g;

    /* renamed from: h, reason: collision with root package name */
    public volatile g f39206h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f39207i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39208j;

    /* renamed from: k, reason: collision with root package name */
    public q f39209k;

    public static String r() {
        StringBuilder sb2 = new StringBuilder();
        String applicationId = FacebookSdk.getApplicationId();
        if (applicationId != null) {
            sb2.append(applicationId);
            sb2.append('|');
            String clientToken = FacebookSdk.getClientToken();
            if (clientToken != null) {
                sb2.append(clientToken);
                return sb2.toString();
            }
            throw new IllegalStateException("No Client Token found, please set the Client Token. Please follow https://developers.facebook.com/docs/android/getting-started/#client-access-token to get the token and fill it in AndroidManifest.xml".toString());
        }
        throw new IllegalStateException("No App ID found, please set the App ID.".toString());
    }

    @Override // androidx.fragment.app.t
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z10;
        h hVar = new h(this, requireActivity());
        if (ml.b.c() && !this.f39208j) {
            z10 = true;
        } else {
            z10 = false;
        }
        hVar.setContentView(s(z10));
        return hVar;
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        c0 f10;
        g gVar;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        w wVar = (w) ((FacebookActivity) requireActivity()).f10876a;
        if (wVar == null) {
            f10 = null;
        } else {
            f10 = wVar.p().f();
        }
        this.f39202d = (j) f10;
        if (bundle != null && (gVar = (g) bundle.getParcelable("request_state")) != null) {
            y(gVar);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onDestroyView() {
        this.f39207i = true;
        this.f39203e.set(true);
        super.onDestroyView();
        xk.a0 a0Var = this.f39204f;
        if (a0Var != null) {
            a0Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f39205g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.t, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (!this.f39207i) {
            t();
        }
    }

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f39206h != null) {
            outState.putParcelable("request_state", this.f39206h);
        }
    }

    public final void q(String userId, m9.m mVar, String accessToken, Date date, Date date2) {
        j jVar = this.f39202d;
        if (jVar != null) {
            String applicationId = FacebookSdk.getApplicationId();
            List list = mVar.f27657a;
            List list2 = mVar.f27658b;
            List list3 = mVar.f27659c;
            xk.h hVar = xk.h.DEVICE_AUTH;
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            xk.a token = new xk.a(accessToken, applicationId, userId, list, list2, list3, hVar, date, null, date2, "facebook");
            Parcelable.Creator<s> creator = s.CREATOR;
            q qVar = jVar.d().f39282g;
            Intrinsics.checkNotNullParameter(token, "token");
            jVar.d().d(new s(qVar, r.SUCCESS, token, null, null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View s(boolean z10) {
        int i10;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        if (z10) {
            i10 = R.layout.com_facebook_smart_device_dialog_fragment;
        } else {
            i10 = R.layout.com_facebook_device_auth_dialog_fragment;
        }
        View inflate = layoutInflater.inflate(i10, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(R.id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f39199a = findViewById;
        View findViewById2 = inflate.findViewById(R.id.confirmation_code);
        if (findViewById2 != null) {
            this.f39200b = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.cancel_button);
            if (findViewById3 != null) {
                ((Button) findViewById3).setOnClickListener(new ph.a(this, 23));
                View findViewById4 = inflate.findViewById(R.id.com_facebook_device_auth_instructions);
                if (findViewById4 != null) {
                    TextView textView = (TextView) findViewById4;
                    this.f39201c = textView;
                    textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
                    return inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void t() {
        if (!this.f39203e.compareAndSet(false, true)) {
            return;
        }
        g gVar = this.f39206h;
        if (gVar != null) {
            ml.b bVar = ml.b.f27823a;
            ml.b.a(gVar.f39185b);
        }
        j jVar = this.f39202d;
        if (jVar != null) {
            Parcelable.Creator<s> creator = s.CREATOR;
            jVar.d().d(new s(jVar.d().f39282g, r.CANCEL, null, "User canceled log in.", null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void u(FacebookException ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (!this.f39203e.compareAndSet(false, true)) {
            return;
        }
        g gVar = this.f39206h;
        if (gVar != null) {
            ml.b bVar = ml.b.f27823a;
            ml.b.a(gVar.f39185b);
        }
        j jVar = this.f39202d;
        if (jVar != null) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            Parcelable.Creator<s> creator = s.CREATOR;
            jVar.d().d(ll.e.f(jVar.d().f39282g, null, ex.getMessage(), null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void v(String str, long j10, Long l10) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (j10 != 0) {
            date = new Date((j10 * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date2 = new Date(l10.longValue() * 1000);
        }
        xk.a aVar = new xk.a(str, FacebookSdk.getApplicationId(), "0", null, null, null, null, date, null, date2, "facebook");
        String str2 = xk.z.f40475j;
        xk.z w10 = ek.e.w(aVar, "me", new xk.c(this, str, date, date2, 2));
        w10.k(xk.e0.f40353a);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        w10.f40482d = bundle;
        w10.d();
    }

    public final void w() {
        String str;
        g gVar = this.f39206h;
        if (gVar != null) {
            gVar.f39188e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        g gVar2 = this.f39206h;
        if (gVar2 == null) {
            str = null;
        } else {
            str = gVar2.f39186c;
        }
        bundle.putString("code", str);
        bundle.putString("access_token", r());
        String str2 = xk.z.f40475j;
        this.f39204f = new xk.z(null, "device/login_status", bundle, xk.e0.f40354b, new e(this, 0)).d();
    }

    public final void x() {
        Long valueOf;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        g gVar = this.f39206h;
        if (gVar == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(gVar.f39187d);
        }
        if (valueOf != null) {
            synchronized (j.f39212d) {
                try {
                    if (j.f39213e == null) {
                        j.f39213e = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = j.f39213e;
                    if (scheduledThreadPoolExecutor == null) {
                        Intrinsics.k("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f39205g = scheduledThreadPoolExecutor.schedule(new bl.d(this, 6), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(wl.g r22) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.i.y(wl.g):void");
    }

    public final void z(q request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f39209k = request;
        Bundle b10 = new Bundle();
        b10.putString("scope", TextUtils.join(",", request.f39246b));
        String str = request.f39251g;
        Intrinsics.checkNotNullParameter(b10, "b");
        if (!n0.A(str)) {
            b10.putString("redirect_uri", str);
        }
        String str2 = request.f39253i;
        Intrinsics.checkNotNullParameter(b10, "b");
        if (!n0.A(str2)) {
            b10.putString("target_user_id", str2);
        }
        b10.putString("access_token", r());
        ml.b bVar = ml.b.f27823a;
        String str3 = null;
        if (!sl.a.b(ml.b.class)) {
            try {
                HashMap hashMap = new HashMap();
                String DEVICE = Build.DEVICE;
                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                hashMap.put(LogSubCategory.Context.DEVICE, DEVICE);
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                hashMap.put("model", MODEL);
                String jSONObject = new JSONObject(hashMap).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
                str3 = jSONObject;
            } catch (Throwable th2) {
                sl.a.a(ml.b.class, th2);
            }
        }
        b10.putString("device_info", str3);
        String str4 = xk.z.f40475j;
        new xk.z(null, "device/login", b10, xk.e0.f40354b, new e(this, 1)).d();
    }
}
