package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t.j0;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f11712i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f11713j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11714a;

    /* renamed from: b, reason: collision with root package name */
    public final xk.f f11715b;

    /* renamed from: c, reason: collision with root package name */
    public final m.w f11716c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f11717d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f11719f;

    /* renamed from: h, reason: collision with root package name */
    public final y f11721h;

    /* renamed from: e, reason: collision with root package name */
    public final t.f f11718e = new j0(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f11720g = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [t.j0, t.f] */
    public a0(FirebaseMessaging firebaseMessaging, xk.f fVar, y yVar, m.w wVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11717d = firebaseMessaging;
        this.f11715b = fVar;
        this.f11721h = yVar;
        this.f11716c = wVar;
        this.f11714a = context;
        this.f11719f = scheduledExecutorService;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) {
        String a10 = this.f11717d.a();
        m.w wVar = this.f11716c;
        wVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(wVar.e(wVar.n(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a10 = this.f11717d.a();
        m.w wVar = this.f11716c;
        wVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(wVar.e(wVar.n(a10, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094 A[Catch: IOException -> 0x0043, TryCatch #1 {IOException -> 0x0043, blocks: (B:8:0x002a, B:17:0x0059, B:19:0x0061, B:54:0x0076, B:56:0x0081, B:57:0x0094, B:59:0x009f, B:60:0x0039, B:63:0x0046), top: B:7:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a0.d():boolean");
    }

    public final void e(long j10) {
        this.f11719f.schedule(new c0(this, this.f11714a, this.f11715b, Math.min(Math.max(30L, 2 * j10), f11712i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f11720g = true;
        }
    }
}
