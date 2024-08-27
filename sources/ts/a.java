package ts;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f36372b;

    public /* synthetic */ a(c cVar, int i10) {
        this.f36371a = i10;
        this.f36372b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f36371a;
        c this$0 = this.f36372b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator it = this$0.f36376b.iterator();
                while (it.hasNext()) {
                    ((us.b) it.next()).a();
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator it2 = this$0.f36376b.iterator();
                while (it2.hasNext()) {
                    ((us.b) it2.next()).getClass();
                }
                return;
        }
    }
}
