package i8;

import a8.o;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.m;
import androidx.work.u;
import b.d;
import b8.l;
import j8.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements f8.b, b8.a {

    /* renamed from: j, reason: collision with root package name */
    public static final String f19731j = u.C("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final l f19732a;

    /* renamed from: b, reason: collision with root package name */
    public final m8.a f19733b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19734c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public String f19735d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f19736e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f19737f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f19738g;

    /* renamed from: h, reason: collision with root package name */
    public final f8.c f19739h;

    /* renamed from: i, reason: collision with root package name */
    public b f19740i;

    public c(Context context) {
        l c10 = l.c(context);
        this.f19732a = c10;
        m8.a aVar = c10.f4111d;
        this.f19733b = aVar;
        this.f19735d = null;
        this.f19736e = new LinkedHashMap();
        this.f19738g = new HashSet();
        this.f19737f = new HashMap();
        this.f19739h = new f8.c(context, aVar, this);
        c10.f4113f.a(this);
    }

    public static Intent a(Context context, String str, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", mVar.f2628a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.f2629b);
        intent.putExtra("KEY_NOTIFICATION", mVar.f2630c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", mVar.f2628a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.f2629b);
        intent.putExtra("KEY_NOTIFICATION", mVar.f2630c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // b8.a
    public final void b(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f19734c) {
            try {
                k kVar = (k) this.f19737f.remove(str);
                if (kVar != null && this.f19738g.remove(kVar)) {
                    this.f19739h.b(this.f19738g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m mVar = (m) this.f19736e.remove(str);
        int i10 = 1;
        if (str.equals(this.f19735d) && this.f19736e.size() > 0) {
            Iterator it = this.f19736e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f19735d = (String) entry.getKey();
            if (this.f19740i != null) {
                m mVar2 = (m) entry.getValue();
                b bVar = this.f19740i;
                int i11 = mVar2.f2628a;
                int i12 = mVar2.f2629b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) bVar;
                systemForegroundService.f2604b.post(new q.b(systemForegroundService, i11, mVar2.f2630c, i12));
                b bVar2 = this.f19740i;
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) bVar2;
                systemForegroundService2.f2604b.post(new o(mVar2.f2628a, i10, systemForegroundService2));
            }
        }
        b bVar3 = this.f19740i;
        if (mVar != null && bVar3 != null) {
            u.w().u(f19731j, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(mVar.f2628a), str, Integer.valueOf(mVar.f2629b)), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) bVar3;
            systemForegroundService3.f2604b.post(new o(mVar.f2628a, i10, systemForegroundService3));
        }
    }

    @Override // f8.b
    public final void d(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                u.w().u(f19731j, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                l lVar = this.f19732a;
                ((h.c) lVar.f4111d).n(new k8.k(lVar, str, true));
            }
        }
    }

    @Override // f8.b
    public final void e(List list) {
    }

    public final void f(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        u.w().u(f19731j, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification != null && this.f19740i != null) {
            m mVar = new m(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.f19736e;
            linkedHashMap.put(stringExtra, mVar);
            if (TextUtils.isEmpty(this.f19735d)) {
                this.f19735d = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f19740i;
                systemForegroundService.f2604b.post(new q.b(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f19740i;
            systemForegroundService2.f2604b.post(new d(systemForegroundService2, intExtra, notification, 8));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= ((m) ((Map.Entry) it.next()).getValue()).f2629b;
                }
                m mVar2 = (m) linkedHashMap.get(this.f19735d);
                if (mVar2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f19740i;
                    systemForegroundService3.f2604b.post(new q.b(systemForegroundService3, mVar2.f2628a, mVar2.f2630c, i10));
                }
            }
        }
    }

    public final void g() {
        this.f19740i = null;
        synchronized (this.f19734c) {
            this.f19739h.c();
        }
        this.f19732a.f4113f.e(this);
    }
}
