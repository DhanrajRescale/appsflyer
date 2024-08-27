package com.webengage.sdk.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ExecutorService extends w0 {

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12126a;

        static {
            int[] iArr = new int[j0.values().length];
            f12126a = iArr;
            try {
                iArr[j0.f12597a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12126a[j0.f12604h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12126a[j0.f12598b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12126a[j0.f12605i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12126a[j0.f12599c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12126a[j0.f12602f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12126a[j0.f12603g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12126a[j0.f12606j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12126a[j0.f12600d.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12126a[j0.f12607k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12126a[j0.f12608l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12126a[j0.f12609m.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12126a[j0.f12611o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12126a[j0.f12610n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private void a(Context context, Intent intent) {
        if (intent.getExtras().getInt("action_name") != 1) {
            return;
        }
        Logger.d("WebEngage", "Ending Background Task From Expiration Handler SESSION_DESTROY");
        Analytics a10 = c.a(context);
        a10.c().g();
        a10.c().h();
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // com.webengage.sdk.android.w0, android.app.Service
    public /* bridge */ /* synthetic */ boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0020. Please report as an issue. */
    @Override // com.webengage.sdk.android.w0
    public void a(Intent intent) {
        Bundle extras;
        Object obj;
        Object b10;
        h0 h0Var;
        Context applicationContext = getApplicationContext();
        try {
            if (intent != null) {
                try {
                    extras = intent.getExtras();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    h0.a(applicationContext).a(j0.f12603g, e10);
                    return;
                }
                if (extras != null) {
                    j0 j0Var = (j0) extras.get("topic");
                    if (j0Var == null) {
                        a(applicationContext, intent);
                        return;
                    }
                    switch (a.f12126a[j0Var.ordinal()]) {
                        case 1:
                        case 9:
                        case 11:
                        case 12:
                        case 13:
                            h0.a(applicationContext).a(j0Var, null);
                            return;
                        case 2:
                        case 3:
                            obj = (n) extras.getSerializable("data");
                            h0.a(applicationContext).a(j0Var, obj);
                            return;
                        case 4:
                            obj = (HashMap) extras.getSerializable("data");
                            h0.a(applicationContext).a(j0Var, obj);
                            return;
                        case 5:
                            obj = extras.getBundle("data");
                            h0.a(applicationContext).a(j0Var, obj);
                            return;
                        case 6:
                            obj = (Intent) extras.getParcelable("data");
                            h0.a(applicationContext).a(j0Var, obj);
                            return;
                        case 7:
                            h0.a(applicationContext).a(j0Var, (Exception) extras.getSerializable("data"));
                            return;
                        case 8:
                            g0 g0Var = (g0) extras.getSerializable("data");
                            if (c.a(getApplicationContext()).a().g().equals(g0Var.a())) {
                                h0 a10 = h0.a(applicationContext);
                                b10 = g0Var.b();
                                h0Var = a10;
                                h0Var.a(j0Var, b10);
                                return;
                            }
                            return;
                        case 10:
                            obj = (ArrayList) extras.getSerializable("data");
                            h0.a(applicationContext).a(j0Var, obj);
                            return;
                        case 14:
                            h0Var = h0.a(applicationContext);
                            b10 = extras.get("data");
                            h0Var.a(j0Var, b10);
                            return;
                        default:
                            return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
