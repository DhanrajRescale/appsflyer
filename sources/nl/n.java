package nl;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import in.juspay.hyper.constants.LogCategory;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnl/n;", "Landroidx/fragment/app/t;", "<init>", "()V", "ll/a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class n extends androidx.fragment.app.t {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28881b = 0;

    /* renamed from: a, reason: collision with root package name */
    public Dialog f28882a;

    @Override // androidx.fragment.app.g0, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f28882a instanceof w0) && isResumed()) {
            Dialog dialog = this.f28882a;
            if (dialog != null) {
                ((w0) dialog).d();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [nl.w0, android.app.Dialog] */
    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        androidx.fragment.app.j0 context;
        boolean z10;
        w0 w0Var;
        String action;
        Bundle bundle2;
        super.onCreate(bundle);
        if (this.f28882a == null && (context = getActivity()) != null) {
            Intent intent = context.getIntent();
            h0 h0Var = h0.f28857a;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle h10 = h0.h(intent);
            final int i10 = 0;
            if (h10 == null) {
                z10 = false;
            } else {
                z10 = h10.getBoolean("is_fallback", false);
            }
            String url = null;
            if (!z10) {
                if (h10 == null) {
                    action = null;
                } else {
                    action = h10.getString(LogCategory.ACTION);
                }
                if (h10 == null) {
                    bundle2 = null;
                } else {
                    bundle2 = h10.getBundle("params");
                }
                if (n0.A(action)) {
                    n0.F("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    context.finish();
                    return;
                }
                if (action != null) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(action, "action");
                    Date date = xk.a.f40309l;
                    xk.a q10 = ek.h.q();
                    if (!ek.h.x()) {
                        n0.K(context, LogCategory.CONTEXT);
                        url = FacebookSdk.getApplicationId();
                        if (url == null) {
                            throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                        }
                    }
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    r0 r0Var = new r0(this) { // from class: nl.m

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n f28880b;

                        {
                            this.f28880b = this;
                        }

                        @Override // nl.r0
                        public final void a(Bundle bundle3, FacebookException facebookException) {
                            int i11 = i10;
                            n this$0 = this.f28880b;
                            switch (i11) {
                                case 0:
                                    int i12 = n.f28881b;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.q(bundle3, facebookException);
                                    return;
                                default:
                                    int i13 = n.f28881b;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    androidx.fragment.app.j0 activity = this$0.getActivity();
                                    if (activity != null) {
                                        Intent intent2 = new Intent();
                                        if (bundle3 == null) {
                                            bundle3 = new Bundle();
                                        }
                                        intent2.putExtras(bundle3);
                                        activity.setResult(-1, intent2);
                                        activity.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    if (q10 != null) {
                        bundle2.putString("app_id", q10.f40319h);
                        bundle2.putString("access_token", q10.f40316e);
                    } else {
                        bundle2.putString("app_id", url);
                    }
                    int i11 = w0.f28951m;
                    Intrinsics.checkNotNullParameter(context, "context");
                    w0.b(context);
                    w0Var = new w0(context, action, bundle2, wl.e0.FACEBOOK, r0Var);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                if (h10 != null) {
                    url = h10.getString("url");
                }
                if (n0.A(url)) {
                    n0.F("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    context.finish();
                    return;
                }
                final int i12 = 1;
                String expectedRedirectUrl = a3.a.m(new Object[]{FacebookSdk.getApplicationId()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
                String str = r.f28905o;
                if (url != null) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
                    w0.b(context);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(url, "url");
                    n0.R();
                    int i13 = w0.f28951m;
                    if (i13 == 0) {
                        n0.R();
                        i13 = w0.f28951m;
                    }
                    ?? dialog = new Dialog(context, i13);
                    dialog.f28953b = "fbconnect://success";
                    dialog.f28952a = url;
                    Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
                    dialog.f28953b = expectedRedirectUrl;
                    dialog.f28954c = new r0(this) { // from class: nl.m

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n f28880b;

                        {
                            this.f28880b = this;
                        }

                        @Override // nl.r0
                        public final void a(Bundle bundle3, FacebookException facebookException) {
                            int i112 = i12;
                            n this$0 = this.f28880b;
                            switch (i112) {
                                case 0:
                                    int i122 = n.f28881b;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.q(bundle3, facebookException);
                                    return;
                                default:
                                    int i132 = n.f28881b;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    androidx.fragment.app.j0 activity = this$0.getActivity();
                                    if (activity != null) {
                                        Intent intent2 = new Intent();
                                        if (bundle3 == null) {
                                            bundle3 = new Bundle();
                                        }
                                        intent2.putExtras(bundle3);
                                        activity.setResult(-1, intent2);
                                        activity.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    w0Var = dialog;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            this.f28882a = w0Var;
        }
    }

    @Override // androidx.fragment.app.t
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f28882a;
        if (dialog == null) {
            q(null, null);
            setShowsDialog(false);
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            Intrinsics.checkNotNullExpressionValue(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        }
        if (dialog != null) {
            return dialog;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
    }

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f28882a;
        if (dialog instanceof w0) {
            if (dialog != null) {
                ((w0) dialog).d();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    public final void q(Bundle bundle, FacebookException facebookException) {
        int i10;
        androidx.fragment.app.j0 activity = getActivity();
        if (activity == null) {
            return;
        }
        h0 h0Var = h0.f28857a;
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        Intent e10 = h0.e(intent, bundle, facebookException);
        if (facebookException == null) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        activity.setResult(i10, e10);
        activity.finish();
    }
}
