package ta;

import kotlin.jvm.internal.Intrinsics;
import ni.o;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements r7.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f35641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gd.m f35642c;

    public /* synthetic */ d(gd.m mVar, boolean z10, int i10) {
        this.f35640a = i10;
        this.f35642c = mVar;
        this.f35641b = z10;
    }

    @Override // r7.j
    public final void i() {
        int i10 = this.f35640a;
        boolean z10 = this.f35641b;
        gd.m mVar = this.f35642c;
        switch (i10) {
            case 0:
                h this$0 = (h) mVar;
                int i11 = h.f35649j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.I(z10);
                return;
            default:
                o this$02 = (o) mVar;
                int i12 = o.f28751j;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.I(z10);
                return;
        }
    }
}
