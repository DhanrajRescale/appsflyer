package tq;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import er.e;
import er.f;
import fr.j;
import java.util.concurrent.ConcurrentHashMap;
import pp.g;
import pp.h;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final yq.a f36351b = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f36352a = new ConcurrentHashMap();

    public c(g gVar, mq.c cVar, nq.d dVar, mq.c cVar2, RemoteConfigManager remoteConfigManager, vq.a aVar, SessionManager sessionManager) {
        Bundle bundle;
        fr.c cVar3;
        boolean j10;
        if (gVar == null) {
            new fr.c(new Bundle());
            return;
        }
        f fVar = f.f15842s;
        fVar.f15846d = gVar;
        gVar.a();
        h hVar = gVar.f31273c;
        fVar.f15858p = hVar.f31286g;
        fVar.f15848f = dVar;
        fVar.f15849g = cVar2;
        fVar.f15851i.execute(new e(fVar, 0));
        gVar.a();
        Context context = gVar.f31271a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            cVar3 = new fr.c(bundle);
        } else {
            cVar3 = new fr.c();
        }
        remoteConfigManager.setFirebaseRemoteConfigProvider(cVar);
        aVar.f38251b = cVar3;
        vq.a.f38248d.f41802b = j.a(context);
        aVar.f38252c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean g10 = aVar.g();
        yq.a aVar2 = f36351b;
        if (aVar2.f41802b) {
            if (g10 != null) {
                j10 = g10.booleanValue();
            } else {
                j10 = g.d().j();
            }
            if (j10) {
                gVar.a();
                String format = String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", String.format("%s/trends?utm_source=%s&utm_medium=%s", String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", hVar.f31286g, context.getPackageName()), "perf-android-sdk", "android-ide"));
                if (aVar2.f41802b) {
                    aVar2.f41801a.getClass();
                    Log.i("FirebasePerformance", format);
                }
            }
        }
    }
}
