package tb;

import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t0.n1;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f35792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(FeedStreamViewModel feedStreamViewModel, int i10) {
        super(0);
        this.f35791a = i10;
        this.f35792b = feedStreamViewModel;
    }

    public final void a() {
        int i10 = this.f35791a;
        FeedStreamViewModel feedStreamViewModel = this.f35792b;
        switch (i10) {
            case 0:
                n1 n1Var = feedStreamViewModel.f8837r;
                if (!Intrinsics.a(((sb.d) n1Var.getValue()).f34443a, "FEED_STREAM_POST_DETAILS") && !((sb.d) n1Var.getValue()).f34459q) {
                    if (feedStreamViewModel.A) {
                        feedStreamViewModel.A = false;
                        feedStreamViewModel.f8845z += feedStreamViewModel.f8844y;
                    }
                    feedStreamViewModel.j(sb.c.f34437a, Boolean.valueOf(((sb.d) n1Var.getValue()).f34461s), ((sb.d) n1Var.getValue()).f34460r, false);
                    return;
                }
                return;
            case 1:
                feedStreamViewModel.getClass();
                sb.c cVar = sb.c.f34438b;
                n1 n1Var2 = feedStreamViewModel.f8837r;
                feedStreamViewModel.j(cVar, Boolean.valueOf(((sb.d) n1Var2.getValue()).f34461s), ((sb.d) n1Var2.getValue()).f34460r, true);
                return;
            default:
                feedStreamViewModel.f8845z = 0;
                sb.c cVar2 = sb.c.f34439c;
                n1 n1Var3 = feedStreamViewModel.f8837r;
                feedStreamViewModel.j(cVar2, Boolean.valueOf(((sb.d) n1Var3.getValue()).f34461s), ((sb.d) n1Var3.getValue()).f34460r, true);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f35791a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
