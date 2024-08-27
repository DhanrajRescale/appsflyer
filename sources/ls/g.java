package ls;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class g extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public g0 f25188a;

    /* renamed from: b, reason: collision with root package name */
    public final m f25189b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25190c;

    /* renamed from: d, reason: collision with root package name */
    public long f25191d;

    /* renamed from: e, reason: collision with root package name */
    public long f25192e;

    /* renamed from: f, reason: collision with root package name */
    public int f25193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f25194g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Looper looper) {
        super(looper);
        this.f25194g = hVar;
        this.f25188a = null;
        hVar.f25218f = b1.a(hVar.f25219g.f25225b);
        i iVar = hVar.f25219g;
        this.f25189b = new m(iVar.f25225b, iVar.f25226c);
        this.f25190c = hVar.f25219g.f25226c.f25150b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:120:0x008a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject a(ls.a r11) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.g.a(ls.a):org.json.JSONObject");
    }

    public final void b(g0 g0Var, String str) {
        this.f25194g.f25219g.getClass();
        i.c();
        i iVar = this.f25194g.f25219g;
        Context context = iVar.f25225b;
        synchronized (iVar.f25226c) {
        }
        if (!ll.e.l(context)) {
            i.a(this.f25194g.f25219g, "Not flushing data to Mixpanel because the device is not connected to the internet.");
            return;
        }
        c(g0Var, str, 1, this.f25194g.f25219g.f25226c.f25161m);
        c(g0Var, str, 2, this.f25194g.f25219g.f25226c.f25162n);
        c(g0Var, str, 4, this.f25194g.f25219g.f25226c.f25163o);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0259 A[Catch: all -> 0x025f, Exception -> 0x0262, SQLiteException -> 0x0264, TryCatch #16 {all -> 0x025f, blocks: (B:58:0x0233, B:61:0x023b, B:63:0x0259, B:64:0x0266, B:79:0x027e, B:76:0x0296), top: B:57:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(ls.g0 r28, java.lang.String r29, int r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.g.c(ls.g0, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x030e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.g.handleMessage(android.os.Message):void");
    }
}
