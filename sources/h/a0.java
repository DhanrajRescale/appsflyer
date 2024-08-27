package h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.assetgro.stockgro.feature_onboarding.presentation.login.LoginActivity;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.google.android.play.core.install.zza;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a0 extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17574c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17575a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17576b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f17575a = i10;
        this.f17576b = obj;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((com.google.firebase.messaging.w) this.f17576b).f11798c.f11688b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        int i10 = 1;
        int i11 = 0;
        String str = null;
        switch (this.f17575a) {
            case 0:
                ((b0) this.f17576b).g();
                return;
            case 1:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i10 = type != 9 ? 8 : 7;
                                        }
                                        i10 = 5;
                                    }
                                }
                                i10 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i10 = 4;
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    i10 = 2;
                                    break;
                                case 20:
                                    if (e5.x.f15050a >= 29) {
                                        i11 = 9;
                                        break;
                                    }
                                    break;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                    if (e5.x.f15050a < 31 && i10 == 5) {
                        e5.o oVar = (e5.o) this.f17576b;
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            telephonyManager.getClass();
                            e5.n nVar = new e5.n(oVar);
                            mainExecutor = context.getMainExecutor();
                            a4.c.t(telephonyManager, mainExecutor, nVar);
                            a4.c.s(telephonyManager, nVar);
                            return;
                        } catch (RuntimeException unused2) {
                            e5.o.a(5, oVar);
                            return;
                        }
                    }
                    e5.o.a(i10, (e5.o) this.f17576b);
                    return;
                }
                i10 = i11;
                if (e5.x.f15050a < 31) {
                }
                e5.o.a(i10, (e5.o) this.f17576b);
                return;
            case 2:
                a3.a.u(this.f17576b);
                throw null;
            case 3:
                if (!isInitialStickyBroadcast()) {
                    k5.g.a((k5.g) this.f17576b, k5.c.c(context, intent));
                    return;
                }
                return;
            case 4:
                if (intent != null) {
                    ((h8.c) this.f17576b).g(intent);
                    return;
                }
                return;
            case 5:
                if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    androidx.work.u.w().u(h8.f.f18050i, "Network broadcast received", new Throwable[0]);
                    h8.f fVar = (h8.f) this.f17576b;
                    fVar.c(fVar.f());
                    return;
                }
                return;
            case 6:
                gd.b bVar = (gd.b) this.f17576b;
                int i12 = gd.b.f17253j;
                bVar.getClass();
                Intent intent2 = new Intent(bVar, (Class<?>) LoginActivity.class);
                intent2.putExtras(new za.c(true, true, true).a());
                intent2.setFlags(268468224);
                bVar.startActivity(intent2);
                bVar.finish();
                return;
            case 7:
                if (intent != null) {
                    str = intent.getAction();
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1966840167) {
                        if (hashCode == 23353741 && str.equals("REFRESH_NOTIFICATION_COUNT_CODE")) {
                            ((MainActivity) this.f17576b).K().k();
                            return;
                        }
                        return;
                    }
                    if (str.equals("REFRESH_MESSAGE_COUNT_CODE")) {
                        ((MainActivity) this.f17576b).K().i();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                lk.c cVar = (lk.c) this.f17576b;
                boolean z10 = cVar.f24875c;
                cVar.f24875c = lk.c.i(context);
                if (z10 != ((lk.c) this.f17576b).f24875c) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + ((lk.c) this.f17576b).f24875c);
                    }
                    lk.c cVar2 = (lk.c) this.f17576b;
                    da.d dVar = cVar2.f24874b;
                    if (cVar2.f24875c) {
                        synchronized (((com.bumptech.glide.h) dVar.f14277c)) {
                            ((i5.b) dVar.f14276b).d();
                        }
                        return;
                    } else {
                        dVar.getClass();
                        return;
                    }
                }
                return;
            case 9:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((CustomTabActivity) this.f17576b).finish();
                return;
            case 10:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                Intent intent3 = new Intent((CustomTabMainActivity) this.f17576b, (Class<?>) CustomTabMainActivity.class);
                intent3.setAction(CustomTabMainActivity.f10871h);
                String str2 = CustomTabMainActivity.f10869f;
                intent3.putExtra(str2, intent.getStringExtra(str2));
                intent3.addFlags(603979776);
                ((CustomTabMainActivity) this.f17576b).startActivity(intent3);
                return;
            case 11:
                dp.c cVar3 = (dp.c) this.f17576b;
                cVar3.getClass();
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    cVar3.f14437a.i("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                cVar3.f14437a.i("List of extras in received intent:", new Object[0]);
                for (String str3 : intent.getExtras().keySet()) {
                    cVar3.f14437a.i("Key: %s; value: %s", str3, intent.getExtras().get(str3));
                }
                ll.o oVar2 = cVar3.f14437a;
                oVar2.i("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                oVar2.i("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                oVar2.i("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                cVar3.f14437a.i("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (cVar3) {
                    Iterator it = new HashSet(cVar3.f14440d).iterator();
                    while (it.hasNext()) {
                        ((nf.r) ((fp.a) it.next())).a(zzaVar);
                    }
                }
                return;
            case 12:
                com.google.firebase.messaging.w wVar = (com.google.firebase.messaging.w) this.f17576b;
                if (wVar != null && wVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    com.google.firebase.messaging.w wVar2 = (com.google.firebase.messaging.w) this.f17576b;
                    wVar2.f11798c.getClass();
                    FirebaseMessaging.b(wVar2, 0L);
                    ((com.google.firebase.messaging.w) this.f17576b).f11798c.f11688b.unregisterReceiver(this);
                    this.f17576b = null;
                    return;
                }
                return;
            default:
                JSONObject jSONObject = new JSONObject();
                Bundle bundleExtra = intent.getBundleExtra("event_args");
                if (bundleExtra != null) {
                    for (String str4 : bundleExtra.keySet()) {
                        try {
                            jSONObject.put(str4, bundleExtra.get(str4));
                        } catch (JSONException e10) {
                            el.l.N("MixpanelAPI.AL", "failed to add key \"" + str4 + "\" to properties for tracking bolts event", e10);
                        }
                    }
                }
                ((ls.n0) this.f17576b).m("$" + intent.getStringExtra("event_name"), jSONObject);
                return;
        }
    }

    public /* synthetic */ a0(dp.c cVar) {
        this.f17575a = 11;
        this.f17576b = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(k5.g gVar) {
        this(gVar, 3);
        this.f17575a = 3;
    }

    public a0(com.google.firebase.messaging.w wVar) {
        this.f17575a = 12;
        this.f17576b = wVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(e5.o oVar) {
        this(oVar, 1);
        this.f17575a = 1;
    }
}
