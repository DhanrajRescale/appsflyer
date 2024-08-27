package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes2.dex */
class x0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f12999a;

    /* renamed from: b, reason: collision with root package name */
    private Messenger f13000b;

    /* renamed from: c, reason: collision with root package name */
    private Context f13001c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f13002d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f13003e;

    /* renamed from: f, reason: collision with root package name */
    private Queue<v0> f13004f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f13005g;

    /* renamed from: h, reason: collision with root package name */
    private int f13006h;

    /* renamed from: i, reason: collision with root package name */
    private int f13007i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Integer, v0> f13008j;

    /* renamed from: k, reason: collision with root package name */
    private String f13009k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f13010l;

    /* renamed from: m, reason: collision with root package name */
    private final a f13011m;

    /* renamed from: n, reason: collision with root package name */
    private Messenger f13012n;

    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            synchronized (x0.this.f13010l) {
                try {
                    int i10 = message.arg1;
                    Logger.d("WebEngage", "YAIS: processing complete, service: " + x0.this.f13009k + ", startId: " + i10 + ", Thread id: " + getLooper().getThread().getId());
                    try {
                        if (x0.this.f13008j.get(Integer.valueOf(i10)) != null) {
                            ((v0) x0.this.f13008j.get(Integer.valueOf(i10))).a();
                            x0.this.f13008j.remove(Integer.valueOf(i10));
                        }
                        if (i10 == x0.this.f13007i) {
                            Logger.d("WebEngage", "YAIS: disconnecting from service: " + x0.this.f13009k);
                            x0.this.f13001c.unbindService(x0.this);
                            x0.this.f13002d = false;
                        }
                    } catch (Exception e10) {
                        Logger.e("WebEngage", "YAIS: Some exception occurred while handling incoming messages from service: " + x0.this.f13009k, e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private x0() {
        this.f12999a = new ScheduledThreadPoolExecutor(1);
        this.f13000b = null;
        this.f13001c = null;
        this.f13002d = false;
        this.f13003e = false;
        this.f13004f = null;
        this.f13005g = null;
        this.f13006h = 0;
        this.f13007i = 0;
        this.f13008j = null;
        this.f13009k = null;
        this.f13010l = new Object();
        a aVar = new a(Looper.getMainLooper());
        this.f13011m = aVar;
        this.f13012n = new Messenger(aVar);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f13010l) {
            try {
                if (iBinder != null) {
                    Logger.d("WebEngage", "YAIS: service connected: " + this.f13009k);
                    this.f13000b = new Messenger(iBinder);
                    this.f13002d = true;
                    this.f13003e = false;
                    b();
                } else {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f13010l) {
            Logger.d("WebEngage", "YAIS: service disconnected: " + this.f13009k);
            this.f13002d = false;
            this.f13000b = null;
            b();
        }
    }

    public x0(Context context, Intent intent) {
        this.f12999a = new ScheduledThreadPoolExecutor(1);
        this.f13000b = null;
        this.f13001c = null;
        this.f13002d = false;
        this.f13003e = false;
        this.f13004f = null;
        this.f13005g = null;
        this.f13006h = 0;
        this.f13007i = 0;
        this.f13008j = null;
        this.f13009k = null;
        this.f13010l = new Object();
        a aVar = new a(Looper.getMainLooper());
        this.f13011m = aVar;
        this.f13012n = new Messenger(aVar);
        this.f13001c = context.getApplicationContext();
        this.f13004f = new ArrayDeque();
        this.f13005g = intent;
        this.f13008j = new HashMap();
        this.f13009k = intent.getComponent().getClassName();
    }

    private synchronized void a() {
        while (!this.f13004f.isEmpty()) {
            this.f13004f.poll().a();
        }
    }

    private synchronized void b() {
        Messenger messenger;
        while (!this.f13004f.isEmpty()) {
            try {
                if (!this.f13002d || (messenger = this.f13000b) == null || !messenger.getBinder().isBinderAlive()) {
                    if (this.f13003e) {
                        return;
                    }
                    this.f13003e = true;
                    try {
                        this.f13001c.bindService(this.f13005g, this, 1);
                        return;
                    } catch (Exception e10) {
                        Logger.e("WebEngage", "YAIS: Exception while binding to service: " + this.f13005g, e10);
                        this.f13003e = false;
                        a();
                        return;
                    }
                }
                a(this.f13004f.poll());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        Logger.d("WebEngage", "YAIS: Adding task to service: " + this.f13009k);
        this.f13004f.add(new v0(intent, this.f12999a, pendingResult));
        b();
    }

    private void a(v0 v0Var) {
        synchronized (this.f13010l) {
            Logger.d("WebEngage", "YAIS: sending message to service: " + this.f13009k + ", startId: " + this.f13006h);
            Message obtain = Message.obtain();
            obtain.obj = v0Var.b();
            obtain.arg1 = this.f13006h;
            obtain.replyTo = this.f13012n;
            try {
                this.f13000b.send(obtain);
                this.f13008j.put(Integer.valueOf(this.f13006h), v0Var);
                int i10 = this.f13006h;
                this.f13007i = i10;
                this.f13006h = i10 + 1;
            } catch (Exception e10) {
                Logger.e("WebEngage", "YAIS: Exception while sending message to service: " + v0Var.b(), e10);
            }
        }
    }
}
