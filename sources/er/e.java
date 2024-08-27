package er;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import vq.g;
import yk.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15840b;

    public /* synthetic */ e(f fVar, int i10) {
        this.f15839a = i10;
        this.f15840b = fVar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [vq.g, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        String str;
        String str2;
        switch (this.f15839a) {
            case 0:
                f fVar = this.f15840b;
                pp.g gVar2 = fVar.f15846d;
                gVar2.a();
                Context context = gVar2.f31271a;
                fVar.f15852j = context;
                fVar.f15857o = context.getPackageName();
                fVar.f15853k = vq.a.e();
                fVar.f15854l = new d(fVar.f15852j, new fr.g(100L, 1L, TimeUnit.MINUTES));
                fVar.f15855m = uq.b.a();
                mq.c cVar = fVar.f15849g;
                vq.a aVar = fVar.f15853k;
                aVar.getClass();
                g gVar3 = g.f38257b;
                synchronized (g.class) {
                    try {
                        if (g.f38257b == null) {
                            g.f38257b = new Object();
                        }
                        gVar = g.f38257b;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (tq.a.f36350a.booleanValue()) {
                    gVar.getClass();
                    str = "FIREPERF";
                } else {
                    gVar.getClass();
                    long longValue = ((Long) aVar.f38250a.getRemoteConfigValueOrDefault("fpr_log_source", -1L)).longValue();
                    Map map = g.f38258c;
                    if (map.containsKey(Long.valueOf(longValue)) && (str2 = (String) map.get(Long.valueOf(longValue))) != null) {
                        aVar.f38252c.f("com.google.firebase.perf.LogSourceName", str2);
                        str = str2;
                    } else {
                        fr.d d10 = aVar.d(gVar);
                        if (d10.b()) {
                            str = (String) d10.a();
                        } else {
                            str = "FIREPERF";
                        }
                    }
                }
                fVar.f15850h = new a(cVar, str);
                uq.b bVar = fVar.f15855m;
                WeakReference weakReference = new WeakReference(f.f15842s);
                synchronized (bVar.f37337f) {
                    bVar.f37337f.add(weakReference);
                }
                gr.e G = gr.g.G();
                fVar.f15856n = G;
                pp.g gVar4 = fVar.f15846d;
                gVar4.a();
                String str3 = gVar4.f31273c.f31281b;
                G.i();
                gr.g.v((gr.g) G.f11975b, str3);
                gr.a B = gr.b.B();
                String str4 = fVar.f15857o;
                B.i();
                gr.b.v((gr.b) B.f11975b, str4);
                B.i();
                gr.b.w((gr.b) B.f11975b);
                Context context2 = fVar.f15852j;
                String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                try {
                    String str6 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str6 != null) {
                        str5 = str6;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                B.i();
                gr.b.x((gr.b) B.f11975b, str5);
                G.i();
                gr.g.z((gr.g) G.f11975b, (gr.b) B.g());
                fVar.f15845c.set(true);
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = fVar.f15844b;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        b bVar2 = (b) concurrentLinkedQueue.poll();
                        if (bVar2 != null) {
                            fVar.f15851i.execute(new h(22, fVar, bVar2));
                        }
                    } else {
                        return;
                    }
                }
                break;
            default:
                f fVar2 = this.f15840b;
                d dVar = fVar2.f15854l;
                boolean z10 = fVar2.f15859q;
                dVar.f15837d.a(z10);
                dVar.f15838e.a(z10);
                return;
        }
    }
}
