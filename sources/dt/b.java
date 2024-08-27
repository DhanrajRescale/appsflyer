package dt;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class b extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14499g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f14500h;

    public /* synthetic */ b(Object obj, int i10) {
        this.f14499g = i10;
        this.f14500h = obj;
    }

    public final void t0(String str) {
        int i10 = this.f14499g;
        Object obj = this.f14500h;
        switch (i10) {
            case 0:
                ((PrintStream) obj).println((Object) str);
                return;
            default:
                ((PrintWriter) obj).println((Object) str);
                return;
        }
    }
}
