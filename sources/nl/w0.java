package nl;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.webengage.sdk.android.z0;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class w0 extends Dialog {

    /* renamed from: m, reason: collision with root package name */
    public static volatile int f28951m;

    /* renamed from: a, reason: collision with root package name */
    public String f28952a;

    /* renamed from: b, reason: collision with root package name */
    public String f28953b;

    /* renamed from: c, reason: collision with root package name */
    public r0 f28954c;

    /* renamed from: d, reason: collision with root package name */
    public v0 f28955d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressDialog f28956e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f28957f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f28958g;

    /* renamed from: h, reason: collision with root package name */
    public final t0 f28959h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28960i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28961j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28962k;

    /* renamed from: l, reason: collision with root package name */
    public WindowManager.LayoutParams f28963l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context, String str, Bundle bundle, wl.e0 e0Var, r0 r0Var) {
        super(context, f28951m);
        Uri b10;
        n0.R();
        this.f28953b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = n0.x(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f28953b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString(PaymentConstants.CLIENT_ID, FacebookSdk.getApplicationId());
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{FacebookSdk.getSdkVersion()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString(PaymentConstants.Category.SDK, format);
        this.f28954c = r0Var;
        if (Intrinsics.a(str, "share") && bundle.containsKey("media")) {
            this.f28959h = new t0(this, str, bundle);
            return;
        }
        if (u0.f28943a[e0Var.ordinal()] == 1) {
            b10 = n0.b(l.d(), "oauth/authorize", bundle);
        } else {
            b10 = n0.b(l.c(), FacebookSdk.getGraphApiVersion() + "/dialog/" + ((Object) str), bundle);
        }
        this.f28952a = b10.toString();
    }

    public static int a(float f10, int i10, int i11, int i12) {
        int i13 = (int) (i10 / f10);
        return (int) (i10 * (i13 <= i11 ? 1.0d : i13 >= i12 ? 0.5d : (((i12 - i13) / (i12 - i11)) * 0.5d) + 0.5d));
    }

    public static final void b(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                bundle = null;
            } else {
                bundle = applicationInfo.metaData;
            }
            if (bundle != null && f28951m == 0) {
                int i10 = applicationInfo.metaData.getInt(FacebookSdk.WEB_DIALOG_THEME);
                if (i10 == 0) {
                    i10 = R.style.com_facebook_activity_theme;
                }
                f28951m = i10;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri parse = Uri.parse(str);
        Bundle M = n0.M(parse.getQuery());
        M.putAll(n0.M(parse.getFragment()));
        return M;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f28954c != null && !this.f28960i) {
            e(new FacebookOperationCanceledException());
        }
    }

    public final void d() {
        int i10;
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i11 = displayMetrics.widthPixels;
            int i12 = displayMetrics.heightPixels;
            if (i11 < i12) {
                i10 = i11;
            } else {
                i10 = i12;
            }
            if (i11 < i12) {
                i11 = i12;
            }
            int min = Math.min(a(displayMetrics.density, i10, 480, 800), displayMetrics.widthPixels);
            int min2 = Math.min(a(displayMetrics.density, i11, 800, 1280), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window != null) {
                window.setLayout(min, min2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        v0 v0Var = this.f28955d;
        if (v0Var != null) {
            v0Var.stopLoading();
        }
        if (!this.f28961j && (progressDialog = this.f28956e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [nl.r0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.facebook.FacebookException] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void e(Exception exc) {
        ?? runtimeException;
        if (this.f28954c != null && !this.f28960i) {
            this.f28960i = true;
            if (exc instanceof FacebookException) {
                runtimeException = (FacebookException) exc;
            } else {
                runtimeException = new RuntimeException(exc);
            }
            ?? r02 = this.f28954c;
            if (r02 != 0) {
                r02.a(null, runtimeException);
            }
            dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [nl.v0, android.view.View, android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, android.view.View$OnTouchListener] */
    public final void f(int i10) {
        WebSettings settings;
        WebSettings settings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        ?? webView = new WebView(getContext());
        this.f28955d = webView;
        webView.setVerticalScrollBarEnabled(false);
        v0 v0Var = this.f28955d;
        if (v0Var != null) {
            v0Var.setHorizontalScrollBarEnabled(false);
        }
        v0 v0Var2 = this.f28955d;
        if (v0Var2 != null) {
            v0Var2.setWebViewClient(new xf.d0(this));
        }
        v0 v0Var3 = this.f28955d;
        WebSettings webSettings = null;
        if (v0Var3 == null) {
            settings = null;
        } else {
            settings = v0Var3.getSettings();
        }
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        v0 v0Var4 = this.f28955d;
        if (v0Var4 != null) {
            String str = this.f28952a;
            if (str != null) {
                v0Var4.loadUrl(str);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        v0 v0Var5 = this.f28955d;
        if (v0Var5 != null) {
            v0Var5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        v0 v0Var6 = this.f28955d;
        if (v0Var6 != null) {
            v0Var6.setVisibility(4);
        }
        v0 v0Var7 = this.f28955d;
        if (v0Var7 == null) {
            settings2 = null;
        } else {
            settings2 = v0Var7.getSettings();
        }
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        v0 v0Var8 = this.f28955d;
        if (v0Var8 != null) {
            webSettings = v0Var8.getSettings();
        }
        if (webSettings != null) {
            webSettings.setSaveFormData(false);
        }
        v0 v0Var9 = this.f28955d;
        if (v0Var9 != null) {
            v0Var9.setFocusable(true);
        }
        v0 v0Var10 = this.f28955d;
        if (v0Var10 != null) {
            v0Var10.setFocusableInTouchMode(true);
        }
        v0 v0Var11 = this.f28955d;
        if (v0Var11 != 0) {
            v0Var11.setOnTouchListener(new Object());
        }
        linearLayout.setPadding(i10, i10, i10, i10);
        linearLayout.addView(this.f28955d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f28958g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        AutofillManager g10;
        boolean isAutofillSupported;
        boolean isEnabled;
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        IBinder iBinder2;
        this.f28961j = false;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (g10 = z0.g(context.getSystemService(z0.h()))) != null) {
            isAutofillSupported = g10.isAutofillSupported();
            if (isAutofillSupported) {
                isEnabled = g10.isEnabled();
                if (isEnabled && (layoutParams = this.f28963l) != null) {
                    IBinder iBinder3 = null;
                    if (layoutParams == null) {
                        iBinder = null;
                    } else {
                        iBinder = layoutParams.token;
                    }
                    if (iBinder == null) {
                        if (layoutParams != null) {
                            Activity ownerActivity = getOwnerActivity();
                            if (ownerActivity == null) {
                                window = null;
                            } else {
                                window = ownerActivity.getWindow();
                            }
                            if (window == null || (attributes = window.getAttributes()) == null) {
                                iBinder2 = null;
                            } else {
                                iBinder2 = attributes.token;
                            }
                            layoutParams.token = iBinder2;
                        }
                        WindowManager.LayoutParams layoutParams2 = this.f28963l;
                        if (layoutParams2 != null) {
                            iBinder3 = layoutParams2.token;
                        }
                        n0.F("FacebookSDK.WebDialog", Intrinsics.i(iBinder3, "Set token on onAttachedToWindow(): "));
                    }
                }
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f28956e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f28956e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f28956e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f28956e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: nl.o0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    w0 this$0 = w0.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.f28958g = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f28957f = imageView;
        imageView.setOnClickListener(new ph.a(this, 22));
        Drawable drawable = getContext().getResources().getDrawable(2131231027);
        ImageView imageView2 = this.f28957f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f28957f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f28952a != null) {
            ImageView imageView4 = this.f28957f;
            if (imageView4 != null) {
                f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        FrameLayout frameLayout = this.f28958g;
        if (frameLayout != null) {
            frameLayout.addView(this.f28957f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f28958g;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f28961j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i10 == 4) {
            v0 v0Var = this.f28955d;
            if (v0Var != null && Intrinsics.a(Boolean.valueOf(v0Var.canGoBack()), Boolean.TRUE)) {
                v0 v0Var2 = this.f28955d;
                if (v0Var2 != null) {
                    v0Var2.goBack();
                    return true;
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i10, event);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        AsyncTask.Status status;
        super.onStart();
        t0 t0Var = this.f28959h;
        if (t0Var != null) {
            if (t0Var == null) {
                status = null;
            } else {
                status = t0Var.getStatus();
            }
            if (status == AsyncTask.Status.PENDING) {
                if (t0Var != null) {
                    t0Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f28956e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        t0 t0Var = this.f28959h;
        if (t0Var != null) {
            t0Var.cancel(true);
            ProgressDialog progressDialog = this.f28956e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.f28963l = params;
        }
        super.onWindowAttributesChanged(params);
    }
}
