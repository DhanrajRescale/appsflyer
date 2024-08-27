package wl;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwl/w;", "Landroidx/fragment/app/g0;", "<init>", "()V", "ll/a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class w extends androidx.fragment.app.g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f39292f = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f39293a;

    /* renamed from: b, reason: collision with root package name */
    public q f39294b;

    /* renamed from: c, reason: collision with root package name */
    public t f39295c;

    /* renamed from: d, reason: collision with root package name */
    public e.c f39296d;

    /* renamed from: e, reason: collision with root package name */
    public View f39297e;

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        p().j(i10, i11, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, wl.t] */
    @Override // androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        t tVar;
        t tVar2;
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            tVar = null;
        } else {
            tVar = (t) bundle.getParcelable("loginClient");
        }
        if (tVar != null) {
            if (tVar.f39278c == null) {
                tVar.f39278c = this;
                tVar2 = tVar;
            } else {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
        } else {
            Intrinsics.checkNotNullParameter(this, "fragment");
            ?? obj = new Object();
            obj.f39277b = -1;
            if (obj.f39278c == null) {
                obj.f39278c = this;
                tVar2 = obj;
            } else {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
        }
        this.f39295c = tVar2;
        p().f39279d = new dj.e(this, 5);
        androidx.fragment.app.j0 activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f39293a = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f39294b = (q) bundleExtra.getParcelable("request");
        }
        e.c registerForActivityResult = registerForActivityResult(new Object(), new b3.t(new zd.g(21, this, activity), 12));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f39296d = registerForActivityResult;
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f39297e = findViewById;
        p().f39280e = new v(this);
        return inflate;
    }

    @Override // androidx.fragment.app.g0
    public final void onDestroy() {
        c0 f10 = p().f();
        if (f10 != null) {
            f10.b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.g0
    public final void onPause() {
        View findViewById;
        super.onPause();
        View view = getView();
        if (view == null) {
            findViewById = null;
        } else {
            findViewById = view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        if (this.f39293a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            androidx.fragment.app.j0 activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        t p10 = p();
        q request = this.f39294b;
        q qVar = p10.f39282g;
        if ((qVar == null || p10.f39277b < 0) && request != null) {
            if (qVar == null) {
                Date date = xk.a.f40309l;
                if (!ek.h.x() || p10.b()) {
                    p10.f39282g = request;
                    Intrinsics.checkNotNullParameter(request, "request");
                    ArrayList arrayList = new ArrayList();
                    boolean a10 = request.a();
                    p pVar = request.f39245a;
                    if (a10) {
                        if (!FacebookSdk.bypassAppSwitch && pVar.f39244f) {
                            arrayList.add(new n(p10));
                        }
                    } else {
                        if (pVar.f39239a) {
                            arrayList.add(new m(p10));
                        }
                        if (!FacebookSdk.bypassAppSwitch && pVar.f39240b) {
                            arrayList.add(new o(p10));
                        }
                    }
                    if (pVar.f39243e) {
                        arrayList.add(new b(p10));
                    }
                    if (pVar.f39241c) {
                        arrayList.add(new j0(p10));
                    }
                    if (!request.a() && pVar.f39242d) {
                        arrayList.add(new j(p10));
                    }
                    Object[] array = arrayList.toArray(new c0[0]);
                    if (array != null) {
                        p10.f39276a = (c0[]) array;
                        p10.k();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return;
            }
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("loginClient", p());
    }

    public final t p() {
        t tVar = this.f39295c;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.k("loginClient");
        throw null;
    }
}
