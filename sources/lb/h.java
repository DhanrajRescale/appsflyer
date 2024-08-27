package lb;

import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f24453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CommentsViewModel commentsViewModel, int i10) {
        super(0);
        this.f24452a = i10;
        this.f24453b = commentsViewModel;
    }

    public final void a() {
        int i10 = this.f24452a;
        CommentsViewModel commentsViewModel = this.f24453b;
        switch (i10) {
            case 0:
                if (!((kb.b) commentsViewModel.f8807p.getValue()).f23028e) {
                    if (commentsViewModel.f8817z) {
                        commentsViewModel.f8817z = false;
                        commentsViewModel.f8816y += commentsViewModel.f8815x;
                    }
                    commentsViewModel.h(kb.a.f23020a);
                    return;
                }
                return;
            default:
                commentsViewModel.f8816y = 0;
                commentsViewModel.h(kb.a.f23021b);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24452a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
