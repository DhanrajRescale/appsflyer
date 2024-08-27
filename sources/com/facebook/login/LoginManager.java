package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.AuthType;
import com.assetgro.stockgro.ui.profile.self.EditProfileActivity;
import com.assetgro.stockgro.ui.profile.self.EditProfileViewModel;
import com.assetgro.stockgro.ui.social.auth.SocialActivityViewModel;
import com.assetgro.stockgro.ui.social.auth.SocialAuthActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.data.model.UserCancellationException;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.google.firebase.messaging.t;
import e.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ll.e;
import ll.f;
import nl.j;
import nl.l;
import nl.n0;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import q.a;
import vt.g0;
import vt.p0;
import vt.v;
import wl.a0;
import wl.b0;
import wl.d;
import wl.d0;
import wl.e0;
import wl.p;
import wl.q;
import wl.r;
import wl.s;
import wl.u;
import wl.x;
import xk.g;
import xk.h0;
import xk.j0;
import xk.o;
import yk.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/LoginManager;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "wl/a0", "ll/f", "wl/b0", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class LoginManager {

    /* renamed from: f, reason: collision with root package name */
    public static final f f10882f = new f(12, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final Set f10883g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f10884h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile LoginManager f10885i;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f10888c;

    /* renamed from: a, reason: collision with root package name */
    public final p f10886a = p.NATIVE_WITH_FALLBACK;

    /* renamed from: b, reason: collision with root package name */
    public final d f10887b = d.FRIENDS;

    /* renamed from: d, reason: collision with root package name */
    public final String f10889d = "rerequest";

    /* renamed from: e, reason: collision with root package name */
    public final e0 f10890e = e0.FACEBOOK;

    static {
        String[] elements = {"ads_management", "create_event", "rsvp_event"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f10883g = v.B(elements);
        String cls = LoginManager.class.toString();
        Intrinsics.checkNotNullExpressionValue(cls, "LoginManager::class.java.toString()");
        f10884h = cls;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, q.g] */
    public LoginManager() {
        n0.R();
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.loginManager", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f10888c = sharedPreferences;
        if (FacebookSdk.hasCustomTabsPrefetching && l.a() != null) {
            t.f(FacebookSdk.getApplicationContext(), "com.android.chrome", new Object());
            Context applicationContext = FacebookSdk.getApplicationContext();
            String packageName = FacebookSdk.getApplicationContext().getPackageName();
            if (packageName != null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                try {
                    t.f(applicationContext2, packageName, new a(applicationContext2));
                } catch (SecurityException unused) {
                }
            }
        }
    }

    public static void a(Activity activity, r rVar, Map map, FacebookException facebookException, boolean z10, q qVar) {
        String str;
        String message;
        x a10 = b0.f39156a.a(activity);
        if (a10 == null) {
            return;
        }
        String str2 = "fb_mobile_login_complete";
        if (qVar == null) {
            ScheduledExecutorService scheduledExecutorService = x.f39298d;
            if (!sl.a.b(x.class)) {
                try {
                    a10.a("fb_mobile_login_complete", HttpUrl.FRAGMENT_ENCODE_SET);
                    return;
                } catch (Throwable th2) {
                    sl.a.a(x.class, th2);
                    return;
                }
            }
            return;
        }
        HashMap loggingExtras = new HashMap();
        if (z10) {
            str = "1";
        } else {
            str = "0";
        }
        loggingExtras.put("try_login_activity", str);
        String str3 = qVar.f39249e;
        if (qVar.f39257m) {
            str2 = "foa_mobile_login_complete";
        }
        if (!sl.a.b(a10)) {
            try {
                Intrinsics.checkNotNullParameter(loggingExtras, "loggingExtras");
                ScheduledExecutorService scheduledExecutorService2 = x.f39298d;
                Bundle a11 = e.a(str3);
                if (rVar != null) {
                    a11.putString("2_result", rVar.f39267a);
                }
                JSONObject jSONObject = null;
                if (facebookException == null) {
                    message = null;
                } else {
                    message = facebookException.getMessage();
                }
                if (message != null) {
                    a11.putString("5_error_message", facebookException.getMessage());
                }
                if (!loggingExtras.isEmpty()) {
                    jSONObject = new JSONObject(loggingExtras);
                }
                if (map != null) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        for (Map.Entry entry : map.entrySet()) {
                            String str4 = (String) entry.getKey();
                            String str5 = (String) entry.getValue();
                            if (str4 != null) {
                                jSONObject.put(str4, str5);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (jSONObject != null) {
                    a11.putString("6_extras", jSONObject.toString());
                }
                a10.f39300b.a(a11, str2);
                if (rVar == r.SUCCESS && !sl.a.b(a10)) {
                    try {
                        x.f39298d.schedule(new h(10, a10, e.a(str3)), 5L, TimeUnit.SECONDS);
                    } catch (Throwable th3) {
                        sl.a.a(a10, th3);
                    }
                }
            } catch (Throwable th4) {
                sl.a.a(a10, th4);
            }
        }
    }

    public final void b(Activity activity, ArrayList arrayList) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (f.p(str3)) {
                    throw new FacebookException(nn.d.k("Cannot pass a publish or manage permission (", str3, ") to a request for read authorization"));
                }
            }
        }
        u loginConfig = new u(arrayList);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        if (activity instanceof i) {
            Log.w(f10884h, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        wl.a aVar = wl.a.f39146a;
        try {
            str = hl.f.f0(loginConfig.f39290c);
        } catch (FacebookException unused) {
            aVar = wl.a.f39147b;
            str = loginConfig.f39290c;
        }
        wl.a aVar2 = aVar;
        String str4 = str;
        p pVar = this.f10886a;
        q request = new q(pVar, g0.V(loginConfig.f39288a), this.f10887b, this.f10889d, FacebookSdk.getApplicationId(), a3.a.d("randomUUID().toString()"), this.f10890e, loginConfig.f39289b, loginConfig.f39290c, str4, aVar2);
        Date date = xk.a.f40309l;
        request.f39250f = ek.h.x();
        request.f39254j = null;
        request.f39255k = false;
        request.f39257m = false;
        request.f39258n = false;
        a0 a0Var = new a0(activity);
        x a10 = b0.f39156a.a(activity);
        if (a10 != null) {
            if (request.f39257m) {
                str2 = "foa_mobile_login_start";
            } else {
                str2 = "fb_mobile_login_start";
            }
            if (!sl.a.b(a10)) {
                try {
                    Intrinsics.checkNotNullParameter(request, "pendingLoginRequest");
                    ScheduledExecutorService scheduledExecutorService = x.f39298d;
                    Bundle a11 = e.a(request.f39249e);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("login_behavior", pVar.toString());
                        jSONObject.put("request_code", nl.i.Login.a());
                        jSONObject.put("permissions", TextUtils.join(",", request.f39246b));
                        jSONObject.put("default_audience", request.f39247c.toString());
                        jSONObject.put("isReauthorize", request.f39250f);
                        String str5 = a10.f39301c;
                        if (str5 != null) {
                            jSONObject.put("facebookVersion", str5);
                        }
                        e0 e0Var = request.f39256l;
                        if (e0Var != null) {
                            jSONObject.put("target_app", e0Var.f39176a);
                        }
                        a11.putString("6_extras", jSONObject.toString());
                    } catch (JSONException unused2) {
                    }
                    a10.f39300b.a(a11, str2);
                } catch (Throwable th2) {
                    sl.a.a(a10, th2);
                }
            }
        }
        e eVar = j.f28865b;
        nl.i iVar = nl.i.Login;
        int a12 = iVar.a();
        nl.h callback = new nl.h() { // from class: wl.z
            @Override // nl.h
            public final void a(int i10, Intent intent) {
                ll.f fVar = LoginManager.f10882f;
                LoginManager this$0 = LoginManager.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.c(i10, intent, null);
            }
        };
        synchronized (eVar) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            HashMap hashMap = j.f28866c;
            if (!hashMap.containsKey(Integer.valueOf(a12))) {
                hashMap.put(Integer.valueOf(a12), callback);
            }
        }
        Intrinsics.checkNotNullParameter(request, "request");
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(request.f39245a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                int a13 = iVar.a();
                Intrinsics.checkNotNullParameter(intent, "intent");
                a0Var.f39149a.startActivityForResult(intent, a13);
                return;
            } catch (ActivityNotFoundException unused3) {
            }
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        a(a0Var.f39149a, r.ERROR, null, facebookException, false, request);
        throw facebookException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, nl.m0] */
    public final void c(int i10, Intent intent, o oVar) {
        r rVar;
        boolean z10;
        FacebookException error;
        q request;
        xk.a newToken;
        Map map;
        xk.i iVar;
        boolean z11;
        Parcelable parcelable;
        r rVar2 = r.ERROR;
        d0 d0Var = null;
        if (intent != null) {
            intent.setExtrasClassLoader(s.class.getClassLoader());
            s sVar = (s) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (sVar != null) {
                rVar = sVar.f39268a;
                if (i10 != -1) {
                    if (i10 != 0) {
                        error = null;
                        newToken = null;
                    } else {
                        z11 = true;
                        error = null;
                        newToken = null;
                        parcelable = newToken;
                        Map map2 = sVar.f39274g;
                        request = sVar.f39273f;
                        iVar = parcelable;
                        z10 = z11;
                        map = map2;
                    }
                } else if (rVar == r.SUCCESS) {
                    xk.a aVar = sVar.f39269b;
                    z11 = false;
                    parcelable = sVar.f39270c;
                    newToken = aVar;
                    error = null;
                    Map map22 = sVar.f39274g;
                    request = sVar.f39273f;
                    iVar = parcelable;
                    z10 = z11;
                    map = map22;
                } else {
                    error = new FacebookException(sVar.f39271d);
                    newToken = null;
                }
                z11 = false;
                parcelable = newToken;
                Map map222 = sVar.f39274g;
                request = sVar.f39273f;
                iVar = parcelable;
                z10 = z11;
                map = map222;
            }
            rVar = rVar2;
            error = null;
            request = null;
            newToken = null;
            map = null;
            iVar = 0;
            z10 = false;
        } else {
            if (i10 == 0) {
                rVar = r.CANCEL;
                z10 = true;
                error = null;
                request = null;
                newToken = null;
                map = null;
                iVar = 0;
            }
            rVar = rVar2;
            error = null;
            request = null;
            newToken = null;
            map = null;
            iVar = 0;
            z10 = false;
        }
        if (error == null && newToken == null && !z10) {
            error = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, rVar, map, error, true, request);
        if (newToken != null) {
            Date date = xk.a.f40309l;
            g.f40363f.r().c(newToken, true);
            String str = h0.f40389h;
            xk.a q10 = ek.h.q();
            if (q10 != null) {
                if (!ek.h.x()) {
                    j0.f40404d.s().a(null, true);
                } else {
                    n0.p(new Object(), q10.f40316e);
                }
            }
        }
        if (iVar != 0) {
            ek.e.E(iVar);
        }
        if (oVar != null) {
            if (newToken != null && request != null) {
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(newToken, "newToken");
                Set set = request.f39246b;
                Set U = g0.U(g0.s(newToken.f40313b));
                if (request.f39250f) {
                    U.retainAll(set);
                }
                Set U2 = g0.U(g0.s(set));
                U2.removeAll(U);
                d0Var = new d0(newToken, iVar, U, U2);
            }
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (!z10 && (d0Var == null || !d0Var.f39169c.isEmpty())) {
                if (error != null) {
                    eb.f fVar = (eb.f) oVar;
                    String str3 = "EMPTY_MESSAGE";
                    int i11 = fVar.f15308a;
                    Object obj = fVar.f15309b;
                    switch (i11) {
                        case 0:
                            Intrinsics.checkNotNullParameter(error, "error");
                            EditProfileActivity editProfileActivity = (EditProfileActivity) obj;
                            editProfileActivity.Q();
                            Pair pair = new Pair("platform", AuthType.FACEBOOK);
                            String currentUserId = ((EditProfileViewModel) editProfileActivity.x()).f9081d.getCurrentUserId();
                            if (currentUserId != null) {
                                str2 = currentUserId;
                            }
                            Pair pair2 = new Pair("userId", str2);
                            Pair pair3 = new Pair("social_auth_error", "social_auth_error");
                            String message = error.getMessage();
                            if (message != null && message.length() != 0) {
                                str3 = message;
                            }
                            editProfileActivity.C(new AnalyticEvent("social_auth_error", p0.f(pair, pair2, pair3, new Pair("description", str3))));
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(error, "error");
                            SocialAuthActivity socialAuthActivity = (SocialAuthActivity) obj;
                            socialAuthActivity.Q();
                            Pair pair4 = new Pair("platform", AuthType.FACEBOOK);
                            Pair pair5 = new Pair("userId", ((SocialActivityViewModel) socialAuthActivity.x()).h());
                            Pair pair6 = new Pair("social_auth_error", "social_auth_error");
                            String message2 = error.getMessage();
                            if (message2 != null && message2.length() != 0) {
                                str3 = message2;
                            }
                            socialAuthActivity.C(new AnalyticEvent("social_auth_error", p0.f(pair4, pair5, pair6, new Pair("description", str3))));
                            return;
                        default:
                            ((FacebookSignInHandler) obj).h(am.d.a(new FirebaseUiException(4, error)));
                            return;
                    }
                }
                if (newToken != null && d0Var != null) {
                    SharedPreferences.Editor edit = this.f10888c.edit();
                    edit.putBoolean("express_login_allowed", true);
                    edit.apply();
                    eb.f fVar2 = (eb.f) oVar;
                    switch (fVar2.f15308a) {
                        case 0:
                            fVar2.t(d0Var);
                            return;
                        case 1:
                            fVar2.t(d0Var);
                            return;
                        default:
                            fVar2.t(d0Var);
                            return;
                    }
                }
                return;
            }
            eb.f fVar3 = (eb.f) oVar;
            int i12 = fVar3.f15308a;
            Object obj2 = fVar3.f15309b;
            switch (i12) {
                case 0:
                    EditProfileActivity editProfileActivity2 = (EditProfileActivity) obj2;
                    Pair pair7 = new Pair("platform", AuthType.FACEBOOK);
                    String currentUserId2 = ((EditProfileViewModel) editProfileActivity2.x()).f9081d.getCurrentUserId();
                    if (currentUserId2 != null) {
                        str2 = currentUserId2;
                    }
                    editProfileActivity2.C(new AnalyticEvent("social_auth_user_cancel", p0.f(pair7, new Pair("userId", str2))));
                    return;
                case 1:
                    SocialAuthActivity socialAuthActivity2 = (SocialAuthActivity) obj2;
                    socialAuthActivity2.C(new AnalyticEvent("social_auth_user_cancel", p0.f(new Pair("platform", AuthType.FACEBOOK), new Pair("userId", ((SocialActivityViewModel) socialAuthActivity2.x()).h()))));
                    return;
                default:
                    ((FacebookSignInHandler) obj2).h(am.d.a(new UserCancellationException()));
                    return;
            }
        }
    }

    public final void d(j jVar, final eb.f fVar) {
        if (jVar instanceof j) {
            int a10 = nl.i.Login.a();
            nl.h callback = new nl.h() { // from class: wl.y
                @Override // nl.h
                public final void a(int i10, Intent intent) {
                    ll.f fVar2 = LoginManager.f10882f;
                    LoginManager this$0 = LoginManager.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.c(i10, intent, fVar);
                }
            };
            jVar.getClass();
            Intrinsics.checkNotNullParameter(callback, "callback");
            jVar.f28867a.put(Integer.valueOf(a10), callback);
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }
}
