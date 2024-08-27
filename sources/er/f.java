package er;

import android.content.Context;
import gr.a0;
import gr.i;
import gr.o;
import gr.r;
import gr.t;
import gr.u;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import pp.g;

/* loaded from: classes2.dex */
public final class f implements uq.a {

    /* renamed from: r, reason: collision with root package name */
    public static final yq.a f15841r = yq.a.d();

    /* renamed from: s, reason: collision with root package name */
    public static final f f15842s = new f();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f15843a;

    /* renamed from: d, reason: collision with root package name */
    public g f15846d;

    /* renamed from: e, reason: collision with root package name */
    public tq.c f15847e;

    /* renamed from: f, reason: collision with root package name */
    public nq.d f15848f;

    /* renamed from: g, reason: collision with root package name */
    public mq.c f15849g;

    /* renamed from: h, reason: collision with root package name */
    public a f15850h;

    /* renamed from: j, reason: collision with root package name */
    public Context f15852j;

    /* renamed from: k, reason: collision with root package name */
    public vq.a f15853k;

    /* renamed from: l, reason: collision with root package name */
    public d f15854l;

    /* renamed from: m, reason: collision with root package name */
    public uq.b f15855m;

    /* renamed from: n, reason: collision with root package name */
    public gr.e f15856n;

    /* renamed from: o, reason: collision with root package name */
    public String f15857o;

    /* renamed from: p, reason: collision with root package name */
    public String f15858p;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f15844b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f15845c = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public boolean f15859q = false;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadPoolExecutor f15851i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public f() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f15843a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(u uVar) {
        long j10;
        String str;
        if (uVar.b()) {
            return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", uVar.c().K(), new DecimalFormat("#.####").format(r8.J() / 1000.0d));
        }
        if (uVar.d()) {
            r e10 = uVar.e();
            if (e10.Z()) {
                j10 = e10.Q();
            } else {
                j10 = 0;
            }
            if (e10.V()) {
                str = String.valueOf(e10.L());
            } else {
                str = "UNKNOWN";
            }
            return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", e10.S(), str, new DecimalFormat("#.####").format(j10 / 1000.0d));
        }
        if (uVar.a()) {
            o f10 = uVar.f();
            return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(f10.D()), Integer.valueOf(f10.A()), Integer.valueOf(f10.z()));
        }
        return "log";
    }

    public final void b(t tVar) {
        if (tVar.b()) {
            this.f15855m.b("_fstec");
        } else if (tVar.d()) {
            this.f15855m.b("_fsntc");
        }
    }

    public final void c(a0 a0Var, i iVar) {
        this.f15851i.execute(new androidx.fragment.app.e(17, this, a0Var, iVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0341, code lost:
    
        if (vq.a.p(r5) != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03c0, code lost:
    
        if (er.d.a(r10.c().L()) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x045f, code lost:
    
        if (er.d.a(r10.e().M()) != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04cf, code lost:
    
        if ((!r11) != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02e6, code lost:
    
        if (er.d.a(r10.c().L()) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0461, code lost:
    
        b(r10);
        er.f.f15841r.e("Event dropped due to device sampling - %s", a(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1  */
    /* JADX WARN: Type inference failed for: r4v13, types: [vq.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [vq.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [vq.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(gr.s r10, gr.i r11) {
        /*
            Method dump skipped, instructions count: 1449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: er.f.d(gr.s, gr.i):void");
    }

    @Override // uq.a
    public final void onUpdateAppState(i iVar) {
        boolean z10;
        int i10 = 1;
        if (iVar == i.FOREGROUND) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15859q = z10;
        if (this.f15845c.get()) {
            this.f15851i.execute(new e(this, i10));
        }
    }
}
