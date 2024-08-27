package m;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25741a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25745e;

    public u0(of.b bVar, int i10, String str, String str2) {
        this.f25745e = bVar;
        this.f25742b = i10;
        this.f25743c = str;
        this.f25744d = str2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0167
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [of.d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [nj.a] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [nj.a] */
    /* JADX WARN: Type inference failed for: r8v5, types: [nj.a] */
    /* JADX WARN: Type inference failed for: r8v6, types: [nj.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0183 -> B:21:0x0186). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.u0.run():void");
    }

    public u0(z0 z0Var, TextView textView, Typeface typeface, int i10) {
        this.f25745e = z0Var;
        this.f25743c = textView;
        this.f25744d = typeface;
        this.f25742b = i10;
    }
}
